package com.trainingapps.productms.controller;

import com.trainingapps.productms.dto.AddProductRequest;
import com.trainingapps.productms.dto.ChangePriceRequest;
import com.trainingapps.productms.dto.ProductDetails;
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

    @PutMapping("/price/change/{id}")
    public ProductDetails changePrice(@RequestBody ChangePriceRequest requestData, @PathVariable int id) throws Exception {
        ProductDetails response = service.changePrice(id, requestData);
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public String removeProduct(@PathVariable int id) {
        service.deleteById(id);
        return id + " product deleted";
    }


}
