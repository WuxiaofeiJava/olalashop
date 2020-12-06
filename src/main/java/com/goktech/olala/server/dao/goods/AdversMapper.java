package com.goktech.olala.server.dao.goods;

import com.goktech.olala.server.pojo.goods.Advers;
import java.util.List;

public interface AdversMapper {
    int deleteByPrimaryKey(Short adverId);

    int insert(Advers record);

    Advers selectByPrimaryKey(Short adverId);

    List<Advers> selectAll();

    int updateByPrimaryKey(Advers record);
}