package com.payoneer.payment.model.repos;

import com.payoneer.payment.domain.contracts.Mapper;
import com.payoneer.payment.domain.contracts.PaymentRepository;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;
import com.payoneer.payment.model.datasources.PaymentDataSource;
import com.payoneer.payment.model.dtos.network.PaymentMethodsResponseModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Single;

public class PaymentRepositoryImp implements PaymentRepository {

    private final PaymentDataSource dataSource;
    private final Mapper<PaymentMethodsResponseModel, List<PaymentMethodDomainModel>> mapper;

    @Inject
    PaymentRepositoryImp(PaymentDataSource dataSource, Mapper<PaymentMethodsResponseModel, List<PaymentMethodDomainModel>> mapper) {
        this.dataSource = dataSource;
        this.mapper = mapper;
    }


    @Override
    public Single<List<PaymentMethodDomainModel>> getPaymentMethods() {
        return dataSource.getPaymentMethods().map(mapper::mapToDomain);
    }
}