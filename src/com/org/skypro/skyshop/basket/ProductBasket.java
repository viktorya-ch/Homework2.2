package com.org.skypro.skyshop.basket;

import com.org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {

    private final Map<String, Integer> products;

    public ProductBasket() {
        this.products = new HashMap<>();
    }

    public void addProduct(String productTitle, int productPrice) {
        products.put(productTitle, productPrice);
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (int price : products.values()) {
            totalCost += price;
        }
        return totalCost;
    }

    public void printBasketContents() {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            s.append(entry.getKey()).append(":").append(entry.getValue()).append("");
        }
        s.append("Итого:").append(getTotalCost());
        System.out.println(s.toString());

    }

    public boolean containsProduct(String productTitle) {
        for (Product product : products) {
            if (product != null && product.getTitle().equals(productTitle)) {
                return true;
            }
        }


        return false;
    }

    public void clearBasket() {
        products.clear();
    }


}



