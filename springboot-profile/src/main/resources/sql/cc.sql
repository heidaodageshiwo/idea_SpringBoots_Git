-- ----------------------------
-- Table structure for system_user_info
-- ----------------------------
DROP TABLE IF EXISTS `system_user_info`;
CREATE TABLE `system_user_info` (
  `SUI_ID` INT(11) NOT NULL AUTO_INCREMENT,
  `SUI_NICK_NAME` VARCHAR(50) DEFAULT NULL,
  `SUI_LOGIN_NAME` VARCHAR(30) DEFAULT NULL,
  `SUI_LOGIN_PASSWORD` VARCHAR(32) DEFAULT NULL,
  PRIMARY KEY (`SUI_ID`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `system_user_info` VALUES ('1', '线上测试环境用户', 'beta', 'beta_password');
INSERT INTO `system_user_info` VALUES ('1', '开发环境用户', 'dev', 'dev_password');
INSERT INTO `system_user_info` VALUES ('1', '正式环境用户', 'prod', 'prod_password');
