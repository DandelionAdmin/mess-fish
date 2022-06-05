/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : navigation

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 21/12/2020 18:34:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for flyway_schema_history
-- ----------------------------
DROP TABLE IF EXISTS `flyway_schema_history`;
CREATE TABLE `flyway_schema_history`  (
  `installed_rank` int NOT NULL,
  `version` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `description` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `script` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `checksum` int NULL DEFAULT NULL,
  `installed_by` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `installed_on` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `execution_time` int NOT NULL,
  `success` tinyint(1) NOT NULL,
  PRIMARY KEY (`installed_rank`) USING BTREE,
  INDEX `flyway_schema_history_s_idx`(`success`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4;

-- ----------------------------
-- Records of flyway_schema_history
-- ----------------------------
INSERT INTO `flyway_schema_history` VALUES (1, '1.0', 'navigation', 'SQL', 'V1_0__navigation.sql', 29036498, 'root', '2020-12-21 12:27:02', 1050, 1);
INSERT INTO `flyway_schema_history` VALUES (2, '1.1', 'navigation', 'SQL', 'V1_1__navigation.sql', -1645223489, 'root', '2020-12-21 17:09:27', 270, 1);

-- ----------------------------
-- Table structure for website_detail
-- ----------------------------
DROP TABLE IF EXISTS `website_detail`;
CREATE TABLE `website_detail`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type_id` bigint NOT NULL COMMENT '网站类型Id',
  `type_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '网站类型名字',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '网站名字',
  `url` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '网站链接',
  `hash` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '网站链接的hash值',
  `status` int NULL DEFAULT NULL COMMENT '网站状态',
  `icon` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '网站图标',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 62 CHARACTER SET = utf8mb4;

-- ----------------------------
-- Records of website_detail
-- ----------------------------
INSERT INTO `website_detail` VALUES (1, 1, '常用/搜索', '百度', 'https://www.baidu.com/', 'e81c1f5749545c5f7d247b3a100ffe62', 0, 'icon-baidu');
INSERT INTO `website_detail` VALUES (2, 1, '常用/搜索', '谷歌', 'https://www.google.com/', 'd75277cdffef995a46ae59bdaef1db86', 0, 'icon-google');
INSERT INTO `website_detail` VALUES (3, 1, '常用/搜索', 'GitHub', 'https://github.com', '3097fca9b1ec8942c4305e550ef1b50a', 0, 'icon-gitHub');
INSERT INTO `website_detail` VALUES (4, 1, '常用/搜索', '微信', 'https://wx.qq.com/', '4418c7e8be69e2ad1a41353337ed22ab', 0, 'icon-weixin');
INSERT INTO `website_detail` VALUES (5, 1, '常用/搜索', '微博', 'https://weibo.com/', '19b1e1822f836b48ad265d535871a4a2', 0, 'icon-weibo');
INSERT INTO `website_detail` VALUES (6, 1, '常用/搜索', '贴吧', 'https://tieba.baidu.com/', '1e1eb00bc97358e093e46535ff95eb4b', 0, 'icon-baidutieba');
INSERT INTO `website_detail` VALUES (7, 1, '常用/搜索', '网易邮箱', 'https://mail.163.com/', 'a140b316f1266d8323f6d1e116dd28c8', 0, 'icon-wangyi');
INSERT INTO `website_detail` VALUES (8, 1, '常用/搜索', 'Gmail', 'https://mail.google.com/', '804458cd9ca1d2c2720eb2b01f63939c', 0, 'icon-Gmail');
INSERT INTO `website_detail` VALUES (9, 1, '常用/搜索', 'Outlook', 'https://outlook.live.com/mail/', '784dfe6a1313265292d5208035506204', 0, 'icon-outlook_x');
INSERT INTO `website_detail` VALUES (10, 2, '视频/直播', 'YouTube', 'https://www.youtube.com/', 'dba51bcc527ba93f7fe03868747280d5', 0, 'icon-youtube');
INSERT INTO `website_detail` VALUES (11, 2, '视频/直播', '哔哩哔哩', 'https://www.bilibili.com/', 'e0ed1515e1e7fde535fbd6a8f2e09cfb', 0, 'icon-bilibili');
INSERT INTO `website_detail` VALUES (12, 2, '视频/直播', '优酷', 'https://www.youku.com/', 'ef59cd4145c6d1d52b0eb2ab3a27adf0', 0, 'icon-youku');
INSERT INTO `website_detail` VALUES (13, 2, '视频/直播', '腾讯视频', 'https://v.qq.com/', '937b0bea1cafd5216e87800f112ce2db', 0, 'icon-tengxunshipin');
INSERT INTO `website_detail` VALUES (14, 2, '视频/直播', '爱奇艺', 'https://www.iqiyi.com/', '6743f8f2acc5f2fe826011fe757dab48', 0, 'icon-aiqiyi');
INSERT INTO `website_detail` VALUES (15, 2, '视频/直播', '虎牙直播', 'https://www.huya.com/', 'b8329fa44b1005c553d5d9ed5a554a31', 0, 'icon-huyazhibo');
INSERT INTO `website_detail` VALUES (16, 2, '视频/直播', '斗鱼直播', 'https://www.douyu.com/', '3b2c634748268179c4ed7279602b6c41', 0, 'icon-douyuTV');
INSERT INTO `website_detail` VALUES (17, 2, '视频/直播', '企鹅电竞', 'https://egame.qq.com/', '0a9b6ccca3f728a4dacc0beadf0084af', 0, 'icon-fangqiedianjing');
INSERT INTO `website_detail` VALUES (18, 2, '视频/直播', '人人影视', 'http://www.zmz2019.com/', 'b1a919752b45d6ef08a8f89179c60aa4', 0, 'icon-zimu');
INSERT INTO `website_detail` VALUES (19, 3, '办公/设计', '看云', 'https://www.kancloud.cn/', '8ba1a85ec5e76414df11bb860464f70c', 0, 'icon-biji');
INSERT INTO `website_detail` VALUES (20, 3, '办公/设计', '语雀', 'https://www.yuque.com/', 'c699c9f09492f8915760e45008a69938', 0, 'icon-yuquemianlogo');
INSERT INTO `website_detail` VALUES (21, 3, '办公/设计', 'LaTeX', 'https://www.latexstudio.net/', 'fe3845d78518b6c81e97a4f111c31bfb', 0, 'icon-tianjiagongshi');
INSERT INTO `website_detail` VALUES (22, 3, '办公/设计', 'Overleaf', 'https://cn.overleaf.com/', '80a5799c653ebbe60f49af0abcf00859', 0, 'icon-xiezuo');
INSERT INTO `website_detail` VALUES (23, 3, '办公/设计', '阿里图标', 'https://www.iconfont.cn/', '14b9e6faed15376ced2bf66eed9a10f2', 0, 'icon-alixingqiu');
INSERT INTO `website_detail` VALUES (24, 3, '办公/设计', '花瓣', 'https://huaban.com/', 'd37f8c694f06b4820461404b459827eb', 0, 'icon-huabanwang');
INSERT INTO `website_detail` VALUES (25, 4, '存储/工具', '百度网盘', 'https://pan.baidu.com/', '18ddf2ba0092217b59726b053d7a4155', 0, 'icon-baiduwangpan');
INSERT INTO `website_detail` VALUES (26, 4, '存储/工具', '坚果云', 'https://www.jianguoyun.com/', '4f77a8827f613016dbc9158c40c64b1f', 0, 'icon-jianguo');
INSERT INTO `website_detail` VALUES (27, 4, '存储/工具', '蓝奏云', 'https://up.woozooo.com/u', '06e88b506b49406627ef759a0c778017', 0, 'icon-yuncunchu');
INSERT INTO `website_detail` VALUES (28, 4, '存储/工具', '奶牛快传', 'https://cowtransfer.com/', '1c312a06189b9c1ee633e84391400f0e', 0, 'icon--nainiu');
INSERT INTO `website_detail` VALUES (29, 4, '存储/工具', 'Ff Send', 'https://send.firefox.com/', '1989ca52719370c9dd8298cea007e0dd', 0, 'icon-huohuliulanqifirefox');
INSERT INTO `website_detail` VALUES (30, 4, '存储/工具', '谷歌翻译', 'https://translate.google.cn/', '1860b50738be1c29ddeb59d9e62696e0', 0, 'icon-google');
INSERT INTO `website_detail` VALUES (31, 4, '存储/工具', 'Toolbox', 'https://lolicon.dev/', 'db80ac7fe9e850b0c853a48efe5be1de', 0, 'icon-idrex');
INSERT INTO `website_detail` VALUES (32, 4, '存储/工具', 'MikuTools', 'https://tools.miku.ac/', '9c1218bb30540d4e75c0f2a825c4a365', 0, 'icon-gongju');
INSERT INTO `website_detail` VALUES (33, 4, '存储/工具', 'APK下载', 'https://apkdl.in/', '3094cb6970b1b44cfdc35096f7dacc9a', 0, 'icon-apk');
INSERT INTO `website_detail` VALUES (34, 4, '存储/工具', '站长工具', 'http://tool.chinaz.com/', 'a89bc04cc2db79dfd39394d4325b468d', 0, 'icon-ico_yunyingguanli_yuangongxinxichaxun');
INSERT INTO `website_detail` VALUES (35, 4, '存储/工具', 'TinyPNG', 'https://tinify.cn/', '099afd148fe3fa67bce2aee47cc86fbc', 0, 'icon--xiongmao');
INSERT INTO `website_detail` VALUES (36, 5, '开发/云', '阿里云', 'https://www.aliyun.com/', '3b59c53b2d39ebb0b6a7214bab8ccc97', 0, 'icon-aliyun');
INSERT INTO `website_detail` VALUES (37, 5, '开发/云', '腾讯云', 'https://cloud.tencent.com/', '38e3cd09145635408d10860bb33ffa92', 0, 'icon-tengxunyun');
INSERT INTO `website_detail` VALUES (38, 5, '开发/云', '七牛云', 'https://www.qiniu.com/', 'e9578a2b92c655bdd128b8196995e77f', 0, 'icon-qiniuyun');
INSERT INTO `website_detail` VALUES (39, 5, '开发/云', 'Cloudflare', 'https://www.cloudflare.com/', 'd678df251a098ddc964aef3c14805166', 0, 'icon-cloudflare');
INSERT INTO `website_detail` VALUES (40, 5, '开发/云', 'W3school', 'https://www.w3school.com.cn/', '9584e026283a12e48055b64d8fd3136d', 0, 'icon-wc');
INSERT INTO `website_detail` VALUES (41, 5, '开发/云', 'MSDN', 'https://msdn.itellyou.cn/', '0198978e4926064f8db32f3a717e0b2f', 0, 'icon-weiruan');
INSERT INTO `website_detail` VALUES (42, 5, '开发/云', '人人客', 'https://rrkee.com/', 'c5db380c7d55bda87169074a1bc77a83', 0, 'icon-renren');
INSERT INTO `website_detail` VALUES (43, 5, '开发/云', 'VSCode', 'https://code.visualstudio.com/', '791fdf3680bfeb494a1f95e29f6ec777', 0, 'icon-file_type_vscode');
INSERT INTO `website_detail` VALUES (44, 5, '开发/云', 'JetBrains', 'https://www.jetbrains.com/', '6f66c1e3ad7135b689267b5f2131f8ce', 0, 'icon-jetbrains');
INSERT INTO `website_detail` VALUES (45, 6, '论坛/学习', '掘金', 'https://juejin.im/', '3089a17ff90fa92539567475eccae4dd', 0, 'icon-juejin');
INSERT INTO `website_detail` VALUES (46, 6, '论坛/学习', 'SF思否', 'https://segmentfault.com/', '974c1e73aab25c5e5d896f571fcade35', 0, 'icon-iconsf-copy');
INSERT INTO `website_detail` VALUES (47, 6, '论坛/学习', '吾爱破解', 'https://www.52pojie.cn/', '90b4b96fa389a58e3c0c27627d04f21b', 0, 'icon-wuaipojie');
INSERT INTO `website_detail` VALUES (48, 6, '论坛/学习', 'IT天空', 'https://www.itsk.com/', '8d361ca7e0e3a3b0aca4320406921a33', 0, 'icon-SKY');
INSERT INTO `website_detail` VALUES (49, 6, '论坛/学习', '图灵社区', 'https://www.ituring.com.cn/', 'd543de36b9a9eb61a92987cbaaec5322', 0, 'icon-tulingyunlogo');
INSERT INTO `website_detail` VALUES (50, 6, '论坛/学习', '力扣', 'https://leetcode-cn.com/', '3bb8687ef1b300c92a74e0c9e9a12d30', 0, 'icon-LeetCode');
INSERT INTO `website_detail` VALUES (51, 1, '常用/搜索', 'test-0', 'http://baidu0.com', '12430', 0, 'type-icon-0');
INSERT INTO `website_detail` VALUES (52, 1, '常用/搜索', 'test-1', 'http://baidu1.com', '12431', 0, 'type-icon-1');
INSERT INTO `website_detail` VALUES (53, 1, '常用/搜索', 'test-2', 'http://baidu2.com', '12432', 0, 'type-icon-2');
INSERT INTO `website_detail` VALUES (54, 1, '常用/搜索', 'test-3', 'http://baidu3.com', '12433', 0, 'type-icon-3');
INSERT INTO `website_detail` VALUES (55, 1, '常用/搜索', 'test-4', 'http://baidu4.com', '12434', 0, 'type-icon-4');
INSERT INTO `website_detail` VALUES (56, 1, '常用/搜索', 'test-5', 'http://baidu5.com', '12435', 0, 'type-icon-5');

-- ----------------------------
-- Table structure for website_search
-- ----------------------------
DROP TABLE IF EXISTS `website_search`;
CREATE TABLE `website_search`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '引擎名字',
  `url` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '搜索链接',
  `icon` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '引擎图标',
  `status` int NULL DEFAULT NULL COMMENT '引擎状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8mb4  COMMENT = '网站搜索';

-- ----------------------------
-- Records of website_search
-- ----------------------------
INSERT INTO `website_search` VALUES (1, '百度', 'https://www.baidu.com/s?wd=', 'icon-baidu', 0);
INSERT INTO `website_search` VALUES (2, '谷歌', 'https://www.google.com/search?q=', 'icon-google', 0);
INSERT INTO `website_search` VALUES (3, '必应', 'https://cn.bing.com/search?q=', 'icon-biying1', 0);
INSERT INTO `website_search` VALUES (4, 'GitHub', 'https://github.com/search?utf8=✓&q=', 'icon-gitHub', 0);
INSERT INTO `website_search` VALUES (5, '360', 'https://www.so.com/s?q=', 'icon-360sousuo', 0);
INSERT INTO `website_search` VALUES (6, '搜狗', 'https://www.sogou.com/web?query=', 'icon-sougousousuo', 0);
INSERT INTO `website_search` VALUES (7, '多吉', 'https://www.dogedoge.com/results?q=', 'icon-gou', 0);
INSERT INTO `website_search` VALUES (8, '淘宝', 'https://s.taobao.com/search?q=', 'icon-TB', 1);
INSERT INTO `website_search` VALUES (9, '京东', 'http://search.jd.com/Search?keyword=', 'icon-jingdong1', 1);
INSERT INTO `website_search` VALUES (10, '天猫', 'https://list.tmall.com/search_product.htm?q=', 'icon-tianmao1', 1);
INSERT INTO `website_search` VALUES (11, '知乎', 'https://www.zhihu.com/search?type=content&q=', 'icon-zhihu', 1);
INSERT INTO `website_search` VALUES (12, '微博', 'https://s.weibo.com/weibo/', 'icon-weibo', 1);
INSERT INTO `website_search` VALUES (13, 'B站', 'http://search.bilibili.com/all?keyword=', 'icon-bzhanicon', 1);

-- ----------------------------
-- Table structure for website_type
-- ----------------------------
DROP TABLE IF EXISTS `website_type`;
CREATE TABLE `website_type`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `icon` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '类型图标',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '类型名字',
  `status` int NULL DEFAULT NULL COMMENT '类型状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COMMENT = '网站类型';

-- ----------------------------
-- Records of website_type
-- ----------------------------
INSERT INTO `website_type` VALUES (1, 'icon-sousuo1', '常用/搜索', 1);
INSERT INTO `website_type` VALUES (2, 'icon-shipin1', '视频/直播', 0);
INSERT INTO `website_type` VALUES (3, 'icon-bangong', '办公/设计', 0);
INSERT INTO `website_type` VALUES (4, 'icon-caozuojiemiantubiao---_gongju', '存储/工具', 0);
INSERT INTO `website_type` VALUES (5, 'icon-_qianduankaifa', '开发/云', 0);
INSERT INTO `website_type` VALUES (6, 'icon-_shequluntan', '论坛/学习', 0);
INSERT INTO `website_type` VALUES (7, 'type-icon-0', 'test-0', 0);
INSERT INTO `website_type` VALUES (8, 'type-icon-1', 'test-1', 0);
INSERT INTO `website_type` VALUES (9, 'type-icon-2', 'test-2', 0);
INSERT INTO `website_type` VALUES (15, 'type-icon-8', 'test-8', 0);
INSERT INTO `website_type` VALUES (16, 'type-icon-9', 'test-9', 0);

-- ----------------------------
-- Table structure for website_user
-- ----------------------------
DROP TABLE IF EXISTS `website_user`;
CREATE TABLE `website_user`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `nickname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '昵称',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '密码',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '电子邮箱',
  `sex` int NULL DEFAULT NULL COMMENT '性别',
  `age` int NULL DEFAULT NULL COMMENT '年龄',
  `role` int NOT NULL DEFAULT -1 COMMENT '角色',
  `phone` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机号',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8mb4 COMMENT = '用户表';

-- ----------------------------
-- Records of website_user
-- ----------------------------
INSERT INTO `website_user` VALUES (1, 'gclm', '123456', '15836175088@163.com', 0, 18, 0, '17336175088', 'https://inskylab-img.cn-sh2.ufileos.com/image/20200523/713704767460737024.jpeg');
INSERT INTO `website_user` VALUES (2, '王小聪', '123456', '15836177851@qq.com', 0, 21, 1, '15836173381', 'https://inskylab-img.cn-sh2.ufileos.com/image/20200523/713702940338028544.jpg');
INSERT INTO `website_user` VALUES (3, 'gclm', '123456', '17336175088@qq.com', 0, 1212112, 1, '17336175089', 'https://image.coderlab.cn/preview/1340673479191199746');
INSERT INTO `website_user` VALUES (5, 'gclmit', '123456', '17336175089@163.com', 1, 11, 1, '17326039789', 'https://image.coderlab.cn/preview/1340673166610694146');
INSERT INTO `website_user` VALUES (6, 'sss', '123456', '17336175012@163.com', 1, 11, 1, '15836173481', 'https://image.coderlab.cn/preview/1340673166610694146');
INSERT INTO `website_user` VALUES (7, 'test0', '123456', '1719982670@qq.com', 0, 11, 1, '17326039510', 'https://image.coderlab.cn/preview/1340673166610694146');
INSERT INTO `website_user` VALUES (8, 'test1', '123456', '1719982671@qq.com', 0, 11, 1, '17326039511', 'https://image.coderlab.cn/preview/1340673166610694146');
INSERT INTO `website_user` VALUES (9, 'test2', '123456', '1719982672@qq.com', 0, 11, 1, '17326039512', 'https://image.coderlab.cn/preview/1340673166610694146');
INSERT INTO `website_user` VALUES (10, 'test3', '123456', '1719982673@qq.com', 0, 11, 1, '17326039513', 'https://image.coderlab.cn/preview/1340673166610694146');
INSERT INTO `website_user` VALUES (11, 'test4', '123456', '1719982674@qq.com', 0, 11, 1, '17326039514', 'https://image.coderlab.cn/preview/1340673166610694146');
INSERT INTO `website_user` VALUES (12, 'test5', '123456', '1719982675@qq.com', 0, 11, 1, '17326039515', 'https://image.coderlab.cn/preview/1340673166610694146');
INSERT INTO `website_user` VALUES (13, 'test6', '123456', '1719982676@qq.com', 0, 11, 1, '17326039516', 'https://image.coderlab.cn/preview/1340673166610694146');

