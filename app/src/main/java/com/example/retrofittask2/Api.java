package com.example.retrofittask2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "http://api.moodi.org";

    @GET("blog")
    Call<List<employee>> getEmployees();
}
