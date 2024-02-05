package com.trainingapps.productms.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.trainingapps.productms.dto.*;
import com.trainingapps.productms.service.IProductService;
import com.trainingapps.productms.util.ProductUtil;
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
    public ProductDetails getProductById(@PathVariable int id) throws Exception {
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

    @PutMapping("/update/{id}")
    public ProductDetails updateProduct(@RequestBody UpdateProductRequest requestData, @PathVariable int id) throws Exception {
        ProductDetails response = service.updateProduct(id, requestData);
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public String removeProduct(@PathVariable int id) {
        service.deleteById(id);
        return id + " product deleted";
    }


}
