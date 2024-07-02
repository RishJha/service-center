package com.rishjha.servicecenter.dto;

import com.rishjha.servicecenter.entity.Customer;
import com.rishjha.servicecenter.entity.Location;
import com.rishjha.servicecenter.entity.ServiceCenter;
import com.rishjha.servicecenter.entity.Slot;
import com.rishjha.servicecenter.entity.Vehicle;

public class CreateServiceRequest {

    private ServiceCenter serviceCenter;

    private Customer customer;

    private Location deliveryLocation;

    private Vehicle vehicle;

    private Slot slot;

}
