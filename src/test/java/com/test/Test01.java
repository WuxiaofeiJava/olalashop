package com.test;

import com.goktech.olala.server.dao.customer.UserMapper;
import com.goktech.olala.server.pojo.customer.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author sanming
 * @Classname Test01
 * @Description TODO
 * @Date 2020/11/27 20:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@WebAppConfiguration
public class Test01 {
    @Autowired
    UserMapper userMapper;

    @Test
    public void testUser(){
        List<User> users = userMapper.selectAll();
        System.out.println("users:"+users);
    }
}
