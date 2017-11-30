package com.allen.service;

import com.allen.entity.InfoEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by AllenWish on 2017-11-28.
 */
public interface InfoService {
    public List<Map<String,Object>> allPay() throws Exception;
    public List<Map<String,Object>> allFree() throws Exception;
    public List<Map<String,Object>> findFree(int id) throws Exception;
    public Map<String,Object> getById(int id) throws Exception;

    public List<Map<String,Object>> getByTypeId(int id);

    public void insertInfo(InfoEntity info) throws Exception;

    public List<InfoEntity> infoList(InfoEntity infoEntity) throws Exception;

    public void deleteById(int delId)throws Exception;

    public void checkInfo(int id)  throws Exception;
}
