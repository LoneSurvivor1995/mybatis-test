package com.example.mybatistest.service.impl;

import com.example.mybatistest.entity.User;
import com.example.mybatistest.mapper.HelloMapper;
import com.example.mybatistest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: mybatis-test
 * @Package: com.example.mybatistest.service.impl
 * @ClassName: HelloServiceImpl
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/2/15 16:25
 */

@Service
public class HelloServiceImpl implements HelloService{

    @Autowired
    HelloMapper helloMapper;

    @Override
    public List<User> get(int id) {
        return helloMapper.get(id);
    }
}
