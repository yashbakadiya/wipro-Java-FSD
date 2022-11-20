package com.traniningapps.productms.dao;

import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.ProductNotFoundException;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ProductDaoImpl implements IProductDao {
    private Map<Integer, Product> store = new HashMap<>();

    private int generatedId;

    private int generateId() {
        return ++generatedId;
    }

    @Override
    public void add(Product product) {
        int id = generateId();
        product.setId(id);
        store.put(id, product);
    }

    @Override
    public Product findById(int id)  {
        Product product=store.get(id);
       return product;
    }

    @Override
    public void update(Product product) {
       store.put(product.getId(), product);

    }

    @Override
    public List<Product> findAll() {
      Collection<Product> products= store.values();
      List<Product>desired=new ArrayList<>(products);
      return desired;
    }
}
