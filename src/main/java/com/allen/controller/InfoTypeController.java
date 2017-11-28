package com.allen.controller;

import com.allen.entity.InfoTypeEntity;
import com.allen.service.InfoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Allenwish on 2017-11-28.
 */
@Controller
@RequestMapping("/infoType")
public class InfoTypeController {

    @Autowired
    private InfoTypeService infoTypeService;
    //http://localhost:8033/cityInfo/infoType/1
    @RequestMapping("/{id}")
    @ResponseBody
    public InfoTypeEntity findInfoTypeById(@PathVariable("id")int id) throws Exception {
        return infoTypeService.findInfoTypeById(id);
    }
    //http://localhost:8033/cityInfo/infoType/all
    @RequestMapping("/all")
    public String findAll(Map<String,Object> map) throws Exception {
        List<InfoTypeEntity> infoTypeList =  infoTypeService.findAll();
        List<Map<String,Object>> typeList =new ArrayList<>();
        Map<String,Object> friend;

        for(InfoTypeEntity infoType:infoTypeList){
            friend = new HashMap<>();
            friend.put("id",infoType.getId());
            friend.put("typeSign",infoType.getTypeSign());
            friend.put("typeName",infoType.getTypeName());
            friend.put("typeIntro",infoType.getTypeIntro());
            typeList.add(friend);
        }
        map.put("typeList", typeList);
        return "allInfoType";
    }


}
