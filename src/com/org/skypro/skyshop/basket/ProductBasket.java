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
    public boolean isSpecialProducts() {
        return false;
    }


}











//    public void removeProduct(Product product) {
//        products.remove(product);
//    }

//    public List<Product> removeProductsByTitle(String title) {
//        List<Product> removedProduct = new ArrayList<>();
//        Iterator<Product> iterator = products.iterator();
//
//        while (iterator.hasNext()) {
//            Product product = iterator.next();
//            if (product.getTitle().equals(title)) {
//                removedProduct.add(product);
//                iterator.remove();
//            }
//        }
//        return removedProduct;
//    }

//    public void printBasket() {
//        for (Product product : products) {
//            System.out.println(product);
//        }
//    }

//    public int getCount() {
//        return products.size();
//    }

//
//    public int getTotalCost() {
//        int totalCost = 0;
//        for (Product product : products) {
//            totalCost += product.getPrice();
//        }
//        return totalCost;
//    }

//    public void clearBasket() {
//        products.clear();
//    }







