package com.payoneer.network;

public abstract class NetworkKeys {

    private NetworkKeys() {
    }

    static {
        System.loadLibrary("native-lib");
    }

    protected static native String getBaseUrl();

}