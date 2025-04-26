CREATE DATABASE `employee`
CHARACTER SET utf8mb4
COLLATE utf8mb4_spanish_ci;

use `employee`;

CREATE TABLE `Employee` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(80) NOT NULL,
	`fecha_ingreso` date NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

INSERT INTO Employee ( nombre, fecha_ingreso )
values ( 'Omar', '2024-06-02');