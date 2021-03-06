package com.example.wsclient.controller;

import com.example.wsclient.enity.Product;
import com.example.wsclient.retrofit.RetrofitServiceGenerator;
import com.example.wsclient.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetProductServlet extends HttpServlet {
    ProductService productService;
    public GetProductServlet(){
        productService = RetrofitServiceGenerator.createService(ProductService.class);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        List<Product> products = productService.getProducts().execute().body();
        req.setAttribute("products", products);
        req.getRequestDispatcher("/product.jsp").forward(req,resp);
    }
}
