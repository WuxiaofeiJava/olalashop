package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.service.IAdversService;
import com.goktech.olala.server.dao.goods.AdversMapper;
import com.goktech.olala.server.pojo.goods.Advers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname AdversServiceImp
 * @Description TODO
 * @Date 2020/11/30 9:30
 * @Created by sanming
 */
@Service
public class AdversServiceImp implements IAdversService {

    @Autowired
    AdversMapper adversMapper;

    @Override
    public List<Advers> selectAll() {
        return adversMapper.selectAll();
    }
}
