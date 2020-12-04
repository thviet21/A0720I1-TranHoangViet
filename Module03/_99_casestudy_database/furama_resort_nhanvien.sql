-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: furama_resort
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `idnhanvien` int NOT NULL AUTO_INCREMENT,
  `hoten` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `idvitri` int NOT NULL,
  `idtrinhdo` int NOT NULL,
  `idbophan` int NOT NULL,
  `ngaysinh` date NOT NULL,
  `socmnd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `luong` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sdt` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `diachi` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`idnhanvien`),
  UNIQUE KEY `idnhanvien_UNIQUE` (`idnhanvien`),
  KEY `fk_idvitri_idx` (`idvitri`),
  KEY `fk_idtrinhdo_idx` (`idtrinhdo`),
  KEY `fk_idbophan_idx` (`idbophan`),
  CONSTRAINT `fk_idbophan` FOREIGN KEY (`idbophan`) REFERENCES `bophan` (`idbophan`),
  CONSTRAINT `fk_idtrinhdo` FOREIGN KEY (`idtrinhdo`) REFERENCES `trinhdo` (`idtrinhdo`),
  CONSTRAINT `fk_idvitri` FOREIGN KEY (`idvitri`) REFERENCES `vitri` (`idvitri`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Trần Hoàng Việt',1,2,3,'1997-09-16','203322565','8000000','0704529871','tranhoangviet.21@gmail.com','Điện bàn, Quảng Nam'),(2,'Tô Thanh Nam',2,3,4,'2000-02-15','205546644','8000000','0552666444','tothanhnam@gmail.com','Đà nẵng'),(3,'Huỳnh Trọng Huy',3,4,5,'1989-03-20','546567987','9900000','0870645546','huytrong@gmail.com','Quảng trị'),(4,'Kha Khấu Khỉnh',1,3,5,'1999-04-20','206654558','10000000','0905455454','khakhaukhinh@gmail.com','Quảng Bình');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-04 13:04:42
