package com.goktech.olala.core.service;

import com.goktech.olala.core.req.ReqGoodKey;
import com.goktech.olala.server.pojo.goods.Good;

import java.util.List;

/**
 * @Classname IGoodsService
 * @Description TODO
 * @Date 2020/12/5 20:20
 * @Created by sanming
 */
public interface IGoodsService {

    List<Good> selectByKey(ReqGoodKey goodKey);
}
