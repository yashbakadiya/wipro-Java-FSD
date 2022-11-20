package com.trainingapps.productms.dao;

import com.trainingapps.productms.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.*;

@Repository
public class ProductDaoImpl implements IProductDao {

    @PersistenceContext
    //@Autowired
    private EntityManager em;


    @Override
    public Product findById(int id) {
        Product product = em.find(Product.class,id);
        return product;
    }

    @Override
    public Product save(Product product) {
        product=em.merge(product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        String queryText="from Product" ;
        TypedQuery<Product> query=em.createQuery(queryText,Product.class);
        List<Product> products = query.getResultList();
        return products;
    }
}