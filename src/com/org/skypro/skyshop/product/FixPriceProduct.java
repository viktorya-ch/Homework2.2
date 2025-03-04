package com.org.skypro.skyshop.product;

import java.util.Objects;

public class FixPriceProduct extends Product {
    private static final double FIXED_PRICE = 399;
    private double price;

    public FixPriceProduct(String title, double price) {
        super(title);
    }

    public double getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FixPriceProduct that = (FixPriceProduct) o;
        return Double.compare(price, that.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price);
    }

    public String toString() {
        return " " + title + " : " + " Фиксированная цена " + FIXED_PRICE;
    }

    public boolean isSpecial() {
        return true;
    }


}
