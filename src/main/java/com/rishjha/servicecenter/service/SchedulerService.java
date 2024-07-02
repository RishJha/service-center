package com.rishjha.servicecenter.service;

import com.rishjha.servicecenter.entity.ServiceCenter;

public interface SchedulerService {

    void processRequests(ServiceCenter serviceCenter);

}
