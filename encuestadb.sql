-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-11-2021 a las 05:14:42
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `encuestadb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encuesta`
--

CREATE TABLE `encuesta` (
  `id_encuesta` int(11) NOT NULL,
  `fecha` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `encuesta`
--

INSERT INTO `encuesta` (`id_encuesta`, `fecha`) VALUES
(1, '2021-11-08 21:41:41'),
(2, '2021-11-08 21:41:47'),
(3, '2021-11-08 21:41:49'),
(4, '2021-11-08 21:41:51'),
(5, '2021-11-08 21:42:51'),
(6, '2021-11-08 21:43:01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encuesta_pregunta`
--

CREATE TABLE `encuesta_pregunta` (
  `encuesta_id` int(11) NOT NULL,
  `pregunta_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `encuesta_pregunta`
--

INSERT INTO `encuesta_pregunta` (`encuesta_id`, `pregunta_id`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(3, 1),
(3, 2),
(3, 3),
(3, 4),
(3, 5),
(4, 1),
(4, 2),
(4, 3),
(4, 4),
(4, 5),
(5, 1),
(5, 2),
(5, 3),
(5, 4),
(5, 5),
(6, 1),
(6, 2),
(6, 3),
(6, 4),
(6, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id_pregunta` int(11) NOT NULL,
  `pregunta` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id_pregunta`, `pregunta`) VALUES
(1, '¿Cual menú te gustaría que estuviese?'),
(2, '¿Qué le gustaría que mejoráramos?'),
(3, '¿Cómo le pareció el servició prestado por nuestros colaboradores?'),
(4, '¿Cuál es su genero?'),
(5, '¿De las siguientes comidas, cuales son tus favoritas?');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta_multiple`
--

CREATE TABLE `respuesta_multiple` (
  `id` int(11) NOT NULL,
  `burrito` bit(1) DEFAULT NULL,
  `hamburguesa` bit(1) DEFAULT NULL,
  `pizza_pepperoni` bit(1) DEFAULT NULL,
  `pizza_pollo` bit(1) DEFAULT NULL,
  `numero_encuesta` int(11) DEFAULT NULL,
  `numero_pregunta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `respuesta_multiple`
--

INSERT INTO `respuesta_multiple` (`id`, `burrito`, `hamburguesa`, `pizza_pepperoni`, `pizza_pollo`, `numero_encuesta`, `numero_pregunta`) VALUES
(1, b'1', b'0', b'1', b'0', 1, 5),
(2, b'1', b'0', b'1', b'0', 2, 5),
(3, b'1', b'0', b'1', b'0', 3, 5),
(4, b'1', b'0', b'1', b'0', 4, 5),
(5, b'1', b'0', b'0', b'0', 5, 5),
(6, b'0', b'1', b'0', b'0', 6, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta_unica`
--

CREATE TABLE `respuesta_unica` (
  `id_resp_uni` int(11) NOT NULL,
  `respuesta` varchar(255) DEFAULT NULL,
  `numero_encuesta` int(11) DEFAULT NULL,
  `numero_pregunta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `respuesta_unica`
--

INSERT INTO `respuesta_unica` (`id_resp_uni`, `respuesta`, `numero_encuesta`, `numero_pregunta`) VALUES
(1, 'Respuesta pregunta1', 1, 1),
(2, 'Respuesta pregunta2', 1, 2),
(3, 'Respuesta pregunta3', 1, 3),
(4, 'Respuesta pregunta4', 1, 4),
(5, 'Respuesta pregunta1', 2, 1),
(6, 'Respuesta pregunta2', 2, 2),
(7, 'Respuesta pregunta3', 2, 3),
(8, 'Respuesta pregunta4', 2, 4),
(9, 'Respuesta pregunta1', 3, 1),
(10, 'Respuesta pregunta2', 3, 2),
(11, 'Respuesta pregunta3', 3, 3),
(12, 'Respuesta pregunta4', 3, 4),
(13, 'Respuesta pregunta1', 4, 1),
(14, 'Respuesta pregunta2', 4, 2),
(15, 'Respuesta pregunta3', 4, 3),
(16, 'Respuesta pregunta4', 4, 4),
(17, 'Respuesta pregunta1', 5, 1),
(18, 'Respuesta pregunta2', 5, 2),
(19, 'Respuesta pregunta3', 5, 3),
(20, 'Respuesta pregunta4', 5, 4),
(21, 'Respuesta pregunta1', 6, 1),
(22, 'Respuesta pregunta2', 6, 2),
(23, 'Respuesta pregunta3', 6, 3),
(24, 'Respuesta pregunta4', 6, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `encuesta`
--
ALTER TABLE `encuesta`
  ADD PRIMARY KEY (`id_encuesta`);

--
-- Indices de la tabla `encuesta_pregunta`
--
ALTER TABLE `encuesta_pregunta`
  ADD PRIMARY KEY (`encuesta_id`,`pregunta_id`),
  ADD KEY `FKl70qqwofaa0xx89po71q4ueqg` (`pregunta_id`);

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id_pregunta`);

--
-- Indices de la tabla `respuesta_multiple`
--
ALTER TABLE `respuesta_multiple`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9frxv7aquro7o206px0weh0js` (`numero_encuesta`),
  ADD KEY `FK92e9w0vqwturqkd4i65nmhijv` (`numero_pregunta`);

--
-- Indices de la tabla `respuesta_unica`
--
ALTER TABLE `respuesta_unica`
  ADD PRIMARY KEY (`id_resp_uni`),
  ADD KEY `FKcbwnlf4dlfkw55qgewcakkflv` (`numero_encuesta`),
  ADD KEY `FKmc5l5cuu40b9ljvyye9y6se08` (`numero_pregunta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `encuesta`
--
ALTER TABLE `encuesta`
  MODIFY `id_encuesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id_pregunta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `respuesta_multiple`
--
ALTER TABLE `respuesta_multiple`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `respuesta_unica`
--
ALTER TABLE `respuesta_unica`
  MODIFY `id_resp_uni` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `encuesta_pregunta`
--
ALTER TABLE `encuesta_pregunta`
  ADD CONSTRAINT `FKl70qqwofaa0xx89po71q4ueqg` FOREIGN KEY (`pregunta_id`) REFERENCES `pregunta` (`id_pregunta`),
  ADD CONSTRAINT `FKqq3314wnol9s7fpv78cqjhtg9` FOREIGN KEY (`encuesta_id`) REFERENCES `encuesta` (`id_encuesta`);

--
-- Filtros para la tabla `respuesta_multiple`
--
ALTER TABLE `respuesta_multiple`
  ADD CONSTRAINT `FK92e9w0vqwturqkd4i65nmhijv` FOREIGN KEY (`numero_pregunta`) REFERENCES `pregunta` (`id_pregunta`),
  ADD CONSTRAINT `FK9frxv7aquro7o206px0weh0js` FOREIGN KEY (`numero_encuesta`) REFERENCES `encuesta` (`id_encuesta`);

--
-- Filtros para la tabla `respuesta_unica`
--
ALTER TABLE `respuesta_unica`
  ADD CONSTRAINT `FKcbwnlf4dlfkw55qgewcakkflv` FOREIGN KEY (`numero_encuesta`) REFERENCES `encuesta` (`id_encuesta`),
  ADD CONSTRAINT `FKmc5l5cuu40b9ljvyye9y6se08` FOREIGN KEY (`numero_pregunta`) REFERENCES `pregunta` (`id_pregunta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
