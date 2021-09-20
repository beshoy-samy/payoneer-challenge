package com.paynoneer.payment.model.repos;

import com.paynoneer.payment.model.dtos.PaymentMethodsResponseModel;

import io.reactivex.rxjava3.core.Single;

public interface PaymentRepository {

    Single<PaymentMethodsResponseModel> getPaymentMethods();

}