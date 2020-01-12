-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 22, 2017 at 04:10 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` varchar(15) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `p_number` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `pass`, `name`, `p_number`) VALUES
('admin', 'pass', 'ABD', 1738868597);

-- --------------------------------------------------------

--
-- Table structure for table `executive`
--

CREATE TABLE `executive` (
  `id` int(11) NOT NULL,
  `pass` varchar(15) NOT NULL,
  `join_date` date DEFAULT NULL,
  `nation` varchar(15) DEFAULT NULL,
  `nid` bigint(20) NOT NULL,
  `designation` varchar(15) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `p_number` int(11) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `executive`
--

INSERT INTO `executive` (`id`, `pass`, `join_date`, `nation`, `nid`, `designation`, `name`, `p_number`, `dob`, `address`) VALUES
(15103029, 'pass', NULL, NULL, 212, NULL, 'ABD', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `ac_type` varchar(15) DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `nation` varchar(15) DEFAULT NULL,
  `nid` bigint(20) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `p_number` int(11) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `pass`, `ac_type`, `join_date`, `nation`, `nid`, `name`, `p_number`, `dob`, `address`) VALUES
(3029, 'pass', NULL, NULL, NULL, 2222, 'abd', NULL, NULL, NULL),
(100200, 'pass', 'Saving', '2016-10-10', 'Bangladeshi', 1515151524, 'Md. Abdullah', 1738868597, '1995-10-21', 'Bamnartek,Uttara,Dhaka');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `executive`
--
ALTER TABLE `executive`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
