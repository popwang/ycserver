
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
  `dtm_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '数据插入时间',
  `p016` double(10,3) DEFAULT NULL,
  `p017` double(10,3) DEFAULT NULL,
  `p018` double(10,3) DEFAULT NULL,
  `p019` double(10,3) DEFAULT NULL,
  `p020` double(10,3) DEFAULT NULL,
  `p021` double(10,3) DEFAULT NULL,
  `p022` double(10,3) DEFAULT NULL,
  `p023` double(10,3) DEFAULT NULL,
  `p024` double(10,3) DEFAULT NULL,
  `p025` double(10,3) DEFAULT NULL,
  `p026` double(10,3) DEFAULT NULL,
  `p027` double(10,3) DEFAULT NULL,
  `p028` double(10,3) DEFAULT NULL,
  `p029` double(10,3) DEFAULT NULL,
  `p030` double(10,3) DEFAULT NULL
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
  `dtm_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '数据插入时间',
  `p016` double(10,3) DEFAULT NULL,
  `p017` double(10,3) DEFAULT NULL,
  `p018` double(10,3) DEFAULT NULL,
  `p019` double(10,3) DEFAULT NULL,
  `p020` double(10,3) DEFAULT NULL,
  `p021` double(10,3) DEFAULT NULL,
  `p022` double(10,3) DEFAULT NULL,
  `p023` double(10,3) DEFAULT NULL,
  `p024` double(10,3) DEFAULT NULL,
  `p025` double(10,3) DEFAULT NULL,
  `p026` double(10,3) DEFAULT NULL,
  `p027` double(10,3) DEFAULT NULL,
  `p028` double(10,3) DEFAULT NULL,
  `p029` double(10,3) DEFAULT NULL,
  `p030` double(10,3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='里面只存每个设备最新的一条数据';

/*Table structure for table `t_order_buffer` */

DROP TABLE IF EXISTS `t_order_buffer`;

CREATE TABLE `t_order_buffer` (
  `i_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `v_equipment_name` varchar(100) DEFAULT NULL COMMENT '设备名称',
  `v_order_content` varchar(500) DEFAULT NULL COMMENT '发送内容',
  `i_send_flag` int(11) DEFAULT NULL COMMENT '发送状态，0未发送，1已发送',
  `dtm_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '数据添加时间',
  PRIMARY KEY (`i_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5051 DEFAULT CHARSET=utf8;