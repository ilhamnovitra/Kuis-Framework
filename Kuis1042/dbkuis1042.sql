-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 12, 2017 at 08:53 AM
-- Server version: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbkuis1042`
--

-- --------------------------------------------------------

--
-- Table structure for table `cv_1042`
--

CREATE TABLE `cv_1042` (
  `id` bigint(20) NOT NULL,
  `pengalaman` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cv_1042`
--

INSERT INTO `cv_1042` (`id`, `pengalaman`, `name`) VALUES
(1, 'Fresh Graduate', 'M. Ilham Novitra'),
(2, 'Fresh Graduate', 'Qintan Thiyana');

-- --------------------------------------------------------

--
-- Table structure for table `nilai_1042`
--

CREATE TABLE `nilai_1042` (
  `id` bigint(20) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `nilai_hardskill` varchar(255) DEFAULT NULL,
  `nilai_softskill` varchar(255) NOT NULL,
  `nilai_team_work` varchar(255) NOT NULL,
  `cv1042_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nilai_1042`
--

INSERT INTO `nilai_1042` (`id`, `nama`, `nilai_hardskill`, `nilai_softskill`, `nilai_team_work`, `cv1042_id`) VALUES
(1, 'M. Ilham Novitra', '80', '80', '80', 1),
(2, 'Qintan Thiyana', '80', '80', '80', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1042`
--
ALTER TABLE `cv_1042`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_s58u8a40rfpwxu0xbtby77iay` (`name`);

--
-- Indexes for table `nilai_1042`
--
ALTER TABLE `nilai_1042`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKiujt1elul9of8pgkk1usip20q` (`cv1042_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1042`
--
ALTER TABLE `cv_1042`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `nilai_1042`
--
ALTER TABLE `nilai_1042`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `nilai_1042`
--
ALTER TABLE `nilai_1042`
  ADD CONSTRAINT `FKiujt1elul9of8pgkk1usip20q` FOREIGN KEY (`cv1042_id`) REFERENCES `cv_1042` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
