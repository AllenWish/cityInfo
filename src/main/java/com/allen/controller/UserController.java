package com.allen.controller;

import com.allen.base.ContextSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by AllenWish on 2017-11-29.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String index(){
        return "admin/index";
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpServletRequest request){
        request.getSession().removeAttribute(ContextSession.LOGINUSER);
        return "redirect:/index";
    }
}
