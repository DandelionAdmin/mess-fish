SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for website_detail
-- ----------------------------
DROP TABLE IF EXISTS `website_detail`;
CREATE TABLE `website_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type` bigint(20) NOT NULL COMMENT '网站类型',
  `icon` varchar(50) DEFAULT NULL COMMENT '网站图标',
  `name` varchar(100) DEFAULT NULL COMMENT '网站名字',
  `url` varchar(200) DEFAULT NULL COMMENT '网站链接',
  `hash` varchar(100) DEFAULT NULL COMMENT '网站链接的hash值',
  `status` int(1) DEFAULT NULL COMMENT '网站状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of website_detail
-- ----------------------------
INSERT INTO `website_detail` VALUES (1, 1, 'icon-baidu', '百度', 'https://www.baidu.com/', 'e81c1f5749545c5f7d247b3a100ffe62', NULL);
INSERT INTO `website_detail` VALUES (2, 1, 'icon-google', '谷歌', 'https://www.google.com/', 'd75277cdffef995a46ae59bdaef1db86', NULL);
INSERT INTO `website_detail` VALUES (3, 1, 'icon-gitHub', 'GitHub', 'https://github.com', '3097fca9b1ec8942c4305e550ef1b50a', NULL);
INSERT INTO `website_detail` VALUES (4, 1, 'icon-weixin', '微信', 'https://wx.qq.com/', '4418c7e8be69e2ad1a41353337ed22ab', NULL);
INSERT INTO `website_detail` VALUES (5, 1, 'icon-weibo', '微博', 'https://weibo.com/', '19b1e1822f836b48ad265d535871a4a2', NULL);
INSERT INTO `website_detail` VALUES (6, 1, 'icon-baidutieba', '贴吧', 'https://tieba.baidu.com/', '1e1eb00bc97358e093e46535ff95eb4b', NULL);
INSERT INTO `website_detail` VALUES (7, 1, 'icon-wangyi', '网易邮箱', 'https://mail.163.com/', 'a140b316f1266d8323f6d1e116dd28c8', NULL);
INSERT INTO `website_detail` VALUES (8, 1, 'icon-Gmail', 'Gmail', 'https://mail.google.com/', '804458cd9ca1d2c2720eb2b01f63939c', NULL);
INSERT INTO `website_detail` VALUES (9, 1, 'icon-outlook_x', 'Outlook', 'https://outlook.live.com/mail/', '784dfe6a1313265292d5208035506204', NULL);
INSERT INTO `website_detail` VALUES (10, 2, 'icon-youtube', 'YouTube', 'https://www.youtube.com/', 'dba51bcc527ba93f7fe03868747280d5', NULL);
INSERT INTO `website_detail` VALUES (11, 2, 'icon-bilibili', '哔哩哔哩', 'https://www.bilibili.com/', 'e0ed1515e1e7fde535fbd6a8f2e09cfb', NULL);
INSERT INTO `website_detail` VALUES (12, 2, 'icon-youku', '优酷', 'https://www.youku.com/', 'ef59cd4145c6d1d52b0eb2ab3a27adf0', NULL);
INSERT INTO `website_detail` VALUES (13, 2, 'icon-tengxunshipin', '腾讯视频', 'https://v.qq.com/', '937b0bea1cafd5216e87800f112ce2db', NULL);
INSERT INTO `website_detail` VALUES (14, 2, 'icon-aiqiyi', '爱奇艺', 'https://www.iqiyi.com/', '6743f8f2acc5f2fe826011fe757dab48', NULL);
INSERT INTO `website_detail` VALUES (15, 2, 'icon-huyazhibo', '虎牙直播', 'https://www.huya.com/', 'b8329fa44b1005c553d5d9ed5a554a31', NULL);
INSERT INTO `website_detail` VALUES (16, 2, 'icon-douyuTV', '斗鱼直播', 'https://www.douyu.com/', '3b2c634748268179c4ed7279602b6c41', NULL);
INSERT INTO `website_detail` VALUES (17, 2, 'icon-fangqiedianjing', '企鹅电竞', 'https://egame.qq.com/', '0a9b6ccca3f728a4dacc0beadf0084af', NULL);
INSERT INTO `website_detail` VALUES (18, 2, 'icon-zimu', '人人影视', 'http://www.zmz2019.com/', 'b1a919752b45d6ef08a8f89179c60aa4', NULL);
INSERT INTO `website_detail` VALUES (19, 3, 'icon-biji', '看云', 'https://www.kancloud.cn/', '8ba1a85ec5e76414df11bb860464f70c', NULL);
INSERT INTO `website_detail` VALUES (20, 3, 'icon-yuquemianlogo', '语雀', 'https://www.yuque.com/', 'c699c9f09492f8915760e45008a69938', NULL);
INSERT INTO `website_detail` VALUES (21, 3, 'icon-tianjiagongshi', 'LaTeX', 'https://www.latexstudio.net/', 'fe3845d78518b6c81e97a4f111c31bfb', NULL);
INSERT INTO `website_detail` VALUES (22, 3, 'icon-xiezuo', 'Overleaf', 'https://cn.overleaf.com/', '80a5799c653ebbe60f49af0abcf00859', NULL);
INSERT INTO `website_detail` VALUES (23, 3, 'icon-alixingqiu', '阿里图标', 'https://www.iconfont.cn/', '14b9e6faed15376ced2bf66eed9a10f2', NULL);
INSERT INTO `website_detail` VALUES (24, 3, 'icon-huabanwang', '花瓣', 'https://huaban.com/', 'd37f8c694f06b4820461404b459827eb', NULL);
INSERT INTO `website_detail` VALUES (25, 4, 'icon-baiduwangpan', '百度网盘', 'https://pan.baidu.com/', '18ddf2ba0092217b59726b053d7a4155', NULL);
INSERT INTO `website_detail` VALUES (26, 4, 'icon-jianguo', '坚果云', 'https://www.jianguoyun.com/', '4f77a8827f613016dbc9158c40c64b1f', NULL);
INSERT INTO `website_detail` VALUES (27, 4, 'icon-yuncunchu', '蓝奏云', 'https://up.woozooo.com/u', '06e88b506b49406627ef759a0c778017', NULL);
INSERT INTO `website_detail` VALUES (28, 4, 'icon--nainiu', '奶牛快传', 'https://cowtransfer.com/', '1c312a06189b9c1ee633e84391400f0e', NULL);
INSERT INTO `website_detail` VALUES (29, 4, 'icon-huohuliulanqifirefox', 'Ff Send', 'https://send.firefox.com/', '1989ca52719370c9dd8298cea007e0dd', NULL);
INSERT INTO `website_detail` VALUES (30, 4, 'icon-google', '谷歌翻译', 'https://translate.google.cn/', '1860b50738be1c29ddeb59d9e62696e0', NULL);
INSERT INTO `website_detail` VALUES (31, 4, 'icon-idrex', 'Toolbox', 'https://lolicon.dev/', 'db80ac7fe9e850b0c853a48efe5be1de', NULL);
INSERT INTO `website_detail` VALUES (32, 4, 'icon-gongju', 'MikuTools', 'https://tools.miku.ac/', '9c1218bb30540d4e75c0f2a825c4a365', NULL);
INSERT INTO `website_detail` VALUES (33, 4, 'icon-apk', 'APK下载', 'https://apkdl.in/', '3094cb6970b1b44cfdc35096f7dacc9a', NULL);
INSERT INTO `website_detail` VALUES (34, 4, 'icon-ico_yunyingguanli_yuangongxinxichaxun', '站长工具', 'http://tool.chinaz.com/', 'a89bc04cc2db79dfd39394d4325b468d', NULL);
INSERT INTO `website_detail` VALUES (35, 4, 'icon--xiongmao', 'TinyPNG', 'https://tinify.cn/', '099afd148fe3fa67bce2aee47cc86fbc', NULL);
INSERT INTO `website_detail` VALUES (36, 5, 'icon-aliyun', '阿里云', 'https://www.aliyun.com/', '3b59c53b2d39ebb0b6a7214bab8ccc97', NULL);
INSERT INTO `website_detail` VALUES (37, 5, 'icon-tengxunyun', '腾讯云', 'https://cloud.tencent.com/', '38e3cd09145635408d10860bb33ffa92', NULL);
INSERT INTO `website_detail` VALUES (38, 5, 'icon-qiniuyun', '七牛云', 'https://www.qiniu.com/', 'e9578a2b92c655bdd128b8196995e77f', NULL);
INSERT INTO `website_detail` VALUES (39, 5, 'icon-cloudflare', 'Cloudflare', 'https://www.cloudflare.com/', 'd678df251a098ddc964aef3c14805166', NULL);
INSERT INTO `website_detail` VALUES (40, 5, 'icon-wc', 'W3school', 'https://www.w3school.com.cn/', '9584e026283a12e48055b64d8fd3136d', NULL);
INSERT INTO `website_detail` VALUES (41, 5, 'icon-weiruan', 'MSDN', 'https://msdn.itellyou.cn/', '0198978e4926064f8db32f3a717e0b2f', NULL);
INSERT INTO `website_detail` VALUES (42, 5, 'icon-renren', '人人客', 'https://rrkee.com/', 'c5db380c7d55bda87169074a1bc77a83', NULL);
INSERT INTO `website_detail` VALUES (43, 5, 'icon-file_type_vscode', 'VSCode', 'https://code.visualstudio.com/', '791fdf3680bfeb494a1f95e29f6ec777', NULL);
INSERT INTO `website_detail` VALUES (44, 5, 'icon-jetbrains', 'JetBrains', 'https://www.jetbrains.com/', '6f66c1e3ad7135b689267b5f2131f8ce', NULL);
INSERT INTO `website_detail` VALUES (45, 6, 'icon-juejin', '掘金', 'https://juejin.im/', '3089a17ff90fa92539567475eccae4dd', NULL);
INSERT INTO `website_detail` VALUES (46, 6, 'icon-iconsf-copy', 'SF思否', 'https://segmentfault.com/', '974c1e73aab25c5e5d896f571fcade35', NULL);
INSERT INTO `website_detail` VALUES (47, 6, 'icon-wuaipojie', '吾爱破解', 'https://www.52pojie.cn/', '90b4b96fa389a58e3c0c27627d04f21b', NULL);
INSERT INTO `website_detail` VALUES (48, 6, 'icon-SKY', 'IT天空', 'https://www.itsk.com/', '8d361ca7e0e3a3b0aca4320406921a33', NULL);
INSERT INTO `website_detail` VALUES (49, 6, 'icon-tulingyunlogo', '图灵社区', 'https://www.ituring.com.cn/', 'd543de36b9a9eb61a92987cbaaec5322', NULL);
INSERT INTO `website_detail` VALUES (50, 6, 'icon-LeetCode', '力扣', 'https://leetcode-cn.com/', '3bb8687ef1b300c92a74e0c9e9a12d30', NULL);


