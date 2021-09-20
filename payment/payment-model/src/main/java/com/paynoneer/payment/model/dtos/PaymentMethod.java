
package com.paynoneer.payment.model.dtos;

import com.squareup.moshi.Json;

import java.util.List;

public class PaymentMethod {

    @Json(name = "code")
    private String code;
    @Json(name = "label")
    private String label;
    @Json(name = "method")
    private String method;
    @Json(name = "grouping")
    private String grouping;
    @Json(name = "registration")
    private String registration;
    @Json(name = "recurrence")
    private String recurrence;
    @Json(name = "redirect")
    private Boolean redirect;
    @Json(name = "links")
    private PaymentMethodLinks paymentMethodLinks;
    @Json(name = "selected")
    private Boolean selected;
    @Json(name = "inputElements")
    private List<InputElement> inputElements = null;
    @Json(name = "operationType")
    private String operationType;
    @Json(name = "contractData")
    private ContractData contractData;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public Boolean getRedirect() {
        return redirect;
    }

    public void setRedirect(Boolean redirect) {
        this.redirect = redirect;
    }

    public PaymentMethodLinks getPaymentMethodLinks() {
        return paymentMethodLinks;
    }

    public void setPaymentMethodLinks(PaymentMethodLinks paymentMethodLinks) {
        this.paymentMethodLinks = paymentMethodLinks;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public List<InputElement> getInputElements() {
        return inputElements;
    }

    public void setInputElements(List<InputElement> inputElements) {
        this.inputElements = inputElements;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ContractData getContractData() {
        return contractData;
    }

    public void setContractData(ContractData contractData) {
        this.contractData = contractData;
    }

}
