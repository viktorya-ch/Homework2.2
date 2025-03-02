package com.org.skypro.skyshop.searchable;

import com.org.skypro.skyshop.article.Article;

import java.util.Comparator;
import java.util.TreeSet;

public class ArticleComparator implements Comparator<Article> {
    @Override
    public int compare(Article a1, Article a2) {
        int lenghtComparison = Integer.compare(a2.getTitleArticle().length(), a1.getTitleArticle().length());
        if (lenghtComparison != 0) {
            return lenghtComparison;
        }
        return a1.getTitleArticle().compareTo(a2.getTitleArticle());
    }
}
