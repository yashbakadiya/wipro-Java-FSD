package com.trainingapps.productms.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;

public class ChangeNameRequest {
    @Length(min=2, max=20)
    private String updatedName;

    public String getUpdatedName() {
        return updatedName;
    }

}
