package com.allen.controller;

import com.allen.base.ContextSession;
import com.allen.entity.InfoEntity;
import com.allen.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by AllenWish on 2017-11-29.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private InfoService infoService;
    @RequestMapping("/index")
    public String index(){
        return "admin/index";
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpServletRequest request){
        request.getSession().removeAttribute(ContextSession.LOGINUSER);
        return "redirect:/index";
    }

    @RequestMapping("/searchInfo")
    public String searchInfo(Map<String,Object> resultMap,HttpServletRequest request,InfoEntity infoEntity){
        try {
            List<InfoEntity> infoEntities = infoService.infoList(infoEntity);
            resultMap.put("mainPage","searchResult.ftl");
            resultMap.put("infoList",infoEntities);
        } catch (Exception e) {
            resultMap.put("error","查询失败咯");
            e.printStackTrace();
        }
        return "admin/index";
    }

}