-- ----------------------------
-- Table structure for website_search
-- ----------------------------
DROP TABLE IF EXISTS `website_search`;
CREATE TABLE `website_search` (
  `id` bigint(22) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) DEFAULT NULL COMMENT '引擎名字',
  `url` varchar(100) DEFAULT NULL COMMENT '搜索链接',
  `icon` varchar(50) DEFAULT NULL COMMENT '引擎图标',
  `status` int(1) DEFAULT NULL COMMENT '引擎状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COMMENT='网站搜索';

-- ----------------------------
-- Records of website_search
-- ----------------------------

INSERT INTO `website_search` VALUES (1, '百度', 'https://www.baidu.com/s?wd=', 'icon-baidu', 1);
INSERT INTO `website_search` VALUES (2, '谷歌', 'https://www.google.com/search?q=', 'icon-google', 1);
INSERT INTO `website_search` VALUES (3, '必应', 'https://cn.bing.com/search?q=', 'icon-biying1', 1);
INSERT INTO `website_search` VALUES (4, 'GitHub', 'https://github.com/search?utf8=✓&q=', 'icon-gitHub', 0);
INSERT INTO `website_search` VALUES (5, '360', 'https://www.so.com/s?q=', 'icon-360sousuo', 1);
INSERT INTO `website_search` VALUES (6, '搜狗', 'https://www.sogou.com/web?query=', 'icon-sougousousuo', 0);
INSERT INTO `website_search` VALUES (7, '多吉', 'https://www.dogedoge.com/results?q=', 'icon-gou', 0);
INSERT INTO `website_search` VALUES (8, '淘宝', 'https://s.taobao.com/search?q=', 'icon-TB', 0);
INSERT INTO `website_search` VALUES (9, '京东', 'http://search.jd.com/Search?keyword=', 'icon-jingdong1', 0);
INSERT INTO `website_search` VALUES (10, '天猫', 'https://list.tmall.com/search_product.htm?q=', 'icon-tianmao1', 1);
INSERT INTO `website_search` VALUES (11, '知乎', 'https://www.zhihu.com/search?type=content&q=', 'icon-zhihu', 0);
INSERT INTO `website_search` VALUES (12, '微博', 'https://s.weibo.com/weibo/', 'icon-weibo', 0);
INSERT INTO `website_search` VALUES (13, 'B站', 'http://search.bilibili.com/all?keyword=', 'icon-bzhanicon', 0);
INSERT INTO `website_search` VALUES (14, '豆瓣', 'https://www.douban.com/search?source=suggest&q=', 'icon-douban', 0);
INSERT INTO `website_search` VALUES (15, '优酷', 'https://so.youku.com/search_video/q_', 'icon-youku', 0);


