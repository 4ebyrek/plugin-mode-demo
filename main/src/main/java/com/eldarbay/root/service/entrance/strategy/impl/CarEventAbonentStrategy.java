package com.eldarbay.root.service.entrance.strategy.impl;

import com.eldarbay.plugininterface.abonnement.AbonnementService;
import com.eldarbay.plugininterface.common.Plugin;
import com.eldarbay.plugininterface.common.PluginName;
import com.eldarbay.root.PluginManager;
import com.eldarbay.root.dto.CarEntryDTO;
import com.eldarbay.root.service.entrance.strategy.CarEventStrategy;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
@AllArgsConstructor
public class CarEventAbonentStrategy implements CarEventStrategy {

    PluginManager pluginManager;

    @Override
    public void carEntry(CarEntryDTO carEntryDTO) {
        log.info("Abonement Strategy starting...");
        Map<PluginName, Plugin> plugins = pluginManager.getPlugins();
        AbonnementService abonnementServiceImpl = (AbonnementService) plugins.get(PluginName.ABONNEMENT);
        String upperCaseStr = abonnementServiceImpl.getUpperCaseString("carevent");
        log.info("abonnement plugin response = {}", upperCaseStr);
    }

    @Override
    public List<PluginName> getPlugins() {
        List<PluginName> pluginNameList = new ArrayList<>();
        pluginNameList.add(PluginName.ABONNEMENT);
        return pluginNameList;
    }
}
