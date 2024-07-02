package com.rishjha.servicecenter.service;

import com.rishjha.servicecenter.entity.Vehicle;

public interface VehicleService {

    Vehicle getVehicleByRegistrationNumber(String registrationNumber);

}
