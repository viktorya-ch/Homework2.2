package com.org.skypro.skyshop.searchengine;


import com.org.skypro.skyshop.product.Product;

public class BestResultNotFound extends Exception {
    public BestResultNotFound() {
        super();
    }

    public BestResultNotFound(String message) {
        super(message);
    }
}



