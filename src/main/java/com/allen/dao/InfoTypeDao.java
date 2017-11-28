package com.allen.dao;

import com.allen.entity.InfoTypeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Allenwish on 2017-11-28.
 */
@Mapper
public interface InfoTypeDao {

    @Select("select id,type_sign as typeSign,type_name as typeName,type_intro as typeIntro from t_infoType where id=#{id}")
    public InfoTypeEntity findInfoTypeById(@Param("id") int id) throws Exception;

    @Select("select id,type_sign as typeSign,type_name as typeName,type_intro as typeIntro from t_infoType order by type_sign")
    public List<InfoTypeEntity> findAll() throws Exception;
}
