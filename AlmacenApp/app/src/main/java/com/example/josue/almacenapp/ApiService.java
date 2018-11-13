package com.example.josue.almacenapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

 public interface ApiService{

    String API_BASE_URL = "https://laboratorio12-josueaz19.c9users.io";

    @GET("api/v1/productos")
    Call<List<Producto>> getProductos();

}
