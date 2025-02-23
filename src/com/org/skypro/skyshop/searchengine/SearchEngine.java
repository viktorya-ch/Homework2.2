package com.org.skypro.skyshop.searchengine;

import com.org.skypro.skyshop.article.Article;
import com.org.skypro.skyshop.searchable.Searchable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchEngine {
    private List<Searchable> searchables;

    public SearchEngine() {
        searchables = new ArrayList<>();
    }

    public void addSearchable(Searchable searchable) {
        searchables.add(searchable);
    }

    private int countOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    public List<Searchable> findAllObjects(String search) {
        List<Searchable> objects = new ArrayList<>();
        for (Searchable searchable : searchables) {
            String term = searchable.getSearchTerm();
            int count = countOccurrences(term, search);
            if (count > 0) {
                objects.add(searchable);
            }
        }
        return objects;
    }
}


//    public Searchable[] elements;
//    private int count;
//
//    public SearchEngine(int size) {
//        this.elements = new Searchable[size];
//        this.count = 0;
//    }


//
//    public Searchable[] search(String searchTerm) {
//        Searchable[] results = new Searchable[5];
//        int resultCount = 0;
//
//        for (int i = 0; i < count; i++) {
//            if (elements[i] != null) {
//                results[resultCount] = elements[i];
//                resultCount++;
//            }
//            if (resultCount == 5) {
//                break;
//            }
//        }
//        return results;
//    }
//
//
//}
