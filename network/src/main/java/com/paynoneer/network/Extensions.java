package com.paynoneer.network;

import android.content.Context;

import java.io.IOException;
import java.net.HttpURLConnection;
import retrofit2.HttpException;

public interface Extensions {

    static String networkErrorMessage(Throwable throwable, Context context) {
        if (throwable instanceof IOException)
            return context.getString(R.string.network_error);
        else if (throwable instanceof HttpException) {
            int statusCode = ((HttpException) throwable).code();
            switch (statusCode) {
                case HttpURLConnection.HTTP_INTERNAL_ERROR:
                    return context.getString(R.string.internal_server_error);
                case HttpURLConnection.HTTP_NOT_FOUND:
                    return context.getString(R.string.content_not_found);
                default:
                    return context.getString(R.string.general_error_message);
            }
        }
        return null;
    }
}