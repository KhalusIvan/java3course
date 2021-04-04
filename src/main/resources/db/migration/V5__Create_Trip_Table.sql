CREATE TABLE `trip` (
  `id` bigint NOT NULL,
  `hotel_id` bigint DEFAULT NULL,
  `person_id` bigint DEFAULT NULL,
  `plane_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkhwcup185gsdomglyb3bbi15d` (`hotel_id`),
  KEY `FK5tr58xr9ilgm14rqoqpfka9ed` (`person_id`),
  KEY `FKlggf88et8m6i4ttc1rfbjjilx` (`plane_id`),
  CONSTRAINT `FK5tr58xr9ilgm14rqoqpfka9ed` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`),
  CONSTRAINT `FKkhwcup185gsdomglyb3bbi15d` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`id`),
  CONSTRAINT `FKlggf88et8m6i4ttc1rfbjjilx` FOREIGN KEY (`plane_id`) REFERENCES `plane` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

