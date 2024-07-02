package com.rishjha.servicecenter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    private Long id;

    private String address;
    private String city;
    private String state;
    private String zipCode;
    private Double latitude;
    private Double longitude;

}
