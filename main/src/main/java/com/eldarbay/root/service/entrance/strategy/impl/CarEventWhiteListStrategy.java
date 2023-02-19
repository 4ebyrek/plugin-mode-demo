package com.eldarbay.root.service.entrance.strategy.impl;

import com.eldarbay.plugininterface.common.Plugin;
import com.eldarbay.plugininterface.common.PluginName;
import com.eldarbay.plugininterface.whitelist.WhiteListService;
import com.eldarbay.root.PluginManager;
import com.eldarbay.root.dto.CarEntryDTO;
import com.eldarbay.root.service.entrance.strategy.CarEventStrategy;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Slf4j
@AllArgsConstructor
@Service
public class CarEventWhiteListStrategy implements CarEventStrategy {

    PluginManager pluginManager;

    @Override
    public void carEntry(CarEntryDTO carEntryDTO) {
        log.info("WhiteList Strategy starting...");
        Map<PluginName, Plugin> plugins = pluginManager.getPlugins();
        WhiteListService whiteListService = (WhiteListService) plugins.get(PluginName.WHITELIST);
        char[] chars = whiteListService.getStringChars("carevent");
        log.info("WhiteList plugin response = {}", chars);
    }

    @Override
    public List<PluginName> getPlugins() {
        List<PluginName> pluginNameList = new ArrayList<>();
        pluginNameList.add(PluginName.WHITELIST);
        return pluginNameList;
    }
}
