package edu.upc.dsa;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class Client {

    public static final String API_URL = "http://localhost:8080";


    public static void main(String[] args) throws Exception {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        // Create a very simple REST adapter
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                //.client(client)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        // Create an instance of our API interface.
        ClientAPI api = retrofit.create(ClientAPI.class);

        // Call it.
        Call<Data> call = api.f1(new Data("hola", 1));
        Data d = call.execute().body();

        System.out.println(d);

        // Call it with inheritance
        Call<Data> call2 = api.f1(new MoreData("que pasa", 2, 3));
        Data d2 = call2.execute().body();

        System.out.println(d2);


    }
}
