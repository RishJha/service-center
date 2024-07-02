package com.rishjha.servicecenter.entity;

import com.rishjha.servicecenter.enums.ServiceStatus;

import java.time.LocalDate;

public class ServiceRequest extends AuditEntity {

    private Integer id;

    private ServiceCenter serviceCenter;

    private Customer customer;

    private Vehicle vehicle;

    private Slot slot;

    private LocalDate serviceDate;

    private ServiceStatus serviceStatus;

    private Location deliveryLocation;

}
