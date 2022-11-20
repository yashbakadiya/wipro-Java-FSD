package com.traniningapps.productms.service;

import com.traniningapps.productms.dto.AddProductRequest;
import com.traniningapps.productms.dto.ChangePriceRequest;
import com.traniningapps.productms.dto.ProductDetails;
import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.ProductNotFoundException;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Validated
public interface IProductService {

    ProductDetails addProduct(@Valid AddProductRequest request);

    Product findById(@NotBlank String id) throws ProductNotFoundException;

    ProductDetails findProductDetailsById(@NotBlank String id) throws ProductNotFoundException;

    ProductDetails changePrice(@NotBlank String productId,@Valid ChangePriceRequest request) throws ProductNotFoundException;

    List<ProductDetails> findAll();

    void deleteById(@NotBlank String id);
}
