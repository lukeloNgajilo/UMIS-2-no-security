-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 06, 2019 at 10:28 AM
-- Server version: 10.1.39-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bana`
--

-- --------------------------------------------------------

--
-- Table structure for table `campus`
--

CREATE TABLE `campus` (
  `id` int(20) NOT NULL,
  `campus_name` varchar(20) NOT NULL,
  `shortname` varchar(20) NOT NULL,
  `contacts` varchar(20) NOT NULL,
  `region` varchar(20) NOT NULL,
  `location` varchar(20) NOT NULL,
  `university_id` int(20) NOT NULL,
  `website` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `campus`
--

INSERT INTO `campus` (`id`, `campus_name`, `shortname`, `contacts`, `region`, `location`, `university_id`, `website`) VALUES
(3, 'MAIN', 'DAR', '0754315910', 'MBEYA', 'MBEYA', 3, 'www.dsdsdds.com'),
(4, 'MBEYA', 'sadsadasd', '0788872074', 'MBEYA', 'MBEYA', 5, 'www.dss.com');

-- --------------------------------------------------------

--
-- Table structure for table `deparment`
--

CREATE TABLE `deparment` (
  `id` int(20) NOT NULL,
  `deparment_name` varchar(255) NOT NULL,
  `head_ofdeparment` varchar(225) DEFAULT NULL,
  `code` varchar(225) NOT NULL,
  `faculty_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deparment`
--

INSERT INTO `deparment` (`id`, `deparment_name`, `head_ofdeparment`, `code`, `faculty_id`) VALUES
(3, 'hbbb', 'jjjjj', 'DAR ES SALAAAM', 7),
(4, 'COMPUTER SCIENCE AND ENGINEER', 'MR JOSHUA', 'WES', 7);

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `id` int(20) NOT NULL,
  `faculty_code` varchar(20) NOT NULL,
  `campus_id` int(20) NOT NULL,
  `facultyname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`id`, `faculty_code`, `campus_id`, `facultyname`) VALUES
(6, 'ASDASD', 3, 'jnnnn'),
(7, 'WES', 4, 'ARTS ');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(21),
(21),
(21),
(21);

-- --------------------------------------------------------

--
-- Table structure for table `organization`
--

CREATE TABLE `organization` (
  `id` int(20) NOT NULL,
  `organization_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `organization`
--

INSERT INTO `organization` (`id`, `organization_name`) VALUES
(1, 'UNIVERSITY'),
(2, 'COLLEGE'),
(3, 'INSTITUTIONS');

-- --------------------------------------------------------

--
-- Table structure for table `programme`
--

CREATE TABLE `programme` (
  `id` int(20) NOT NULL,
  `programme_type` varchar(225) NOT NULL,
  `programme_name` varchar(225) NOT NULL,
  `programme_shortname` varchar(225) NOT NULL,
  `durationof_programme` varchar(225) NOT NULL,
  `deparment_id` int(20) NOT NULL,
  `location` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `programme`
--

INSERT INTO `programme` (`id`, `programme_type`, `programme_name`, `programme_shortname`, `durationof_programme`, `deparment_id`, `location`) VALUES
(18, '3 YEARS', 'BSC IB COMPUTER SCIENCE', 'BSC IN CS', '4', 3, ''),
(20, 'AQ', 'BSC IN MABAHARIA', 'SSSA', 'ASAS', 4, 'WES');

-- --------------------------------------------------------

--
-- Table structure for table `university`
--

CREATE TABLE `university` (
  `id` int(20) NOT NULL,
  `universityname` varchar(255) NOT NULL,
  `number_ofcampus` varchar(225) NOT NULL,
  `campus` varchar(225) NOT NULL,
  `contacts` varchar(225) NOT NULL,
  `postal_address` varchar(225) NOT NULL,
  `website` varchar(225) NOT NULL,
  `location` varchar(225) NOT NULL,
  `organization_id` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `university`
--

INSERT INTO `university` (`id`, `universityname`, `number_ofcampus`, `campus`, `contacts`, `postal_address`, `website`, `location`, `organization_id`) VALUES
(3, 'UNIVERSITY OF DAR ES SALAAM', '22', 'MBEYA', '6545456', 'DAR ES SALAAM', 'WWW.udsm.com', 'MBEYA', 2),
(4, 'ARDHI UNIVERSITY', '12', 'DUCE', '21', '2112', 'www', 'MBEYA', 3),
(5, 'MABAHARI UNIVERSITY', '20', 'DAR ES SALAAM', '0754215369', '690 DAR  ES SALAAM', 'wwww.mabaharia.com', 'KINGAMBONI', 2),
(6, 'KAMPALA UNIVERSITY', '34', 'TANZANIA', '0754885545', '6 DAR ES SALAAM', 'www.kampala.com', 'DAR ES SALAAM', 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(20) NOT NULL,
  `name` varchar(225) NOT NULL,
  `email` varchar(225) NOT NULL,
  `telephone` varchar(225) NOT NULL,
  `password` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `telephone`, `password`) VALUES
(18, 'JOSHUA', 'joshua@gmail.com', '564564654', '2131'),
(19, 'lukelo', 'ngajilol@gmail.com', '0788872074', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `campus`
--
ALTER TABLE `campus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `deparment`
--
ALTER TABLE `deparment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `deparment_ibfk_1` (`faculty_id`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`id`),
  ADD KEY `faculty_ibfk_1` (`campus_id`);

--
-- Indexes for table `organization`
--
ALTER TABLE `organization`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `programme`
--
ALTER TABLE `programme`
  ADD PRIMARY KEY (`id`),
  ADD KEY `programme_ibfk_1` (`deparment_id`);

--
-- Indexes for table `university`
--
ALTER TABLE `university`
  ADD PRIMARY KEY (`id`),
  ADD KEY `university_ibfk_1` (`organization_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `campus`
--
ALTER TABLE `campus`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `deparment`
--
ALTER TABLE `deparment`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `faculty`
--
ALTER TABLE `faculty`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `organization`
--
ALTER TABLE `organization`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `programme`
--
ALTER TABLE `programme`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `university`
--
ALTER TABLE `university`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `campus`
--
ALTER TABLE `campus`
  ADD CONSTRAINT `campus_ibfk_1` FOREIGN KEY (`id`) REFERENCES `university` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `deparment`
--
ALTER TABLE `deparment`
  ADD CONSTRAINT `deparment_ibfk_1` FOREIGN KEY (`faculty_id`) REFERENCES `faculty` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `faculty`
--
ALTER TABLE `faculty`
  ADD CONSTRAINT `faculty_ibfk_1` FOREIGN KEY (`campus_id`) REFERENCES `campus` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `programme`
--
ALTER TABLE `programme`
  ADD CONSTRAINT `programme_ibfk_1` FOREIGN KEY (`deparment_id`) REFERENCES `deparment` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `university`
--
ALTER TABLE `university`
  ADD CONSTRAINT `university_ibfk_1` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