-- ----------------------------
-- Table structure for website_type
-- ----------------------------
DROP TABLE IF EXISTS `website_type`;
CREATE TABLE `website_type` (
    `id` bigint(22) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `icon` varchar(100) DEFAULT NULL COMMENT '类型图标',
    `name` varchar(100) DEFAULT NULL COMMENT '类型名字',
    `status` int(1) DEFAULT NULL COMMENT '类型状态',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COMMENT='网站类型';

-- ----------------------------
-- Records of website_type
-- ----------------------------

INSERT INTO `website_type` VALUES (1, 'icon-sousuo1', '常用/搜索', NULL);
INSERT INTO `website_type` VALUES (2, 'icon-shipin1', '视频/直播', NULL);
INSERT INTO `website_type` VALUES (3, 'icon-bangong', '办公/设计', NULL);
INSERT INTO `website_type` VALUES (4, 'icon-caozuojiemiantubiao---_gongju', '存储/工具', NULL);
INSERT INTO `website_type` VALUES (5, 'icon-_qianduankaifa', '开发/云', NULL);
INSERT INTO `website_type` VALUES (6, 'icon-_shequluntan', '论坛/学习', NULL);

-- ----------------------------
-- Table structure for website_user
-- ----------------------------
DROP TABLE IF EXISTS `website_user`;
CREATE TABLE `website_user` (
                                `id`       bigint(22) NOT NULL AUTO_INCREMENT COMMENT 'id',
                                `nickname` varchar(50) NOT NULL DEFAULT '' COMMENT '昵称',
                                `password` varchar(50) NOT NULL DEFAULT '' COMMENT '密码',
                                `email`    varchar(50) NOT NULL DEFAULT '' COMMENT '电子邮箱',
                                `sex`      int(11)              DEFAULT NULL COMMENT '性别',
                                `age`      int(11)              DEFAULT NULL COMMENT '年龄',
                                `role`     int(11) NOT NULL     DEFAULT -1 COMMENT '角色',
                                `phone`    varchar(15)          DEFAULT NULL COMMENT '手机号',
                                `avatar`   varchar(255)         DEFAULT NULL COMMENT '头像',
                                PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 7
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户表';

-- ----------------------------
-- Records of website_user
-- ----------------------------
INSERT INTO `website_user`
VALUES (1, 'gclm', '123456', '15836175088@163.com', 0, 18, 0, '17336175088',
        'https://image.coderlab.cn/preview/1340673479191199746');
INSERT INTO `website_user`
VALUES (2, '王小聪', '123456', '15836177851@qq.com', 0, 21, 1, '15836173381',
        'https://image.coderlab.cn/preview/1340673479191199746');
INSERT INTO `website_user`
VALUES (3, 'gclm', '123456', '17336175088@qq.com', 0, 1212112, 1, '17336175089',
        'https://image.coderlab.cn/preview/1340673479191199746');
INSERT INTO `website_user`
VALUES (5, 'gclmit', '123456', '17336175089@163.com', 1, 11, 1, '17326039789',
        'https://image.coderlab.cn/preview/1340673166610694146');
INSERT INTO `website_user`
VALUES (6, 'sss', '123456', '17336175012@163.com', 1, 11, 1, '15836173481',
        'https://image.coderlab.cn/preview/1340673166610694146');


SET FOREIGN_KEY_CHECKS = 1;
