package com.eldarbay.root.service.entrance.strategy;

import com.eldarbay.plugininterface.common.PluginName;
import com.eldarbay.root.dto.CarEntryDTO;

import java.util.List;

public interface CarEventStrategy {
    void carEntry(CarEntryDTO carEntryDTO);

    List<PluginName> getPlugins();
}
