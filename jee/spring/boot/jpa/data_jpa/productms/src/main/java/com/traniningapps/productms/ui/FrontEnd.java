package com.traniningapps.productms.ui;

import com.traniningapps.productms.entity.Product;
import com.traniningapps.productms.exceptions.InvalidProductIdException;
import com.traniningapps.productms.exceptions.InvalidProductNameException;
import com.traniningapps.productms.exceptions.InvalidProductPriceException;
import com.traniningapps.productms.exceptions.ProductNotFoundException;
import com.traniningapps.productms.service.IProductService;
import com.traniningapps.productms.service.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;


@Component
public class FrontEnd {

    private Logger Log= LoggerFactory.getLogger(FrontEnd.class);

    @Autowired
    private IProductService service;

    public void runUI() {
        try {
            Log.debug("****adding products");
            Product product1 = service.addProduct("samsung", 20000);
            display(product1);
            Product product2 = service.addProduct("mototrolla", 15000);
            display(product2);

            int product1Id = product1.getId();
            System.out.println("****find product by id=" + product1Id);
            Product foundProduct = service.findById(product1Id);
            display(foundProduct);

            System.out.println("**change product price");
            Product changedProduct = service.changePrice(product1Id, 30000);
            display(changedProduct);

            System.out.println("*********displaying all products");
            List<Product> products=service.findAll();
            System.out.println("dound products="+products.size());
            displayProducts(products);

        } catch (ProductNotFoundException|InvalidProductNameException
                |InvalidProductIdException|
                InvalidProductPriceException e) {
            Log.error(e.getMessage(),e);
        }catch (Exception e) {
            Log.error("something went wrong, please try again",e);
        }
    }

    void display(Product product) {
        System.out.println("product " + product.getId() + " " + product.getName() + " " + product.getPrice());
    }

    void displayProducts(Collection<Product> products) {

        for (Product product : products) {
            display(product);
        }
    }

}
