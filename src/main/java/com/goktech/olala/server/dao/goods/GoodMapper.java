package com.goktech.olala.server.dao.goods;

import com.goktech.olala.core.req.ReqGoodKey;
import com.goktech.olala.server.pojo.goods.Good;

import java.util.List;

public interface GoodMapper {
    int deleteByPrimaryKey(String goodsId);

    int insert(Good record);

    Good selectByPrimaryKey(String goodsId);

    List<Good> selectAll();

    int updateByPrimaryKey(Good record);

    List<Good> selectByKey(ReqGoodKey keywords);
}