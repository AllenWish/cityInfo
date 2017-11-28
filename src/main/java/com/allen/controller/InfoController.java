package com.allen.controller;

import com.allen.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by AllenWish on 2017-11-28.
 */
@Controller
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/{id}")
    public String infoById(@PathVariable("id")int id,Map<String,Object> resultMap)throws Exception{

        Map<String, Object> info = infoService.getById(id);
        resultMap.put("info",info);
        resultMap.put("mainPage","detail.ftl");
        return "index";
    }
}
