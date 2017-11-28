package com.allen.service;

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
}
