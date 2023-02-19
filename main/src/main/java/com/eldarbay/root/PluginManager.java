package com.eldarbay.root;

import com.eldarbay.plugininterface.common.Plugin;
import com.eldarbay.plugininterface.common.PluginName;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PluginManager {

    List<Plugin> plugins;

    public PluginManager(List<Plugin> plugins) {
        this.plugins = plugins;
    }

    public Map<PluginName, Plugin> getPlugins(){
        return plugins.stream()
                .collect(
                        Collectors.toMap(
                                Plugin::getPluginType, Function.identity()
                        )
                );
    }
}
