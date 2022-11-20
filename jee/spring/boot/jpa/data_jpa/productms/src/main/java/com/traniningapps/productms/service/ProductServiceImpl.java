package com.traniningapps.productms.service;

import com.traniningapps.productms.repository.IProductRepository;
import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.InvalidProductNameException;
import com.traniningapps.productms.exceptions.InvalidProductPriceException;
import com.traniningapps.productms.exceptions.InvalidProductIdException;
import com.traniningapps.productms.exceptions.ProductNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ProductServiceImpl implements IProductService {
    private static final Logger Log= LoggerFactory.getLogger(ProductServiceImpl.class);


    @Autowired
    private IProductRepository productRepository;

    @Override
    public Product addProduct(String name, double price) {
        validateProductName(name);
        validatePrice(price);
        Product product = new Product(name, price);
        product = productRepository.save(product);
        return product;
    }

    @Override
    public Product findById(int id) throws ProductNotFoundException {
        validateId(id);
        Optional<Product> optional = productRepository.findById(id);
        if (!optional.isPresent()) {
            throw new ProductNotFoundException("product not found for id=" + id);
        }
        Product product = optional.get();
        return product;
    }

    @Override
    public Product changePrice(int productId, double newPrice) throws ProductNotFoundException {
        Product product = findById(productId);
        product.setPrice(newPrice);
        product = productRepository.save(product);
        return product;
    }


    @Override
    public List<Product> findAll() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Product findByName(String name) throws ProductNotFoundException {
        Log.debug("inide findByName() name=" + name);
        Optional<Product> optional = productRepository.findByName(name);
        if (!optional.isPresent()) {
            throw new ProductNotFoundException("product not found for name=" + name);
        }
        Product product = optional.get();
        return product;
    }

    @Override
    public List<Product> findByPrice(double price) {
        List<Product> list = productRepository.findByPrice(price);
        return list;
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
