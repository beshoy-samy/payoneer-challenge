
package com.payoneer.payment.model.dtos.network;

import com.squareup.moshi.Json;

public class InputElement {

    @Json(name = "name")
    private String name;
    @Json(name = "type")
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
