package com.trainingapps.productms.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trainingapps.productms.dto.ProductDetails;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import com.trainingapps.productms.service.IProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@WebMvcTest(ProductController.class)
class ProductControllerMvcTest {

    @MockBean
    IProductService service;

    @Autowired
    MockMvc mvc;

    @Test
    public void testGetById_1() throws Exception {
        int id = 200;
        String name="samsung";
        double price=10000;
        ProductDetails details = new ProductDetails();
        details.setId(id);
        details.setName(name);
        details.setPrice(price);

        ObjectMapper objectMapper=new ObjectMapper();
        String expectedJson=objectMapper.writeValueAsString(details);
        System.out.println("***json="+expectedJson);
        when(service.findProductDetailsById(id)).thenReturn(details);
        String url = "/products/byid/200";
        mvc.perform(get(url))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson));
    }

    /**
     * scenario : product is NOT found
     * expectation : status code 404, response is exception message
     */
    @Test
    public void testGetById_2() throws Exception {
        int id = 100;
        String expectedResponse = "product not found";
        ProductNotFoundException exception = new ProductNotFoundException(expectedResponse);
        when(service.findProductDetailsById(id)).thenThrow(exception);
        String url = "/products/byid/100";
        mvc.perform(get(url))
                .andExpect(status().isNotFound())
                .andExpect(content().string(expectedResponse))
        ;
    }


}