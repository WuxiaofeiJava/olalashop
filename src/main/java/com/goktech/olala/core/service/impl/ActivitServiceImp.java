package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.service.IActivitService;
import com.goktech.olala.server.dao.goods.ActivitMapper;
import com.goktech.olala.server.pojo.goods.Activit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ActivitServiceImp
 * @Description TODO
 * @Date 2020/11/30 9:50
 * @Created by sanming
 */
@Service
public class ActivitServiceImp implements IActivitService {
    @Autowired
    ActivitMapper activitMapper;
    @Override
    public List<Activit> selectAll() {
        return activitMapper.selectAll();
    }
}
