package com.rishjha.servicecenter.service;

import com.rishjha.servicecenter.entity.Customer;

public interface CustomerService {

    Customer getCustomerByPhone(String phone);

}
