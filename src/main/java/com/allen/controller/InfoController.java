package com.allen.controller;

import com.allen.entity.InfoEntity;
import com.allen.entity.InfoTypeEntity;
import com.allen.service.InfoService;
import com.allen.service.InfoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by AllenWish on 2017-11-28.
 */
@Controller
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;
    @Autowired
    private InfoTypeService infoTypeService;

    @RequestMapping("/{id}")
    public String infoById(@PathVariable("id")int id,Map<String,Object> resultMap)throws Exception{

        Map<String, Object> info = infoService.getById(id);
        resultMap.put("info",info);
        resultMap.put("mainPage","detail.ftl");
        return "index";
    }

    @RequestMapping("/addInfo")
    public String addInfo(InfoEntity info, Map<String,Object> resultMap) throws Exception{
        try {
            infoService.insertInfo(info);
            resultMap.put("msg",info.getInfoTitle()+"添加成功，等待审核中！！");
            resultMap.put("mainPage","base/success.ftl");
        } catch (Exception e) {
            List<InfoTypeEntity> all = infoTypeService.findAll();
            resultMap.put("infoTypeList",all);
            resultMap.put("mainPage","publish.ftl");
            resultMap.put("error",info.getInfoTitle()+"添加失败！！"+e.getMessage());
        }

        return "index";
    }

}
