CREATE DATABASE  IF NOT EXISTS `rockola` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `rockola`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: rockola
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `cancion`
--

DROP TABLE IF EXISTS `cancion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cancion` (
  `nombre` varchar(50) NOT NULL,
  `autor` varchar(50) DEFAULT NULL,
  `categoria` varchar(30) DEFAULT NULL,
  `año` int DEFAULT NULL,
  `disco` varchar(50) DEFAULT NULL,
  `ruta` varchar(200) DEFAULT NULL,
  `ruta_imagen` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`nombre`),
  UNIQUE KEY `ruta_imagen_UNIQUE` (`ruta_imagen`),
  UNIQUE KEY `ruta_UNIQUE` (`ruta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cancion`
--

LOCK TABLES `cancion` WRITE;
/*!40000 ALTER TABLE `cancion` DISABLE KEYS */;
INSERT INTO `cancion` VALUES ('a little respect','Erasure','AÑOS80',1988,'The Innocents','./sonidos/AÑOS80/erasure.wav','./imagenes/AÑOS80/erasure.png'),('bad guy','Billie Eilish','ACTUALIDAD',2019,'When We All Fall Asleep, Where Do We Go?','./sonidos/ACTUALIDAD/billie.wav','./imagenes/ACTUALIDAD/billie.jpg'),('enamorado de la moda juvenil','Radio Futura','AÑOS80',1980,'Música Moderna','./sonidos/AÑOS80/moda.wav','./imagenes/AÑOS80/radio.jpg'),('forever','Chvrches','ACTUALIDAD',2018,'Love is Dead','./sonidos/ACTUALIDAD/forever.wav','./imagenes/ACTUALIDAD/chvrches.png'),('hawai','Maluma','ACTUALIDAD',2020,'Papi Juancho','./sonidos/ACTUALIDAD/hawai.wav','./imagenes/ACTUALIDAD/maluma.png'),('i want to break free','Queen','AÑOS80',1984,'The Works','./sonidos/AÑOS80/queen.wav','./imagenes/AÑOS80/queen.jpg'),('la chica de ayer','Nacha Pop','AÑOS80',1980,'Nacha Pop','./sonidos/AÑOS80/nacha.wav','./imagenes/AÑOS80/nacha.jpg'),('la fuerza del destino','Mecano','AÑOS80',1988,'Descanso Dominical','./sonidos/AÑOS80/destino.wav','./imagenes/AÑOS80/mecano.jpg'),('livin on a prayer','Jon Bon Jovi','AÑOS80',1986,'Slippery When Wet','./sonidos/AÑOS80/jovi.wav','./imagenes/AÑOS80/jovi.jpg'),('merichane','Zahara','ACTUALIDAD',2021,'Puta','./sonidos/ACTUALIDAD/merichane.wav','./imagenes/ACTUALIDAD/zahara.jpg'),('mujer bruja','Lola Indigo','ACTUALIDAD',2019,'Akelarre','./sonidos/ACTUALIDAD/bruja.wav','./imagenes/ACTUALIDAD/akelarre.jpg'),('night crawling','Miley Cyrus ft  Billy Idol','ACTUALIDAD',2021,'Plastic Hearts','./sonidos/ACTUALIDAD/miley.wav','./imagenes/ACTUALIDAD/miley.jpg'),('que se joda todo lo demas','Alice Wonder','ACTUALIDAD',2021,'Que se joda todo lo demás','./sonidos/ACTUALIDAD/aliceWonder.wav','./imagenes/ACTUALIDAD/alice.jpg'),('salta','Tequila','AÑOS80',1981,'Confidencial','./sonidos/AÑOS80/salta.wav','./imagenes/AÑOS80/tequila.jpg'),('somebody that i used to know','Gotye ft Kimbra','AÑOS80',1980,'Desconocido','./sonidos/AÑOS80/somebody.wav','./imagenes/AÑOS80/somebody.jpg'),('starboy','The Weeknd','ACTUALIDAD',2016,'Starboy','./sonidos/ACTUALIDAD/starboy.wav','./imagenes/ACTUALIDAD/starboy.jpg'),('tu me dejaste de querer','C.Tangana','ACTUALIDAD',2021,'El Madrileño','./sonidos/ACTUALIDAD/tangana.wav','./imagenes/ACTUALIDAD/tangana.jpg'),('what a feeling','Irene Cara','AÑOS80',1983,'What a Feelin\'','./sonidos/AÑOS80/flashdance.wav','./imagenes/AÑOS80/flashdance.jpg'),('wolves','Selena Gómez ft Marshmello','ACTUALIDAD',2017,'Wolves','./sonidos/ACTUALIDAD/wolves.wav','./imagenes/ACTUALIDAD/wolves.jpg'),('you shook me all night long','ACDC','AÑOS80',1980,'Back in Black','./sonidos/AÑOS80/acdc.wav','./imagenes/AÑOS80/acdc.jpg');
/*!40000 ALTER TABLE `cancion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugador` (
  `nombre` varchar(50) NOT NULL,
  `contraseña` varchar(20) NOT NULL,
  PRIMARY KEY (`nombre`,`contraseña`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
INSERT INTO `jugador` VALUES ('YOLANDA','CORDERO');
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opciones`
--

DROP TABLE IF EXISTS `opciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opciones` (
  `nombre` varchar(50) NOT NULL,
  `nombre_cancion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opciones`
--

LOCK TABLES `opciones` WRITE;
/*!40000 ALTER TABLE `opciones` DISABLE KEYS */;
INSERT INTO `opciones` VALUES (' I don\'t wanna live that way','somebody that i used to know'),('A little respect','a little respect'),('All night long','you shook me all night long'),('Bad','bad guy'),('Bad boy','bad guy'),('Bad gay','bad guy'),('Bad guy','bad guy'),('Bein\'s believin\'','what a feeling'),('Can\'t shake it','night crawling'),('Contento de verdad','salta'),('Cuando más te quería','tu me dejaste de querer'),('Cut me off','somebody that i used to know'),('Dark side of the moon','wolves'),('Déjame decirte','hawai'),('Dime si tú','enamorado de la moda juvenil'),('El viaje','que se joda todo lo demas'),('Empezamos mal','la fuerza del destino'),('Enamorado de la moda juvenil','enamorado de la moda juvenil'),('Enamorado de ti','enamorado de la moda juvenil'),('Flashdance','what a feeling'),('Forever','forever'),('Free','i want to break free'),('God knows','i want to break free'),('Hablando de mí','mujer bruja'),('Hawai','hawai'),('Hoy me he levantado','salta'),('I kill any pain','starboy'),('I want to break free','i want to break free'),('I would hate you \'til forever','forever'),('I\'ve fallen in love','i want to break free'),('In love with you','a little respect'),('La chica de ayer','la chica de ayer'),('La fuerza del destino','la fuerza del destino'),('Las calles mojadas','la chica de ayer'),('Livin\' on a prayer','livin on a prayer'),('Look what you\'ve done','starboy'),('Malquerer','tu me dejaste de querer'),('Me asomo a la ventana','la chica de ayer'),('Merichane','merichane'),('Miedo','mujer bruja'),('Moda juvenil','enamorado de la moda juvenil'),('Motherfucking','starboy'),('Mujer bruja','mujer bruja'),('Night crawling','night crawling'),('Nos vimos tres o cuatro veces','la fuerza del destino'),('Once upon a time not so long ago','livin on a prayer'),('Pa\' que yo vea','hawai'),('Puede que no te haga falta na\'','hawai'),('Que se joda todo lo demás','que se joda todo lo demas'),('Quizás','que se joda todo lo demas'),('Respect','a little respect'),('Salta','salta'),('Salta conmigo','salta'),('Savor the pain','forever'),('Savor the taste','forever'),('Se te fueron las ganas','tu me dejaste de querer'),('Shaking','you shook me all night long'),('Shook me','you shook me all night long'),('Si el invierno viene frío','la fuerza del destino'),('Sin saber salir','merichane'),('Sitio muy raro','que se joda todo lo demas'),('Sky falling','night crawling'),('Somebody','somebody that i used to know'),('Somebody that i used to know','somebody that i used to know'),('Sometimes','night crawling'),('Starboy','starboy'),('Take my hand','livin on a prayer'),('Take your passion','what a feeling'),('That you gimme no','a little respect'),('Through the jungle','wolves'),('To get to you','wolves'),('Tú me dejaste de querer','tu me dejaste de querer'),('Un día cualquiera','la chica de ayer'),('We\'re half way there','livin on a prayer'),('What a feelin\'','what a feeling'),('Wolves','wolves'),('Yo','merichane'),('Yo estaba ahí','merichane'),('Yo te aviso','mujer bruja'),('You shook me all night long','you shook me all night long');
/*!40000 ALTER TABLE `opciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partida`
--

DROP TABLE IF EXISTS `partida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partida` (
  `nivel` varchar(10) DEFAULT NULL,
  `puntos` int DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `nombre_jugador` varchar(50) DEFAULT NULL,
  KEY `nombre_jugador` (`nombre_jugador`),
  CONSTRAINT `partida_ibfk_1` FOREIGN KEY (`nombre_jugador`) REFERENCES `jugador` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partida`
--

LOCK TABLES `partida` WRITE;
/*!40000 ALTER TABLE `partida` DISABLE KEYS */;
/*!40000 ALTER TABLE `partida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'rockola'
--

--
-- Dumping routines for database 'rockola'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-21 11:56:58
