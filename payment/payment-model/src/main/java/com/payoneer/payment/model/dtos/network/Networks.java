
package com.payoneer.payment.model.dtos.network;

import com.squareup.moshi.Json;

import java.util.List;

public class Networks {

    @Json(name = "applicable")
    private List<PaymentMethod> paymentMethods = null;

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

}
