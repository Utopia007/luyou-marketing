package com.luyou.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @author 鹿又笑
 * @create 2024/11/20-18:01
 * @description
 */
@Data
public class Strategy {

    /** 自增ID */
    private Long id;
    /** 抽奖策略ID */
    private Long strategyId;
    /** 抽奖策略描述 */
    private String strategyDesc;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;


}
