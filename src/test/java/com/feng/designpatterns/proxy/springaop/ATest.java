package com.feng.designpatterns.proxy.springaop;

import com.feng.scaffold.GenerateProjectScaffoldApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/16 13:14
 * @Desc
 * @Since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {GenerateProjectScaffoldApplication.class})
public class ATest {

    @Resource
    private IUserService userService;

    @Test
    public void testAop() {
        userService.add();
    }

}

