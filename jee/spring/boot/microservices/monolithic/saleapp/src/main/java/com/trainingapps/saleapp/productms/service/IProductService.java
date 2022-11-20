package com.trainingapps.saleapp.productms.service;

import com.trainingapps.saleapp.productms.dto.AddProductRequest;
import com.trainingapps.saleapp.productms.dto.ChangePriceRequest;
import com.trainingapps.saleapp.productms.dto.ProductDetails;
import com.trainingapps.saleapp.productms.entity.Product;
import com.trainingapps.saleapp.productms.exceptions.ProductNotFoundException;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
public interface IProductService {

    ProductDetails addProduct(@Valid AddProductRequest request);

    Product findById(@Min(1)long id) throws ProductNotFoundException;

    ProductDetails findProductDetailsById(@Min(1)long id) throws ProductNotFoundException;

    ProductDetails changePrice(@Min(1)long productId,@Valid ChangePriceRequest request) throws ProductNotFoundException;

    List<ProductDetails> findAll();


}
