package com.trainingapps.saleapp.productms.controller;

import com.trainingapps.saleapp.productms.dto.AddProductRequest;
import com.trainingapps.saleapp.productms.dto.ChangePriceRequest;
import com.trainingapps.saleapp.productms.dto.ProductDetails;
import com.trainingapps.saleapp.productms.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {
    @Autowired
    private IProductService service;

// effective url /products/byid/{id}

    //@RequestMapping(path="/byid/{id}", method=RequestMethod.GET)
    @GetMapping("/byid/{id}")
    public ProductDetails getProductById(@PathVariable long id) throws Exception {
        ProductDetails response = service.findProductDetailsById(id);
        return response;
    }

    // effective url  /products
    @GetMapping
    public List<ProductDetails> fetchAll() {
        List<ProductDetails>response=service.findAll();
        return response;
    }


    // effective url  /products/add
    //@RequestMapping(path="/add", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public ProductDetails addProduct(@RequestBody AddProductRequest requestData) {
        ProductDetails response = service.addProduct(requestData);
        return response;
    }

    @PutMapping("/price/change/{id}")
    public ProductDetails changePrice(@RequestBody ChangePriceRequest requestData, @PathVariable long id) throws Exception {
        ProductDetails response = service.changePrice(id, requestData);
        return response;
    }



}
