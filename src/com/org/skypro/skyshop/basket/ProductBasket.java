package com.org.skypro.skyshop.basket;

import com.org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductBasket {
    private ArrayList<Product> products;

    public ProductBasket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> removeProductsByTitle(String title) {
        List<Product> removedProduct = new ArrayList<>();
        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getTitle().equals(title)) {
                removedProduct.add(product);
                iterator.remove();
            }
        }
        return removedProduct;
    }

    public void printBasket() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public int getCount() {
        return products.size();
    }


    public int getTotalCost() {
        int totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public void clearBasket() {
        products.clear();
    }

    public int isSpecialProducts() {
        int specialCount = 0;
        for (Product product : products) {
            if (product.isSpecial()) {
                specialCount++;
            }
        }
        return specialCount;
    }

}




