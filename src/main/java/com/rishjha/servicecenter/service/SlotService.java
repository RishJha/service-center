package com.rishjha.servicecenter.service;

import com.rishjha.servicecenter.entity.ServiceCenter;
import com.rishjha.servicecenter.entity.Slot;

public interface SlotService {

    Slot getAvailableSlots(ServiceCenter serviceCenter);

}
