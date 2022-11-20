package com.trainingapps.productms.service;

import com.trainingapps.productms.exceptions.ProductNotFoundException;
import com.trainingapps.productms.dao.IProductDao;
import com.trainingapps.productms.dto.AddProductRequest;
import com.trainingapps.productms.dto.ChangePriceRequest;
import com.trainingapps.productms.dto.ProductDetails;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Autowired
    private ProductUtil util;

    @Override
    public ProductDetails addProduct(AddProductRequest request) {
        Product product = new Product(request.getName(), request.getPrice());
        product=productDao.save(product);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public Product findById(int id) throws ProductNotFoundException {
        Product product = productDao.findById(id);
        if (product == null) {
            throw new ProductNotFoundException("product not found for id=" + id);
        }
        return product;
    }

    @Override
    public ProductDetails findProductDetailsById(int id) throws ProductNotFoundException {
        Product product=findById(id);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public ProductDetails changePrice(int productId, ChangePriceRequest requestData) throws ProductNotFoundException {
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
