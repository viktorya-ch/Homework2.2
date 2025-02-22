package com.org.skypro.skyshop.searchengine;

import com.org.skypro.skyshop.searchable.Searchable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchEngine {
    private List<Searchable>searchables;
    public SearchEngine(){
     searchables =new ArrayList<>();
    }

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


    public int countOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;
        while ((index=str.indexOf(substring,index))!= -1){

      //  for (int index = 0; (index = str.indexOf(substr, index)) != -1; index += substr.length()) {
            count++;
            index += substring.length();
        }
        return count;
    }
    public Searchable  findSuitableObject (String search) throws BestResultNotFound {
        int maxCount = -1;
        Searchable suitableObject = null;
        for (Searchable searchable : elements){
            String term=searchable.getSearchTerm();
            int count = countOccurrences(term, search);
            if (count>maxCount){
                maxCount=count;
                suitableObject=searchable;
            }
        }
        if (suitableObject == null){
            throw new BestResultNotFound(" Объект не найден для запроса: " + search);
        }
        return suitableObject;
    }




}
