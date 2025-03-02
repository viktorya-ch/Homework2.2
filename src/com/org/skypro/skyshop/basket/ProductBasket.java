package com.org.skypro.skyshop.basket;

import com.org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private Map<String, List<Product>> products;

    public ProductBasket() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.computeIfAbsent(product.getTitle(), k -> new ArrayList<>()).add(product);
    }

    public void removeProduct(Product product) {
        List<Product> productList = products.get(product.getTitle());
        if (productList != null) {
            productList.remove(product);
            if (productList.isEmpty()) {
                products.remove(product.getTitle());
            }
        }
    }

    public List<Product> removeProductsByTitle(String title) {
        List<Product> removedProducts = new ArrayList<>();
        List<Product> productList = products.get(title);
        if (productList != null) {
            removedProducts.addAll(productList);
            productList.clear();
            products.remove(title);
        }
        return removedProducts;
    }

    public void printBasket() {
        for (Map.Entry<String, List<Product>> entry : products.entrySet()) {
            System.out.println(" Название продукта " + entry.getKey());
            for (Product product : entry.getValue()) {
                System.out.println(" " + product);
            }
        }
    }

    public void clearBasket() {
        products.clear();
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                totalCost += product.getPrice();
            }
        }
        return totalCost;
    }

    public int isSpecialProducts() {
        int count = 0;
        for (List<Product> product : products.values()) {
            if (product.isEmpty()) {
                count++;
            }
        }
        return count;
    }

}

















