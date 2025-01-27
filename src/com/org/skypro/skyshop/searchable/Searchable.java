package com.org.skypro.skyshop.searchable;

public interface Searchable {
    String getSearchTerm();
    String getContentType();
    String getName();

    default String getStringRepresentation() {
        return getName() + " - " + getContentType();
    }
}
