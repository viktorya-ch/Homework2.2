package com.org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
  public double basePrice;
  public  int discount;

  public DiscountedProduct (String title, double basePrice, int discount) {
      super(title);
      this.discount = discount;
      this.basePrice = basePrice;

  }

  public double getBasePrice(){
      return basePrice;
  }
public int getDiscount(){
      return discount;
}
public double getPrice(){
      return basePrice - (basePrice * discount/100.0);
}

public String toString(){
      return " " + title + " : " + basePrice + " Скидка = " + discount;
}

    public boolean isSpecial() {
        return true;
    }

    }


