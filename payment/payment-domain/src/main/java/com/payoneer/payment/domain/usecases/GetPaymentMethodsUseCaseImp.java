package com.payoneer.payment.domain.usecases;

import com.payoneer.payment.domain.contracts.PaymentRepository;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Single;

public class GetPaymentMethodsUseCaseImp implements GetPaymentMethodsUseCase {

    private final PaymentRepository paymentRepository;

    @Inject
    public GetPaymentMethodsUseCaseImp(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Single<List<PaymentMethodDomainModel>> getPaymentMethods() {
        return paymentRepository.getPaymentMethods();
    }
}