CREATE TABLE `hotel` (
  `id` bigint NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `stars` int NOT NULL,
  `guide_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqxfw8urhiepjuxfgdorf6hf8s` (`guide_id`),
  CONSTRAINT `FKqxfw8urhiepjuxfgdorf6hf8s` FOREIGN KEY (`guide_id`) REFERENCES `guide` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
