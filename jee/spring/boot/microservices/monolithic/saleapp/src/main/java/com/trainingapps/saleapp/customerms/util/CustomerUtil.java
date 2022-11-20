package com.trainingapps.saleapp.customerms.util;

import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.entity.Customer;
import com.trainingapps.saleapp.productms.dto.ProductDetails;
import com.trainingapps.saleapp.productms.entity.Product;
import com.trainingapps.saleapp.productms.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CustomerUtil {

    @Autowired
    private ProductUtil productUtil;

    public CustomerDetails toCustomerDetails(Customer customer) {
        CustomerDetails desired = new CustomerDetails();
        desired.setId(customer.getId());
        desired.setName(customer.getName());
        List<Product> products = customer.getBoughtProducts();
        if (products != null) {
            List<ProductDetails> productsDto = productUtil.toListProductDetails(products);
            desired.setProducts(productsDto);
        }
        return desired;

    }

}
