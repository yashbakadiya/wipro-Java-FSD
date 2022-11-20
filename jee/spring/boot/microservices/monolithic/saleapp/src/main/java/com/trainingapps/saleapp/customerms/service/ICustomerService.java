package com.trainingapps.saleapp.customerms.service;

import com.trainingapps.saleapp.customerms.dto.BuyProduct;
import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.dto.RegisterCustomer;
import com.trainingapps.saleapp.customerms.exceptions.CustomerNotFoundException;
import com.trainingapps.saleapp.productms.exceptions.ProductNotFoundException;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Validated
public interface ICustomerService {
    CustomerDetails register(@Valid RegisterCustomer request);

    CustomerDetails findCustomerDetailsById(@Min(1)Long id)throws CustomerNotFoundException;

    CustomerDetails buyProduct(@Valid BuyProduct request)throws CustomerNotFoundException, ProductNotFoundException;

}
