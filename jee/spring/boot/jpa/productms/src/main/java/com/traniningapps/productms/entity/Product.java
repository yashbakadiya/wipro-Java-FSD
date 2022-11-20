package com.traniningapps.productms.entity;

import javax.persistence.*;
import java.util.Objects;

@Table(name="products")
@Entity
public class Product {
    @GeneratedValue
    @Id
    private Integer id;
    @Column(name ="pname",nullable=false)
    private String name;

    @Column(nullable=false)
    private Double price;

    public Product(){

    }

    public Product(String name, double price){
        setName(name);
        setPrice(price);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
