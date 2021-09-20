package com.paynoneer.payment.model.repos;

import com.paynoneer.payment.model.services.PaymentService;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@Module
@InstallIn(ViewModelComponent.class)
public class RepositoriesModule {

    @Provides
    PaymentRepository providePaymentRepository(PaymentService paymentService) {
        return new PaymentRepositoryImp(paymentService);
    }

}