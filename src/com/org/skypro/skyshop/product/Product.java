package com.org.skypro.skyshop.product;

import java.util.Objects;

public abstract class Product {
    protected String title;
   // private int price;

    public Product(String title) {
        this.title = title;

    }

    public String getTitle() {
        return this.title;
    }

    public abstract double getPrice();


    public void setTitle(String title) {
        this.title = title;
    }


    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }



    public abstract boolean isSpecial();
}
