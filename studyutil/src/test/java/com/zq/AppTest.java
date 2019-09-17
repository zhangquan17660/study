package com.zq;

import static org.junit.Assert.assertTrue;

import com.zq.Ioczhujie.service.Iservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beanIoczhujie.xml"})
public class AppTest 
{
    @Autowired
    private Iservice iservice;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        iservice.save();
        assertTrue( true );
    }
}
