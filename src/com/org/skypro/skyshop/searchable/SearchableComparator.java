package com.org.skypro.skyshop.searchable;


import java.util.Comparator;

public class SearchableComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable o1, Searchable o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
