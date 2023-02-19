package com.eldarbay.root.service.entrance.context;

import com.eldarbay.root.dto.CarEntryDTO;
import com.eldarbay.root.service.entrance.operator.CarEventStrategyOperator;
import com.eldarbay.root.service.entrance.strategy.CarEventStrategy;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class CarEventContext {

    CarEventStrategyOperator carEventStrategyOperator;

    public void execute (CarEntryDTO carEntryDTO) {
        log.info("CarEvent starting...");
        CarEventStrategy strategy = carEventStrategyOperator.chooseStrategy();
        strategy.carEntry(carEntryDTO);
        log.info("CarEvent end...");
    }
}
