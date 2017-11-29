package com.allen.service.imp;

import com.allen.dao.UserDao;
import com.allen.entity.UserEntity;
import com.allen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AllenWish on 2017-11-29.
 */
@Service("userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity login(UserEntity user) throws Exception {
        if(user==null){
            return null;
        }else if(user.getUserName()==null||"".equals(user.getUserName())){
            return null;
        }else if(user.getPassword()==null||"".equals(user.getPassword())){
            return null;
        }
        return userDao.login(user);
    }
}
