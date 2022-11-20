package com.trainingapps.saleapp.productms.dto;

import javax.validation.constraints.Min;

public class ChangePriceRequest {
    @Min(0)
    private double newPrice;

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }
}
