package com.example.wsclient.service;

import com.example.wsclient.enity.Product;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ProductService {
    @GET("/api/products")
    public Call<List<Product>> getProducts();
    @GET("/api/products/{id}")
    public Call<Product> getProductDetail(@Path("id") int id);
    @POST("/api/products")
    public Call<Product>  save(@Body Product product);
    @PUT("/api/products")
    public Call<Product>  update(@Body Product product, @Path("id") int id);
}
