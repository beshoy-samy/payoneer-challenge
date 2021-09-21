package com.paynoneer.payment.domain.usecases;

import com.paynoneer.payment.domain.contracts.PaymentRepository;
import com.paynoneer.payment.domain.entities.PaymentMethodDomainModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Single;

public class GetPaymentMethodsUseCaseImp implements GetPaymentMethodsUseCase {

    private final PaymentRepository paymentRepository;

    @Inject
    protected GetPaymentMethodsUseCaseImp(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Single<List<PaymentMethodDomainModel>> getPaymentMethods() {
        return paymentRepository.getPaymentMethods();
    }
}