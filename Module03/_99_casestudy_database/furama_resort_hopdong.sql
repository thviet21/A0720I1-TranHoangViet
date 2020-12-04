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
-- Table structure for table `hopdong`
--

DROP TABLE IF EXISTS `hopdong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdong` (
  `idhopdong` int NOT NULL AUTO_INCREMENT,
  `idnhanvien` int NOT NULL,
  `idkhachhang` int NOT NULL,
  `iddichvu` int NOT NULL,
  `ngaylamhopdong` date NOT NULL,
  `ngayketthuc` date NOT NULL,
  `tiendatcoc` int NOT NULL,
  `tongtien` int NOT NULL,
  PRIMARY KEY (`idhopdong`),
  UNIQUE KEY `idhopdong_UNIQUE` (`idhopdong`),
  KEY `fk_hopdong_idnv_idx` (`idnhanvien`),
  KEY `fk_hopdong_idkh_idx` (`idkhachhang`),
  KEY `fk_hopdong_iddv_idx` (`iddichvu`),
  CONSTRAINT `fk_hopdong_iddv` FOREIGN KEY (`iddichvu`) REFERENCES `dichvu` (`iddichvu`),
  CONSTRAINT `fk_hopdong_idkh` FOREIGN KEY (`idkhachhang`) REFERENCES `khachhang` (`idkhachhang`),
  CONSTRAINT `fk_hopdong_idnv` FOREIGN KEY (`idnhanvien`) REFERENCES `nhanvien` (`idnhanvien`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdong`
--

LOCK TABLES `hopdong` WRITE;
/*!40000 ALTER TABLE `hopdong` DISABLE KEYS */;
INSERT INTO `hopdong` VALUES (1,1,2,3,'2018-02-21','2018-04-15',20000000,50000000),(2,2,3,2,'2019-05-24','2019-06-16',20000000,100000000),(3,3,4,1,'2018-01-23','2018-01-27',10000000,20000000),(4,4,5,4,'2019-03-22','2019-03-25',20000000,50000000);
/*!40000 ALTER TABLE `hopdong` ENABLE KEYS */;
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
