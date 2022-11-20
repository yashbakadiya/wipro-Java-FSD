package com.traniningapps.productms.service;

import com.traniningapps.productms.dao.IProductDao;
import com.traniningapps.productms.dao.ProductDaoImpl;
import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.InvalidProductNameException;
import com.traniningapps.productms.exceptions.InvalidProductPriceException;
import com.traniningapps.productms.exceptions.InvalidProductIdException;
import com.traniningapps.productms.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public Product addProduct(String name, double price) {
        validateProductName(name);
        validatePrice(price);
        Product product = new Product(name, price);
        product=productDao.save(product);
        return product;
    }

    @Override
    public Product findById(int id) throws ProductNotFoundException {
        validateId(id);
        Product product = productDao.findById(id);
        if (product == null) {
            throw new ProductNotFoundException("product not found for id=" + id);
        }
        return product;
    }

    @Override
    public Product changePrice(int productId, double newPrice) throws ProductNotFoundException {
        Product product = findById(productId);
        product.setPrice(newPrice);
        product=productDao.save(product);
        return product;
    }


    @Override
    public List<Product> findAll() {
        List<Product> products = productDao.findAll();
        return products;
    }

    void validatePrice(double price) {
        if (price < 0) {
            throw new InvalidProductPriceException("invalid product price=" + price);
        }
    }

    void validateId(int id) {
        if (id <= 0) {
            throw new InvalidProductIdException("invalid productid=" + id);
        }
    }

    void validateProductName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidProductNameException("name can't be empty or null");
        }
    }
}
