package com.trainingapps.saleapp.productms.dao;

import com.trainingapps.saleapp.productms.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductDaoImpl implements IProductDao {
    private Map<Long, Product> store = new HashMap<>();


    @Override
    public Product findById(long id) {
        Product product = store.get(id);
        return product;
    }

    @Override
    public Product save(Product product) {
        store.put(product.getId(), product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        Collection<Product> products = store.values();
        List<Product> desired = new ArrayList<>(products);
        return desired;
    }

    @Override
    public void deleteById(long id) {
        store.remove(id);
    }
}
