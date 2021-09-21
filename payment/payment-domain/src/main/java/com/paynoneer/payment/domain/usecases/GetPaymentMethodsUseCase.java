package com.paynoneer.payment.domain.usecases;

import com.paynoneer.payment.domain.entities.PaymentMethodDomainModel;

import java.util.List;

import io.reactivex.rxjava3.core.Single;

public interface GetPaymentMethodsUseCase {

    Single<List<PaymentMethodDomainModel>> getPaymentMethods();
}
