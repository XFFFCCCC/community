package com.lf.community;

import com.lf.community.dao.UserMapper;
import com.lf.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectUser(){
        System.out.println(userMapper.selectById(11));
    }


    @Test
    public void testSelectByName(){
        System.out.println(userMapper.selectByName("nowcoder11"));
    }


    @Test
    public void testSelectByEmail(){
        System.out.println(userMapper.selectByEmail("nowcoder11@sina.com"));
    }


    @Test
    public void testInsertUser(){
//        System.out.println(userMapper.insertUser(new User()));
    }

    @Test
    public void testupdateStatus(){
        System.out.println(userMapper.updateStatus(152,1));
    }



}
