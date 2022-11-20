package com.trainingapps.saleapp.customerms.controller;

import com.trainingapps.saleapp.customerms.dto.BuyProduct;
import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.dto.RegisterCustomer;
import com.trainingapps.saleapp.customerms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customers")
@RestController
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @PostMapping("/register")
    public CustomerDetails register(@RequestBody  RegisterCustomer request){
        return service.register(request);
    }

    @GetMapping("/byid/{id}")
    public CustomerDetails findById(@PathVariable long id) throws Exception{
        return service.findCustomerDetailsById(id);
    }

    @PutMapping("/product/buy")
    public CustomerDetails buyProduct(@RequestBody BuyProduct request) throws Exception{
        return service.buyProduct(request);
    }

}
