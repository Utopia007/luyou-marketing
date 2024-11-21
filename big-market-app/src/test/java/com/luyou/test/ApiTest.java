package com.luyou.test;

import com.luyou.domain.strategy.service.armory.IStrategyArmory;
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

    @Resource
    private IStrategyArmory strategyArmory;

    @Test
    public void test() {
        log.info("测试完成");
    }

    @Test
    public void test_infrastructure() {
        log.info("strategyAwardDao: data: {}", strategyAwardDao.queryStrategyAwardList());
    }

    /**
     * 策略ID；100001L、100002L 装配的时候创建策略表写入到 Redis Map 中
     */
    @Test
    public void test_strategyArmory() {
        boolean success = strategyArmory.assembleLotteryStrategy(100001L);
        log.info("测试结果：{}", success);
    }

    /**
     * 从装配的策略中随机获取奖品ID值
     */
    @Test
    public void test_getAssembleRandomVal() {
        log.info("测试结果：{} - 奖品ID值", strategyArmory.getRandomAwardId(100001L));
    }


}
