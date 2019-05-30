-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-05-2019 a las 21:12:54
-- Versión del servidor: 10.1.39-MariaDB
-- Versión de PHP: 7.3.5

CREATE DATABASE ciber;
use ciber;

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
(1, 'adm', 'Ambos', '123'),
(2, 'master', 'Ambos', '1'),
(3, 'root', 'Matutino', 'hola');

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
(4, 'Cliente', 'C', 16);

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
(1, 'Escritorio', 'Espera', 'PC1'),
(2, 'Escritorio', 'Espera', 'PC2'),
(3, 'Escritorio', 'Espera', 'PC3');

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
(8, 'Chocolate', '12');

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
  MODIFY `idRentas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idVentas` int(11) NOT NULL AUTO_INCREMENT;

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
