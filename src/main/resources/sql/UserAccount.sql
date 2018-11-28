-- auto Generated on 2018-11-28 09:29:35 
-- DROP TABLE IF EXISTS `user_account`; 
CREATE TABLE user_account(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `user_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '用户ID',
    `user_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '用户账号 Unique',
    `user_password` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '用户密码',
    `user_last_login` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '用户最近一次登录时间',
    `user_login_count` INTEGER(12) NOT NULL DEFAULT -1 COMMENT '用户总访问次数',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'createTime',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    `is_deleted` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'isDeleted',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user_account';
