/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : project1

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 25/10/2023 23:17:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `cid` int NOT NULL,
  `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES (1, 'aa');
INSERT INTO `class` VALUES (2, 'qq');
INSERT INTO `class` VALUES (3, 'bb');
INSERT INTO `class` VALUES (4, 'dd');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `logo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `s_class` int NULL DEFAULT NULL,
  `Acj` int NULL DEFAULT NULL COMMENT 'A',
  `Bcj` int NULL DEFAULT NULL COMMENT 'B',
  `Ccj` int NULL DEFAULT NULL COMMENT 'C',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2004 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (3, '白翔宇', 'https://img0.baidu.com/it/u=2047776719,2765444767&fm=253&fmt=auto&app=138&f=JPEG?w=190&h=190', 2, 65, 80, 80);
INSERT INTO `student` VALUES (1004, '张三', NULL, 3, 45, 83, 97);
INSERT INTO `student` VALUES (1005, 'Sano Minato', NULL, 4, 76, 13, 18);
INSERT INTO `student` VALUES (1006, 'Cheung Lik Sun', NULL, 3, 88, 46, 55);
INSERT INTO `student` VALUES (1007, 'Hu Zitao', NULL, 3, 66, 78, 80);
INSERT INTO `student` VALUES (1008, 'Shimizu Hikaru', NULL, 3, 90, 91, 17);
INSERT INTO `student` VALUES (1009, 'Endo Yuito', NULL, 2, 43, 93, 6);
INSERT INTO `student` VALUES (1010, 'Leung Chieh Lun', NULL, 4, 72, 80, 78);
INSERT INTO `student` VALUES (1011, 'Cho Chun Yu', NULL, 2, 71, 87, 73);
INSERT INTO `student` VALUES (1012, 'Aoki Misaki', NULL, 4, 88, 78, 85);
INSERT INTO `student` VALUES (1013, 'Jia Lu', NULL, 2, 31, 24, 5);
INSERT INTO `student` VALUES (1014, 'Cheng Yunxi', NULL, 2, 75, 63, 89);
INSERT INTO `student` VALUES (1015, 'Yuen Wai Han', NULL, 1, 83, 94, 69);
INSERT INTO `student` VALUES (1016, 'Ku Ching Wan', NULL, 1, 18, 81, 77);
INSERT INTO `student` VALUES (1017, 'Kudo Rin', NULL, 3, 16, 80, 53);
INSERT INTO `student` VALUES (1018, 'Lam Wing Fat', NULL, 4, 26, 88, 6);
INSERT INTO `student` VALUES (1019, 'He Jiehong', NULL, 2, 41, 40, 86);
INSERT INTO `student` VALUES (1020, 'Yokoyama Misaki', NULL, 3, 63, 76, 75);
INSERT INTO `student` VALUES (1021, 'Sun Yunxi', NULL, 2, 49, 34, 27);
INSERT INTO `student` VALUES (1022, 'Au Cho Yee', NULL, 1, 53, 51, 67);
INSERT INTO `student` VALUES (1023, 'Miyazaki Hana', NULL, 1, 17, 53, 2);
INSERT INTO `student` VALUES (1024, 'Yue Sau Man', NULL, 2, 70, 62, 91);
INSERT INTO `student` VALUES (1025, 'Tang Anqi', NULL, 4, 62, 70, 29);
INSERT INTO `student` VALUES (1026, 'Tang Yunxi', NULL, 3, 94, 18, 82);
INSERT INTO `student` VALUES (1027, 'Francis Schmidt', NULL, 4, 62, 3, 69);
INSERT INTO `student` VALUES (1028, 'Feng Lan', NULL, 3, 1, 40, 23);
INSERT INTO `student` VALUES (1029, 'Takagi Aoi', NULL, 4, 43, 72, 26);
INSERT INTO `student` VALUES (1030, 'Christine Chen', NULL, 4, 52, 61, 50);
INSERT INTO `student` VALUES (1031, 'Fu Kwok Wing', NULL, 3, 98, 66, 82);
INSERT INTO `student` VALUES (1032, 'Yamashita Itsuki', NULL, 4, 50, 96, 33);
INSERT INTO `student` VALUES (1033, 'Janet Stewart', NULL, 3, 46, 67, 16);
INSERT INTO `student` VALUES (1034, 'Leonard Griffin', NULL, 1, 76, 30, 46);
INSERT INTO `student` VALUES (1035, 'Au Sau Man', NULL, 4, 23, 85, 25);
INSERT INTO `student` VALUES (1036, 'Mao Shihan', NULL, 2, 92, 48, 59);
INSERT INTO `student` VALUES (1037, 'Yuen Yu Ling', NULL, 3, 31, 49, 30);
INSERT INTO `student` VALUES (1038, 'Lucille Morales', NULL, 3, 4, 81, 57);
INSERT INTO `student` VALUES (1039, 'Scott Ramirez', NULL, 1, 3, 26, 3);
INSERT INTO `student` VALUES (1040, 'Tsang Kwok Wing', NULL, 1, 58, 94, 72);
INSERT INTO `student` VALUES (1041, 'Saito Kasumi', NULL, 4, 99, 6, 81);
INSERT INTO `student` VALUES (1042, 'Au Tsz Ching', NULL, 1, 15, 23, 65);
INSERT INTO `student` VALUES (1043, 'Au Wai Lam', NULL, 4, 6, 96, 89);
INSERT INTO `student` VALUES (1044, 'Liao Xiuying', NULL, 4, 84, 75, 12);
INSERT INTO `student` VALUES (1045, 'Qian Lan', NULL, 3, 27, 16, 12);
INSERT INTO `student` VALUES (1046, 'Yamada Eita', NULL, 2, 7, 63, 93);
INSERT INTO `student` VALUES (1047, 'Yeow Wing Suen', NULL, 1, 93, 39, 61);
INSERT INTO `student` VALUES (1048, 'Kao On Kay', NULL, 4, 26, 37, 55);
INSERT INTO `student` VALUES (1049, 'Yue Suk Yee', NULL, 3, 81, 64, 51);
INSERT INTO `student` VALUES (1050, 'Wu Chieh Lun', NULL, 1, 62, 87, 46);
INSERT INTO `student` VALUES (1051, 'He Xiuying', NULL, 3, 49, 62, 41);
INSERT INTO `student` VALUES (1052, 'Samuel Chavez', NULL, 4, 59, 32, 37);
INSERT INTO `student` VALUES (1053, 'Maruyama Seiko', NULL, 4, 34, 86, 73);
INSERT INTO `student` VALUES (1054, 'Kam Ming Sze', NULL, 3, 68, 24, 68);
INSERT INTO `student` VALUES (1055, 'Ono Sara', NULL, 3, 66, 31, 7);
INSERT INTO `student` VALUES (1056, 'Tang Shihan', NULL, 4, 81, 99, 69);
INSERT INTO `student` VALUES (1057, 'Jia Jiehong', NULL, 2, 80, 87, 14);
INSERT INTO `student` VALUES (1058, 'Nomura Ren', NULL, 3, 76, 25, 10);
INSERT INTO `student` VALUES (1059, 'Shi Rui', NULL, 4, 25, 96, 44);
INSERT INTO `student` VALUES (1060, 'Mui Tak Wah', NULL, 3, 87, 57, 10);
INSERT INTO `student` VALUES (1061, 'Adam Fisher', NULL, 1, 38, 67, 71);
INSERT INTO `student` VALUES (1062, 'Lu Lan', NULL, 3, 79, 100, 54);
INSERT INTO `student` VALUES (1063, 'Mok Chiu Wai', NULL, 1, 69, 87, 28);
INSERT INTO `student` VALUES (1064, 'Harold Stone', NULL, 3, 6, 77, 77);
INSERT INTO `student` VALUES (1065, 'Terry Patel', NULL, 2, 30, 78, 82);
INSERT INTO `student` VALUES (1066, 'Matsumoto Daisuke', NULL, 1, 89, 85, 35);
INSERT INTO `student` VALUES (1067, 'Choi Fat', NULL, 3, 52, 66, 69);
INSERT INTO `student` VALUES (1068, 'Kojima Takuya', NULL, 2, 81, 13, 7);
INSERT INTO `student` VALUES (1069, 'Yan Rui', NULL, 2, 52, 84, 26);
INSERT INTO `student` VALUES (1070, 'Pak Hok Yau', NULL, 1, 26, 28, 90);
INSERT INTO `student` VALUES (1071, 'Ernest Wells', NULL, 3, 13, 73, 94);
INSERT INTO `student` VALUES (1072, 'Yan Rui', NULL, 2, 88, 85, 94);
INSERT INTO `student` VALUES (1073, 'Kaneko Rena', NULL, 4, 39, 19, 36);
INSERT INTO `student` VALUES (1074, 'Yamada Sara', NULL, 1, 55, 27, 55);
INSERT INTO `student` VALUES (1075, 'Cheng Jiehong', NULL, 3, 52, 37, 55);
INSERT INTO `student` VALUES (1076, 'Chung Tsz Hin', NULL, 3, 30, 4, 48);
INSERT INTO `student` VALUES (1077, 'Koyama Daisuke', NULL, 2, 37, 40, 2);
INSERT INTO `student` VALUES (1078, 'Hazel Castillo', NULL, 3, 22, 37, 44);
INSERT INTO `student` VALUES (1079, 'Laura Robinson', NULL, 1, 73, 32, 7);
INSERT INTO `student` VALUES (1080, 'Kaneko Aoshi', NULL, 3, 2, 65, 65);
INSERT INTO `student` VALUES (1081, 'Leonard Moore', NULL, 3, 70, 51, 82);
INSERT INTO `student` VALUES (1082, 'Miyazaki Mio', NULL, 4, 74, 64, 15);
INSERT INTO `student` VALUES (1083, 'Wu Xiuying', NULL, 4, 3, 52, 89);
INSERT INTO `student` VALUES (1084, 'Xu Shihan', NULL, 2, 13, 15, 55);
INSERT INTO `student` VALUES (1085, 'Chow Hiu Tung', NULL, 1, 19, 93, 84);
INSERT INTO `student` VALUES (1086, 'Phyllis Wood', NULL, 2, 65, 1, 29);
INSERT INTO `student` VALUES (2003, 'Endo Sara', NULL, 2, 95, 83, 87);

SET FOREIGN_KEY_CHECKS = 1;
