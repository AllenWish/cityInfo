package com.allen.service;

import com.allen.entity.UserEntity;

/**
 * Created by AllenWish on 2017-11-29.
 */
public interface UserService {

    public UserEntity login(UserEntity user) throws Exception;
}
