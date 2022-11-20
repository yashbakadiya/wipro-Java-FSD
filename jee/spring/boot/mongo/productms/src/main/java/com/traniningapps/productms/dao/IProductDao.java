package com.traniningapps.productms.dao;

import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.ProductNotFoundException;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IProductDao extends MongoRepository<Product,String> {


}
