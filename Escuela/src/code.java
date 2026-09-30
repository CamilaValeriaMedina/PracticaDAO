
/*
-- Crear base de datos
CREATE DATABASE IF NOT EXISTS escuela
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_general_ci;

CREATE TABLE IF NOT EXISTS estudiantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(150) UNIQUE NOT NULL
);

INSERT INTO estudiantes (nombre, correo) VALUES
('Juan Pérez', 'juan.perez@mail.com'),
('Ana López', 'ana.lopez@mail.com'),
('Carlos Ruiz', 'carlos.ruiz@mail.com');
*/