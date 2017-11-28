package com.allen.service;

import com.allen.entity.InfoTypeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Allenwish on 2017-11-28.
 */
public interface InfoTypeService {

    public InfoTypeEntity findInfoTypeById(@Param("id") int id) throws Exception;

    public List<InfoTypeEntity> findAll() throws Exception;
}
