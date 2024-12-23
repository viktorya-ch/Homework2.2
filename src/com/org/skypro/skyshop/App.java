package com.org.skypro.skyshop;

import com.org.skypro.skyshop.basket.ProductBasket;
import com.org.skypro.skyshop.product.Product;

import java.util.Objects;

public class App {
    private static Product [] product = new Product[5];

    private static void main(String[] args) {
        product[0] = new Product("Kettle", 799);
        product[1] = new Product("Lamp", 569);
        product[2] = new Product("Pillow", 1020);
        product[3] = new Product("Shelf", 1300);
        product[4] = new Product("Book", 1355);
        System.out.println(gettingTheTotalCost());
        printInTheConsole();


    }


    public static int gettingTheTotalCost(){
        int sum = 0;
        for (int i = 0; i < product.length ; i++)
            sum += product[i].getPrice();
        return sum;


        }

        public static void printInTheConsole(){

            for (int i = 0; i < product.length; i++){
            System.out.println(product[i].getTitle() + " : " + product[i].getPrice());}

            System.out.println( " Итого "  + gettingTheTotalCost());

        }}
