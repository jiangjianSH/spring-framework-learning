CREATE TABLE `user` (
  `id` int(11) auto_increment  NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) unsigned,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `address` (
  `id` int(11) unsigned NOT NULL,
  `address` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;