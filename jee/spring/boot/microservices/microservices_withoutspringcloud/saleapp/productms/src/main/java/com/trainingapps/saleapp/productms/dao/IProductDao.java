package com.trainingapps.saleapp.productms.dao;

import com.trainingapps.saleapp.productms.entity.Product;

import java.util.List;

public interface IProductDao {

   Product findById(long id) ;

   Product save(Product product);

   List<Product> findAll();

   void deleteById(long id);
}
