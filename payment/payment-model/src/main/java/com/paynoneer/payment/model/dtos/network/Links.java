
package com.paynoneer.payment.model.dtos.network;

import com.squareup.moshi.Json;

public class Links {

    @Json(name = "self")
    private String self;
    @Json(name = "lang")
    private String lang;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

}
