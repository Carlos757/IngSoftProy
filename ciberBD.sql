-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-06-2019 a las 00:00:02
-- Versión del servidor: 10.1.39-MariaDB
-- Versión de PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ciber`
--
CREATE DATABASE ciber;
USE ciber;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admins`
--

CREATE TABLE `admins` (
  `idAdmins` int(11) NOT NULL,
  `Usuario` varchar(25) NOT NULL,
  `Turno` varchar(15) NOT NULL,
  `Pass` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `admins`
--

INSERT INTO `admins` (`idAdmins`, `Usuario`, `Turno`, `Pass`) VALUES
(1, 'emp', 'Ambos', 'hola'),
(2, 'adm', 'Matutino', '123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idClientes` int(4) NOT NULL,
  `NombreC` varchar(20) NOT NULL,
  `Tipo` varchar(1) NOT NULL,
  `Visitas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idClientes`, `NombreC`, `Tipo`, `Visitas`) VALUES
(4, 'Cliente', 'C', 76);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `idEquipos` int(4) NOT NULL,
  `Tipo` varchar(15) NOT NULL,
  `Estatus` varchar(50) DEFAULT NULL,
  `Nequipo` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`idEquipos`, `Tipo`, `Estatus`, `Nequipo`) VALUES
(1, 'Escritorio', 'Activa', 'PC1'),
(2, 'Escritorio', 'Espera', 'PC2'),
(3, 'Escritorio', 'Espera', 'PC3'),
(4, 'Escritorio', 'Espera', 'pc4');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `NombreP` varchar(25) NOT NULL,
  `Precio` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `NombreP`, `Precio`) VALUES
(1, 'Refresco 600ml', '15'),
(2, 'Tostitos', '10'),
(3, 'Chettos', '10'),
(4, 'Ruffles', '10'),
(5, 'Jugo 600ml', '13'),
(6, 'Té', '13'),
(7, 'Chicle', '2'),
(8, 'Chocolate', '12'),
(9, 'Color', '4'),
(10, 'Blanco y Negro', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rentas`
--

CREATE TABLE `rentas` (
  `idRentas` int(11) NOT NULL,
  `HoraInicio` time DEFAULT NULL,
  `HoraFin` time DEFAULT NULL,
  `idEquipos` int(4) NOT NULL,
  `idClientes` int(4) NOT NULL,
  `idAdmins` int(11) NOT NULL,
  `Fecha_R` date NOT NULL,
  `Monto a pagar` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `rentas`
--

INSERT INTO `rentas` (`idRentas`, `HoraInicio`, `HoraFin`, `idEquipos`, `idClientes`, `idAdmins`, `Fecha_R`, `Monto a pagar`) VALUES
(1, '07:00:00', '08:00:00', 1, 4, 1, '2019-05-01', '10'),
(2, '12:00:00', '13:00:00', 2, 4, 2, '2019-04-25', '10'),
(3, '13:00:00', '16:00:00', 3, 4, 2, '2019-04-27', '30'),
(4, '13:00:00', '16:00:00', 2, 4, 2, '2019-02-15', '30'),
(5, '13:00:00', '16:00:00', 3, 4, 2, '2019-01-15', '30'),
(6, '10:52:25', '11:52:30', 1, 4, 2, '2019-06-03', '10'),
(7, '10:53:53', '12:53:54', 1, 4, 2, '2019-05-29', '20'),
(8, '11:08:36', '12:08:37', 1, 4, 2, '2019-06-03', '10'),
(9, '00:00:00', '01:00:00', 1, 4, 2, '2019-06-03', '10'),
(10, '00:00:00', '01:00:00', 2, 4, 2, '2019-06-03', '15'),
(11, '00:00:00', '01:00:00', 1, 4, 2, '2019-06-03', '10'),
(12, '10:08:46', '11:30:49', 1, 4, 2, '2019-06-04', '15'),
(13, '11:40:48', '12:40:49', 1, 4, 2, '2019-06-04', '10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `idVentas` int(11) NOT NULL,
  `idClientes` int(4) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `idAdmins` int(11) NOT NULL,
  `Fecha_V` date NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Precio_final` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`idVentas`, `idClientes`, `idProducto`, `idAdmins`, `Fecha_V`, `Cantidad`, `Precio_final`) VALUES
