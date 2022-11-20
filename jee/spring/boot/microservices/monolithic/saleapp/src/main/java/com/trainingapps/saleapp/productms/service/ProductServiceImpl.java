package com.trainingapps.saleapp.productms.service;

import com.trainingapps.saleapp.productms.exceptions.ProductNotFoundException;
import com.trainingapps.saleapp.productms.dao.IProductDao;
import com.trainingapps.saleapp.productms.dto.AddProductRequest;
import com.trainingapps.saleapp.productms.dto.ChangePriceRequest;
import com.trainingapps.saleapp.productms.dto.ProductDetails;
import com.trainingapps.saleapp.productms.entity.Product;
import com.trainingapps.saleapp.productms.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Autowired
    private ProductUtil util;
    private int generatedId;

    private int generateId() {
        return ++generatedId;
    }

    @Override
    public ProductDetails addProduct(AddProductRequest request) {
        long id=generateId();
        Product product = new Product(request.getName(), request.getPrice());
        product.setId(id);
        product=productDao.save(product);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public Product findById(long id) throws ProductNotFoundException {
        Product product = productDao.findById(id);
        if (product == null) {
            throw new ProductNotFoundException("product not found for id=" + id);
        }
        return product;
    }

    @Override
    public ProductDetails findProductDetailsById(long id) throws ProductNotFoundException {
        Product product=findById(id);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public ProductDetails changePrice(long productId, ChangePriceRequest requestData) throws ProductNotFoundException {
        Product product = findById(productId);
        product.setPrice(requestData.getNewPrice());
        product=productDao.save(product);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public List<ProductDetails> findAll() {
        List<Product> products = productDao.findAll();
        List<ProductDetails>desired=util.toListProductDetails(products);
        return desired;
    }

}
