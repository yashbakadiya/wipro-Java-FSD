package com.trainingapps.productms.dao;

import com.trainingapps.productms.entity.Product;

import java.util.List;

public interface IProductDao {

   Product  save(Product product);

   Product findById(int id) ;


   List<Product> findAll();

}
