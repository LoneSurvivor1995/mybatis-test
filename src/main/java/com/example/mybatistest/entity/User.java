package com.example.mybatistest.entity;

/**
 * @ProjectName: mybatis-test
 * @Package: com.example.mybatistest.entity
 * @ClassName: User
 * @Description:
 * @Author: meihao
 * @CreateDate: 2019/2/15 15:34
 */
public class User {

    int id;
    int userId;
    String name;
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
