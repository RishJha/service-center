package com.rishjha.servicecenter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Slot {

    private Integer id;

    private ServiceCenter serviceCenter;

    private LocalTime start;

    private LocalTime end;

    private Integer capacity;

}
