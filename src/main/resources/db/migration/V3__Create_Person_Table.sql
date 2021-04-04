CREATE TABLE `person` (
  `id` bigint NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `data_of_birth` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `passport_number` varchar(255) DEFAULT NULL,
  `second_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
