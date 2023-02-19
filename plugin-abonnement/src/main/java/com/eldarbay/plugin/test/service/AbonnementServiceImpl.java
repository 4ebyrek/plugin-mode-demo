package com.eldarbay.plugin.test.service;

import com.eldarbay.plugininterface.abonnement.AbonnementService;
import com.eldarbay.plugininterface.common.PluginName;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AbonnementServiceImpl implements AbonnementService {

    @Override
    public PluginName getPluginType() {
        return PluginName.ABONNEMENT;
    }

    @Override
    public String getUpperCaseString(String string) {
        return string.toUpperCase();
    }
}
