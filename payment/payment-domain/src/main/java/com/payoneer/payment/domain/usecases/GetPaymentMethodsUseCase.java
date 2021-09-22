package com.payoneer.payment.domain.usecases;

import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;

import java.util.List;

import io.reactivex.rxjava3.core.Single;

public interface GetPaymentMethodsUseCase {

    Single<List<PaymentMethodDomainModel>> getPaymentMethods();
}
