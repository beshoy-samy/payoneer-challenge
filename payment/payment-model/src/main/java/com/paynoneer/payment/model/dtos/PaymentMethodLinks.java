
package com.paynoneer.payment.model.dtos;

import com.squareup.moshi.Json;

public class PaymentMethodLinks {

    @Json(name = "logo")
    private String logo;
    @Json(name = "self")
    private String self;
    @Json(name = "lang")
    private String lang;
    @Json(name = "operation")
    private String operation;
    @Json(name = "validation")
    private String validation;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

}
