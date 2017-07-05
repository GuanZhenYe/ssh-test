package com.jianq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by hp on 2017/7/3.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping("/index")
    public String indexPage(Map<String,Object> model){

        model.put("key","hello linux");
        return "index";
    }
}
