package com.test.dao;

import com.test.po.UserCustom;
import com.test.po.UserVo;
import com.zq.model.User;

public interface UserMapper {
    User selectByPrimaryKey(int id);
    User findUserByUser(User user);
    UserCustom findUserByVo(UserVo userVo);
}
