package com.org.skypro.skyshop;

import com.org.skypro.skyshop.article.Article;
import com.org.skypro.skyshop.basket.ProductBasket;
import com.org.skypro.skyshop.product.Product;
import com.org.skypro.skyshop.product.SimpleProduct;
import com.org.skypro.skyshop.product.DiscountedProduct;
import com.org.skypro.skyshop.product.FixPriceProduct;
import com.org.skypro.skyshop.searchable.Searchable;
import com.org.skypro.skyshop.searchengine.BestResultNotFound;
import com.org.skypro.skyshop.searchengine.SearchEngine;

import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();
        DiscountedProduct kettle = new DiscountedProduct(" Чайник ", 599, 20);
        DiscountedProduct dryer = new DiscountedProduct(" Фен ", 659, 11);
        SimpleProduct table = new SimpleProduct(" Стол ", 1120);
        FixPriceProduct notepad = new FixPriceProduct(" Блокнот", 90);

        SimpleProduct chair = new SimpleProduct(" Стул ", 494);

        //Демонстрация проверки
        try {
            DiscountedProduct mug = new DiscountedProduct(" Кружка ", 0, 250);
        } catch (IllegalArgumentException s) {
            System.out.println(s.getMessage());
        }
        try {
            SimpleProduct notebook = new SimpleProduct(" Тетрадь ", 0);
        } catch (IllegalArgumentException l) {
            System.out.println(l.getMessage());
        }
        try {
            DiscountedProduct mirror = new DiscountedProduct(" Зеркало ", 122, 101);
        } catch (IllegalArgumentException m) {
            System.out.println(m.getMessage());
        }

        //Добавить продукт в корзину
        basket.addProduct(kettle);
        basket.addProduct(dryer);
        basket.addProduct(table);
        basket.addProduct(notepad);

        //Удалить существующий продукт из корзины

        List<Product> removedProducts = basket.removeProductsByTitle(" Чайник ");

        //Вывести удаленный продукт на экран

        System.out.println("  Удаленный продукт: ");
        for (Product product : removedProducts) {
            System.out.println(product);
        }

        //Вывести содержимое корзины с помощью метода printBasket

        System.out.println(" Содержимое корзины : ");
        basket.printBasket();

        //Удалить не существующий продукт
        List<Product> removedFree = basket.removeProductsByTitle(" Телевизор ");


        //Проверить, что список удаленных продуктов пуст


        if (removedFree.isEmpty()) {
            System.out.println(" Список пуст ");
        }


        //Вывести содержимое корзины на экран

        System.out.println(" Содержимое корзины: ");
        basket.printBasket();


        //Тестирование изменений

        SearchEngine searchEngine = new SearchEngine();

        Searchable searchable1 = new Searchable() {
            @Override
            public String getSearchTerm() {
                return " Кровать односпальная подростковая ";
            }

            @Override
            public String getContentType() {
                return " Ортопедическое основание кровати ";
            }

            @Override
            public String getName() {
                return " Кровать ";
            }
        };
        Searchable searchable2 = new Searchable() {
            @Override
            public String getSearchTerm() {
                return " Монитор обладает разрешением 1920*108 ";
            }

            @Override
            public String getContentType() {
                return " Монитор Xiaomi Display G24 ";
            }

            @Override
            public String getName() {
                return " Монитор ";
            }
        };
        searchEngine.addSearchable(searchable1);
        searchEngine.addSearchable(searchable2);


        String searchString = " Кровать ";
        List<Searchable> results = searchEngine.findAllObjects(searchString);

        if (!results.isEmpty()) {
            System.out.println(" Результаты поиска " + searchString);
            for (Searchable result : results) {
                System.out.println(result.getSearchTerm());
            }
        } else {
            System.out.println(" Нет совпадений для поисковой строки : " + searchString);
        }
    }
}


//        searchEngine.add(new Article(" Стол из коллекции Fargo ", " Модель правильной круглой формы легко раскладывается вручную."));
//        searchEngine.add(new Article(" Монитор Xiaomi Display G24 ", " Обладает разрешением 1920*1080 пикселей. "));
//        searchEngine.add(new Article(" Кровать односпальная подростковая", " Ортопедическое основание обеспечивает правильное положение тела "));
//        searchEngine.add(new Article(" Умный электрический чайник СТ-0039 ", " Чайник оснащен панелью управления "));
//        searchEngine.add(new Article(" Фен для волос ", " Профессиональный стайлер с насадками "));

//
//        System.out.println(searchEngine.search("Чайник"));
//        System.out.println(searchEngine.search("Дверь"));
//        System.out.println(searchEngine.search("Кровать"));
//        System.out.println(searchEngine.search("Фен"));
//        System.out.println(searchEngine.search("Монитор"));
//        System.out.println(searchEngine.search("Стол"));
//
//        String searchString1 = " Стол ";
//        try {
//            Searchable bestSearchable1 = searchEngine.findSuitableObject(searchString1);
//            System.out.println(" Луший результат: " + bestSearchable1.getSearchTerm());
//        } catch (BestResultNotFound b) {
//            System.out.println(" Ошибка: " + b.getMessage());
//        }
//
//
//        String searchString2 = " Шнур ";
//        try {
//            Searchable bestSearchable2 = searchEngine.findSuitableObject(searchString2);
//            System.out.println(" Лучший результат: " + bestSearchable2.getSearchTerm());
//        } catch (BestResultNotFound i) {
//            System.out.println(" Ошибка: " + i.getMessage());
//        }





