package com.paynoneer.payment.domain.entities;

import java.util.Objects;

public class PaymentMethodDomainModel {

    private String name;
    private String logoUrl;

    public PaymentMethodDomainModel(String name, String logoUrl) {
        this.name = name;
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentMethodDomainModel that = (PaymentMethodDomainModel) o;
        return Objects.equals(name, that.name) && Objects.equals(logoUrl, that.logoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, logoUrl);
    }
}