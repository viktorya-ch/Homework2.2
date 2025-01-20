package com.org.skypro.skyshop;

import com.org.skypro.skyshop.basket.ProductBasket;
import com.org.skypro.skyshop.product.Product;
import com.org.skypro.skyshop.product.SimpleProduct;
import com.org.skypro.skyshop.product.DiscountedProduct;
import com.org.skypro.skyshop.product.FixPriceProduct;


public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();
        DiscountedProduct kettle = new DiscountedProduct(" Чайник ", 599,20);
        DiscountedProduct dryer = new DiscountedProduct(" Фен ", 659,11);
        SimpleProduct table = new SimpleProduct( " Стол ", 1120);
        FixPriceProduct notepad = new FixPriceProduct(" Блокнот", 90);

        SimpleProduct chair = new SimpleProduct( " Стул ", 494);


        //Добавление продукта в корзину
        basket.addProduct(kettle);
        basket.addProduct(dryer);
        basket.addProduct(table);
        basket.addProduct(notepad);

        //Добавление продукта в заполненную корзину
        basket.addProduct(chair);


        //Печать содержимого корзины
        System.out.println("Содержимое корзины: ");
        basket.printBasketContents();



        //Получение стоимости корзины
        System.out.println("Общая стоимость корзины" + basket.getTotalCost());


        //Поиск товара
        System.out.println("Чайник есть в корзине" + basket.containsProduct("Чайник"));
        System.out.println("Фен есть в корзине" + basket.containsProduct("Фен"));


        //Очистка корзины
        basket.clearBasket();

        //Печать содержимого пустой корзины
        System.out.println("Содержимое пустой корзины");
        basket.printBasketContents();

        //Получение стоимости пустой корзины
        System.out.println("Общая стоимость пустой корзины" + basket.getTotalCost());

        //Поиск товара в пустой корзине
        System.out.println("Чайник есть в пустой корзине" + basket.containsProduct("Чайник"));

    }
}

