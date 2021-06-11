-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: track_and_deliver_db
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `email` varchar(255) NOT NULL,
  `subscription` enum('basic','premium') NOT NULL,
  `country` varchar(255) NOT NULL,
  `area` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `street_number` int NOT NULL,
  `street` varchar(255) NOT NULL,
  `postal_code` int NOT NULL,
  `company_name` varchar(255) NOT NULL,
  `afm` int NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company_archive`
--

DROP TABLE IF EXISTS `company_archive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company_archive` (
  `employee_email` varchar(255) NOT NULL,
  `comany_email` varchar(255) NOT NULL,
  `shipment_number` int NOT NULL,
  PRIMARY KEY (`employee_email`,`shipment_number`),
  KEY `company_archive_email` (`comany_email`),
  KEY `company_archive_shipment_number` (`shipment_number`),
  CONSTRAINT `company_archive_email` FOREIGN KEY (`comany_email`) REFERENCES `company` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `company_archive_employee_email` FOREIGN KEY (`employee_email`) REFERENCES `employee` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `company_archive_shipment_number` FOREIGN KEY (`shipment_number`) REFERENCES `package` (`shipment_number`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_archive`
--

LOCK TABLES `company_archive` WRITE;
/*!40000 ALTER TABLE `company_archive` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_archive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company_phone`
--

DROP TABLE IF EXISTS `company_phone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company_phone` (
  `company_email` varchar(255) NOT NULL,
  `company_phone` varchar(255) NOT NULL,
  PRIMARY KEY (`company_email`,`company_phone`),
  CONSTRAINT `company_phone_email` FOREIGN KEY (`company_email`) REFERENCES `company` (`email`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_phone`
--

LOCK TABLES `company_phone` WRITE;
/*!40000 ALTER TABLE `company_phone` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_phone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `email` varchar(255) NOT NULL,
  `subscription` enum('basic','premium') NOT NULL,
  `country` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `street_number` int NOT NULL,
  `street` varchar(255) NOT NULL,
  `postal_code` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `order_date` date DEFAULT NULL,
  `phone_number` varchar(255) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('apos1@gmail.com','basic','Cyprus','Madrid',1,'Prodromos',4673,'Apostolos','Kontarinis','R7c+27zdnZumXCn9M7EdHg==',NULL,'+306988334402'),('Apos@yahoo.com','basic','Afghanistan','Athens',1,'Prodromos',1246,'Apostolos','Kontarinis','/KUE9C8cgJvc2StveKcMzw==',NULL,'+306910293847'),('sina@gmail.com','premium','Greece','Chania',3,'Naoussa',84400,'Ioannis','Sina','/KUE9C8cgJvc2StveKcMzw==',NULL,'+3012345678'),('stav@hotmail.com','basic','Afghanistan','Thessaloniki',1,'Prodromos',10417,'Stavroula','Iliopoulou','/KUE9C8cgJvc2StveKcMzw==',NULL,'+306910293847');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_archive`
--

DROP TABLE IF EXISTS `customer_archive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_archive` (
  `customer_email` varchar(255) NOT NULL,
  `shipment_number` int NOT NULL,
  PRIMARY KEY (`customer_email`,`shipment_number`),
  KEY `customer_archive_shipment_numer` (`shipment_number`),
  CONSTRAINT `customer_archive_email` FOREIGN KEY (`customer_email`) REFERENCES `customer` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `customer_archive_shipment_numer` FOREIGN KEY (`shipment_number`) REFERENCES `package` (`shipment_number`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_archive`
--

LOCK TABLES `customer_archive` WRITE;
/*!40000 ALTER TABLE `customer_archive` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_archive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deliver_man_ratings`
--

DROP TABLE IF EXISTS `deliver_man_ratings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `deliver_man_ratings` (
  `deliver_man_afm` int NOT NULL,
  `stars` int NOT NULL,
  `comments` text NOT NULL,
  `customer_email` varchar(255) NOT NULL,
  PRIMARY KEY (`deliver_man_afm`,`customer_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliver_man_ratings`
--

LOCK TABLES `deliver_man_ratings` WRITE;
/*!40000 ALTER TABLE `deliver_man_ratings` DISABLE KEYS */;
/*!40000 ALTER TABLE `deliver_man_ratings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivers`
--

DROP TABLE IF EXISTS `delivers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delivers` (
  `delivery_man_afm` int DEFAULT NULL,
  `shipment_number` int NOT NULL,
  `state` enum('in_transit','delivered') NOT NULL,
  `assignemnt_date` date NOT NULL,
  PRIMARY KEY (`shipment_number`),
  KEY `delivers_shipment_number` (`shipment_number`),
  KEY `delivers_delivery_man_afm` (`delivery_man_afm`),
  CONSTRAINT `delivers_delivery_man_afm` FOREIGN KEY (`delivery_man_afm`) REFERENCES `delivery_man` (`afm`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `delivers_shipment_number` FOREIGN KEY (`shipment_number`) REFERENCES `package` (`shipment_number`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivers`
--

LOCK TABLES `delivers` WRITE;
/*!40000 ALTER TABLE `delivers` DISABLE KEYS */;
/*!40000 ALTER TABLE `delivers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery_man`
--

DROP TABLE IF EXISTS `delivery_man`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delivery_man` (
  `afm` int NOT NULL,
  `delivery_number` int DEFAULT NULL,
  `surname` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `state` enum('available','not_available','in_duty') NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`afm`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_man`
--

LOCK TABLES `delivery_man` WRITE;
/*!40000 ALTER TABLE `delivery_man` DISABLE KEYS */;
INSERT INTO `delivery_man` VALUES (1,1,'test','test1','123456789','test@gmail.com','available','+306912345678');
/*!40000 ALTER TABLE `delivery_man` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery_man_archive`
--

DROP TABLE IF EXISTS `delivery_man_archive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delivery_man_archive` (
  `delivery_man_afm` int NOT NULL,
  `shipment_number` int NOT NULL,
  PRIMARY KEY (`delivery_man_afm`,`shipment_number`),
  KEY `delivery_man_archive_shipment_number` (`shipment_number`),
  CONSTRAINT `delivery_man_archive_afm` FOREIGN KEY (`delivery_man_afm`) REFERENCES `delivery_man` (`afm`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `delivery_man_archive_shipment_number` FOREIGN KEY (`shipment_number`) REFERENCES `package` (`shipment_number`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_man_archive`
--

LOCK TABLES `delivery_man_archive` WRITE;
/*!40000 ALTER TABLE `delivery_man_archive` DISABLE KEYS */;
/*!40000 ALTER TABLE `delivery_man_archive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `working_company` varchar(255) NOT NULL,
  `afm` int NOT NULL,
  `property` enum('admin','user') NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`email`),
  KEY `employee_working_company` (`working_company`),
  CONSTRAINT `employee_working_company` FOREIGN KEY (`working_company`) REFERENCES `company` (`email`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `package`
--

DROP TABLE IF EXISTS `package`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `package` (
  `shipment_number` int NOT NULL,
  `estimated_delivery_date` date NOT NULL,
  `take_away_from_store` tinyint(1) NOT NULL DEFAULT '0',
  `departure_date` date NOT NULL,
  `weight` float DEFAULT NULL,
  `sending_company` varchar(255) NOT NULL,
  `dimensions` varchar(255) DEFAULT NULL,
  `delivery_attempts` int NOT NULL,
  `state` enum('on_hold','in_transit','delivered') NOT NULL,
  `customer_email` varchar(255) DEFAULT NULL,
  `date_of_register` date NOT NULL,
  `employee_email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`shipment_number`),
  KEY `package_customer_email` (`customer_email`),
  KEY `package_employee_email` (`employee_email`),
  CONSTRAINT `package_customer_email` FOREIGN KEY (`customer_email`) REFERENCES `customer` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `package_employee_email` FOREIGN KEY (`employee_email`) REFERENCES `employee` (`email`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `package`
--

LOCK TABLES `package` WRITE;
/*!40000 ALTER TABLE `package` DISABLE KEYS */;
INSERT INTO `package` VALUES (1,'2021-06-10',1,'2021-06-10',953,'GENIKI','30x40x100',2,'in_transit','sina@gmail.com','2021-09-03',NULL),(2,'2021-06-25',0,'2021-06-10',354,'GENIKI','30x40x100',9,'in_transit','sina@gmail.com','2021-06-10',NULL),(3,'2021-06-02',1,'2021-06-10',32,'SPEEDEX','30x40x100',7,'delivered','sina@gmail.com','2021-06-10',NULL),(4,'2021-06-25',0,'2021-06-10',529,'GENIKI','30x40x100',2,'delivered','sina@gmail.com','2021-06-10',NULL),(5,'2021-06-21',1,'2021-06-10',915,'ACS','30x40x100',5,'on_hold','sina@gmail.com','2021-06-10',NULL),(45643,'2021-09-03',0,'2021-09-03',446,'ACS','30x40x100',4,'on_hold','sina@gmail.com','2021-09-03',NULL),(123456,'2021-09-03',1,'2021-06-10',943,'ACS','30x40x100',0,'on_hold','sina@gmail.com','2021-09-03',NULL),(290199,'2021-09-03',1,'2021-09-03',975,'ACS','30x40x100',3,'delivered','sina@gmail.com','2021-09-03',NULL),(656565,'2021-09-03',1,'2021-09-03',103,'GENIKI','30x40x100',6,'in_transit','sina@gmail.com','2021-09-03',NULL),(43214321,'2021-09-03',0,'2021-09-03',781,'DHL','30x40x100',5,'in_transit','sina@gmail.com','2021-09-03',NULL),(454523542,'2021-09-03',1,'2021-09-03',956,'ELTA COURIER','30x40x100',5,'in_transit','sina@gmail.com','2021-09-03',NULL);
/*!40000 ALTER TABLE `package` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `serves`
--

DROP TABLE IF EXISTS `serves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `serves` (
  `customer_email` varchar(255) NOT NULL,
  `delivery_man_afm` int NOT NULL,
  `state` enum('served','accepted','in_service','declined') NOT NULL,
  `stars` float DEFAULT NULL,
  `comments` text,
  PRIMARY KEY (`customer_email`,`delivery_man_afm`),
  KEY `serves_afm` (`delivery_man_afm`),
  CONSTRAINT `serves_afm` FOREIGN KEY (`delivery_man_afm`) REFERENCES `delivery_man` (`afm`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `serves_email` FOREIGN KEY (`customer_email`) REFERENCES `customer` (`email`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serves`
--

LOCK TABLES `serves` WRITE;
/*!40000 ALTER TABLE `serves` DISABLE KEYS */;
/*!40000 ALTER TABLE `serves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `delivery_man_afm` int NOT NULL,
  `vehicle` enum('motorbike','bicycle','car','on_foot') NOT NULL,
  PRIMARY KEY (`ID`,`delivery_man_afm`),
  KEY `vehicle_delivery_man_afm` (`delivery_man_afm`),
  CONSTRAINT `vehicle_delivery_man_afm` FOREIGN KEY (`delivery_man_afm`) REFERENCES `delivery_man` (`afm`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-11 16:22:47
