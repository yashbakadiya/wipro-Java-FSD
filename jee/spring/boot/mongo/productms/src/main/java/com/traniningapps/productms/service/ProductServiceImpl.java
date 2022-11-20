package com.traniningapps.productms.service;

import com.traniningapps.productms.dao.IProductDao;
import com.traniningapps.productms.dto.AddProductRequest;
import com.traniningapps.productms.dto.ChangePriceRequest;
import com.traniningapps.productms.dto.ProductDetails;
import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.ProductNotFoundException;
import com.traniningapps.productms.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Autowired
    private ProductUtil util;

    private long generatedId;


    public String generateId() {
        String newId = ++generatedId + "";
        return newId;
    }

    @Override
    public ProductDetails addProduct(AddProductRequest request) {
        Product product = new Product(request.getName(), request.getPrice());
        String id = generateId();
        product.setId(id);
        product = productDao.save(product);
        ProductDetails desired = util.toProductDetails(product);
        return desired;
    }

    @Override
    public Product findById(String id) throws ProductNotFoundException {
        Optional<Product> optional = productDao.findById(id);
        if (!optional.isPresent()) {
            throw new ProductNotFoundException("product not found for id=" + id);
        }
        Product product = optional.get();
        return product;
    }

    @Override
    public ProductDetails findProductDetailsById(String id) throws ProductNotFoundException {
        Product product = findById(id);
        ProductDetails desired = util.toProductDetails(product);
        return desired;
    }

    @Override
    public ProductDetails changePrice(String productId, ChangePriceRequest requestData) throws ProductNotFoundException {
        Product product = findById(productId);
        product.setPrice(requestData.getNewPrice());
        product = productDao.save(product);
        ProductDetails desired = util.toProductDetails(product);
        return desired;
    }

    @Override
    public List<ProductDetails> findAll() {
        List<Product> products = productDao.findAll();
        List<ProductDetails> desired = util.toListProductDetails(products);
        return desired;
    }

    @Override
    public void deleteById(String id) {
        productDao.deleteById(id);
    }
}
