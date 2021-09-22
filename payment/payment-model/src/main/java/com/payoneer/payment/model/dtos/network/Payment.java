
package com.payoneer.payment.model.dtos.network;

import com.squareup.moshi.Json;

public class Payment {

    @Json(name = "reference")
    private String reference;
    @Json(name = "amount")
    private Integer amount;
    @Json(name = "currency")
    private String currency;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
