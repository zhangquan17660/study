package com.test.dao;

import com.zq.model.User;

public interface UserDao {
     User findUserById(int id) throws Exception;

}
