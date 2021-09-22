
package com.payoneer.payment.model.dtos.network;

import com.squareup.moshi.Json;

public class Style {

    @Json(name = "language")
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
