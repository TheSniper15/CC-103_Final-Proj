-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2023 at 03:53 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `final103`
--

-- --------------------------------------------------------

--
-- Table structure for table `jobtype_tbl`
--

CREATE TABLE `jobtype_tbl` (
  `id` int(11) NOT NULL,
  `type` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jobtype_tbl`
--

INSERT INTO `jobtype_tbl` (`id`, `type`) VALUES
(1, 'Web Developer'),
(2, 'Game Dev'),
(3, 'Cybersecurity');

-- --------------------------------------------------------

--
-- Table structure for table `job_tbl`
--

CREATE TABLE `job_tbl` (
  `id` int(11) NOT NULL,
  `jobtype` varchar(1000) NOT NULL,
  `descrpt` varchar(1000) NOT NULL,
  `salary` varchar(1000) NOT NULL,
  `etype` varchar(1000) NOT NULL,
  `email` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `job_tbl`
--

INSERT INTO `job_tbl` (`id`, `jobtype`, `descrpt`, `salary`, `etype`, `email`) VALUES
(1, 'Web Developer', 'Fun', '150,000', 'Full - Time', 'example@gmail.com'),
(2, 'Game Dev', 'Fun', '100k', 'Full - Time', 'email'),
(3, 'Cybersecurity', 'AWla lng', '1,000,000', 'GIG', 'example');

-- --------------------------------------------------------

--
-- Table structure for table `user_acct`
--

CREATE TABLE `user_acct` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_acct`
--

INSERT INTO `user_acct` (`id`, `username`, `password`) VALUES
(1, 'Admin', '123456'),
(2, 'Jeanne', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jobtype_tbl`
--
ALTER TABLE `jobtype_tbl`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `job_tbl`
--
ALTER TABLE `job_tbl`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_acct`
--
ALTER TABLE `user_acct`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jobtype_tbl`
--
ALTER TABLE `jobtype_tbl`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `job_tbl`
--
ALTER TABLE `job_tbl`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user_acct`
--
ALTER TABLE `user_acct`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
