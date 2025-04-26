CREATE DATABASE `empleados`
CHARACTER SET utf8mb4
COLLATE utf8mb4_spanish_ci;

use `empleados`;

CREATE TABLE `Empleado` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(80) NOT NULL,
	`fecha_ingreso` date NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

INSERT INTO Empleado ( nombre, fecha_ingreso )
values ( 'Omar', '2024-06-02');

INSERT INTO Empleado ( nombre, fecha_ingreso )
values ( 'Diego', '2024-06-10');

INSERT INTO employee ( id, fecha_ingreso, name )
values ( '1','2024-06-10', 'omar' );

INSERT INTO employee ( id, fecha_ingreso, name )
values ( '2','2024-08-21', 'Pepe Navas' );


CREATE DATABASE `nomina`
CHARACTER SET utf8mb4
COLLATE utf8mb4_spanish_ci;

use `nomina`;

INSERT INTO nomina ( id, rol, salario )
values ( '1', 'mydog', '10' );

INSERT INTO nomina ( id, rol, salario )
values ( '1', 'miperra', '100' );