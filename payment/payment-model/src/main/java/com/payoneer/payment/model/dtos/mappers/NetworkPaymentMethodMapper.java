package com.payoneer.payment.model.dtos.mappers;

import com.payoneer.payment.domain.contracts.Mapper;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;
import com.payoneer.payment.model.dtos.network.PaymentMethod;
import com.payoneer.payment.model.dtos.network.PaymentMethodsResponseModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class NetworkPaymentMethodMapper implements Mapper<PaymentMethodsResponseModel, List<PaymentMethodDomainModel>> {

    @Inject
    NetworkPaymentMethodMapper() {

    }

    @Override
    public List<PaymentMethodDomainModel> mapToDomain(PaymentMethodsResponseModel paymentMethodsResponseModel) {
        ArrayList<PaymentMethodDomainModel> paymentMethodDomainModels = new ArrayList<>();
        for (PaymentMethod paymentMethod : paymentMethodsResponseModel.getNetworks().getPaymentMethods()) {
            PaymentMethodDomainModel domainModel =
                    new PaymentMethodDomainModel(paymentMethod.getLabel(), paymentMethod.getPaymentMethodLinks().getLogo());
            paymentMethodDomainModels.add(domainModel);
        }
        return paymentMethodDomainModels;
    }
}