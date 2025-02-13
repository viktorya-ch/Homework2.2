package com.org.skypro.skyshop.product;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DiscountedProduct extends Product {
  public double basePrice;
  public  int discount;

  public DiscountedProduct (String title, double basePrice, int discount) {
      super(title);
      if (basePrice > 0){
          throw new IllegalArgumentException(" Неправильная базовая цена продукта ");
      }
      this.basePrice = basePrice;
      if (0 <= discount & discount >= 100){
          throw new IllegalArgumentException(" Неправильная скидка для продукта ");
      }
      this.discount = discount;
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


