package com.zq;

import com.zq.anno.config.SpringConfiguration;
import com.zq.anno.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class JdbcAnnoTransationTest {
    @Resource
    private IAccountService iAccountService;
    @Test
    public void test(){
        iAccountService.transfer(1,2,100);
    }
}
