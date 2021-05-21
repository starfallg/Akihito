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
            int arr[]={8,4,6,2,3};
            int tem=0;
            System.out.println("牛牛乓臭");
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr.length;j++){
                    if(arr[j]>arr[i]){
                        tem=arr[i];
                        arr[i]=arr[j];
                        arr[j]=tem;
                    }
                }
            }
            for (int i : arr) {
                System.out.println(i);
            }
        }catch (Exception e){
            return "no";
        }

        return "ok";
    }
}
