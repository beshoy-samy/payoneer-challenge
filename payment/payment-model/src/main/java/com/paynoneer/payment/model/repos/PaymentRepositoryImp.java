package com.paynoneer.payment.model.repos;

import com.paynoneer.payment.model.dtos.PaymentMethodsResponseModel;
import com.paynoneer.payment.model.services.PaymentService;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Single;

public class PaymentRepositoryImp implements PaymentRepository {

    private final PaymentService paymentService;

    @Inject
    PaymentRepositoryImp(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public Single<PaymentMethodsResponseModel> getPaymentMethods() {
        return paymentService.getPaymentMethods();
    }
}