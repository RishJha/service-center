package com.rishjha.servicecenter.service;

import com.rishjha.servicecenter.entity.DeliveryRequest;
import com.rishjha.servicecenter.entity.Rider;
import com.rishjha.servicecenter.entity.ServiceRequest;
import com.rishjha.servicecenter.enums.DeliveryRequestStatus;

public interface RiderService {

    DeliveryRequest createDeliveryRequest(ServiceRequest serviceRequest);

    void updateAssignedTask(Rider rider, DeliveryRequest deliveryRequest, DeliveryRequestStatus status);

}
