package com.example.retrofit;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RequestInterface {
    /**
     * FormUrlEncoded:只是请求Body为一个Form表单
     **/
    @FormUrlEncoded
    @POST("api/demo/login")
    Call<Result> login(@FieldMap Map<String, Object> map);

    /**
     * FormUrlEncoded:只是请求Body为一个Form表单
     **/
    @FormUrlEncoded
    @POST("api/demo/login")
    Call<Result> login(@Field("username") String username,
                                                              @Field("password") String password,
                                                              @Field("mobile") String mobile,
                                                              @Field("ver_code") String ver_code);
}
