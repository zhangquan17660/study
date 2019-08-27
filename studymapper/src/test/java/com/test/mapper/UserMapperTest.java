package com.test.mapper;

import com.test.dao.UserMapper;
import com.test.po.UserCustom;
import com.test.po.UserVo;
import com.zq.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    // 此方法是在执行testFindUserById之前执行
    @Before
    public void setUp() throws Exception {
        // 创建sqlSessionFactory

        // mybatis配置文件
        String resource = "SqlMapConfig.xml";
        // 得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂，传入mybatis的配置文件信息
        sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);
    }

    @Test
    public void testFindUserById() throws Exception {
        // 创建UserDao的对象
        SqlSession sqlsession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlsession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
        sqlsession.close();
    }

    @Test
    public void selectUserByUserVO() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserCustom user = new UserCustom();
        user.setId(10);
        user.setUsername("张三");
        UserVo userVo = new UserVo();
        userVo.setUserCustom(user);
        UserCustom userCustom = userMapper.findUserByVo(userVo);
        System.out.println(user);

    }

    @Test
    public void selectUserByUser() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(10);
        user.setUsername("张三");
        user = userMapper.findUserByUser(user);
        System.out.println(user);

    }

    @Test
    public void selectUserByIds() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(10);
        ids.add(16);

        List<UserCustom> user = userMapper.findUserByIds( ids);
        System.out.println(user);

    }


}
