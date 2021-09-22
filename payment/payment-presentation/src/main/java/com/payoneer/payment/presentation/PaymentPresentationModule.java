package com.payoneer.payment.presentation;

import com.payoneer.payment.domain.contracts.PaymentRepository;
import com.payoneer.payment.domain.usecases.GetPaymentMethodsUseCase;
import com.payoneer.payment.domain.usecases.GetPaymentMethodsUseCaseImp;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@Module
@InstallIn(ViewModelComponent.class)
public class PaymentPresentationModule {

    @Provides
    GetPaymentMethodsUseCase provideGetPaymentMethodsUseCase(PaymentRepository paymentRepository){
        return new GetPaymentMethodsUseCaseImp(paymentRepository);
    }
}