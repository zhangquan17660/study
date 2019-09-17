package com.zq;

import com.zq.jdbc.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:jdbcBean.xml")
public class JdbcTransationTest {
    @Autowired
    private IAccountService iAccountService;
    @Test
    public void test(){
        iAccountService.transfer(1,2,100);
    }
}
