package com.trainingapps.demo.service;

import com.trainingapps.demo.entity.Customer;
import com.trainingapps.demo.exceptions.CustomerNotFoundException;

public interface ICustomerService {

    Customer add(String name, int age);

    Customer findById(String id) throws CustomerNotFoundException;

    Customer changeName(String id, String name) throws CustomerNotFoundException;

}
