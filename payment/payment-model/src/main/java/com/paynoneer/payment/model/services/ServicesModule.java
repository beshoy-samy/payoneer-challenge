package com.paynoneer.payment.model.services;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;

@Module
@InstallIn(SingletonComponent.class)
public class ServicesModule {

    @Singleton
    @Provides
    PaymentService providePaymentService(Retrofit retrofit) {
        return retrofit.create(PaymentService.class);
    }
}