package com.org.skypro.skyshop;

import com.org.skypro.skyshop.article.Article;
import com.org.skypro.skyshop.basket.ProductBasket;
import com.org.skypro.skyshop.product.Product;
import com.org.skypro.skyshop.product.SimpleProduct;
import com.org.skypro.skyshop.product.DiscountedProduct;
import com.org.skypro.skyshop.product.FixPriceProduct;


public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();
        DiscountedProduct kettle = new DiscountedProduct(" Чайник ", 599, 20);
        DiscountedProduct dryer = new DiscountedProduct(" Фен ", 659, 11);
        SimpleProduct table = new SimpleProduct(" Стол ", 1120);
        FixPriceProduct notepad = new FixPriceProduct(" Блокнот", 90);

        SimpleProduct chair = new SimpleProduct(" Стул ", 494);


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



        //Тестирование изменений

        SearchEngine searchEngine = new SearchEngine(15);

        searchEngine.add(new Product("Фен"));
        searchEngine.add(new Product("Стол"));
        searchEngine.add(new Product("Кровать"));
        searchEngine.add(new Product("Монитор"));
        searchEngine.add(new Product("Чайник"));
        searchEngine.add(new Product("Дверь"));




        searchEngine.add( new Article(" Стол из коллекции Fargo ", " Модель правильной круглой формы легко раскладывается вручную."));
        searchEngine.add( new Article(" Монитор Xiaomi Display G24 ", " Обладает разрешением 1920*1080 пикселей. "));
        searchEngine.add( new Article(" Кровать односпальная подростковая", " Ортопедическое основание обеспечивает правильное положение тела "));
        searchEngine.add( new Article(" Умный электрический чайник СТ-0039 ", " Чайник оснащен панелью управления "));
        searchEngine.add( new Article(" Фен для волос ", " Профессиональный стайлер с насадками "));


        System.out.println(searchEngine.search("Чайник"));
        System.out.println(searchEngine.search("Дверь"));
        System.out.println(searchEngine.search("Кровать"));
        System.out.println(searchEngine.search("Фен"));
        System.out.println(searchEngine.search("Монитор"));
        System.out.println(searchEngine.search("Стол"));












    }






















    }

