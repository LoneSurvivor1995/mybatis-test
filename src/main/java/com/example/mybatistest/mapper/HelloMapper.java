package com.example.mybatistest.mapper;

import com.example.mybatistest.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: mybatis-test
 * @Package: com.example.mybatistest.mapper
 * @ClassName: HelloMapper
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/2/15 15:32
 */

@Repository
public interface HelloMapper {

    public List<User> get(int id);
}
