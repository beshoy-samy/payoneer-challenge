package com.payoneer.payment.model.repos;

import com.payoneer.payment.domain.contracts.Mapper;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;
import com.payoneer.payment.model.datasources.PaymentDataSource;
import com.payoneer.payment.model.dtos.network.Networks;
import com.payoneer.payment.model.dtos.network.PaymentMethod;
import com.payoneer.payment.model.dtos.network.PaymentMethodLinks;
import com.payoneer.payment.model.dtos.network.PaymentMethodsResponseModel;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.core.Single;

public class PaymentRepositoryImpTest {

    @Test
    public void getPaymentMethodsThenEmitListOfPaymentMethodDomainModel() {
        //arrange
        PaymentMethodsResponseModel mockedResponse = mockResponse();
        PaymentDataSource paymentDataSource = () -> Single.just(mockedResponse);

        Mapper<PaymentMethodsResponseModel, List<PaymentMethodDomainModel>> mapper = this::map;

        PaymentRepositoryImp paymentRepository = new PaymentRepositoryImp(paymentDataSource, mapper);

        //act
        Single<List<PaymentMethodDomainModel>> result = paymentRepository.getPaymentMethods();
        List<PaymentMethodDomainModel> expected = getExpected();

        //assert
        result.test().assertNoErrors().assertValue(expected);
    }

    @Test
    public void getPaymentMethodsThenThrowIOException() {
        //arrange
        PaymentDataSource paymentDataSource = () -> Single.error(new IOException("Network not found"));
        Mapper<PaymentMethodsResponseModel, List<PaymentMethodDomainModel>> mapper = this::map;

        PaymentRepositoryImp paymentRepository = new PaymentRepositoryImp(paymentDataSource, mapper);

        //act
        Single<List<PaymentMethodDomainModel>> result = paymentRepository.getPaymentMethods();

        //assert
        result.test().assertError(IOException.class);
    }

    private PaymentMethodsResponseModel mockResponse() {
        PaymentMethodsResponseModel mockedResponse = new PaymentMethodsResponseModel();
        mockedResponse.setTimestamp("9-20-2021");

        Networks networks = new Networks();
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setPaymentMethodLinks(new PaymentMethodLinks());
        paymentMethod.setLabel("Beshoy");
        List<PaymentMethod> methods = new ArrayList<>();
        methods.add(paymentMethod);
        networks.setPaymentMethods(methods);

        mockedResponse.setNetworks(networks);
        return mockedResponse;
    }

    private List<PaymentMethodDomainModel> map(PaymentMethodsResponseModel responseModel) {
        ArrayList<PaymentMethodDomainModel> paymentMethodDomainModels = new ArrayList<>();
        for (PaymentMethod paymentMethod : responseModel.getNetworks().getPaymentMethods()) {
            PaymentMethodDomainModel domainModel =
                    new PaymentMethodDomainModel(paymentMethod.getLabel(), paymentMethod.getPaymentMethodLinks().getLogo());
            paymentMethodDomainModels.add(domainModel);
        }
        return paymentMethodDomainModels;
    }

    private List<PaymentMethodDomainModel> getExpected() {
        ArrayList<PaymentMethodDomainModel> paymentMethodDomainModels = new ArrayList<>();
        PaymentMethodDomainModel domainModel =
                new PaymentMethodDomainModel("Beshoy", null);
        paymentMethodDomainModels.add(domainModel);
        return paymentMethodDomainModels;
    }

}