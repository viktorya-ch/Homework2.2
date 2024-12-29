package com.org.skypro.skyshop;

import com.org.skypro.skyshop.basket.ProductBasket;
import com.org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();
        //Добавление продуктов
        basket.addProduct(new Product("Чайник", 790));
        basket.addProduct(new Product("Фен", 1300));

        //Печать содержимого корзины
        System.out.println("Содержимое корзины");
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

