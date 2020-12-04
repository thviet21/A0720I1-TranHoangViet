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
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `idkhachhang` int NOT NULL AUTO_INCREMENT,
  `idloaikhach` int NOT NULL,
  `hoten` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ngaysinh` date NOT NULL,
  `socmnd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sdt` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `diachi` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`idkhachhang`),
  UNIQUE KEY `idkhachhang_UNIQUE` (`idkhachhang`),
  KEY `fk_idloaikhach_idx` (`idloaikhach`),
  CONSTRAINT `fk_idloaikhach` FOREIGN KEY (`idloaikhach`) REFERENCES `loaikhach` (`idloaikhach`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,1,'John Sena','1985-03-29','206565554','0778854666','johnsena@gmail.com','SandAndres'),(2,3,'Phan quốc đông','1991-05-21','206655444','0779999999','anhdon@gmail.com','Quảng Bình'),(3,1,'Some body','1997-02-15','654646546','0905987879','lakkkk@gmail.com','Quảng Trị'),(4,2,'Nguyễn Văn C','1995-03-16','206546544','0904846546','tnraoíaam@gmail.com','Quảng Ngãi'),(5,4,'Trương Hồng Tối','1998-02-25','206465498','7884654654','truonghongsang@gmail.com','Hà Tĩnh'),(6,5,'Lươn Xuân Duy','1999-05-30','065465465','3164654654','luonxuanduy@gmail.com','Nha Trang');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
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
