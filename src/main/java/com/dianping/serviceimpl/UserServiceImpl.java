package com.dianping.serviceimpl;

import com.dianping.dao.user.UserDao;
import com.dianping.entity.UserEntity;
import com.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chenchen on 14-10-28.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public UserEntity getUserById(int id) {
        return userDao.getUserById(id);
    }
}
