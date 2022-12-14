package com.trainingapps.saleapp.customerms.entity;

import java.util.*;

import java.util.Objects;

public class Customer {
    private Long id;
    private String name;
    private List<Long> boughtProducts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(List<Long> boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
