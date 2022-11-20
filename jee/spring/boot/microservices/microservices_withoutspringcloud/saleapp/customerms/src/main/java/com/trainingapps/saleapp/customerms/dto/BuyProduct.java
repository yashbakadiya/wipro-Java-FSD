package com.trainingapps.saleapp.customerms.dto;

import javax.validation.constraints.Min;

public class BuyProduct {
    @Min(1)
    private Long customerId;
    @Min(1)
    private Long productId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
