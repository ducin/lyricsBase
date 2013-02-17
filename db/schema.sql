DROP SCHEMA IF EXISTS `lyricsbase`;

CREATE SCHEMA `lyricsbase` COLLATE utf8_general_ci;

USE `lyricsbase`;

CREATE TABLE `lyric` (
`id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`title` VARCHAR(64) NOT NULL,
`lyric_text` text NOT NULL,
`author` VARCHAR(64) NOT NULL,
`album` VARCHAR(64) NOT NULL,
`created_at` DATETIME NOT NULL,
PRIMARY KEY (`id`),
UNIQUE KEY `lyric_author_title` (`title`,`author`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lyric_comment` (
`id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`lyric_id` INT(10) UNSIGNED NOT NULL,
`text` text NOT NULL,
`author` VARCHAR(64) NOT NULL,
`ip` VARCHAR(16) NOT NULL,
`created_at` DATETIME NOT NULL,
PRIMARY KEY (`id`),
INDEX `lyric_comment_lyric_id` (`lyric_id`),
CONSTRAINT `lyric_comment_lyric_id` FOREIGN KEY
  (`lyric_id`) REFERENCES `lyric` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
