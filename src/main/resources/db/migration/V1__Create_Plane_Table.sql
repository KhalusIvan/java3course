CREATE TABLE `plane` (
  `id` bigint NOT NULL,
  `arrive_place` varchar(255) DEFAULT NULL,
  `arrive_time` varchar(255) DEFAULT NULL,
  `depart_place` varchar(255) DEFAULT NULL,
  `depart_time` varchar(255) DEFAULT NULL,
  `flight_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

