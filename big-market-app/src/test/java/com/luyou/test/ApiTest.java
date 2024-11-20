package com.luyou.test;

import com.luyou.infrastructure.persistent.dao.IStrategyAwardDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Resource
    private IStrategyAwardDao strategyAwardDao;

    @Test
    public void test() {
        log.info("测试完成");
    }

    @Test
    public void test_infrastructure() {
        log.info("strategyAwardDao: data: {}", strategyAwardDao.queryStrategyAwardList());
    }

}
