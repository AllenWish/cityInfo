package com.allen.service.imp;

import com.allen.dao.InfoTypeDao;
import com.allen.entity.InfoTypeEntity;
import com.allen.service.InfoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Allenwish on 2017-11-28.
 */
@Service("infoTypeService")
public class InfoTypeServiceImp implements InfoTypeService {

    @Autowired
    private InfoTypeDao infoTypeDao;

    @Override
    public InfoTypeEntity findInfoTypeById(int id) throws Exception {
        return infoTypeDao.findInfoTypeById(id);
    }

    @Override
    public List<InfoTypeEntity> findAll() throws Exception {
        return infoTypeDao.findAll();
    }
}
