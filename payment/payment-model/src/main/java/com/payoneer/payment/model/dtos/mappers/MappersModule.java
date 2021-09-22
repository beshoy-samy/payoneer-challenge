package com.payoneer.payment.model.dtos.mappers;

import com.payoneer.payment.domain.contracts.Mapper;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;
import com.payoneer.payment.model.dtos.network.PaymentMethodsResponseModel;

import java.util.List;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@Module
@InstallIn(ViewModelComponent.class)
public class MappersModule {

    @Provides
    Mapper<PaymentMethodsResponseModel, List<PaymentMethodDomainModel>> provideNetworkPaymentMethodMapper() {
        return new NetworkPaymentMethodMapper();
    }

}