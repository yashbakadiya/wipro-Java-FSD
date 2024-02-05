package com.trainingapps.productms.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;

public class UpdateProductRequest {
    @Length(min=2, max=20)
    private String newName;

    @Min(0)
    private double newPrice;

    public String getNewName() { return newName; }

    public double getNewPrice() {
        return newPrice;
    }

}
