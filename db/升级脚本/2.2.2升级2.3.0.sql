ALTER TABLE `base_mall`.`order_item` ADD COLUMN `is_refund` CHAR(2) NULL COMMENT '�Ƿ��˿�0:�� 1����' AFTER `remark`, ADD COLUMN `status` CHAR(2) NULL COMMENT '״̬1���˿��У�2���ܾ��˿3��ͬ���˿�' AFTER `is_refund`; 


ALTER TABLE `base_mall`.`order_item` CHANGE `status` `status` CHAR(2) CHARSET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '״̬1���˿������У�2���˻��У�3���ܾ��˿4��ͬ���˿�'; 


ALTER TABLE `base_mall`.`order_refunds` CHANGE `status` `status` CHAR(2) CHARSET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '�˿�״̬1���˿������У�2���˻��У�3���ܾ��˿4��ͬ���˿�'; 


ALTER TABLE `base_mall`.`order_item` CHANGE `status` `status` CHAR(2) CHARSET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '0' NULL COMMENT '״̬0��������1���˿��У�2���˻��˿���'; 

ALTER TABLE `base_mall`.`order_refunds` CHANGE `status` `status` CHAR(2) CHARSET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '�˿�״̬0�������˻����룻11���˿������У�111��ͬ���˿112���ܾ��˿12���˻��˿������У�121��ͬ���˻��˿�/�˻��У�122���ܾ��˻��˿1211���յ��˻�ͬ���˿1211���յ��˻��ܾ��˿�'; 


ALTER TABLE `base_mall`.`order_item` CHANGE `is_refund` `is_refund` CHAR(2) CHARSET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '0' NULL COMMENT '�Ƿ��˿�0:�� 1����'; 

UPDATE `base_mall`.`order_item` SET `status` = '0' WHERE `status` IS NULL;
UPDATE `base_mall`.`order_item` SET `is_refund` = '0' WHERE `is_refund` IS NULL;


ALTER TABLE `base_mall`.`order_refunds` CHANGE `status` `status` CHAR(2) CHARSET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '�˿�״̬0�������˻����룻1���˿������У�11��ͬ���˿12���ܾ��˿2���˻��˿������У�21��ͬ���˻��˿�/�˻��У�22���ܾ��˻��˿211���յ��˻�ͬ���˿212���յ��˻��ܾ��˿�'; 

ALTER TABLE `base_mall`.`order_item` CHANGE `status` `status` CHAR(2) CHARSET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '0' NULL COMMENT '״̬0��������1���˿��У�2���˻��˿��У�3������˿4������˻��˿�'; 

ALTER TABLE `base_mall`.`order_refunds` CHANGE `status` `status` CHAR(6) CHARSET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '�˿�״̬0�������˻����룻1���˿������У�11��ͬ���˿12���ܾ��˿2���˻��˿������У�21��ͬ���˻��˿�/�˻��У�22���ܾ��˻��˿211���յ��˻�ͬ���˿212���յ��˻��ܾ��˿�'; 








