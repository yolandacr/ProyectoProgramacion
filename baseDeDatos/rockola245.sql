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
INSERT INTO `cancion` VALUES ('(you drive me) crazy','Britney Spears','AÑOS90',1999,'...Baby One More Time','./sonidos/AÑOS90/crazy.wav','./imagenes/AÑOS90/britney.jpg'),('a contracorriente','El Canto del Loco','AÑOS2000',2002,'A Contracorriente','./sonidos/AÑOS2000/contracorriente.wav','./imagenes/AÑOS2000/contracorriente.jpg'),('a little respect','Erasure','AÑOS80',1988,'The Innocents','./sonidos/AÑOS80/erasure.wav','./imagenes/AÑOS80/erasure.png'),('bad guy','Billie Eilish','ACTUALIDAD',2019,'When We All Fall Asleep, Where Do We Go?','./sonidos/ACTUALIDAD/billie.wav','./imagenes/ACTUALIDAD/billie.jpg'),('basket case','Green Day','AÑOS90',1994,'Dookie','./sonidos/AÑOS90/basket.wav','./imagenes/AÑOS90/green.jpg'),('cherry lips','Garbage','AÑOS2000',2001,'Beautiful Garbage','./sonidos/AÑOS2000/garbage.wav','./imagenes/AÑOS2000/garbage.jpg'),('en vela','La Fuga','AÑOS2000',2003,'Calles de papel','./sonidos/AÑOS2000/fuga.wav','./imagenes/AÑOS2000/fuga.jpg'),('enamorado de la moda juvenil','Radio Futura','AÑOS80',1980,'Música Moderna','./sonidos/AÑOS80/moda.wav','./imagenes/AÑOS80/radio.jpg'),('every you every me','Placebo','AÑOS90',1998,'Without You I\'m Nothing','./sonidos/AÑOS90/placebo.wav','./imagenes/AÑOS90/placebo.jpg'),('fear','Sarah McLachlan','AÑOS90',1997,'Fumbling Towards Ecstasy','./sonidos/AÑOS90/fear.wav','./imagenes/AÑOS90/fear.jpg'),('forever','Chvrches','ACTUALIDAD',2018,'Love is Dead','./sonidos/ACTUALIDAD/forever.wav','./imagenes/ACTUALIDAD/chvrches.png'),('gods & monsters','Lana del Rey','AÑOS2000',2012,'Paradise','./sonidos/AÑOS2000/gods.wav','./imagenes/AÑOS2000/paradise.jpg'),('hawai','Maluma','ACTUALIDAD',2020,'Papi Juancho','./sonidos/ACTUALIDAD/hawai.wav','./imagenes/ACTUALIDAD/maluma.png'),('here with me','Dido','AÑOS90',1999,'No Angel','./sonidos/AÑOS90/dido.wav','./imagenes/AÑOS90/dido.jpg'),('historias de amor','OBK','AÑOS90',1991,'Llámalo Sueño','./sonidos/AÑOS90/obk.wav','./imagenes/AÑOS90/obk.jpg'),('i want to break free','Queen','AÑOS80',1984,'The Works','./sonidos/AÑOS80/queen.wav','./imagenes/AÑOS80/queen.jpg'),('i write sins not tragedies','Panic! At the Disco','AÑOS2000',2005,'A Fever You Can\'t Sweat Out','./sonidos/AÑOS2000/tragedies.wav','./imagenes/AÑOS2000/panic.jpg'),('join me in death','HIM','AÑOS90',1999,'Razorblade Romance','./sonidos/AÑOS90/him.wav','./imagenes/AÑOS90/him.jpg'),('just a girl','No Doubt','AÑOS90',1995,'Tragic Kingdom','./sonidos/AÑOS90/nodoubt.wav','./imagenes/AÑOS90/tragic.jpg'),('just like a pill','P!nk','AÑOS2000',2001,'M!ssundaztood','./sonidos/AÑOS2000/pill.wav','./imagenes/AÑOS2000/pink.jpg'),('la chica de ayer','Nacha Pop','AÑOS80',1980,'Nacha Pop','./sonidos/AÑOS80/nacha.wav','./imagenes/AÑOS80/nacha.jpg'),('la fuerza del destino','Mecano','AÑOS80',1988,'Descanso Dominical','./sonidos/AÑOS80/destino.wav','./imagenes/AÑOS80/mecano.jpg'),('lamento boliviano','Enanitos Verdes','AÑOS2000',2018,'Huevos Revueltos','./sonidos/AÑOS2000/boliviano.wav','./imagenes/AÑOS2000/boliviano.jpg'),('livin on a prayer','Jon Bon Jovi','AÑOS80',1986,'Slippery When Wet','./sonidos/AÑOS80/jovi.wav','./imagenes/AÑOS80/jovi.jpg'),('merichane','Zahara','ACTUALIDAD',2021,'Puta','./sonidos/ACTUALIDAD/merichane.wav','./imagenes/ACTUALIDAD/zahara.jpg'),('mujer bruja','Lola Indigo','ACTUALIDAD',2019,'Akelarre','./sonidos/ACTUALIDAD/bruja.wav','./imagenes/ACTUALIDAD/akelarre.jpg'),('night crawling','Miley Cyrus ft  Billy Idol','ACTUALIDAD',2021,'Plastic Hearts','./sonidos/ACTUALIDAD/miley.wav','./imagenes/ACTUALIDAD/miley.jpg'),('que se joda todo lo demas','Alice Wonder','ACTUALIDAD',2021,'Que se joda todo lo demás','./sonidos/ACTUALIDAD/aliceWonder.wav','./imagenes/ACTUALIDAD/alice.jpg'),('quit playing games (with my heart)','Backstreet Boys','AÑOS90',1996,'Backstreet Boys','./sonidos/AÑOS90/bsb.wav','./imagenes/AÑOS90/bsb.jpg'),('salta','Tequila','AÑOS80',1981,'Confidencial','./sonidos/AÑOS80/salta.wav','./imagenes/AÑOS80/tequila.jpg'),('somebody that i used to know','Gotye ft Kimbra','AÑOS80',1980,'Desconocido','./sonidos/AÑOS80/somebody.wav','./imagenes/AÑOS80/somebody.jpg'),('starboy','The Weeknd','ACTUALIDAD',2016,'Starboy','./sonidos/ACTUALIDAD/starboy.wav','./imagenes/ACTUALIDAD/starboy.jpg'),('teen idle','Marina and The Diamonds','AÑOS2000',2012,'Electra Heart','./sonidos/AÑOS2000/teen.wav','./imagenes/AÑOS2000/teen.jpeg'),('the kill','30 Seconds to Mars','AÑOS2000',2005,'A Beautiful Lie','./sonidos/AÑOS2000/kill.wav','./imagenes/AÑOS2000/kill.jpg'),('to the moon and back','Savage Garden','AÑOS90',1997,'Savage Garden','./sonidos/AÑOS90/moon.wav','./imagenes/AÑOS90/savage.jpg'),('torero','Chayanne','AÑOS2000',2002,'Grandes éxitos','./sonidos/AÑOS2000/torero.wav','./imagenes/AÑOS2000/torero.jpg'),('tu me dejaste de querer','C.Tangana','ACTUALIDAD',2021,'El Madrileño','./sonidos/ACTUALIDAD/tangana.wav','./imagenes/ACTUALIDAD/tangana.jpg'),('what a feeling','Irene Cara','AÑOS80',1983,'What a Feelin\'','./sonidos/AÑOS80/flashdance.wav','./imagenes/AÑOS80/flashdance.jpg'),('wolves','Selena Gómez ft Marshmello','ACTUALIDAD',2017,'Wolves','./sonidos/ACTUALIDAD/wolves.wav','./imagenes/ACTUALIDAD/wolves.jpg'),('you shook me all night long','ACDC','AÑOS80',1980,'Back in Black','./sonidos/AÑOS80/acdc.wav','./imagenes/AÑOS80/acdc.jpg');
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
INSERT INTO `jugador` VALUES ('ALEJANDRO','1234'),('ANTONIO','1234'),('MAURO','1234'),('NOEMI','1234'),('YOLANDA','CORDERO');
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
INSERT INTO `opciones` VALUES (' I don\'t wanna live that way','somebody that i used to know'),(' turn back time','quit playing games (with my heart)'),('(You drive me) Crazy','(you drive me) crazy'),('a contracorriente','a contracorriente'),('A little respect','a little respect'),('a tu ventana','en vela'),('All night long','you shook me all night long'),('alma en el ruedo','torero'),('American Idiot','basket case'),('angel','gods & monsters'),('Baby','(you drive me) crazy'),('Bad','bad guy'),('Bad boy','bad guy'),('Bad gay','bad guy'),('Bad guy','bad guy'),('Basket Case','basket case'),('beautiful weding','i write sins not tragedies'),('Bein\'s believin\'','what a feeling'),('big surprise','just a girl'),('borracho y loco','lamento boliviano'),('bury me','the kill'),('Can\'t shake it','night crawling'),('Carve your name','every you every me'),('cheater','i write sins not tragedies'),('cherry lips','cherry lips'),('Contento de verdad','salta'),('corazón idiota','lamento boliviano'),('Cuando más te quería','tu me dejaste de querer'),('Cut me off','somebody that i used to know'),('Dark side of the moon','wolves'),('Déjame decirte','hawai'),('delicate boy','cherry lips'),('Dime si tú','enamorado de la moda juvenil'),('El viaje','que se joda todo lo demas'),('Empezamos mal','la fuerza del destino'),('en vela','en vela'),('Enamorado de la moda juvenil','enamorado de la moda juvenil'),('Enamorado de ti','enamorado de la moda juvenil'),('entre los dos','historias de amor'),('escuchar solo tu voz','a contracorriente'),('Every you every me','every you every me'),('Everytime you look me','(you drive me) crazy'),('fear','fear'),('finish with you','the kill'),('Flashdance','what a feeling'),('Forever','forever'),('Free','i want to break free'),('from the stars','quit playing games (with my heart)'),('funeral of hearts','join me in death'),('girl','just a girl'),('go baby','cherry lips'),('God knows','i want to break free'),('gods & monsters','gods & monsters'),('guilty','to the moon and back'),('Hablando de mí','mujer bruja'),('Hawai','hawai'),('hay que ser','torero'),('here with me','here with me'),('historias de amor','historias de amor'),('Hoy me he levantado','salta'),('hysterical realm','cherry lips'),('i can\'t breathe','here with me'),('I kill any pain','starboy'),('i wanna be','teen idle'),('I want to break free','i want to break free'),('i won\'t go','here with me'),('i would fly','to the moon and back'),('I would hate you \'til forever','forever'),('i write sins not tragedies','i write sins not tragedies'),('I\'ve fallen in love','i want to break free'),('if you\'ll be my baby','to the moon and back'),('imposible de borrar','historias de amor'),('In love with you','a little respect'),('join me in death','join me in death'),('just a girl','just a girl'),('just like a pill','just like a pill'),('La chica de ayer','la chica de ayer'),('La fuerza del destino','la fuerza del destino'),('lamento boliviano','lamento boliviano'),('land of evil','gods & monsters'),('Las calles mojadas','la chica de ayer'),('Livin\' on a prayer','livin on a prayer'),('look in my eyes','the kill'),('Look what you\'ve done','starboy'),('Malquerer','tu me dejaste de querer'),('Me asomo a la ventana','la chica de ayer'),('Melodramatic fools','basket case'),('Merichane','merichane'),('Miedo','mujer bruja'),('Moda juvenil','enamorado de la moda juvenil'),('morning smiles','fear'),('Motherfucking','starboy'),('Mujer bruja','mujer bruja'),('my life','just a girl'),('Night crawling','night crawling'),('No doubt about it','basket case'),('no sé mentir','historias de amor'),('Nos vimos tres o cuatro veces','la fuerza del destino'),('nothing to give','fear'),('Once upon a time not so long ago','livin on a prayer'),('One more time','(you drive me) crazy'),('Pa\' que yo vea','hawai'),('panic at the disco','i write sins not tragedies'),('pasa las horas','en vela'),('promises','fear'),('Puede que no te haga falta na\'','hawai'),('Que se joda todo lo demás','que se joda todo lo demas'),('quien te ha robao\' la primavera','en vela'),('quit playing games (with my heart)','quit playing games (with my heart)'),('Quizás','que se joda todo lo demas'),('Respect','a little respect'),('resting here','here with me'),('run','just like a pill'),('salome','torero'),('Salta','salta'),('Salta conmigo','salta'),('Savor the pain','forever'),('Savor the taste','forever'),('Se te fueron las ganas','tu me dejaste de querer'),('Shaking','you shook me all night long'),('Shook me','you shook me all night long'),('Si el invierno viene frío','la fuerza del destino'),('Sin saber salir','merichane'),('Sitio muy raro','que se joda todo lo demas'),('Sky falling','night crawling'),('sober','just like a pill'),('Somebody','somebody that i used to know'),('Somebody that i used to know','somebody that i used to know'),('Sometimes','night crawling'),('Starboy','starboy'),('Sucker love','every you every me'),('Take my hand','livin on a prayer'),('Take your passion','what a feeling'),('te busco','a contracorriente'),('teen idle','teen idle'),('That you gimme no','a little respect'),('the kill','the kill'),('Through the jungle','wolves'),('To get to you','wolves'),('to the moon and back','to the moon and back'),('together in death','join me in death'),('tonight 4 love','join me in death'),('torero','torero'),('tú me dejaste de querer','tu me dejaste de querer'),('un día cualquiera','la chica de ayer'),('volver a sentir','a contracorriente'),('wasted years','teen idle'),('wasted youth','teen idle'),('we\'re half way there','livin on a prayer'),('what a feelin\'','what a feeling'),('wolves','wolves'),('y yo estoy aquí','lamento boliviano'),('yo','merichane'),('yo estaba ahí','merichane'),('yo te aviso','mujer bruja'),('you and me','every you every me'),('you got that everything','gods & monsters'),('you makin\' me ill','just like a pill'),('you shook me all night long','you shook me all night long'),('you tear us apart','quit playing games (with my heart)');
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
  `fecha` date NOT NULL,
  `nombre_jugador` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`fecha`),
  KEY `nombre_jugador` (`nombre_jugador`),
  CONSTRAINT `partida_ibfk_1` FOREIGN KEY (`nombre_jugador`) REFERENCES `jugador` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partida`
--

LOCK TABLES `partida` WRITE;
/*!40000 ALTER TABLE `partida` DISABLE KEYS */;
INSERT INTO `partida` VALUES ('EXPERTO',1000,'2021-03-24','ANTONIO'),('EXPERTO',800,'2021-04-15','NOEMI'),('FACIL',200,'2021-05-15','ALEJANDRO'),('EXPERTO',600,'2021-05-20','MAURO'),('FACIL',500,'2021-05-22','YOLANDA');
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

-- Dump completed on 2021-05-24 19:06:17
