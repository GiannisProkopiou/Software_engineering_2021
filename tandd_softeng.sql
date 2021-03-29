-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 29 Μαρ 2021 στις 13:56:48
-- Έκδοση διακομιστή: 10.4.16-MariaDB
-- Έκδοση PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `tandd_softeng`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `company`
--

CREATE TABLE `company` (
  `email` varchar(255) NOT NULL,
  `subscription` enum('basic','premium') NOT NULL,
  `country` varchar(255) NOT NULL,
  `area` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `street_number` int(9) NOT NULL,
  `street` varchar(255) NOT NULL,
  `postal_code` int(9) NOT NULL,
  `company_name` varchar(255) NOT NULL,
  `afm` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `company_archive`
--

CREATE TABLE `company_archive` (
  `employee_email` varchar(255) NOT NULL,
  `comany_email` varchar(255) NOT NULL,
  `shipment_number` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `company_phone`
--

CREATE TABLE `company_phone` (
  `company_email` varchar(255) NOT NULL,
  `company_phone` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `customer`
--

CREATE TABLE `customer` (
  `email` varchar(255) NOT NULL,
  `subscription` enum('basic','premium') NOT NULL,
  `country` varchar(255) NOT NULL,
  `area` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `street_number` int(9) NOT NULL,
  `street` varchar(255) NOT NULL,
  `postal_code` int(9) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `order_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `customer_archive`
--

CREATE TABLE `customer_archive` (
  `customer_email` varchar(255) NOT NULL,
  `shipment_number` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `delivers`
--

CREATE TABLE `delivers` (
  `delivery_man_afm` int(9) NOT NULL,
  `shipment_number` int(9) NOT NULL,
  `state` enum('in_transit','delivered') NOT NULL,
  `assignemnt_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `delivery_man`
--

CREATE TABLE `delivery_man` (
  `afm` int(9) NOT NULL,
  `delivery_number` int(9) DEFAULT NULL,
  `surname` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `state` enum('available','not_available','in_duty') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `delivery_man_archive`
--

CREATE TABLE `delivery_man_archive` (
  `delivery_man_afm` int(9) NOT NULL,
  `shipment_number` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `delivery_man_phone`
--

CREATE TABLE `delivery_man_phone` (
  `phone_number` varchar(255) NOT NULL,
  `delivery_man_afm` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `employee`
--

CREATE TABLE `employee` (
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `working_company` varchar(255) NOT NULL,
  `afm` int(9) NOT NULL,
  `property` enum('admin','user') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `package`
--

CREATE TABLE `package` (
  `shipment_number` int(9) NOT NULL,
  `estimated_delivery_date` date NOT NULL,
  `take_away_from_store` tinyint(1) NOT NULL DEFAULT 0,
  `departure_date` date NOT NULL,
  `weight` float DEFAULT NULL,
  `sending_company` varchar(255) NOT NULL,
  `dimensions` varchar(255) DEFAULT NULL,
  `delivery_attempts` int(9) NOT NULL,
  `state` enum('on_hold','in_transit','delivered') NOT NULL,
  `customer_email` varchar(255) DEFAULT NULL,
  `date_of_register` date NOT NULL,
  `employee_email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `serves`
--

CREATE TABLE `serves` (
  `customer_email` varchar(255) NOT NULL,
  `delivery_man_afm` int(9) NOT NULL,
  `state` enum('served','accepted','in_service','declined') NOT NULL,
  `stars` float DEFAULT NULL,
  `comments` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `vehicle`
--

CREATE TABLE `vehicle` (
  `ID` int(9) NOT NULL,
  `delivery_man_afm` int(9) NOT NULL,
  `vehicle` enum('motorbike','bicycle','car','on_foot') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`email`);

--
-- Ευρετήρια για πίνακα `company_archive`
--
ALTER TABLE `company_archive`
  ADD PRIMARY KEY (`employee_email`,`shipment_number`),
  ADD KEY `company_archive_email` (`comany_email`),
  ADD KEY `company_archive_shipment_number` (`shipment_number`);

--
-- Ευρετήρια για πίνακα `company_phone`
--
ALTER TABLE `company_phone`
  ADD PRIMARY KEY (`company_email`,`company_phone`);

--
-- Ευρετήρια για πίνακα `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`email`);

--
-- Ευρετήρια για πίνακα `customer_archive`
--
ALTER TABLE `customer_archive`
  ADD PRIMARY KEY (`customer_email`,`shipment_number`),
  ADD KEY `customer_archive_shipment_numer` (`shipment_number`);

--
-- Ευρετήρια για πίνακα `delivers`
--
ALTER TABLE `delivers`
  ADD PRIMARY KEY (`delivery_man_afm`,`shipment_number`),
  ADD KEY `delivers_shipment_number` (`shipment_number`);

--
-- Ευρετήρια για πίνακα `delivery_man`
--
ALTER TABLE `delivery_man`
  ADD PRIMARY KEY (`afm`);

--
-- Ευρετήρια για πίνακα `delivery_man_archive`
--
ALTER TABLE `delivery_man_archive`
  ADD PRIMARY KEY (`delivery_man_afm`,`shipment_number`),
  ADD KEY `delivery_man_archive_shipment_number` (`shipment_number`);

--
-- Ευρετήρια για πίνακα `delivery_man_phone`
--
ALTER TABLE `delivery_man_phone`
  ADD PRIMARY KEY (`phone_number`,`delivery_man_afm`),
  ADD KEY `delivery_man_phone_afm` (`delivery_man_afm`);

--
-- Ευρετήρια για πίνακα `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`email`),
  ADD KEY `employee_working_company` (`working_company`);

--
-- Ευρετήρια για πίνακα `package`
--
ALTER TABLE `package`
  ADD PRIMARY KEY (`shipment_number`),
  ADD KEY `package_customer_email` (`customer_email`),
  ADD KEY `package_employee_email` (`employee_email`);

--
-- Ευρετήρια για πίνακα `serves`
--
ALTER TABLE `serves`
  ADD PRIMARY KEY (`customer_email`,`delivery_man_afm`),
  ADD KEY `serves_afm` (`delivery_man_afm`);

--
-- Ευρετήρια για πίνακα `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`ID`,`delivery_man_afm`),
  ADD KEY `vehicle_delivery_man_afm` (`delivery_man_afm`);

--
-- AUTO_INCREMENT για άχρηστους πίνακες
--

--
-- AUTO_INCREMENT για πίνακα `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `ID` int(9) NOT NULL AUTO_INCREMENT;

--
-- Περιορισμοί για άχρηστους πίνακες
--

--
-- Περιορισμοί για πίνακα `company_archive`
--
ALTER TABLE `company_archive`
  ADD CONSTRAINT `company_archive_email` FOREIGN KEY (`comany_email`) REFERENCES `company` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `company_archive_employee_email` FOREIGN KEY (`employee_email`) REFERENCES `employee` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `company_archive_shipment_number` FOREIGN KEY (`shipment_number`) REFERENCES `package` (`shipment_number`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `company_phone`
--
ALTER TABLE `company_phone`
  ADD CONSTRAINT `company_phone_email` FOREIGN KEY (`company_email`) REFERENCES `company` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `customer_archive`
--
ALTER TABLE `customer_archive`
  ADD CONSTRAINT `customer_archive_email` FOREIGN KEY (`customer_email`) REFERENCES `customer` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `customer_archive_shipment_numer` FOREIGN KEY (`shipment_number`) REFERENCES `package` (`shipment_number`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `delivers`
--
ALTER TABLE `delivers`
  ADD CONSTRAINT `delivers_delivery_man_afm` FOREIGN KEY (`delivery_man_afm`) REFERENCES `delivery_man` (`afm`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `delivers_shipment_number` FOREIGN KEY (`shipment_number`) REFERENCES `package` (`shipment_number`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `delivery_man_archive`
--
ALTER TABLE `delivery_man_archive`
  ADD CONSTRAINT `delivery_man_archive_afm` FOREIGN KEY (`delivery_man_afm`) REFERENCES `delivery_man` (`afm`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `delivery_man_archive_shipment_number` FOREIGN KEY (`shipment_number`) REFERENCES `package` (`shipment_number`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `delivery_man_phone`
--
ALTER TABLE `delivery_man_phone`
  ADD CONSTRAINT `delivery_man_phone_afm` FOREIGN KEY (`delivery_man_afm`) REFERENCES `delivery_man` (`afm`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_working_company` FOREIGN KEY (`working_company`) REFERENCES `company` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `package`
--
ALTER TABLE `package`
  ADD CONSTRAINT `package_customer_email` FOREIGN KEY (`customer_email`) REFERENCES `customer` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `package_employee_email` FOREIGN KEY (`employee_email`) REFERENCES `employee` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `serves`
--
ALTER TABLE `serves`
  ADD CONSTRAINT `serves_afm` FOREIGN KEY (`delivery_man_afm`) REFERENCES `delivery_man` (`afm`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `serves_email` FOREIGN KEY (`customer_email`) REFERENCES `customer` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Περιορισμοί για πίνακα `vehicle`
--
ALTER TABLE `vehicle`
  ADD CONSTRAINT `vehicle_delivery_man_afm` FOREIGN KEY (`delivery_man_afm`) REFERENCES `delivery_man` (`afm`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
