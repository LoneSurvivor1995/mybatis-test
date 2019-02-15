package com.example.mybatistest.controller;

import com.example.mybatistest.entity.User;
import com.example.mybatistest.mapper.HelloMapper;
import com.example.mybatistest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: mybatis-test
 * @Package: com.example.mybatistest.controller
 * @ClassName: HelloController
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/2/15 15:27
 */

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/")
    public List<User> get(int id){
        return helloService.get(id);
    }
}
