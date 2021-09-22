package com.payoneer.network;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.InstallIn;
import javax.inject.Singleton;
import com.squareup.moshi.Moshi;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class NetworkModule {

    private static final long NETWORK_CONNECT_TIMEOUT = 30;
    private static final long NETWORK_READ_TIMEOUT = 30;
    private static final long NETWORK_WRITE_TIMEOUT = 30;

    @Singleton
    @Provides
    public Moshi provideMoshi() {
        return new Moshi.Builder().build();
    }


    @Singleton
    @Provides
    public OkHttpClient provideOkhttp() {
        OkHttpClient.Builder okhttpBuilder = new OkHttpClient.Builder()
                .connectTimeout(NETWORK_CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(NETWORK_READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(NETWORK_WRITE_TIMEOUT, TimeUnit.SECONDS);

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(message -> Log.i("Network", message));
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okhttpBuilder.addInterceptor(loggingInterceptor);
        }

        return okhttpBuilder.build();
    }

    @Singleton
    @Provides
    public Retrofit provideRetrofit(Moshi moshi, OkHttpClient okhttp) {
        return new Retrofit.Builder()
                .baseUrl(NetworkKeys.getBaseUrl())
                .client(okhttp)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
    }

}