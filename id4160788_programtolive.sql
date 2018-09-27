-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 27, 2018 at 06:12 PM
-- Server version: 10.2.17-MariaDB
-- PHP Version: 7.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id4160788_programtolive`
--

-- --------------------------------------------------------

--
-- Table structure for table `program_list`
--

CREATE TABLE `program_list` (
  `id` varchar(10) NOT NULL,
  `language` varchar(100) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `image` varchar(100) NOT NULL,
  `name` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `program_list`
--

INSERT INTO `program_list` (`id`, `language`, `description`, `image`, `name`) VALUES
('1', 'Programming In C', 'C program examples: These programs illustrate various programming elements, concepts such as using operators, loops, functions, single and double dimensional arrays, performing operations on strings, files, pointers, etc. Browse the codes from simple C programs too complicated ones, the output of every one of them is provided. C programs with executable files which you can download and execute without compiling the source file. All programs are made using C programming language and Code::Blocks, most of these will work under GCC and Dev C++ compiler also. The first program prints \"Hello World\" on your output device.', 'images/c.jpg', 'C'),
('2', 'Programming In CPP', 'C++ is a statically-typed, free-form, (usually) compiled, multi-paradigm, intermediate-level general-purpose middle-level programming language.\r\n      In simple terms, C++ is a sophisticated, efficient and a general-purpose programming language based on C. It was developed by Bjarne Stroustrup in 1979.Many of today’s operating systems, system drivers, browsers and games use C++ as their core language. This makes C++ one of the most popular languages today.Since it is an enhanced/extended version of C programming language, C and C++ are often denoted together as C/C++.', 'images/cpp.jpg', 'CPP'),
('3', 'JAVA', 'Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX. This tutorial gives a complete understanding of Java. This reference will take you through simple and practical approaches while learning Java Programming language.\r\n      The latest release of the Java Standard Edition is Java SE 8. With the advancement of Java and its widespread popularity, multiple configurations were built to suit various types of platforms. For example: J2EE for Enterprise Applications, J2ME for Mobile Applications.', 'images/java.jpg', 'JAVA'),
('4', 'PYTHON', 'Python is a general-purpose language. It has wide range of applications from Web development (like: Django and Bottle), scientific and mathematical computing (Orange, SymPy, NumPy) to desktop graphical user Interfaces (Pygame, Panda3D).\r\n      The syntax of the language is clean and length of the code is relatively short. It\'s fun to work in Python because it allows you to think about the problem rather than focusing on the syntax.\r\n      Python is a computer programming language that lets you work more quickly than other programming languages. This tutorial will help you to become a python developer.', 'images/python.jpg', 'PYTHON'),
('5', 'Computer Graphics', 'Computer graphics are pictures and films created using computers. Usually, the term refers to computer-generated image data created with help of specialized graphical hardware and software. It is a vast and recently developed area of computer science. The phrase was coined in 1960, by computer graphics researchers Verne Hudson and William Fetter of Boeing. It is often abbreviated as CG, though sometimes erroneously referred to as computer-generated imagery (CGI). This tutorial uses Basic CG programs in CPP language.', 'images/cg.png', 'CG');

-- --------------------------------------------------------

--
-- Table structure for table `sourcecode`
--

CREATE TABLE `sourcecode` (
  `p_id` int(100) NOT NULL,
  `p_language` varchar(100) NOT NULL,
  `p_heading` varchar(100) NOT NULL,
  `p_problemstatement` varchar(100) NOT NULL,
  `p_file` varchar(100) NOT NULL,
  `p_output` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sourcecode`
--

