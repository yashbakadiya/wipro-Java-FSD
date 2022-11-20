package com.traniningapps.productms.dao;

import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.ProductNotFoundException;

import java.util.List;

public interface IProductDao {

   Product save(Product product);

   Product findById(int id) ;

   List<Product> findAll();


}
