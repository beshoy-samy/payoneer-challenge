
package com.payoneer.payment.model.dtos.network;

import com.squareup.moshi.Json;

public class ReturnCode {

    @Json(name = "name")
    private String name;
    @Json(name = "source")
    private String source;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
