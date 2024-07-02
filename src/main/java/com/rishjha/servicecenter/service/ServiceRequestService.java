package com.rishjha.servicecenter.service;

import com.rishjha.servicecenter.dto.CreateServiceRequest;
import com.rishjha.servicecenter.entity.ServiceRequest;
import com.rishjha.servicecenter.enums.ServiceStatus;

public interface ServiceRequestService {

    ServiceRequest createService(CreateServiceRequest createServiceRequest);

    void updateServiceRequestStatus(ServiceRequest serviceRequest, ServiceStatus status);

}
