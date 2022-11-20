package com.traniningapps.productms.dao;

import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.ProductNotFoundException;

public class ProductDaoImpl implements IProductDao {
    private Product store[] = new Product[10];
    private int index;

    private int generatedId;

    private int generateId() {
        return ++generatedId;
    }

    @Override
    public void add(Product product) {
        int id = generateId();
        product.setId(id);
        store[index] = product;
        index++;
    }

    @Override
    public Product findById(int id) {
        for (Product product : store) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(Product productArg) {
        int index = 0;
        for (Product product : store) {
            if (product!=null && product.getId() == productArg.getId()) {
                store[index] = productArg;
                index++;
            }
        }

    }

    @Override
    public Product[] findAll() {
       Product products[]=new Product[index];
       for (int i=0;i<index;i++){
           Product product=store[i];
           products[i]=product;
       }
       return products;
    }
}
