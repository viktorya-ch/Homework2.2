package com.org.skypro.skyshop.article;

import com.org.skypro.skyshop.searchable.ArticleComparator;
import com.org.skypro.skyshop.searchable.Searchable;

import java.util.Objects;
import java.util.TreeSet;

public class Article implements Searchable {

   private final String titleArticle;
    private final String textArticle;

    public Article(String titleArticle, String textArticle) {
        this.titleArticle = titleArticle;
        this.textArticle = textArticle;
    }

    public String getTitleArticle() {
        return this.titleArticle;
    }

    public String getTextArticle() {
        return this.textArticle;
    }


    public String toString() {
        return " " + titleArticle + "\n" + textArticle;
    }

    @Override
    public String getSearchTerm() {
        return toString();
    }

    @Override
    public String getContentType() {
        return " ARTICLE ";
    }

    @Override
    public String getName() {
        return titleArticle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(titleArticle, article.titleArticle) && Objects.equals(textArticle, article.textArticle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleArticle, textArticle);
    }

}
