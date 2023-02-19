package com.eldarbay.root.service;

import com.eldarbay.root.service.entrance.context.CarEventContext;
import com.eldarbay.root.dto.CarEntryDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarEventService {

    private CarEventContext context;

    public void carEnter(CarEntryDTO carEntryDTO) {
        context.execute(carEntryDTO);
    }
}
