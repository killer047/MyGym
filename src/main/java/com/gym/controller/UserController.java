package com.gym.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gym.bean.User;
import com.gym.service.UserService;
import com.gym.service.UserServiceImpl;


@Controller
@RequestMapping("/user")
public class UserController {
	
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/userhello")    
    public ModelAndView getIndex(){   
        ModelAndView mav = new ModelAndView("hello");   
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + user.getUserPassword());
        mav.addObject("hello", "Hello Spring MVC!!!");
        mav.addObject("user", user);
        return mav;    
    } 
      
    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }
    
    @RequestMapping("/doRegist")
    public String doRegist(User user){
        System.out.println(user.getUserName());
        System.out.println(user.getUserPassword());
        user.setUserId(1);
        userService.regist(user);
        return "success";
    }

    @RequestMapping("/login")
    public String checkLogin(User user, Model model){
        user = userService.login(user.getUserName(), user.getUserPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "success";
        }
        System.out.println(user);
        return "fail";
    }
    
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}