package com.payoneer.payment.model.services;

import com.payoneer.payment.model.dtos.network.PaymentMethodsResponseModel;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface PaymentService {

    @GET("optile/checkout-android/develop/shared-test/lists/listresult.json")
    Single<PaymentMethodsResponseModel> getPaymentMethods();
}