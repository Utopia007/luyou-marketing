CREATE TABLE `strategy` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                            `strategy_id` bigint NOT NULL COMMENT '抽奖策略ID',
                            `strategy_desc` varchar(128) NOT NULL COMMENT '抽奖策略描述',
                            `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                            PRIMARY KEY (`id`),
                            KEY `idx_strategy_id` (`strategy_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `strategy` (`id`, `strategy_id`, `strategy_desc`, `create_time`, `update_time`) VALUES (1, 100001, '抽奖策略', '2023-12-09 09:37:19', '2023-12-09 09:37:19');
