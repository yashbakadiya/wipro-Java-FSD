package com.trainingapps.productms.service;

import com.trainingapps.productms.dao.IProductDao;
import com.trainingapps.productms.dto.ProductDetails;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import com.trainingapps.productms.service.ProductServiceImpl;
import com.trainingapps.productms.util.ProductUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    @Mock
    IProductDao dao;

    @Mock
    ProductUtil util;

    @Spy
    @InjectMocks
    ProductServiceImpl service;


    /**
     * scenario: product exists in the store
     * input : id=10
     * expectation: product returned from store
     */
    @Test
    public  void testFindById_1() throws Exception{
        int id=10;
        Product expected=mock(Product.class);
        when(dao.findById(id)).thenReturn(expected);
        Product result=service.findById(id);
        assertEquals(expected,result);
        verify(dao).findById(id);
    }


    /**
     * scenario: product does NOT exist in the store
     * input : id=10
     * expectation: ProductNotFoundException thrown
     */
    @Test
    public void testFindById_2() throws Exception{
        int id=20;
        /*
        Executable executable=new Executable(){
            @Override
            public void execute() throws Throwable {
                Product result=service.findById(id);

            }
        };

         */
        Executable executable=()->service.findById(id);
        assertThrows(ProductNotFoundException.class,executable);
    }

    /**
     * scenario: product exists in the store
     * input : id=10
     * expectation: product
     */
    @Test
    public void testFindProductDetailsById_1() throws Exception {
        int id = 10;
        Product product = mock(Product.class);
        ProductDetails expected=mock(ProductDetails.class);
        doReturn(product).when(service).findById(id);
        when(util.toProductDetails(product)).thenReturn(expected);
        ProductDetails result = service.findProductDetailsById(id);
        assertEquals(expected,result);
        verify(service).findById(id);
        verify(util).toProductDetails(product);
    }


    /**
     * scenario: product does NOT exist in the store
     * input : id=10
     * expectation: ProductNotFoundException thrown
     */
    @Test
    public void testFindProductDetailsById_2() throws Exception{
        int id=30;
        doThrow(ProductNotFoundException.class).when(service).findById(id);
        Executable executable=()-> service.findProductDetailsById(id);
        assertThrows(ProductNotFoundException.class,executable);
    }




}