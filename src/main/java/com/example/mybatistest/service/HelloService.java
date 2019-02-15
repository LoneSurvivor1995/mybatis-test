package com.example.mybatistest.service;

import com.example.mybatistest.entity.User;

import java.util.List;

/**
 * @ProjectName: mybatis-test
 * @Package: com.example.mybatistest.service
 * @ClassName: HelloService
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/2/15 16:25
 */
public interface HelloService {

    public List<User> get(int id);
}
