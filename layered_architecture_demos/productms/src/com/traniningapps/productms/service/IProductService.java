package com.traniningapps.productms.service;

import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.ProductNotFoundException;

public interface IProductService {

   Product addProduct(String name, double price);

   Product findById(int id) throws ProductNotFoundException;

   Product changePrice(int productId, double price) throws ProductNotFoundException ;

   Product [] findAll();

}
