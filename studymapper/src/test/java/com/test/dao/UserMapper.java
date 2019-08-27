package com.test.dao;

import com.test.po.UserCustom;
import com.test.po.UserVo;
import com.zq.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User selectByPrimaryKey(int id);
    User findUserByUser(User user);
    UserCustom findUserByVo(UserVo userVo);
    List<UserCustom> findUserByIds( @Param("ids") List<Integer> ids);
}
