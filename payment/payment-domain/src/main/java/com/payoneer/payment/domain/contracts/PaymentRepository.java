package com.payoneer.payment.domain.contracts;

import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;

import java.util.List;

import io.reactivex.rxjava3.core.Single;

public interface PaymentRepository {

    Single<List<PaymentMethodDomainModel>> getPaymentMethods();
}