
package com.paynoneer.payment.model.dtos.network;


import com.squareup.moshi.Json;

public class PaymentMethodsResponseModel {

    @Json(name = "links")
    private Links links;
    @Json(name = "timestamp")
    private String timestamp;
    @Json(name = "operation")
    private String operation;
    @Json(name = "resultCode")
    private String resultCode;
    @Json(name = "resultInfo")
    private String resultInfo;
    @Json(name = "returnCode")
    private ReturnCode returnCode;
    @Json(name = "status")
    private Status status;
    @Json(name = "interaction")
    private Interaction interaction;
    @Json(name = "identification")
    private Identification identification;
    @Json(name = "networks")
    private Networks networks;
    @Json(name = "operationType")
    private String operationType;
    @Json(name = "style")
    private Style style;
    @Json(name = "payment")
    private Payment payment;
    @Json(name = "integrationType")
    private String integrationType;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public ReturnCode getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(ReturnCode returnCode) {
        this.returnCode = returnCode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Interaction getInteraction() {
        return interaction;
    }

    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public Networks getNetworks() {
        return networks;
    }

    public void setNetworks(Networks networks) {
        this.networks = networks;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getIntegrationType() {
        return integrationType;
    }

    public void setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
    }

}
