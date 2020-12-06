package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.req.ReqGoodKey;
import com.goktech.olala.core.service.IGoodsService;
import com.goktech.olala.server.dao.goods.GoodMapper;
import com.goktech.olala.server.pojo.goods.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GoodsServiceImp
 * @Description TODO
 * @Date 2020/12/5 20:20
 * @Created by sanming
 */
@Service
public class GoodsServiceImp implements IGoodsService {
    @Autowired
    GoodMapper goodMapper;

    @Override
    public List<Good> selectByKey(ReqGoodKey goodKey) {
        List<Good> goods = goodMapper.selectByKey(goodKey);
        return goods;
    }
}
