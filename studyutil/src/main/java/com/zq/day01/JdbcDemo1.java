package com.zq.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 耦合：
 * 类之间依赖
 * 方法之间的依赖
 * 解耦：降低依赖关系
 * 解决：
 *  通过反射创建对象，避免使用new关键字创建对象
 *  通过读取配置文件读取创建内容
 *
 *
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception{
       // 1.注册驱动
       // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.146.210:3306/test?useUnicode=true&characterEncoding=utf8",
                "gaokao","gaokao678");
        // 3.获取数据库操作预处理对象
        PreparedStatement pstm = connection.prepareStatement("select * from user");

       // 执行sql
        ResultSet resultSet = pstm.executeQuery();
        //遍历结果集
        while (resultSet.next()){
            System.out.println(resultSet.getString("username"));
        }
        //释放资源
        resultSet.close();
        pstm.close();
        connection.close();


    }
}
