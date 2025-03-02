package com.org.skypro.skyshop.searchengine;

import com.org.skypro.skyshop.article.Article;
import com.org.skypro.skyshop.searchable.Searchable;
import com.org.skypro.skyshop.searchable.SearchableComparator;

import java.util.*;

public class SearchEngine {
    private Set<Searchable> searchables;


    public SearchEngine() {
        searchables = new HashSet<>();
    }

    public void addSearchable(Searchable searchable) {
        searchables.add(searchable);
    }


    public TreeSet<Searchable> search(String inquiry) {
        TreeSet<Searchable> resultSet = new TreeSet<>(new SearchableComparator());
        for (Searchable searchable : searchables) {
            if (searchable.getName().toLowerCase().contains(inquiry.toLowerCase())) {
                resultSet.add(searchable);
            }
        }
        return resultSet;

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

    public List<Searchable> findAllObjects(String search) throws BestResultNotFound {
        List<Searchable> objects = new ArrayList<>();
        for (Searchable searchable : searchables) {
            String term = searchable.getSearchTerm();
            int count = countOccurrences(term, search);
            if (count > 0) {
                objects.add(searchable);
            }
        }
        if (objects == null) {
            throw new BestResultNotFound(" Объект не найден для запроса: " + search);
        }
        return objects;
    }


}


