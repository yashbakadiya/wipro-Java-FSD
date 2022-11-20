package com.traniningapps.productms.repository;

import com.sun.tools.javac.util.List;
import com.traniningapps.productms.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {

   List<Product> findByPrice(double price);

   Optional<Product> findByName(String name);

}
