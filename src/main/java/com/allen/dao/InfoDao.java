package com.allen.dao;

import com.allen.entity.InfoEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by AllenWish on 2017-11-28.
 */
@Mapper
public interface InfoDao {

    @Select(" select t.id,t.info_title as infoTitle,t.info_content as infoContent,t.info_linkman as infoLinkman," +
            " t.info_phone as infoPhone, t.info_email as infoEmail,t.info_date as infoDate,t.info_state as infoState," +
            " t.info_payfor as infoPayfor,d.id as typeId,d.type_sign as typeSign,d.type_name as typeName,d.type_intro as typeIntro " +
            " from t_info t,t_infoType d " +
            " where t.info_type=d.id and info_state=1 and info_payfor=1 order by t.info_date desc")
    public List<Map<String,Object>> allPay() throws Exception;

    @Select(" select t.id,t.info_title as infoTitle,t.info_content as infoContent,t.info_linkman as infoLinkman," +
            " t.info_phone as infoPhone, t.info_email as infoEmail,t.info_date as infoDate,t.info_state as infoState," +
            " t.info_payfor as infoPayfor,d.id as typeId,d.type_sign as typeSign,d.type_name as typeName,d.type_intro as typeIntro " +
            " from t_info t,t_infoType d " +
            " where t.info_type=d.id and info_state=1 and info_payfor=0 order by t.info_date desc ")
    public List<Map<String,Object>> allFree() throws Exception;

    @Select(" select t.id,t.info_title as infoTitle,t.info_content as infoContent,t.info_linkman as infoLinkman," +
            " t.info_phone as infoPhone, t.info_email as infoEmail,t.info_date as infoDate,t.info_state as infoState," +
            " t.info_payfor as infoPayfor,d.id as typeId,d.type_sign as typeSign,d.type_name as typeName,d.type_intro as typeIntro " +
            " from t_info t,t_infoType d " +
            " where t.info_type=d.id and t.info_state=1 and t.info_payfor=0 and d.id=#{id} order by t.info_date desc limit 0,5")
    public List<Map<String,Object>> findFree(@Param("id")int id) throws Exception;

    @Select(" select t.id,t.info_title as infoTitle,t.info_content as infoContent,t.info_linkman as infoLinkman," +
            " t.info_phone as infoPhone, t.info_email as infoEmail,t.info_date as infoDate,t.info_state as infoState," +
            " t.info_payfor as infoPayfor,d.id as typeId,d.type_sign as typeSign,d.type_name as typeName,d.type_intro as typeIntro " +
            " from t_info t,t_infoType d " +
            " where t.info_type=d.id  and t.id=#{id}")
    public Map<String,Object> getById(@Param("id")int id) throws Exception;

    @Select(" select t.id,t.info_title as infoTitle,t.info_content as infoContent,t.info_linkman as infoLinkman," +
            " t.info_phone as infoPhone, t.info_email as infoEmail,t.info_date as infoDate,t.info_state as infoState," +
            " t.info_payfor as infoPayfor,d.id as typeId,d.type_sign as typeSign,d.type_name as typeName,d.type_intro as typeIntro " +
            " from t_info t,t_infoType d " +
            " where t.info_type=d.id and t.info_state=1 and d.id=#{id}")
    public List<Map<String,Object>> getByTypeId(@Param("id")int id);

    @Insert("insert into t_info values(null,#{infoType},#{infoTitle},#{infoContent},#{infoLinkman},#{infoPhone}," +
            "#{infoEmail},now(),#{infoState},#{infoPayfor})")
    public void insertInfo(InfoEntity info);


    public List<InfoEntity> infoList(InfoEntity infoEntity);

    @Delete("delete FROM t_info where id=#{id}")
    public void deleteById(int id);

    @Update("update t_info set info_state = '1' where id =#{id}")
    public void checkInfo(int id);
}
