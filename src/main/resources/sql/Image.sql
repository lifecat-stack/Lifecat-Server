-- auto Generated on 2018-11-28 09:30:57 
-- DROP TABLE IF EXISTS `image`; 
CREATE TABLE image(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `image_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'Õº∆¨ID Unique',
    `user_id` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'Õº∆¨À˘ Ù”√ªßID',
    `image_path` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'Õº∆¨¥Ê¥¢ŒÔ¿Ì¬∑æ∂',
    `image_url` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'Õº∆¨¥Ê¥¢Õ¯¬Á¬∑æ∂',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'createTime',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'updateTime',
    `is_deleted` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'isDeleted',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'image';
