package com.trainingapps.productms.service;

import com.trainingapps.productms.dto.*;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
public interface IProductService {

    ProductDetails addProduct(@Valid AddProductRequest request);

    Product findById(@Min(1)int id) throws ProductNotFoundException;

    ProductDetails findProductDetailsById(@Min(1)int id) throws ProductNotFoundException;

    ProductDetails updateProduct(@Min(1)int productId,@Valid UpdateProductRequest request) throws ProductNotFoundException;

    List<ProductDetails> findAll();

    void deleteById(@Min(1)int id);
}
