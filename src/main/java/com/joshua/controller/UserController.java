package com.joshua.controller;

import com.joshua.dao.UserDao;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;
    @CrossOrigin
    @GetMapping("/login")
    public String login(String username, String password, HttpServletRequest httpServletRequest){
       Document us = userDao.findByName(username);
        Object password1 = null;
       if (us!=null){
           password1 = us.get("password");
       }
        if (us!=null&&password1.toString().equals(password)){
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("user",us.get("username"));
            return "登录成功";
        }

        else {
            return "用户名或密码错误！";
        }


    }
}
