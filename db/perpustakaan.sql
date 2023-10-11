-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 11, 2023 at 01:41 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` varchar(30) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `pengarang` varchar(100) NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `kategori` varchar(30) NOT NULL,
  `deskripsi` text NOT NULL,
  `stok` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `pengarang`, `penerbit`, `kategori`, `deskripsi`, `stok`) VALUES
('B0001', 'Atomic Habits', 'James Clear', 'Penguin Books', 'Ilmu Sains dan Teknologi', 'Atomic Habits: Cara Mudah & Terbukti untuk Membangun Kebiasaan Baik & Menghentikan Kebiasaan Buruk\r\nBuku terobosan dari James Clear ini adalah panduan terlengkap tentang cara mengubah kebiasaan Anda dan menjadi 1% lebih baik setiap hari.', 2),
('B0002', 'Filosofi Teras', 'Henry Manampiring', 'PT Kompas Media Nusantara', 'Ilmu Kesehatan', 'Filosofi Teras adalah sebuah buku pengantar filsafat Stoa yang dibuat khusus sebagai panduan moral anak muda. Buku ini ditulis untuk menjawab permasalahan tentang tingkat kekhawatiran yang cukup tinggi dalam skala nasional, terutama yang dialami oleh anak muda. Filosofi Teras, dibuat dengan kolaborasi beberapa pihak, seperti ilustrator, Levina Lesmana yang cukup berjasa dalam pembuatan sampul buku, dan si penulis, Henry Manampiring, yang terinspirasi dari buku How to be a Stoic karya Massimo Piggliuci, seorang penulis kenamaan Italia yang juga penganut Stoisisme. Buku ini dilengkapi dengan beberapa data seperti survei kekhawatiran nasional dan juga wawancara dari beberapa tokoh yang dianggap ahli dalam hal psikologi.', 0),
('B0003', 'Mindset : the new psychology of success', 'Carol S. Dweck, PH.D.', 'Random House Publishing Group', 'Ilmu Sains dan Teknologi', 'Buku Mindset \"The New Psychology of Success\" karya Carol Dweck membahas tentang pentingnya pola pikir (mindset) dalam mencapai kesuksesan hidup. Dweck mengidentifikasi dua jenis mindset yang memengaruhi cara kita memandang dunia dan memecahkan masalah: mindset tetap (fixed mindset) dan mindset berkembang (growth mindset).\r\n\r\nMindset tetap adalah pola pikir yang melihat kemampuan seseorang sebagai sesuatu yang tetap dan tidak dapat berubah. Orang dengan mindset tetap cenderung menghindari tantangan dan memandang kegagalan sebagai bukti ketidakmampuan mereka.', 12),
('B0004', 'The 48 Laws of Power', 'Greene, Robert', ' Pers Viking, Audio HighBridge', 'Ilmu Sosial dan Humaniora', 'Dalam The 48 Laws of Power , Robert Greene menegaskan bahwa suka atau tidak suka, Anda adalah bagian dari permainan kekuasaan yang tidak pernah berakhir. Entah Anda berjuang dan memegang kekuasaan, atau Anda adalah bidak yang dipermainkan oleh seseorang yang lebih berkuasa dari Anda. Anda memilih peran Anda.\r\n\r\nBuku ini diperuntukkan bagi mereka yang lebih memilih menjadi pemain daripada pion. Untuk mengubah Anda dari seorang amatir menjadi pemain ahli, Greene telah menyusun 48 hukum kekuasaan berdasarkan contoh sejarah orang-orang yang unggul atau gagal dalam menggunakan kekuasaan, dengan hasil yang gemilang atau berdarah (atau keduanya). Beberapa prinsip utama yang akan Anda pelajari: manfaatkan musuh Anda, biarkan orang lain bergantung pada Anda, bicaralah sesedikit mungkin, hargai pekerjaan orang lain, dan jangan mengotori tangan Anda. Anda dapat memilih untuk menerapkan atau mengabaikan peraturan ini - namun Anda tidak dapat menghindarinya.', 15);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `salt` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `nama`, `password`, `salt`) VALUES
(6, 'admin', 'Administrator', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', ''),
(7, 'Hilmy', 'Hilmy Sukma Nurmakarim', 'a8f2fdec02c1bee801f99486177a06317d6cd29735366d7d051733883814f6f9', ''),
(8, 'Teuku', 'Teuku Nurmansyah Puteh', 'f29285d266f870bde29e0f243fe95ce5f0b9b061265a8ae92408e743509883b8', ''),
(9, 'Farhan', 'Farhan Naufal Sukmana', '583e8b51381c34bae52f6bd990dd22640123c0f631d5f6bd6cb301beafc2d2e3', '');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `npm` int(40) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `fakultas` varchar(30) NOT NULL,
  `jurusan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`npm`, `nama`, `fakultas`, `jurusan`) VALUES
(64, 'Farhan Naufal Sukmana', 'Ilmu Komputer', 'Informatika'),
(111, 'Teuku Nurmansyah Puteh', 'Ilmu Komputer', 'Informatika'),
(133, 'Hilmy Sukma Nurmakarim', 'Ilmu Komputer', 'Informatika');

-- --------------------------------------------------------

--
-- Table structure for table `pinjaman`
--

CREATE TABLE `pinjaman` (
  `id_pinjam` varchar(30) NOT NULL,
  `npm` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `id_buku` varchar(30) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `jumlah` int(30) NOT NULL,
  `tgl_pinjam` varchar(30) NOT NULL,
  `tgl_balik` varchar(30) NOT NULL,
  `denda` int(30) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `pinjaman`
--

INSERT INTO `pinjaman` (`id_pinjam`, `npm`, `nama`, `id_buku`, `judul`, `jumlah`, `tgl_pinjam`, `tgl_balik`, `denda`, `status`) VALUES
('P0001', '064', 'Farhan Naufal Sukmana', 'b0001', 'Atomic Habits', 1, '16 September 2023', '18 September 2023', 0, 'Belum Kembali'),
('P0002', '133', 'Hilmy Sukma Nurmakarim', 'b0002', 'Filosofi Teras', 10, '10 September 2023', '16 September 2023', 0, 'Belum Kembali'),
('P0003', '111', 'Teuku Nurmansyah Puteh', 'b0003', 'Mindset : the new psychology of success', 5, '17 September 2023', '23 September 2023', 0, 'Belum Kembali');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`npm`);

--
-- Indexes for table `pinjaman`
--
ALTER TABLE `pinjaman`
  ADD PRIMARY KEY (`id_pinjam`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
