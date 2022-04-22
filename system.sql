/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : system

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2022-04-22 14:59:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for logindate
-- ----------------------------
DROP TABLE IF EXISTS `logindate`;
CREATE TABLE `logindate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=232 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of logindate
-- ----------------------------
INSERT INTO `logindate` VALUES ('13', 'chong', '2022-03-01 14:49:58');
INSERT INTO `logindate` VALUES ('14', 'chong', '2022-03-01 14:58:59');
INSERT INTO `logindate` VALUES ('15', 'chong', '2022-03-01 14:59:30');
INSERT INTO `logindate` VALUES ('16', 'chong', '2022-03-01 15:00:46');
INSERT INTO `logindate` VALUES ('17', 'chong', '2022-03-01 15:02:10');
INSERT INTO `logindate` VALUES ('18', 'chong', '2022-03-01 15:02:40');
INSERT INTO `logindate` VALUES ('19', 'chong', '2022-03-01 15:34:59');
INSERT INTO `logindate` VALUES ('20', 'chong', '2022-03-01 15:37:00');
INSERT INTO `logindate` VALUES ('21', 'chong', '2022-03-01 15:37:44');
INSERT INTO `logindate` VALUES ('22', 'chong', '2022-03-01 15:38:11');
INSERT INTO `logindate` VALUES ('23', 'chong', '2022-03-02 08:37:22');
INSERT INTO `logindate` VALUES ('24', 'chong', '2022-03-02 08:38:58');
INSERT INTO `logindate` VALUES ('25', 'chong', '2022-03-02 09:13:27');
INSERT INTO `logindate` VALUES ('26', 'chong', '2022-03-02 09:16:25');
INSERT INTO `logindate` VALUES ('27', 'chong', '2022-03-02 09:16:30');
INSERT INTO `logindate` VALUES ('28', 'chong', '2022-03-02 09:16:31');
INSERT INTO `logindate` VALUES ('29', 'chong', '2022-03-02 09:16:31');
INSERT INTO `logindate` VALUES ('30', 'chong', '2022-03-02 09:17:36');
INSERT INTO `logindate` VALUES ('31', 'chong', '2022-03-02 09:21:34');
INSERT INTO `logindate` VALUES ('32', 'chong', '2022-03-02 09:23:06');
INSERT INTO `logindate` VALUES ('33', 'chong', '2022-03-02 09:25:55');
INSERT INTO `logindate` VALUES ('34', 'chong', '2022-03-02 09:26:53');
INSERT INTO `logindate` VALUES ('35', 'chong', '2022-03-02 09:48:13');
INSERT INTO `logindate` VALUES ('36', 'chong', '2022-03-02 10:23:20');
INSERT INTO `logindate` VALUES ('37', 'wang', '2022-03-02 10:23:54');
INSERT INTO `logindate` VALUES ('38', 'chong', '2022-03-03 11:02:38');
INSERT INTO `logindate` VALUES ('39', 'chong', '2022-03-03 12:35:10');
INSERT INTO `logindate` VALUES ('40', 'chong', '2022-03-03 12:43:36');
INSERT INTO `logindate` VALUES ('41', 'chong', '2022-03-04 08:20:00');
INSERT INTO `logindate` VALUES ('42', 'chong', '2022-03-04 09:23:51');
INSERT INTO `logindate` VALUES ('43', 'chong', '2022-03-04 09:28:35');
INSERT INTO `logindate` VALUES ('44', 'chong', '2022-03-04 09:34:10');
INSERT INTO `logindate` VALUES ('45', 'chong', '2022-03-04 09:35:11');
INSERT INTO `logindate` VALUES ('46', 'chong', '2022-03-04 09:38:37');
INSERT INTO `logindate` VALUES ('47', 'chong', '2022-03-04 09:46:49');
INSERT INTO `logindate` VALUES ('48', 'chong', '2022-03-04 09:51:58');
INSERT INTO `logindate` VALUES ('49', 'chong', '2022-03-04 09:52:54');
INSERT INTO `logindate` VALUES ('50', 'chong', '2022-03-04 10:03:09');
INSERT INTO `logindate` VALUES ('51', 'chong', '2022-03-04 10:03:32');
INSERT INTO `logindate` VALUES ('52', 'chong', '2022-03-04 10:10:00');
INSERT INTO `logindate` VALUES ('53', 'chong', '2022-03-04 10:10:59');
INSERT INTO `logindate` VALUES ('54', 'chong', '2022-03-04 10:11:11');
INSERT INTO `logindate` VALUES ('55', 'chong', '2022-03-04 10:14:08');
INSERT INTO `logindate` VALUES ('56', 'chong', '2022-03-04 10:15:16');
INSERT INTO `logindate` VALUES ('57', 'chong', '2022-03-04 10:20:50');
INSERT INTO `logindate` VALUES ('58', 'chong', '2022-03-04 14:52:32');
INSERT INTO `logindate` VALUES ('59', 'chong', '2022-03-04 15:14:03');
INSERT INTO `logindate` VALUES ('60', 'chong', '2022-03-04 15:38:44');
INSERT INTO `logindate` VALUES ('61', 'chong', '2022-03-04 15:40:02');
INSERT INTO `logindate` VALUES ('62', 'chong', '2022-03-04 15:44:10');
INSERT INTO `logindate` VALUES ('63', 'chong', '2022-03-04 15:45:32');
INSERT INTO `logindate` VALUES ('64', 'chong', '2022-03-04 15:51:30');
INSERT INTO `logindate` VALUES ('65', 'chong', '2022-03-04 15:55:58');
INSERT INTO `logindate` VALUES ('66', 'chong', '2022-03-04 15:59:29');
INSERT INTO `logindate` VALUES ('67', 'chong', '2022-03-04 16:00:20');
INSERT INTO `logindate` VALUES ('68', 'chong', '2022-03-04 16:01:50');
INSERT INTO `logindate` VALUES ('69', 'chong', '2022-03-04 16:14:09');
INSERT INTO `logindate` VALUES ('70', 'chong', '2022-03-04 16:15:34');
INSERT INTO `logindate` VALUES ('71', 'chong', '2022-03-04 16:19:14');
INSERT INTO `logindate` VALUES ('72', 'chong', '2022-03-04 16:22:21');
INSERT INTO `logindate` VALUES ('73', 'chong', '2022-03-04 16:29:49');
INSERT INTO `logindate` VALUES ('74', 'chong', '2022-03-04 16:31:39');
INSERT INTO `logindate` VALUES ('75', 'chong', '2022-03-04 16:33:20');
INSERT INTO `logindate` VALUES ('76', 'chong', '2022-03-04 16:34:54');
INSERT INTO `logindate` VALUES ('77', 'chong', '2022-03-04 16:36:55');
INSERT INTO `logindate` VALUES ('78', 'chong', '2022-03-04 16:38:13');
INSERT INTO `logindate` VALUES ('79', 'chong', '2022-03-05 09:08:29');
INSERT INTO `logindate` VALUES ('80', 'chong', '2022-03-05 09:10:35');
INSERT INTO `logindate` VALUES ('81', 'chong', '2022-03-05 09:13:02');
INSERT INTO `logindate` VALUES ('82', 'chong', '2022-03-05 09:15:02');
INSERT INTO `logindate` VALUES ('83', 'chong', '2022-03-05 09:19:43');
INSERT INTO `logindate` VALUES ('84', 'chong', '2022-03-05 09:32:45');
INSERT INTO `logindate` VALUES ('85', 'chong', '2022-03-05 09:42:33');
INSERT INTO `logindate` VALUES ('86', 'chong', '2022-03-05 10:07:43');
INSERT INTO `logindate` VALUES ('87', 'chong', '2022-03-05 10:10:17');
INSERT INTO `logindate` VALUES ('88', 'chong', '2022-03-05 15:00:01');
INSERT INTO `logindate` VALUES ('89', 'chong', '2022-03-05 15:03:48');
INSERT INTO `logindate` VALUES ('90', 'chong', '2022-03-05 15:06:55');
INSERT INTO `logindate` VALUES ('91', 'chong', '2022-03-05 15:09:59');
INSERT INTO `logindate` VALUES ('92', 'chong', '2022-03-05 15:19:29');
INSERT INTO `logindate` VALUES ('93', 'chong', '2022-03-05 15:34:06');
INSERT INTO `logindate` VALUES ('94', 'chong', '2022-03-05 15:37:45');
INSERT INTO `logindate` VALUES ('95', 'chong', '2022-03-05 15:39:59');
INSERT INTO `logindate` VALUES ('96', 'chong', '2022-03-05 15:41:42');
INSERT INTO `logindate` VALUES ('97', 'chong', '2022-03-05 15:52:13');
INSERT INTO `logindate` VALUES ('98', 'chong', '2022-03-05 16:43:18');
INSERT INTO `logindate` VALUES ('99', 'chong', '2022-03-05 16:55:44');
INSERT INTO `logindate` VALUES ('100', 'chong', '2022-03-05 16:57:11');
INSERT INTO `logindate` VALUES ('101', 'chong', '2022-03-05 17:00:11');
INSERT INTO `logindate` VALUES ('102', 'chong', '2022-03-05 17:08:34');
INSERT INTO `logindate` VALUES ('103', 'chong', '2022-03-06 12:13:56');
INSERT INTO `logindate` VALUES ('104', 'chong', '2022-03-06 12:14:47');
INSERT INTO `logindate` VALUES ('105', 'chong', '2022-03-06 12:18:32');
INSERT INTO `logindate` VALUES ('106', 'chong', '2022-03-07 08:39:18');
INSERT INTO `logindate` VALUES ('107', 'chong', '2022-03-07 08:58:16');
INSERT INTO `logindate` VALUES ('108', 'chong', '2022-03-07 08:58:50');
INSERT INTO `logindate` VALUES ('109', 'chong', '2022-03-07 09:11:24');
INSERT INTO `logindate` VALUES ('110', 'chong', '2022-03-07 09:13:11');
INSERT INTO `logindate` VALUES ('111', 'chong', '2022-03-07 09:15:31');
INSERT INTO `logindate` VALUES ('112', 'chong', '2022-03-07 09:20:32');
INSERT INTO `logindate` VALUES ('113', 'chong', '2022-03-07 09:25:39');
INSERT INTO `logindate` VALUES ('114', 'chong', '2022-03-07 09:45:34');
INSERT INTO `logindate` VALUES ('115', 'chong', '2022-03-07 09:46:37');
INSERT INTO `logindate` VALUES ('116', 'chong', '2022-03-07 14:40:07');
INSERT INTO `logindate` VALUES ('117', 'chong', '2022-03-07 14:58:03');
INSERT INTO `logindate` VALUES ('118', 'chong', '2022-03-07 15:01:12');
INSERT INTO `logindate` VALUES ('119', 'chong', '2022-03-07 15:20:17');
INSERT INTO `logindate` VALUES ('120', 'chong', '2022-03-09 10:03:59');
INSERT INTO `logindate` VALUES ('121', 'chong', '2022-03-09 10:12:43');
INSERT INTO `logindate` VALUES ('122', 'chong', '2022-03-09 10:22:28');
INSERT INTO `logindate` VALUES ('123', 'chong', '2022-03-09 10:25:31');
INSERT INTO `logindate` VALUES ('124', 'chong', '2022-03-20 11:13:58');
INSERT INTO `logindate` VALUES ('125', 'chong', '2022-03-20 11:15:56');
INSERT INTO `logindate` VALUES ('126', 'chong', '2022-03-20 11:22:47');
INSERT INTO `logindate` VALUES ('127', 'chong', '2022-03-20 11:24:49');
INSERT INTO `logindate` VALUES ('128', 'chong', '2022-03-20 11:29:07');
INSERT INTO `logindate` VALUES ('129', 'chong', '2022-03-21 10:20:55');
INSERT INTO `logindate` VALUES ('130', 'chong', '2022-03-21 10:23:29');
INSERT INTO `logindate` VALUES ('131', 'chong', '2022-03-21 10:38:04');
INSERT INTO `logindate` VALUES ('132', 'chong', '2022-03-21 10:39:10');
INSERT INTO `logindate` VALUES ('133', 'chong', '2022-03-21 10:47:30');
INSERT INTO `logindate` VALUES ('134', 'chong', '2022-03-21 11:04:50');
INSERT INTO `logindate` VALUES ('135', 'chong', '2022-03-21 11:08:24');
INSERT INTO `logindate` VALUES ('136', 'chong', '2022-03-21 11:11:57');
INSERT INTO `logindate` VALUES ('137', 'chong', '2022-03-21 11:13:20');
INSERT INTO `logindate` VALUES ('138', 'chong', '2022-03-21 11:15:09');
INSERT INTO `logindate` VALUES ('139', 'chong', '2022-03-21 11:19:27');
INSERT INTO `logindate` VALUES ('140', 'chong', '2022-03-21 11:22:44');
INSERT INTO `logindate` VALUES ('141', 'chong', '2022-03-21 11:23:51');
INSERT INTO `logindate` VALUES ('142', 'chong', '2022-03-22 14:49:01');
INSERT INTO `logindate` VALUES ('143', 'chong', '2022-03-22 14:53:51');
INSERT INTO `logindate` VALUES ('144', 'chong', '2022-03-22 15:09:31');
INSERT INTO `logindate` VALUES ('145', 'chong', '2022-03-22 15:11:10');
INSERT INTO `logindate` VALUES ('146', 'chong', '2022-03-22 15:13:00');
INSERT INTO `logindate` VALUES ('147', 'chong', '2022-03-22 15:15:12');
INSERT INTO `logindate` VALUES ('148', 'chong', '2022-03-22 16:09:17');
INSERT INTO `logindate` VALUES ('149', 'chong', '2022-03-22 16:12:21');
INSERT INTO `logindate` VALUES ('150', 'chong', '2022-03-22 16:17:31');
INSERT INTO `logindate` VALUES ('151', 'chong', '2022-03-22 16:19:08');
INSERT INTO `logindate` VALUES ('152', 'chong', '2022-03-22 16:20:19');
INSERT INTO `logindate` VALUES ('153', 'chong', '2022-03-22 17:16:01');
INSERT INTO `logindate` VALUES ('154', 'chong', '2022-03-22 17:28:35');
INSERT INTO `logindate` VALUES ('155', 'chong', '2022-03-22 17:46:23');
INSERT INTO `logindate` VALUES ('156', 'chong', '2022-03-22 17:48:51');
INSERT INTO `logindate` VALUES ('157', 'chong', '2022-03-22 17:50:13');
INSERT INTO `logindate` VALUES ('158', 'chong', '2022-03-22 17:58:02');
INSERT INTO `logindate` VALUES ('159', 'chong', '2022-03-25 08:09:45');
INSERT INTO `logindate` VALUES ('160', 'chong', '2022-03-25 08:13:38');
INSERT INTO `logindate` VALUES ('161', 'chong', '2022-03-25 08:15:30');
INSERT INTO `logindate` VALUES ('162', 'chong', '2022-03-25 08:27:11');
INSERT INTO `logindate` VALUES ('163', 'chong', '2022-03-25 14:33:48');
INSERT INTO `logindate` VALUES ('164', 'chong', '2022-03-25 14:45:16');
INSERT INTO `logindate` VALUES ('165', 'chong', '2022-03-25 14:50:17');
INSERT INTO `logindate` VALUES ('166', 'chong', '2022-03-25 15:01:17');
INSERT INTO `logindate` VALUES ('167', 'chong', '2022-03-25 15:07:01');
INSERT INTO `logindate` VALUES ('168', 'chong', '2022-03-26 14:55:41');
INSERT INTO `logindate` VALUES ('169', 'chong', '2022-03-26 14:56:26');
INSERT INTO `logindate` VALUES ('170', 'chong', '2022-03-26 15:32:32');
INSERT INTO `logindate` VALUES ('171', 'chong', '2022-03-28 15:03:26');
INSERT INTO `logindate` VALUES ('172', 'chong', '2022-03-28 16:09:50');
INSERT INTO `logindate` VALUES ('173', 'chong', '2022-03-28 16:11:06');
INSERT INTO `logindate` VALUES ('174', 'chong', '2022-03-28 16:17:21');
INSERT INTO `logindate` VALUES ('175', 'chong', '2022-03-28 16:19:33');
INSERT INTO `logindate` VALUES ('176', 'chong', '2022-03-28 16:19:52');
INSERT INTO `logindate` VALUES ('177', 'chong', '2022-03-28 16:23:22');
INSERT INTO `logindate` VALUES ('178', 'chong', '2022-03-28 16:26:47');
INSERT INTO `logindate` VALUES ('179', 'chong', '2022-03-28 16:28:50');
INSERT INTO `logindate` VALUES ('180', 'chong', '2022-03-28 16:28:57');
INSERT INTO `logindate` VALUES ('181', 'chong', '2022-04-01 08:41:09');
INSERT INTO `logindate` VALUES ('182', 'chong', '2022-04-01 08:45:26');
INSERT INTO `logindate` VALUES ('183', 'chong', '2022-04-01 09:29:01');
INSERT INTO `logindate` VALUES ('184', 'chong', '2022-04-02 13:24:04');
INSERT INTO `logindate` VALUES ('185', 'chong', '2022-04-02 13:33:09');
INSERT INTO `logindate` VALUES ('186', 'chong', '2022-04-02 13:38:16');
INSERT INTO `logindate` VALUES ('187', 'chong', '2022-04-02 13:55:49');
INSERT INTO `logindate` VALUES ('188', 'chong', '2022-04-02 13:58:44');
INSERT INTO `logindate` VALUES ('189', 'chong', '2022-04-02 14:02:09');
INSERT INTO `logindate` VALUES ('190', 'chong', '2022-04-02 14:04:41');
INSERT INTO `logindate` VALUES ('191', 'chong', '2022-04-02 14:06:44');
INSERT INTO `logindate` VALUES ('192', 'chong', '2022-04-02 14:10:59');
INSERT INTO `logindate` VALUES ('193', 'chong', '2022-04-02 14:13:59');
INSERT INTO `logindate` VALUES ('194', 'chong', '2022-04-02 14:14:49');
INSERT INTO `logindate` VALUES ('195', 'chong', '2022-04-02 14:22:37');
INSERT INTO `logindate` VALUES ('196', 'chong', '2022-04-02 14:23:08');
INSERT INTO `logindate` VALUES ('197', 'chong', '2022-04-02 14:24:10');
INSERT INTO `logindate` VALUES ('198', 'chong', '2022-04-02 14:26:25');
INSERT INTO `logindate` VALUES ('199', 'chong', '2022-04-02 14:39:43');
INSERT INTO `logindate` VALUES ('200', 'chong', '2022-04-02 14:39:58');
INSERT INTO `logindate` VALUES ('201', 'chong', '2022-04-02 14:43:44');
INSERT INTO `logindate` VALUES ('202', 'chong', '2022-04-02 14:56:53');
INSERT INTO `logindate` VALUES ('203', 'chong', '2022-04-02 14:59:26');
INSERT INTO `logindate` VALUES ('204', 'chong', '2022-04-02 14:59:53');
INSERT INTO `logindate` VALUES ('205', 'chong', '2022-04-03 13:38:30');
INSERT INTO `logindate` VALUES ('206', 'chong', '2022-04-03 13:39:52');
INSERT INTO `logindate` VALUES ('207', 'chong', '2022-04-03 14:11:47');
INSERT INTO `logindate` VALUES ('208', 'chong', '2022-04-03 16:27:50');
INSERT INTO `logindate` VALUES ('209', 'chong', '2022-04-03 16:29:35');
INSERT INTO `logindate` VALUES ('210', 'chong', '2022-04-03 16:31:24');
INSERT INTO `logindate` VALUES ('211', 'chong', '2022-04-06 13:42:22');
INSERT INTO `logindate` VALUES ('212', 'chong', '2022-04-08 10:04:30');
INSERT INTO `logindate` VALUES ('213', 'chong', '2022-04-08 10:07:17');
INSERT INTO `logindate` VALUES ('214', 'chong', '2022-04-08 10:26:39');
INSERT INTO `logindate` VALUES ('215', 'chong', '2022-04-08 10:26:43');
INSERT INTO `logindate` VALUES ('216', 'chong', '2022-04-08 10:29:26');
INSERT INTO `logindate` VALUES ('217', 'chong', '2022-04-08 10:29:28');
INSERT INTO `logindate` VALUES ('218', 'chong', '2022-04-08 10:29:33');
INSERT INTO `logindate` VALUES ('219', 'chong', '2022-04-12 08:54:30');
INSERT INTO `logindate` VALUES ('220', 'chong', '2022-04-12 09:01:40');
INSERT INTO `logindate` VALUES ('221', 'chong', '2022-04-12 09:04:03');
INSERT INTO `logindate` VALUES ('222', 'chong', '2022-04-12 09:16:05');
INSERT INTO `logindate` VALUES ('223', 'chong', '2022-04-12 09:47:29');
INSERT INTO `logindate` VALUES ('224', 'chong', '2022-04-12 09:52:15');
INSERT INTO `logindate` VALUES ('225', 'chong', '2022-04-12 11:16:59');
INSERT INTO `logindate` VALUES ('226', 'chong', '2022-04-12 11:17:12');
INSERT INTO `logindate` VALUES ('227', 'chong', '2022-04-21 09:14:56');
INSERT INTO `logindate` VALUES ('228', 'chong', '2022-04-21 09:44:30');
INSERT INTO `logindate` VALUES ('229', 'chong', '2022-04-21 09:44:36');
INSERT INTO `logindate` VALUES ('230', 'chong', '2022-04-21 10:20:32');
INSERT INTO `logindate` VALUES ('231', 'chong', '2022-04-21 10:24:32');

-- ----------------------------
-- Table structure for lostandfound
-- ----------------------------
DROP TABLE IF EXISTS `lostandfound`;
CREATE TABLE `lostandfound` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '发布姓名',
  `context` varchar(255) DEFAULT NULL COMMENT '发布内容',
  `releaseDate` datetime DEFAULT NULL COMMENT '发布时间',
  `phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of lostandfound
