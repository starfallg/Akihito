package com.c.controller;

import com.c.service.usersservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Akihito
 * 2021/5/18 16:31
 */
@Controller
public class users {
    @Autowired
    private usersservice dao;

    @RequestMapping("queryall")
    @ResponseBody
    private String queryall(){
        try {
            List<com.c.entity.users> users = dao.queryall();
            System.out.println(users);
        }catch (Exception e){
            return "no";
        }

        return "ok";
    }
}
