package com.trainingapps.demo.frontend;

import com.trainingapps.demo.entity.Customer;
import com.trainingapps.demo.exceptions.CustomerNotFoundException;
import com.trainingapps.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FrontEnd {
    @Autowired
    private ICustomerService service;

    public void runUI() {
        try {
            Customer customer = service.add("jitender", 21);
            System.out.println("customer added");
            display(customer);
            String id = customer.getId();
            Customer found = service.findById(id);
            System.out.println("customer fetched by id=" + id);
            display(found);
            Customer changed=service.changeName(id,"jitender kumar");
            System.out.println("name changed");
            display(changed);
        } catch (CustomerNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void display(Customer customer) {
        System.out.println(customer.getId() + "-" + customer.getName() + "-" + customer.getAge());
    }
}

