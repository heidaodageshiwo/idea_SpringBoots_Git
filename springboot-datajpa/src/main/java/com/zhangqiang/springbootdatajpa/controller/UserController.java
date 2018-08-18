package com.zhangqiang.springbootdatajpa.controller;

import com.zhangqiang.springbootdatajpa.entity.UserEntity;
import com.zhangqiang.springbootdatajpa.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询用户列表方法
     * @return
     * http://localhost:8080/user/list
     */
    @RequestMapping(value ="/list" ,method = RequestMethod.GET)
    public List<UserEntity> list(){
        return userJPA.findAll();
    }

    /**
     * 添加、更新用户方法
     * @param entity
     * @return
     * http://localhost:8080/user/save?name=admin&age=22&address=jinan
     */
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public UserEntity save(UserEntity entity)
    {
        return userJPA.save(entity);
    }

    /**
     * 删除用户方法
     * @param id 用户编号
     * @return
     */
   /* @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<UserEntity> delete(Long id)
    {
        userJPA.delete(id);
        return userJPA.findAll();
    }*/

}