package com.paynoneer.payment.model.repos;

import com.paynoneer.payment.domain.contracts.Mapper;
import com.paynoneer.payment.domain.contracts.PaymentRepository;
import com.paynoneer.payment.domain.entities.PaymentMethodDomainModel;
import com.paynoneer.payment.model.datasources.PaymentDataSource;
import com.paynoneer.payment.model.dtos.network.PaymentMethodsResponseModel;

import java.util.List;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@Module
@InstallIn(ViewModelComponent.class)
public class RepositoriesModule {

    @Provides
    PaymentRepository providePaymentRepository(PaymentDataSource dataSource, Mapper<PaymentMethodsResponseModel, List<PaymentMethodDomainModel>> mapper) {
        return new PaymentRepositoryImp(dataSource, mapper);
    }

}