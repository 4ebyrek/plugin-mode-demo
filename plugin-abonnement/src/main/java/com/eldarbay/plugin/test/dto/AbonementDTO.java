package com.eldarbay.plugin.test.dto;


import lombok.Data;

import java.time.Instant;
@Data
public class AbonementDTO {
    private Long id;
    private String name;
    private Instant endDate;
    private Long carId;
}