INSERT INTO `sourcecode` (`p_id`, `p_language`, `p_heading`, `p_problemstatement`, `p_file`, `p_output`) VALUES
(1, 'C', 'Hello World', 'Write C Program to print Hello World.', 'code/c/hello.c', 'output/c/1.jpg'),
(2, 'CPP', 'Hello World', 'Write CPP Program to Print Hello World.', 'code/cpp/hello.cpp', 'output/cpp/2.jpg'),
(3, 'JAVA', 'Hello World', 'Write Java Program to Print Hello World.', 'code/java/hello.java', 'output/java/3.jpg'),
(4, 'JAVA', 'GCD', 'Write Java Program to Print GCD between two numbers.', 'code/java/GCD.java', 'hgdfgh'),
(5, 'C', 'GCD', 'Write C Program to Print GCD between two numbers.', 'code/c/gcd.c', 'fgdg'),
(6, 'CPP', 'GCD', 'Write CPP Program to Print GCD between two numbers.', 'code/cpp/gcd.cpp', 'eferghh'),
(7, 'C', 'ASCII', 'C Program to Find ASCII Value of a Character', 'code/c/ascii.c', 'sfasdf'),
(8, 'CPP', 'ASCII', 'CPP Program to Find ASCII Value of a Character', 'code/cpp/ascii.cpp', 'fewfve'),
(9, 'JAVA', 'ASCII', 'JAVA Program to Find ASCII Value of a Character', 'code/java/Ascii.java', 'edvf'),
(10, 'C', 'Leap Year', 'C Program to Check Leap Year', 'code/c/leapyear.c', 'dfasasf'),
(11, 'CPP', 'Leap Year', 'CPP Program to Check Leap Year', 'code/cpp/leapyear.cpp', 'DSVSVBFB'),
(12, 'JAVA', 'LEAP YEAR', 'JAVA Program to Check Leap Year', 'code/java/Leapyear.java', 'WFQWFDEF'),
(13, 'C', 'Reverse Number', 'C Program to Reverse a Number', 'code/c/reverse.c', 'wfgvsdgv'),
(14, 'CPP', 'Reverse Number', 'CPP Program to Reverse a Number', 'code/cpp/reverse.cpp', 'gvgdfgdg'),
(15, 'JAVA', 'Reverse Number', 'JAVA Program to Reverse a Number', 'code/java/Reverse.java', 'fwfdgg'),
(16, 'JAVA', 'Threading Demo', 'JAVA Program to create Thread and use of isAlive() method.', 'code/java/ThreadDemo.java', 'output/java/threaddemo.jpg'),
(17, 'JAVA', 'Thread Demo', 'JAVA Program to show how to create Threads.', 'code/java/ThreadDemo2.java', 'output/java/threaddemo2.jpg'),
(18, 'JAVA', 'TCP HEADER', 'JAVA Program to display TCP header.', 'code/java/Tcp.java', 'output/java/tcp.jpg'),
(19, 'JAVA', 'Restoring Division', 'JAVA Program to implement Restoring Division Algorithm.', 'code/java/RestoringDivision2.java', 'output/java/restoringdivision.jpg'),
(20, 'JAVA', 'Dijkstra Algorithm', 'JAVA Program to implement Dijkstra(Shortest Path) Algorithm.', 'code/java/ShortestPath.java.java', 'output/java/ShortestPath.jpg'),
(21, 'JAVA', 'FIFO', 'JAVA Program to implement FIFO Page Replacement Algorithm.', 'code/java/PageReplacement.java', 'output/java/fifo.jpg'),
(22, 'JAVA', 'LRU', 'JAVA Program to implement LRU Page Replacement Algorithm.', 'code/java/LRU.java', 'output/java/lru.jpg'),
(23, 'JAVA', 'KEY LOGGGER', 'JAVA Program to implement KeyLogger.', 'code/java/KeyLogger.java', 'output/java/keylogger.jpg'),
(24, 'CPP', 'Bucket Sort', 'CPP Program to perform Buck Sort.', 'code/cpp/BUCKET.cpp', 'output/cpp/bucket.jpg'),
(25, 'C', 'STACK', 'C Program to implement Stack Data Structure.', 'code/c/STACK2.C', 'output/c/stack.jpg'),
(26, 'C', 'QUEUE', 'C Program to implement Queue Data Structure.', 'code/c/QUEUE.C', 'output/c/queue.jpg'),
(27, 'CG', 'ARC', 'Program to draw ARC in CPP. ', 'code/cg/ARC.CPP', ''),
(28, 'CG', 'STANDING LINE', 'Draw Standing Line In CPP.', 'code/cg/STANDING.CPP', ''),
(29, 'CG', 'SLEEPING LINE', 'Draw Sleeping Line in CPP.', 'code/cg/SLEEPING.CPP', ''),
(30, 'CG', 'ELLIPSE', 'Draw Ellipse in CPP.', 'code/cg/ELLIPSE.CPP', ''),
(31, 'CG', 'PRINT', 'Print Text in CPP.', 'code/cg/PRINT.CPP', ''),
(32, 'CG', 'CIRCLE', 'Draw Circle in CPP.', 'code/cg/CIRCLE.CPP', ''),
(33, 'CG', 'RECTANGLE', 'Draw Rectangle in CPP.', 'code/cg/RECTANGLE.CPP', ''),
(35, 'CG', 'PUTPIXEL', 'Put pixel in CPP.', 'code/cg/PUTPIXEL.CPP', ''),
(36, 'CG', 'DDA Line Drawing Algorithm', 'Implement DDA line Drawing Algorithm in CPP.', 'code/cg/DDA.CPP', ''),
(37, 'CG', 'BRESENHAM Line Drawing Algorithm', 'Implement Bresenham line drawing algorithm in cpp.', 'code/cg/BRESENHAM.CPP', ''),
(41, 'PYTHON', 'Hello World ', 'Print Hello World in Python.', 'code/python/helloworld.py', ''),
(42, 'PYTHON', 'Areas', 'Find out areas in Python.', 'code/python/areas.py', ''),
(43, 'PYTHON', 'Factorial', 'To find Factorial in Python.', 'code/python/factorial.py', ''),
(44, 'PYTHON', 'Stack', 'Stack program in Python.', 'code/python/stack.py', ''),
(45, 'PYTHON', 'String1', 'Basic string operation 1 in Python.', 'code/python/string1.py', ''),
(46, 'PYTHON', 'String2', 'Basic String operation2 in Python. ', 'code/python/string2.py', ''),
(47, 'PYTHON', 'String3', 'Basic String Operation 3 in Python.', 'code/python/string3.py', ''),
(48, 'PYTHON', 'Inheritance', 'Understand Inheritance Concept in Python.', 'code/python/inheritance.py', ''),
(49, 'PYTHON', 'Radio Button', 'Radio Button program in Python.', 'code/python/radio_buttton.py', ''),
(50, 'CG', 'ANGRYBIRD ANIMATION ', 'Create Animation For AngryBird in CPP.', 'code/cg/ANGRYBIR.CPP', ''),
(51, 'PYTHON', 'Checkbox Button', 'Checkbox Button Program in Python.', 'code/python/checkbox_button.py', '');

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `user` varchar(10) NOT NULL,
  `email` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`user`, `email`, `password`) VALUES
('Parth', 'parth1@gma', 'parth4299'),
('', '', 'fgjghj'),
('dfhfhfdh', 'fghdgdf', 'ghdfghd'),
('fjfgjg', 'fjghjgfjh', 'gfjhgfjhfg'),
('gjkgfk', 'ghkhgjkhk', 'hjkhjk'),
('', 'raj@gd.com', 'raju'),
('Raj', 'raj@gd.com', 'raju'),
('ujj', 'fgjfgjgfj', 'gjhfgj'),
('fghghfghfd', 'fghdfghdfg', 'fghdfghgfh'),
('kjgkghk', 'hjkghjkgh', 'jkhjkghjkj'),
('edfwegvdfg', 'fdsedg', 'fgergrhjgh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sourcecode`
--
ALTER TABLE `sourcecode`
  ADD PRIMARY KEY (`p_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
