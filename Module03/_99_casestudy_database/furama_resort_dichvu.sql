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
-- Table structure for table `dichvu`
--

DROP TABLE IF EXISTS `dichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvu` (
  `iddichvu` int NOT NULL AUTO_INCREMENT,
  `tendichvu` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dientich` int NOT NULL,
  `sotang` int NOT NULL,
  `songuoitoida` int NOT NULL,
  `chiphithue` int NOT NULL,
  `idkieuthue` int NOT NULL,
  `idloaidichvu` int NOT NULL,
  `trangthai` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`iddichvu`),
  UNIQUE KEY `iddichvu_UNIQUE` (`iddichvu`),
  KEY `fk_kieuthue_idx` (`idkieuthue`),
  KEY `fk_loaidichvu_idx` (`idloaidichvu`),
  CONSTRAINT `fk_idkieuthue` FOREIGN KEY (`idkieuthue`) REFERENCES `kieuthue` (`idkieuthue`),
  CONSTRAINT `fk_idloaidichvu` FOREIGN KEY (`idloaidichvu`) REFERENCES `loaidichvu` (`idloaidichvu`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvu`
--

LOCK TABLES `dichvu` WRITE;
/*!40000 ALTER TABLE `dichvu` DISABLE KEYS */;
INSERT INTO `dichvu` VALUES (1,'Athena',45,2,25,9000000,1,1,'Sẵn sàng'),(2,'Zeus',100,3,25,10000000,2,2,'Sẵn sàng'),(3,'Predator',200,4,30,12000000,1,3,'Sẵn sàng'),(4,'John Henry',50,1,15,9000000,2,1,'Sẵn sàng'),(5,'Haw',90,1,10,9000000,1,1,'Sẵn sàng');
/*!40000 ALTER TABLE `dichvu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-04 13:04:41
