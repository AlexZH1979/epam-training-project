#---
# MySql database dump for hotel entity
#---
DROP DATABASE IF EXISTS `hotel_system`;
CREATE DATABASE `hotel_system` DEFAULT CHARACTER SET = latin1;
USE `hotel_system`;

DROP TABLE IF EXISTS `hotel_system`.`user_role`;
DROP TABLE IF EXISTS `hotel_system`.`gender`;
DROP TABLE IF EXISTS `hotel_system`.`event_status`;
DROP TABLE IF EXISTS `hotel_system`.`room_category`;

#
# Table structure for table 'user_role'
#
CREATE TABLE `hotel_system`.`user_role` (
  `id` INT NOT NULL AUTO_INCREMENT UNIQUE,
  `code` VARCHAR(32) NOT NULL UNIQUE,
  CONSTRAINT user_role_pk PRIMARY KEY (`id`))
ENGINE = InnoDB;

INSERT INTO `hotel_system`.`user_role` (`code`) VALUES ('CUSTOMER');
INSERT INTO `hotel_system`.`user_role` (`code`) VALUES ('ADMINISTRATOR');

#
# Table structure for table 'gender'
#
CREATE TABLE `hotel_system`.`gender` (
  `id` INT NOT NULL AUTO_INCREMENT UNIQUE,
  `code` VARCHAR(32) NOT NULL UNIQUE,
  CONSTRAINT gender_pk PRIMARY KEY (`id`))
ENGINE = InnoDB;
  
INSERT INTO `hotel_system`.`gender` (`code`) VALUES ('UNCNOWN');
INSERT INTO `hotel_system`.`gender` (`code`) VALUES ('MALE');
INSERT INTO `hotel_system`.`gender` (`code`) VALUES ('FEMALE');

#
# Table structure for table 'gender'
#
CREATE TABLE `hotel_system`.`event_status` (  
  `id` INT NOT NULL AUTO_INCREMENT UNIQUE,
  `code` VARCHAR(32) NOT NULL UNIQUE,
  CONSTRAINT event_status_pk PRIMARY KEY (`id`))  
ENGINE = InnoDB;

INSERT INTO `hotel_system`.`event_status` (`code`) VALUES ('UNCNOWN');
INSERT INTO `hotel_system`.`event_status` (`code`) VALUES ('BADBEHAVIOR');
INSERT INTO `hotel_system`.`event_status` (`code`) VALUES ('TREF');

#
# Table structure for table 'room_category'
#
CREATE TABLE `hotel_system`.`room_category` (  
  `id` INT NOT NULL AUTO_INCREMENT UNIQUE,
  `code` VARCHAR(32) NOT NULL UNIQUE,
  CONSTRAINT room_category_pk PRIMARY KEY (`id`))  
ENGINE = InnoDB;

INSERT INTO `hotel_system`.`room_category` (`code`) VALUES ('ECONOMY');
INSERT INTO `hotel_system`.`room_category` (`code`) VALUES ('BUSINESS');
INSERT INTO `hotel_system`.`room_category` (`code`) VALUES ('ELITE');

