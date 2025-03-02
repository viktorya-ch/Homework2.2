package com.org.skypro.skyshop.article;

import com.org.skypro.skyshop.searchable.ArticleComparator;

import java.util.TreeSet;

public class ArticleSearch {
    private TreeSet<Article> articles;
    public ArticleSearch(){
    articles=new TreeSet<>(new ArticleComparator());
    }
    public void addArticle(Article article) {
        articles.add(article);
    }
    public TreeSet<Article>search(String query){
        TreeSet<Article>resultSet = new TreeSet<>(new ArticleComparator());
        for (Article article :  articles){
            if (article.getTitleArticle().toLowerCase().contains(query.toLowerCase())){
                resultSet.add(article);
            }
        }
        return resultSet;
    }
}
