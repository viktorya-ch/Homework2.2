package com.org.skypro.skyshop.basket;

import com.org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private List<Product> basket;

    public void Basket() {
        basket = new ArrayList<>();
    }

    private Product[] products;
    private int count;
    private static final int MAX_SIZE = 4;


    public ProductBasket() {
        products = new Product[MAX_SIZE];
        count = 0;
    }

    public void addProduct(Product product) {
        if (count < MAX_SIZE) {
            products[count] = product;
            count++;
            System.out.println(" Продукт " + product.getTitle() + " добавлен в корзину. ");
        } else {
            System.out.println(" Корзина заполнена, удалите продукты, чтобы добавить новые. ");
        }
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < count; i++) {
            totalCost += products[i].getPrice();
        }
        return totalCost;
    }

    public void printBasketContents() {
        if (count == 0) {
            System.out.println(" Корзина пуста. ");
        }
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getTitle() + " : " + products[i].getPrice());

        }
        System.out.println(" Итого: " + getTotalCost());

    }

    public boolean containsProduct(String productTitle) {
        for (int i = 0; i < count; i++) {
            if (products[i].getTitle().equalsIgnoreCase(productTitle)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < count; i++) {
            products[i] = null;
        }
        count = 0;
        System.out.println(" Корзина очищена ");
    }


    public int isSpecialProducts() {
        int specialCount = 0;
        for (Product product : basket) {
            if (product.isSpecial()) {
                specialCount++;
            }
        }
        return specialCount;
    }

}




