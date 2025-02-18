package com.org.skypro.skyshop.searchengine;

import com.org.skypro.skyshop.searchable.Searchable;

import java.util.Arrays;

public class SearchEngine {
    public Searchable[] elements;
    private int count;

    public SearchEngine(int size) {
        this.elements = new Searchable[size];
        this.count = 0;
    }

    public void add(Searchable type) {
        if (count < elements.length) {
            elements[count] = type;
            count++;
        } else {
            System.out.println(" Массив полный. Невозможно добавить новый элемент. ");
        }
    }

    public Searchable[] search(String searchTerm) {
        Searchable[] results = new Searchable[5];
        int resultCount = 0;

        for (int i = 0; i < count; i++) {
            if (elements[i] != null) {
                results[resultCount] = elements[i];
                resultCount++;
            }
            if (resultCount == 5) {
                break;
            }
        }
        return results;
    }

    public Searchable findSuitableObject(String searchTerm) {
        Searchable[] object = new Searchable[4];
        Searchable suitableObject = null;
        int maxFind = 0;
        int score;
        for (Searchable searchable : elements) {
            String str = searchable.getSearchTerm().toLowerCase();
            String subStr = searchTerm.toLowerCase();
            score = countOccurrences(str, subStr);
            if (score > maxFind) {
                maxFind = score;
                suitableObject = searchable;
            }
            if (suitableObject == null){
                throw new BestResultNotFound(" Для этого запроса не нашлось подходящей статьи ")
            }
        }
        return suitableObject;
    }

    public int countOccurrences(String str, String substr) {
        int count = 0;
        for (int index = 0; (index = str.indexOf(substr, index)) != -1; index += substr.length()) {
            count++;
        }
        return count;
    }


}
