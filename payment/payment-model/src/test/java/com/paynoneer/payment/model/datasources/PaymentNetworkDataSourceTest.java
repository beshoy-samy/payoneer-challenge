package com.paynoneer.payment.model.datasources;

import com.paynoneer.payment.model.dtos.network.PaymentMethodsResponseModel;
import com.paynoneer.payment.model.services.PaymentService;

import org.junit.Test;

import java.io.IOException;

import io.reactivex.rxjava3.core.Single;

public class PaymentNetworkDataSourceTest {

    @Test
    public void getPaymentMethodsThenEmitPaymentMethodsResponseModel() {
        //arrange
        PaymentMethodsResponseModel mockedResponse = new PaymentMethodsResponseModel();
        mockedResponse.setTimestamp("9-20-2021");

        PaymentService paymentService = () -> Single.just(mockedResponse);

        PaymentNetworkDataSource paymentNetworkDataSource = new PaymentNetworkDataSource(paymentService);

        //act
        Single<PaymentMethodsResponseModel> result = paymentNetworkDataSource.getPaymentMethods();

        //assert
        result.test().assertNoErrors().assertValue(mockedResponse);
    }

    @Test
    public void getPaymentMethodsThenThrowIOException() {
        //arrange
        PaymentService paymentService = () -> Single.error(new IOException("Network not found"));

        PaymentNetworkDataSource paymentNetworkDataSource = new PaymentNetworkDataSource(paymentService);

        //act
        Single<PaymentMethodsResponseModel> result = paymentNetworkDataSource.getPaymentMethods();

        //assert
        result.test().assertError(IOException.class);
    }
}