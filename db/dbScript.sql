CREATE DATABASE `school` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;

CREATE TABLE `student` (
  `idStudent` int(11) NOT NULL AUTO_INCREMENT,
  `studentName` varchar(45) DEFAULT NULL,
  `studentSurname` varchar(45) DEFAULT NULL,
  `studentAge` int(11) DEFAULT NULL,
  `studentClass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idStudent`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
