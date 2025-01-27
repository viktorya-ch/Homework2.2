package com.org.skypro.skyshop.product;

import com.org.skypro.skyshop.searchable.Searchable;

import java.util.Objects;

public abstract class Product implements Searchable {
    protected String title;


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


    @Override
    public String getSearchTerm(){
        return title;
    }

    @Override
    public String getContentType(){
        return " PRODUCT ";
    }

    @Override
    public String getName(){
        return title;
    }




}

