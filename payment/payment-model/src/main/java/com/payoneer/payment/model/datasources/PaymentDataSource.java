package com.payoneer.payment.model.datasources;

import com.payoneer.payment.model.dtos.network.PaymentMethodsResponseModel;

import io.reactivex.rxjava3.core.Single;

public interface PaymentDataSource {

    Single<PaymentMethodsResponseModel> getPaymentMethods();

}