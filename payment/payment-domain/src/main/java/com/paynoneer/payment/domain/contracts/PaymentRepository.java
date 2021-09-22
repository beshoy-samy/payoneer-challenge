package com.paynoneer.payment.domain.contracts;

import com.paynoneer.payment.domain.entities.PaymentMethodDomainModel;

import java.util.List;

import io.reactivex.rxjava3.core.Single;

public interface PaymentRepository {

    Single<List<PaymentMethodDomainModel>> getPaymentMethods();
}