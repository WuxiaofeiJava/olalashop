package com.goktech.olala.core.service;

import com.goktech.olala.server.pojo.goods.Article;

import java.util.List;

/**
 * @author sanming
 * @Classname IArticleService
 * @Description TODO
 * @Date 2020/11/29
 */
public interface IArticleService {

    /**
     *
     * @return
     */
    List<Article> selectAll();
}
