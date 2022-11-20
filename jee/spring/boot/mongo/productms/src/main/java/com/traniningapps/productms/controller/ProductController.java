package com.traniningapps.productms.controller;

import com.traniningapps.productms.dto.AddProductRequest;
import com.traniningapps.productms.dto.ChangePriceRequest;
import com.traniningapps.productms.dto.ProductDetails;
import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.service.IProductService;
import com.traniningapps.productms.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {
    @Autowired
    private IProductService service;
    @Autowired
    private ProductUtil util;
// effective url /products/byid/{id}

    //@RequestMapping(path="/byid/{id}", method=RequestMethod.GET)
    @GetMapping("/byid/{id}")
    public ProductDetails getProductById(@PathVariable String id) throws Exception {
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
    public ProductDetails changePrice(@RequestBody ChangePriceRequest requestData, @PathVariable String id) throws Exception {
        ProductDetails response = service.changePrice(id, requestData);
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public String removeProduct(@PathVariable String id) {
        service.deleteById(id);
        return id + " product deleted";
    }


}
