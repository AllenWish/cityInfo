package com.allen.runner;

import com.allen.base.ContextSession;
import com.allen.entity.InfoTypeEntity;
import com.allen.service.InfoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by AllenWish on 2017-11-29.
 */
@Component
@Order(value = 1)
public class StartupRunner implements CommandLineRunner {
    @Autowired
    private InfoTypeService infoTypeService;
    @Autowired
    ServletContext application;
    @Override
    public void run(String... strings) throws Exception {
        List<InfoTypeEntity> all = infoTypeService.findAll();
        application.setAttribute(ContextSession.INFOTYPELIST,all);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>StartupRunner<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
