-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 21, 2018 at 07:30 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Login`
--

-- --------------------------------------------------------

--
-- Table structure for table `buy`
--

CREATE TABLE IF NOT EXISTS `buy` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `Customer_id` int(10) NOT NULL,
  `Customer_name` varchar(100) NOT NULL,
  `Mobile_id` int(11) NOT NULL,
  `Mobile_name` varchar(11) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Rate` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `buy`
--

INSERT INTO `buy` (`Id`, `Customer_id`, `Customer_name`, `Mobile_id`, `Mobile_name`, `Date`, `Rate`, `Quantity`, `Price`) VALUES
(1, 1, 'jyoti', 1, 'lenevo', '4/1/2017', 200, 3, 15000),
(2, 2, 'swati', 1, 'android', '4/1/2018', 500, 5, 5000),
(3, 2, 'swati', 1, 'android', '4/1/2018', 500, 5, 5000),
(4, 1, 'jyoti', 1, 'android', '2/4/2017', 23333, 3, 23244);

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE IF NOT EXISTS `customers` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(100) NOT NULL,
  `c_address` varchar(100) NOT NULL,
  `mobile_num` bigint(12) NOT NULL,
  `email_id` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `c_name`, `c_address`, `mobile_num`, `email_id`, `date`) VALUES
(1, 'jyoti', 'saravali', 4353634645, 'jyoti@gmail.com', '7/2/2029'),
(2, 'swati', 'palghar', 827645345, 'swati232@gmail.com', '4/5/2013'),
(3, 'vidhya', 'hrrtyurhf', 2343543, 'fdhfghs3', '4/4/2015'),
(4, 'suvarna', 'pune', 7465634654, 'suvbiradar@gmail.com', '4/4/2015'),
(5, 'suvarna', 'pune', 6476563545, 'suvbiradar@gmail.com', '4/4/2015'),
(6, 'tarang', 'palghar', 5657345678, 'tarag@gmail.com', '4/4/2014');

-- --------------------------------------------------------

--
-- Table structure for table `mobile`
--

CREATE TABLE IF NOT EXISTS `mobile` (
  `Mobile_id` int(10) NOT NULL AUTO_INCREMENT,
  `M_name` varchar(50) NOT NULL,
  `M_company` varchar(100) NOT NULL,
  `Model_no` int(50) NOT NULL,
  `M_features` varchar(50) NOT NULL,
  `Rate` int(50) NOT NULL,
  `Quantity` int(50) NOT NULL,
  `Price` int(50) NOT NULL,
  PRIMARY KEY (`Mobile_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `mobile`
--

INSERT INTO `mobile` (`Mobile_id`, `M_name`, `M_company`, `Model_no`, `M_features`, `Rate`, `Quantity`, `Price`) VALUES
(1, 'sahara', 'lenovo', 1, 'camera', 4, 3, 0),
(2, 'MI', 'Xiaomi', 53, 'music', 3, 34, 20000);

-- --------------------------------------------------------

--
-- Table structure for table `table1`
--

CREATE TABLE IF NOT EXISTS `table1` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `mobile` bigint(10) NOT NULL,
  `date` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=233 ;

--
-- Dumping data for table `table1`
--

INSERT INTO `table1` (`id`, `username`, `password`, `mobile`, `date`) VALUES
(1, 'jyoti', 'sdsm', 232323242, '23232323'),
(2, 'suraj', 'sursj', 56564565464, '4/3/2014'),
(223, 'suraj32', 'sursj', 56564565464, '4/3/2014'),
(232, 'jyotiasa', 'sdsmasas', 232323242, '23232323');
