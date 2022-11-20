package com.trainingapps.saleapp.customerms.dao;

import com.trainingapps.saleapp.customerms.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
    private Map<Long, Customer> store = new HashMap<>();

    @Override
    public Customer save(Customer customer) {
        store.put(customer.getId(), customer);
        return customer;
    }

    @Override
    public Optional<Customer> findById(long id) {
        Customer customer = store.get(id);
        if(customer!=null){
            Optional<Customer>optional=Optional.of(customer);
            return optional;
        }
        Optional<Customer>optional=Optional.empty();
        return optional;
    }
}
