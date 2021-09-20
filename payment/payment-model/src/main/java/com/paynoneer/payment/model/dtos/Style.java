
package com.paynoneer.payment.model.dtos;

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
