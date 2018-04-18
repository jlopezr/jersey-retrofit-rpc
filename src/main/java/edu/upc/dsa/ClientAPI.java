package edu.upc.dsa;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

//TODO Try to avoid the Retrofit 2 Call interface

public interface ClientAPI {

    @POST("/api/service/f1")
    Call<Data> f1(@Body Data d);
}
