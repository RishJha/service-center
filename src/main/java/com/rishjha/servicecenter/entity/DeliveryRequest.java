package com.rishjha.servicecenter.entity;

import com.rishjha.servicecenter.enums.DeliveryRequestStatus;

public class DeliveryRequest extends AuditEntity {

    private Integer id;

    private ServiceRequest serviceRequest;

    private Rider rider;

    private Location source;

    private Location destination;

    private DeliveryRequestStatus status;

}
