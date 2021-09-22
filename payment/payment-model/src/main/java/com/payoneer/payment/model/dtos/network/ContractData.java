
package com.payoneer.payment.model.dtos.network;

import com.squareup.moshi.Json;

public class ContractData {

    @Json(name = "PAGE_ENVIRONMENT")
    private String pageEnvironment;
    @Json(name = "JAVASCRIPT_INTEGRATION")
    private String javascriptIntegration;
    @Json(name = "PAGE_BUTTON_LOCALE")
    private String pageButtonLocale;

    public String getPageEnvironment() {
        return pageEnvironment;
    }

    public void setPageEnvironment(String pageEnvironment) {
        this.pageEnvironment = pageEnvironment;
    }

    public String getJavascriptIntegration() {
        return javascriptIntegration;
    }

    public void setJavascriptIntegration(String javascriptIntegration) {
        this.javascriptIntegration = javascriptIntegration;
    }

    public String getPageButtonLocale() {
        return pageButtonLocale;
    }

    public void setPageButtonLocale(String pageButtonLocale) {
        this.pageButtonLocale = pageButtonLocale;
    }

}
