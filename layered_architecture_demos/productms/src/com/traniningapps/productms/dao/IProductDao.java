package com.traniningapps.productms.dao;

import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.ProductNotFoundException;

public interface IProductDao {

   void  add(Product product);

   Product findById(int id) ;

   void update(Product product);

   Product [] findAll();


}
