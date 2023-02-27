-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : dim. 26 fév. 2023 à 22:04
-- Version du serveur : 5.7.40
-- Version de PHP : 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestion_produits`
--

-- --------------------------------------------------------

--
-- Structure de la table `approvisionnement`
--

DROP TABLE IF EXISTS `approvisionnement`;
CREATE TABLE IF NOT EXISTS `approvisionnement` (
  `Code` varchar(50) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Fournisseur` varchar(50) NOT NULL,
  `Description` varchar(250) NOT NULL,
  `Type` char(50) NOT NULL,
  `Couleur` char(50) NOT NULL,
  `Finition` varchar(100) NOT NULL,
  `Prix` float NOT NULL,
  `Stock` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `approvisionnement`
--

INSERT INTO `approvisionnement` (`Code`, `Nom`, `Fournisseur`, `Description`, `Type`, `Couleur`, `Finition`, `Prix`, `Stock`) VALUES
('YGH31105', 'YGH', 'Behr', 'abc', 'Latex', 'Blanc', 'Mat', 720, 1800),
('DFB50010', 'DFB', 'Rust', 'abcd', 'Arcylique', 'Noir', 'Satiné', 1000, 200),
('PNT030', 'AGH', 'Valspar', 'abc', 'Alkyde', 'Brun', 'Brillant', 1750, 200),
('PNT035', 'ABH', 'Sharwin', 'abcfg', 'Époxy', 'Gris', 'Satiné', 750, 1000),
('SWC54732', 'SWC', 'Oleum', 'abcfgk', 'Acrylique', 'Violet', 'Plafond', 950, 830),
('GTU31805', 'GTU', 'Ayep', 'abcfgkg', 'Latex', 'Bleu', 'Mat', 900, 1620);

-- --------------------------------------------------------

--
-- Structure de la table `fournisseurss`
--

DROP TABLE IF EXISTS `fournisseurss`;
CREATE TABLE IF NOT EXISTS `fournisseurss` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(100) NOT NULL,
  `Telephone` varchar(20) NOT NULL,
  `Email` varchar(150) NOT NULL,
  `Adresse` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fournisseurss`
--

INSERT INTO `fournisseurss` (`id`, `Nom`, `Telephone`, `Email`, `Adresse`) VALUES
(1, 'Rust', '0546519529', 'aaaaaaa@aaaa.com', 'aaaaaaaaaaaaaaaaaa'),
(2, 'Behr', '058484846', 'bbbbbbbbbb@bbbb.com', 'bbbbbbbbbbbbb'),
(3, 'Valspar', '07659295', 'ccccccc@ccccc.com', 'cccccccccccc'),
(4, 'Sharwin', '0615654545', 'ddddddd@dddd.com', 'dddddddddddd'),
(5, 'Ayep', '05694318', 'eeeeeee@eeeeee.com', 'eeeeeeeeeeeeee'),
(6, 'Oleum', '075926196', 'ffffffffffff@fffff.com', 'fffffffffffffffffff');

-- --------------------------------------------------------

--
-- Structure de la table `produits`
--

DROP TABLE IF EXISTS `produits`;
CREATE TABLE IF NOT EXISTS `produits` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Code` varchar(50) DEFAULT NULL,
  `Nom` varchar(50) DEFAULT NULL,
  `Description` varchar(150) DEFAULT NULL,
  `Type` varchar(50) DEFAULT NULL,
  `Couleur` varchar(50) DEFAULT NULL,
  `Finition` varchar(50) DEFAULT NULL,
  `Prix` float DEFAULT NULL,
  `Stock` int(11) DEFAULT NULL,
  `Seuil` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `produits`
--

INSERT INTO `produits` (`id`, `Code`, `Nom`, `Description`, `Type`, `Couleur`, `Finition`, `Prix`, `Stock`, `Seuil`) VALUES
(7, 'YER10015', 'YER', 'abcd', 'Aérosol', 'Noir', 'Brillant', 560, 100, 20),
(4, 'ABC51105', 'ABC', 'abcde', 'Acrylique', 'Blanc', 'Mat', 500, 170, 30),
(5, 'SDR93315', 'SDR', 'abcdefghijk', 'Époxy', 'Gris', 'Brillant', 925, 50, 20),
(8, 'SDG93314', 'SDG', 'abc', 'Époxy', 'Gris', 'Semi-brillant', 275, 150, 10),
(6, 'YUT21410', 'YUTO', 'abcdefg', 'Huile', 'Rouge', 'Satiné', 750, 150, 50);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `type` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id`, `id_user`, `username`, `password`, `type`) VALUES
(1, 101, 'bachir', 'ammibachir', 'directeur'),
(2, 102, 'a', 'a', 'directeur'),
(3, 103, 'd', 'd', 'caissier'),
(4, 104, 'cc', 'cc', 'caissier');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
