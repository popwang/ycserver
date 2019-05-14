
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ds` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ds`;

/*Table structure for table `t_equipment_data` */

DROP TABLE IF EXISTS `t_equipment_data`;

CREATE TABLE `t_equipment_data` (
  `v_equipment_name` varchar(100) CHARACTER SET gb2312 DEFAULT NULL COMMENT '设备编号',
  `p001` double(7,3) DEFAULT NULL COMMENT '传感器状态',
  `p002` double(7,3) DEFAULT NULL COMMENT 'PM2.5',
  `p003` double(7,3) DEFAULT NULL COMMENT 'pm10',
  `p004` double(7,3) DEFAULT NULL COMMENT '风速',
  `p005` double(7,3) DEFAULT NULL COMMENT '风向',
  `p006` double(7,3) DEFAULT NULL COMMENT '温度',
  `p007` double(7,3) DEFAULT NULL COMMENT '湿度',
  `p008` double(7,3) DEFAULT NULL COMMENT '噪音',
  `p009` double(7,3) DEFAULT NULL COMMENT 'pm100',
  `p010` double(7,3) DEFAULT NULL COMMENT '气压',
  `p011` double(7,3) DEFAULT NULL COMMENT '风级',
  `p012` double(10,3) DEFAULT NULL COMMENT '保留4',
  `p013` double(10,3) DEFAULT NULL COMMENT '保留5',
  `p014` double(10,6) DEFAULT NULL COMMENT '经度',
  `p015` double(10,6) DEFAULT NULL COMMENT '纬度',
  `dtm_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '数据插入时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `t_equipment_data2` */

DROP TABLE IF EXISTS `t_equipment_data2`;

CREATE TABLE `t_equipment_data2` (
  `v_equipment_name` varchar(100) CHARACTER SET gb2312 DEFAULT NULL COMMENT '设备编号',
  `p001` double(7,3) DEFAULT NULL COMMENT '传感器状态',
  `p002` double(7,3) DEFAULT NULL COMMENT 'PM2.5',
  `p003` double(7,3) DEFAULT NULL COMMENT 'pm10',
  `p004` double(7,3) DEFAULT NULL COMMENT '风速',
  `p005` double(7,3) DEFAULT NULL COMMENT '风向',
  `p006` double(7,3) DEFAULT NULL COMMENT '温度',
  `p007` double(7,3) DEFAULT NULL COMMENT '湿度',
  `p008` double(7,3) DEFAULT NULL COMMENT '噪音',
  `p009` double(7,3) DEFAULT NULL COMMENT 'pm100',
  `p010` double(7,3) DEFAULT NULL COMMENT '气压',
  `p011` double(7,3) DEFAULT NULL COMMENT '风级',
  `p012` double(10,3) DEFAULT NULL COMMENT '保留4',
  `p013` double(10,3) DEFAULT NULL COMMENT '保留5',
  `p014` double(10,6) DEFAULT NULL COMMENT '经度',
  `p015` double(10,6) DEFAULT NULL COMMENT '纬度',
  `dtm_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '数据插入时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='里面只存每个设备最新的一条数据';