package com.paynoneer.payment.domain.usecases;

import com.paynoneer.payment.domain.contracts.PaymentRepository;

import javax.inject.Inject;

public class GetPaymentMethodsUseCaseImp {

    @Inject
    protected GetPaymentMethodsUseCaseImp(PaymentRepository paymentRepository){
        
    }

}
