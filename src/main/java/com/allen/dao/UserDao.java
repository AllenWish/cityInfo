package com.allen.dao;

import com.allen.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by AllenWish on 2017-11-29.
 */
@Mapper
public interface UserDao {

    @Select("select id as id,user_name as userName,password as password from t_user where user_name=#{userName} and password=#{password} limit 0,1")
    public UserEntity login(UserEntity user);
}
