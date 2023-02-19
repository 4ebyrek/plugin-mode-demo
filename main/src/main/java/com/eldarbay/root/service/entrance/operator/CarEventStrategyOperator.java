package com.eldarbay.root.service.entrance.operator;

import com.eldarbay.plugininterface.common.PluginName;
import com.eldarbay.root.PluginManager;
import com.eldarbay.root.ex.StrategyNotFoundException;
import com.eldarbay.root.service.entrance.strategy.CarEventStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@AllArgsConstructor
public class CarEventStrategyOperator {

    List<CarEventStrategy> strategyList;

    PluginManager pluginManager;

    public CarEventStrategy chooseStrategy(){
        Set<PluginName> pluginNameSet = pluginManager.getPlugins().keySet();
        return strategyList.stream()
                .filter(crEventStrtg -> crEventStrtg.getPlugins().containsAll(pluginNameSet))
                .findFirst()
                .orElseThrow(StrategyNotFoundException::new);
    }
}
