package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wolzche on 2018/3/7.
 */
@RestController
@RequestMapping("/rest/user")
public class UserController {
    @Autowired
    private UserRepository userDao;


    @RequestMapping("getAll")
    @ResponseBody
    public List<User> queryAll(){
        List<User> list = new ArrayList<User>();
        list = userDao.findAll();
        return list;
    }


}
