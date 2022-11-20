package com.trainingapps.demo.repository;

import com.trainingapps.demo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICustomerRepository extends MongoRepository<Customer,String> {
}
