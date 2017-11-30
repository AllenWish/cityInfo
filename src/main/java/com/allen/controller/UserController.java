package com.allen.controller;

import com.allen.base.ContextSession;
import com.allen.entity.InfoEntity;
import com.allen.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
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

    @PostMapping("/deleteInfo")
    @ResponseBody
    public String deleteInfo(int delId, HttpServletRequest request, HttpServletResponse response)
                                            throws  Exception{
        try {
            infoService.deleteById(delId);
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"flag\":false}";
        }
        return "{\"flag\":true}";
    }

    @RequestMapping("/infodetails/{id}")
    public String infodetails(Map<String,Object> resultMap, @PathVariable int id, HttpServletRequest request) throws Exception{
        Map<String, Object> info = infoService.getById(id);
        resultMap.put("mainPage","infodetails.ftl");
        resultMap.put("info",info);
        return  "admin/index";
    }
    @PostMapping("/checkInfo")
    @ResponseBody
    public String checkInfo(int id){
        try {
            infoService.checkInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"flag\":false}";
        }
        return "{\"flag\":true}";
    }

}
