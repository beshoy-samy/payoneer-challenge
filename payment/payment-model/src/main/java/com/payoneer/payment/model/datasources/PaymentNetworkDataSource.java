package com.payoneer.payment.model.datasources;

import com.payoneer.payment.model.dtos.network.PaymentMethodsResponseModel;
import com.payoneer.payment.model.services.PaymentService;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Single;

public class PaymentNetworkDataSource implements PaymentDataSource {

    private final PaymentService paymentService;

    @Inject
    PaymentNetworkDataSource(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public Single<PaymentMethodsResponseModel> getPaymentMethods() {
        return paymentService.getPaymentMethods();
    }
}