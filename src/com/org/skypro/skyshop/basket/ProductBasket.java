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


//    private Product[] products;
    // private int count;
//    private static final int MAX_SIZE = 4;

//
//    public ProductBasket() {
//        products = new Product[MAX_SIZE];
//        count = 0;
//    }


//    public int getTotalCost() {
//        int totalCost = 0;
//        for (int i = 0; i < count; i++) {
//            totalCost += basket.getPrice();
//        }
//        return totalCost;
//    }

//    public void printBasketContents() {
//        if (count == 0) {
//            System.out.println(" Корзина пуста. ");
//        }
//        for (int i = 0; i < count; i++) {
//            System.out.println(basket.getTitle() + " : " + basket.getPrice());
//
//        }
//        System.out.println(" Итого: " + getTotalCost());
//
//    }
//
//    public boolean containsProduct(String productTitle) {
//        for (int i = 0; i < count; i++) {
//            if (basket.getTitle().equalsIgnoreCase(productTitle)) {
//                return true;
//            }
//        }
//        return false;
//    }

//    public void clearBasket() {
//        for (int i = 0; i < count; i++) {
//            products = null;
//        }
//        count = 0;
//        System.out.println(" Корзина очищена ");
//    }


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




