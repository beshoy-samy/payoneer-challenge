package com.paynoneer.payment.model.datasources;

import com.paynoneer.payment.model.dtos.network.PaymentMethodsResponseModel;

import io.reactivex.rxjava3.core.Single;

public interface PaymentDataSource {

    Single<PaymentMethodsResponseModel> getPaymentMethods();

}