package com.example.santosh.simulation1.restful;

import android.util.Log;

import com.example.santosh.simulation1.pojo.response.ResponsePojo;

import java.util.Locale;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by santosh on 10/22/16.
 */
public class RestApi {
    private static final String TAG = RestApi.class.getName();
    private static final String BASE_RUL = "http://104.155.212.203/";

    public static Retrofit retrofit;
    public static FirstApi firstApi;
    public static SecondApi secondApi;

    static {
        try{
            retrofit = new Retrofit.Builder().baseUrl(BASE_RUL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();

            firstApi = retrofit.create(FirstApi.class);
            secondApi = retrofit.create(SecondApi.class);
        } catch(Exception e){
            Log.e(TAG, e.getMessage());
            throw e;
        }
    }


    public interface FirstApi {

        @GET("pub/home/news")
        public Call<ResponsePojo> getNews();
    }

    public interface SecondApi {
        @GET("pub/home/news")
        public Call<ResponsePojo> getNews();
    }
}
