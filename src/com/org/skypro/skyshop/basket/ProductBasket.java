package com.org.skypro.skyshop.basket;
import com.org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private Product[] products;

    public void addProductToBasket(Product product) {
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
    }

    public int gettingTheTotalCost() {
        int sum = 0;
        for (int i = 0; i < products.length; i++)
            sum += products[i].getPrice();
        return sum;

    }


    public void printInTheConsole() {

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getTitle() + " : " + products[i].getPrice());
        }

        System.out.println(" Итого " + gettingTheTotalCost());

    }
    public boolean hasProductInBasket(String title) {
        for (Product product : products) {
            if (product != null && product.getTitle().equals(title)) {
                return true;
            }

        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }
}



