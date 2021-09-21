
package com.paynoneer.payment.model.dtos.network;

import com.squareup.moshi.Json;

public class Interaction {

    @Json(name = "code")
    private String code;
    @Json(name = "reason")
    private String reason;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
