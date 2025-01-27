package com.org.skypro.skyshop.searchengine;

import com.org.skypro.skyshop.searchable.Searchable;

public class SearchEngine {
    private Searchable[] elements;
    private int count;


    public SearchEngine (int size) {
        this.elements = new Searchable[size];
        this.count = 0;
    }

    public void add ( Searchable type) {
        if (count < elements.length){
            elements[count] = type;
            count++;
        }else {
            System.out.println(" Массив полный. Невозможно добавить новый элемент. ");
        }
    }

    public Searchable[] search ( String searchTerm) {
        Searchable[] results = new Searchable[5];
        int resultCount = 0;

        for (int i = 0; i < count; i++){
            if (elements[i] != null){
                results[resultCount] = elements[i];
                resultCount++;
            }
            if (resultCount == 5) {
                break;
            }
        }
        return results;
    }

}