-- ----------------------------
INSERT INTO `lostandfound` VALUES ('1', 'chong', 'dasdadwdadwadawdaw', '2022-03-20 10:55:42', '123456789');
INSERT INTO `lostandfound` VALUES ('2', 'chong', '大使馆的哈苏丹哈桑的用户', '2022-03-20 10:56:01', '123456789');
INSERT INTO `lostandfound` VALUES ('5', '派蒙', '进不去，怎么想都进不去吧', '2022-03-22 18:07:07', '18331500392');

-- ----------------------------
-- Table structure for repair
-- ----------------------------
DROP TABLE IF EXISTS `repair`;
CREATE TABLE `repair` (
  `repairId` int(11) NOT NULL AUTO_INCREMENT COMMENT '维修id',
  `reportPerson` varchar(255) DEFAULT NULL COMMENT '上报人',
  `reportDate` datetime DEFAULT NULL COMMENT '维修上报日期',
  `repairContext` varchar(255) DEFAULT NULL COMMENT '维修内容(最大255个文字描述)',
  `finishDate` datetime DEFAULT NULL COMMENT '维修完成日期',
  PRIMARY KEY (`repairId`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of repair
-- ----------------------------
INSERT INTO `repair` VALUES ('1', 'chong', '2022-03-02 14:32:04', '一二三四', '2022-03-04 16:16:58');
INSERT INTO `repair` VALUES ('2', 'chong', '2022-03-02 14:32:04', '五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八', '2022-03-02 18:08:37');
INSERT INTO `repair` VALUES ('3', 'chong', '2022-03-02 14:32:04', '九十十一十二', '2022-03-04 16:34:57');
INSERT INTO `repair` VALUES ('4', 'chong', '2022-03-02 15:54:50', '覅i不能胜任你说如果', '2022-03-04 16:29:35');
INSERT INTO `repair` VALUES ('5', 'chong', '2022-03-02 14:32:04', '一二三四', '2022-03-02 15:08:37');
INSERT INTO `repair` VALUES ('6', 'chong', '2022-03-02 14:32:04', '五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八', '2022-03-02 18:08:37');
INSERT INTO `repair` VALUES ('7', 'chong', '2022-03-02 14:32:04', '九十十一十二', '2022-03-03 15:08:37');
INSERT INTO `repair` VALUES ('8', 'chong', '2022-03-02 15:54:50', '覅i不能胜任你说如果', '2022-03-02 16:04:26');
INSERT INTO `repair` VALUES ('9', 'chong', '2022-03-02 14:32:04', '一二三四', '2022-03-04 16:16:56');
INSERT INTO `repair` VALUES ('10', 'chong', '2022-03-02 14:32:04', '五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八五六七八', '2022-03-02 18:08:37');
INSERT INTO `repair` VALUES ('11', 'chong', '2022-03-02 14:32:04', '九十十一十二', '2022-03-03 15:08:37');
INSERT INTO `repair` VALUES ('12', 'chong', '2022-03-02 15:54:50', '覅i不能胜任你说如果', '2022-03-02 16:04:26');
INSERT INTO `repair` VALUES ('14', 'chong', '2022-03-05 10:07:58', '暖气不热', '2022-03-05 10:08:11');
INSERT INTO `repair` VALUES ('15', 'chong', '2022-03-06 12:15:05', '网线损坏', '2022-03-06 12:15:09');
INSERT INTO `repair` VALUES ('17', 'chong', '2022-03-22 15:21:33', 'sda', '2022-03-25 08:13:15');
INSERT INTO `repair` VALUES ('18', 'chong', '2022-03-25 08:15:20', '网线损坏', '2022-03-25 08:15:47');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userId` int(64) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `resqitdate` datetime DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL COMMENT '院系班级',
  `hostelNum` varchar(255) DEFAULT NULL COMMENT '宿舍号',
  `frozen` int(11) DEFAULT '0' COMMENT '用来判断账号是否封禁，为0时正常，为1时表示被冻结。该账号异常，无法登录',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('8', 'chong', 'e10adc3949ba59abbe56e057f20f883e', '2022-03-01 15:03:59', 'http://localhost:8081/upload/4be5dba8 330e 4c7b 9039 637859b8c4b1qq_pic_merged_1648881309557.jpg', '计科19403', '四海楼607左', '0');
INSERT INTO `users` VALUES ('9', 'wang', 'e10adc3949ba59abbe56e057f20f883e', '2022-03-02 10:23:46', null, '计算机应用技术1803', '4223', '0');
