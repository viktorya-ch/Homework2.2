package com.org.skypro.skyshop.product;

public class Product {
    private String title;
    private int price;

    public Product (String title, int price){
        this.title = title;
        this.price = price;

    }

    public String getTitle(){
        return this.title;
    }

    public int getPrice(){
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public String toString(){
        return title + " стоит " + price;
    }



}
