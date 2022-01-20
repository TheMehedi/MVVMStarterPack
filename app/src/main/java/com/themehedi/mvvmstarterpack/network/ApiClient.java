package com.themehedi.mvvmstarterpack.network;

import androidx.databinding.library.BuildConfig;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {
    private static OkHttpClient.Builder builder = new OkHttpClient.Builder()
            .connectTimeout(90, TimeUnit.SECONDS)
            .writeTimeout(90, TimeUnit.SECONDS)
            .readTimeout(90, TimeUnit.SECONDS)
            .addInterceptor(BuildConfig.DEBUG ? DefaultInterceptors.getHttpBodyLoggingInterceptor() : DefaultInterceptors.getHttpNoneLoggingInterceptor())
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request.Builder builder = chain.request().newBuilder();
                    builder.addHeader("Device", "android");
                    return chain.proceed(builder.build());
                }
            });

    public static Retrofit getApiClient(String base_url) {
        return new Retrofit.Builder()
                .baseUrl(base_url)//"http://192.168.0.103/cs_study/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
    }

    public static class DefaultInterceptors {
        static HttpLoggingInterceptor getHttpBodyLoggingInterceptor() {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            return interceptor;
        }

        static HttpLoggingInterceptor getHttpNoneLoggingInterceptor() {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
            return interceptor;
        }
    }
}