(1, 4, 6, 1, '2019-03-24', 1, '13'),
(2, 4, 3, 1, '2019-04-24', 1, '10'),
(3, 4, 7, 1, '2019-05-24', 2, '4'),
(4, 4, 4, 2, '2019-05-24', 3, '30'),
(5, 4, 2, 2, '2019-05-24', 1, '10'),
(6, 4, 1, 2, '2019-05-25', 1, '15'),
(7, 4, 3, 2, '2019-05-26', 1, '10'),
(8, 4, 5, 2, '2019-05-26', 1, '13'),
(9, 4, 3, 2, '2019-05-26', 1, '10'),
(10, 4, 8, 2, '2019-05-26', 1, '12'),
(11, 4, 1, 2, '2019-05-27', 1, '15'),
(12, 4, 3, 2, '2019-05-28', 1, '10'),
(13, 4, 5, 2, '2019-05-29', 1, '13'),
(14, 4, 6, 2, '2019-05-30', 1, '13'),
(15, 4, 6, 2, '2019-05-31', 1, '13'),
(16, 4, 2, 2, '2019-06-03', 1, '10'),
(17, 4, 2, 2, '2019-06-03', 1, '10'),
(18, 4, 1, 2, '2019-06-03', 1, '15'),
(19, 4, 1, 2, '2019-06-03', 1, '15'),
(20, 4, 1, 2, '2019-06-03', 1, '15'),
(21, 4, 9, 2, '2019-06-03', 1, '4'),
(22, 4, 10, 2, '2019-06-03', 3, '3'),
(23, 4, 1, 2, '2019-06-03', 1, '15'),
(24, 4, 3, 2, '2019-06-03', 1, '10'),
(25, 4, 9, 2, '2019-06-03', 2, '8'),
(26, 4, 10, 2, '2019-06-03', 1, '1'),
(27, 4, 3, 2, '2019-06-04', 1, '10'),
(28, 4, 1, 2, '2019-06-04', 1, '15'),
(29, 4, 9, 2, '2019-06-04', 3, '12'),
(30, 4, 10, 2, '2019-06-04', 2, '2'),
(31, 4, 3, 2, '2019-06-04', 3, '30'),
(32, 4, 5, 2, '2019-06-04', 1, '13');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`idAdmins`),
  ADD UNIQUE KEY `Contraseña_UNIQUE` (`Pass`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idClientes`);

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`idEquipos`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `rentas`
--
ALTER TABLE `rentas`
  ADD PRIMARY KEY (`idRentas`,`idEquipos`,`idClientes`,`idAdmins`),
  ADD KEY `fk_Rentas_Equipos_idx` (`idEquipos`),
  ADD KEY `fk_Rentas_Clientes1_idx` (`idClientes`),
  ADD KEY `fk_Rentas_Administrador1_idx` (`idAdmins`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`idVentas`,`idClientes`,`idProducto`,`idAdmins`),
  ADD KEY `fk_Ventas_Clientes1_idx` (`idClientes`),
  ADD KEY `fk_Ventas_Producto1_idx` (`idProducto`),
  ADD KEY `fk_Ventas_Administrador1_idx` (`idAdmins`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idClientes` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `rentas`
--
ALTER TABLE `rentas`
  MODIFY `idRentas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idVentas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `rentas`
--
ALTER TABLE `rentas`
  ADD CONSTRAINT `fk_Rentas_Administrador1` FOREIGN KEY (`idAdmins`) REFERENCES `admins` (`idAdmins`),
  ADD CONSTRAINT `fk_Rentas_Clientes1` FOREIGN KEY (`idClientes`) REFERENCES `clientes` (`idClientes`),
  ADD CONSTRAINT `fk_Rentas_Equipos` FOREIGN KEY (`idEquipos`) REFERENCES `equipos` (`idEquipos`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `fk_Ventas_Administrador1` FOREIGN KEY (`idAdmins`) REFERENCES `admins` (`idAdmins`),
  ADD CONSTRAINT `fk_Ventas_Clientes1` FOREIGN KEY (`idClientes`) REFERENCES `clientes` (`idClientes`),
  ADD CONSTRAINT `fk_Ventas_Producto1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
