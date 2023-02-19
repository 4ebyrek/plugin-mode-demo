package com.eldarbay.root.rest;

import com.eldarbay.root.dto.CarEntryDTO;
import com.eldarbay.root.service.CarEventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CarEventController {

    private CarEventService carEventService;

    @PostMapping("/car/event")
    public ResponseEntity<Void> carEvent(@RequestBody CarEntryDTO carEntryDTO){
        carEventService.carEnter(carEntryDTO);
        return ResponseEntity.ok().build();
    }
}
