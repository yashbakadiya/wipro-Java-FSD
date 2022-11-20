package com.trainingapps.saleapp.customerms.dao;

import com.trainingapps.saleapp.customerms.entity.Customer;

import java.util.Optional;

public interface ICustomerDao {

    Customer save(Customer customer);

    Optional<Customer> findById(long id);
}
