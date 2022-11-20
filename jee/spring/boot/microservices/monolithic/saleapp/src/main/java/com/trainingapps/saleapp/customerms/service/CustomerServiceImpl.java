package com.trainingapps.saleapp.customerms.service;

import com.trainingapps.saleapp.customerms.dao.ICustomerDao;
import com.trainingapps.saleapp.customerms.dto.BuyProduct;
import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.dto.RegisterCustomer;
import com.trainingapps.saleapp.customerms.entity.Customer;
import com.trainingapps.saleapp.customerms.exceptions.CustomerNotFoundException;
import com.trainingapps.saleapp.customerms.util.CustomerUtil;
import com.trainingapps.saleapp.productms.entity.Product;
import com.trainingapps.saleapp.productms.exceptions.ProductNotFoundException;
import com.trainingapps.saleapp.productms.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerDao customerDao;

    @Autowired
    private CustomerUtil customerUtil;

    @Autowired
    private IProductService productService;

    private long generatedId;

    public long generateId() {
        return ++generatedId;
    }

    @Override
    public CustomerDetails register(RegisterCustomer request) {
        long id = generateId();
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(request.getName());
        customer = customerDao.save(customer);
        CustomerDetails desired = customerUtil.toCustomerDetails(customer);
        return desired;
    }

    @Override
    public CustomerDetails findCustomerDetailsById(Long id) throws CustomerNotFoundException {
        Customer customer = findById(id);
        CustomerDetails desired = customerUtil.toCustomerDetails(customer);
        return desired;
    }

    public Customer findById(Long id) throws CustomerNotFoundException {
        Optional<Customer> optional = customerDao.findById(id);
        if (!optional.isPresent()) {
            throw new CustomerNotFoundException("customer not found for id=" + id);
        }
        return optional.get();
    }

    @Override
    public CustomerDetails buyProduct(BuyProduct request) throws CustomerNotFoundException, ProductNotFoundException {
        Customer customer = findById(request.getCustomerId());
        Product product = productService.findById(request.getProductId());
        List<Product> boughtProducts= customer.getBoughtProducts();
        if(boughtProducts==null){
            boughtProducts=new ArrayList<>();
            customer.setBoughtProducts(boughtProducts);
        }
        boughtProducts.add(product);
        customer=customerDao.save(customer);
        CustomerDetails desired = customerUtil.toCustomerDetails(customer);
        return desired;
    }
}
