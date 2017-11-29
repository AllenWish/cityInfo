package com.allen.controller;

import com.allen.entity.InfoTypeEntity;
import com.allen.service.InfoService;
import com.allen.service.InfoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Allenwish on 2017-11-28.
 */
@Controller
public class IndexController {

    @Autowired
    private InfoTypeService infoTypeService;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private InfoService infoService;
    @RequestMapping("/")
    public String index(Map<String,Object> resultMap, HttpServletRequest request) throws Exception {
        List<Map<String,Object>> infoListMap = infoService.allPay();
        List<InfoTypeEntity> all = infoTypeService.findAll();
        List freeInfoList = new ArrayList<>();
        for(InfoTypeEntity infoType:all){
            List<Map<String,Object>> freeInfo = infoService.findFree(infoType.getId());
            freeInfoList.add(freeInfo);
        }

        HttpSession session = request.getSession();
        session.setAttribute("infoTypeList",all);

        //resultMap.put("infoTypeList",all);//导航标题
        resultMap.put("infoList",infoListMap);//缴费信息
        resultMap.put("freeInfoList",freeInfoList);//免费信息
        return "index";
    }

    @RequestMapping("/publish")
    public String publish(Map<String,Object> resultMap) throws Exception{
        //获取所有标题类别
        /*List<InfoTypeEntity> all = infoTypeService.findAll();

        resultMap.put("infoTypeList",all);*/
        resultMap.put("mainPage","publish.ftl");
        return "index";
    }

    @RequestMapping("/search")
    public String search(Map<String,Object> resultMap, String keyword,String content,String searchType) throws Exception{
        String sql = " select t.id,t.info_title as infoTitle,t.info_content as infoContent,t.info_linkman as infoLinkman," +
                " t.info_phone as infoPhone, t.info_email as infoEmail,t.info_date as infoDate,t.info_state as infoState," +
                " t.info_payfor as infoPayfor,d.id as typeId,d.type_sign as typeSign,d.type_name as typeName,d.type_intro as typeIntro " +
                " from t_info t,t_infoType d " +
                " where t.info_type=d.id and info_state=1 and ";
        StringBuffer sb = new StringBuffer(sql);
        if("like".equals(searchType)){
            sb.append(content+" like '%"+keyword+"%' ");
        }else{
            sb.append(content+" = '"+keyword+"' ");
        }
        sb.append(" order by t.info_payfor desc , t.info_date desc ");

        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sb.toString());//查询数据

        resultMap.put("infoList",mapList);
        resultMap.put("mainPage","searchPage.ftl");
        // keyword, content, searchType
        resultMap.put("keyword",keyword);
        resultMap.put("content",content);
        resultMap.put("searchType",searchType);
        return "index";
    }

}
