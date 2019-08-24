package com.zq.service.impl;

import com.zq.dao.UserDao;
import com.zq.model.User;
import com.zq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getUserById(int id) {
        return userDao.selectByPrimaryKey(id);
    }
}
