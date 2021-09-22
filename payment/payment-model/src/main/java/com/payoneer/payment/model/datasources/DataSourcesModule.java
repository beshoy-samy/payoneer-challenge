package com.payoneer.payment.model.datasources;

import com.payoneer.payment.model.services.PaymentService;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@Module
@InstallIn(ViewModelComponent.class)
public class DataSourcesModule {

    @Provides
    PaymentDataSource providePaymentNetworkDataSource(PaymentService paymentService) {
        return new PaymentNetworkDataSource(paymentService);
    }
}
