
package com.payoneer.payment.model.dtos.network;

import com.squareup.moshi.Json;

public class Identification {

    @Json(name = "longId")
    private String longId;
    @Json(name = "shortId")
    private String shortId;
    @Json(name = "transactionId")
    private String transactionId;

    public String getLongId() {
        return longId;
    }

    public void setLongId(String longId) {
        this.longId = longId;
    }

    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
