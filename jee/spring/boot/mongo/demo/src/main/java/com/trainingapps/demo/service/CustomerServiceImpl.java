package com.trainingapps.demo.service;

import com.trainingapps.demo.entity.Customer;
import com.trainingapps.demo.exceptions.CustomerNotFoundException;
import com.trainingapps.demo.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    private ICustomerRepository repository;

    private long generated;

    public String generateId(){
        String newId=++generated+"";
        return newId;
    }

    @Override
    public Customer add(String name, int age) {
        Customer customer = new Customer(name,age);
        String newId=generateId();
        customer.setId(newId);
        Customer saved=repository.save(customer);
        return saved;
    }

    @Override
    public Customer findById(String id) throws CustomerNotFoundException{
       Optional<Customer> optional= repository.findById(id);
        if(!optional.isPresent()){
            throw new CustomerNotFoundException("customer not found for id="+id);
        }
        Customer customer= optional.get();
        return customer;
    }

    @Override
    public Customer changeName(String id, String newName) throws CustomerNotFoundException{
       Customer customer =findById(id);
       customer.setName(newName);
       Customer saved=repository.save(customer);
       return saved;
    }
}
