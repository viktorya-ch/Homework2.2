package com.org.skypro.skyshop.product;

import java.util.Objects;

public class Product {
    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String toString() {
        return title + " стоит " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}
