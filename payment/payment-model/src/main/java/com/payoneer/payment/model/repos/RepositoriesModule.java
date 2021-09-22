package com.payoneer.payment.model.repos;

import com.payoneer.payment.domain.contracts.Mapper;
import com.payoneer.payment.domain.contracts.PaymentRepository;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;
import com.payoneer.payment.model.datasources.PaymentDataSource;
import com.payoneer.payment.model.dtos.network.PaymentMethodsResponseModel;

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