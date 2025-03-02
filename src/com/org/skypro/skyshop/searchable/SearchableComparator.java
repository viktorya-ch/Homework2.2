package com.org.skypro.skyshop.searchable;


import com.org.skypro.skyshop.article.Article;

import java.util.Comparator;

public class SearchableComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable o1, Searchable o2) {
        int lenghtComparison = Integer.compare(o2.getName().length(), o1.getName().length());
        if (lenghtComparison != 0) {
            return lenghtComparison;
        }
        return o1.getName().compareTo(o2.getName());
    }

}

