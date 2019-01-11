package com.furkanturkmen.numberstrivia.utils;

import com.furkanturkmen.numberstrivia.models.RandomFact;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface InterfaceApi {

    @GET("/{randomNumber}?json")
    Call<RandomFact> getFact(@Path("randomNumber") int randomNumber);

}

