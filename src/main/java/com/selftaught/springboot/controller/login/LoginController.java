package com.selftaught.springboot.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"hello"})
public class LoginController {

    @RequestMapping(value = {"/springboot"})
    public String hello(){
        return "login";
    }

    @RequestMapping(value = {"/userlogin"})
    public String userlogin(){
        return "index";
    }

    @RequestMapping(value = {"/homePage"})
    public String homePage(){
        return "home/homePage";
    }
}
