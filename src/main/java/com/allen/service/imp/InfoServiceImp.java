package com.allen.service.imp;

import com.allen.dao.InfoDao;
import com.allen.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by AllenWish on 2017-11-28.
 */
@Service("infoService")
public class InfoServiceImp implements InfoService {

    @Autowired
    private InfoDao infoDao;

    @Override
    public List<Map<String, Object>> allPay() throws Exception {
        return infoDao.allPay();
    }

    @Override
    public List<Map<String, Object>> allFree() throws Exception {
        return infoDao.allFree();
    }

    @Override
    public List<Map<String, Object>> findFree(int id) throws Exception {
        return infoDao.findFree(id);
    }

    @Override
    public Map<String, Object> getById(int id) throws Exception {
        return infoDao.getById(id);
    }
}
