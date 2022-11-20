package com.trainingapps.saleapp.customerms.util;

import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.dto.ProductDetails;
import com.trainingapps.saleapp.customerms.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Component
public class CustomerUtil {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${product.baseurl}")
    private String baseProductUrl;

    public CustomerDetails toCustomerDetails(Customer customer) {
        CustomerDetails desired = new CustomerDetails();
        desired.setId(customer.getId());
        desired.setName(customer.getName());
        List<Long> productsId = customer.getBoughtProducts();
        if (productsId != null) {
            List<ProductDetails> productsDto = fetchProductsListByProductsId(productsId);
            desired.setProducts(productsDto);
        }
        return desired;

    }

    List<ProductDetails> fetchProductsListByProductsId(Collection<Long> ids) {
        List<ProductDetails> list = new ArrayList<>();
        for (Long id : ids) {
            ProductDetails product = fetchProductDetailsByProductId(id);
            list.add(product);
        }
        return list;
    }

    ProductDetails fetchProductDetailsByProductId(long productId) {
        String url = baseProductUrl+"/byid/" + productId;
        ProductDetails product = restTemplate.getForObject(url, ProductDetails.class);
        return product;
    }

}
