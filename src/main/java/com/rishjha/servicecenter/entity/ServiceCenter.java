package com.rishjha.servicecenter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceCenter {

    private Integer id;

    private Brand brand;

    private Location location;

}
