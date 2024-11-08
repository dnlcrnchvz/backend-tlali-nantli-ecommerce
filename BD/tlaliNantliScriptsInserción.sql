-- Inserción de categorias
SELECT * FROM categorias;
INSERT INTO categorias (nombre, descripcion) 
VALUES ("maquillaje", "productos de belleza y maquillaje"), 
("cuidado personal", "productos para el cuidado de la piel y del cuerpo"),
("lo más vendido", "articulos más vendidos de la temporada");

-- Inserción de productos
SELECT * FROM productos;
INSERT INTO productos (idProductos, nombre, precio, descripcion, stock, Categorias_idCategorias) 
VALUES
(1, 'Couleur Caramel', 319.00 , 'Aporta un color intenso, cremosidad e hidratación.', 10, 1),
(2, 'Máscara de Pestaña',  250.00, 'Aporta volumen y longitud intensos a tus pestañas, con una fórmula que evita grumos.', 10, 1),
(3, 'Spray Fijador de Maquillaje', 300.00, 'Prolonga la duración de tu maquillaje, proporcionando un acabado fresco y natural.', 10, 1),
(4, 'Base de Maquillaje', 360.00, 'Base de maquillaje semi-líquida con ácido hialurónico.', 10, 1),
(5, 'Delineador Líquido', 359.00, 'Delineador líquido de alta precisión a base de agua.', 10, 1),
(6, 'Pads Desmaquillantes', 200.00, 'Almohadillas de algodón reutilizables.', 10, 2),
(7, 'Aceite de Almendras Dulces Ecológico', 300.00, 'Nutritivo corporal.', 10, 2),
(8, 'Suero Ácido Hialurónico', 350.00, 'Ofrece un poderoso impulso de hidratación para una piel flexible y tersa.', 10, 2),
(9, 'Bálsamo Labial Hidratante', 100.00, 'Bálsamo de karité hidratante olor sandía.', 10, 2),
(10, 'Aceite de Lavanda', 100.00, 'Aceite esencial corporal.', 10, 2);

-- Inserción de compras
SELECT * FROM compras;
INSERT INTO compras (total, numeroDeProductos, fecha, Usuarios_idUsuarios) VALUES
(120.50, 5, '2024-10-01', 6),
(85.00, 3, '2024-10-21', 3),
(45.75, 2, '2024-10-03', 2),
(150.00, 8, '2024-10-04', 6),
(60.25, 1, '2024-10-05',1 ),
(200.00, 10, '2024-10-06', 5),
(70.80, 4, '2024-10-07', 4),
(90.00, 2, '2024-10-18', 3),
(130.55, 6, '2024-10-09', 6),
(105.40, 7, '2024-10-10', 7),
(56.90, 3, '2024-11-10', 3),
(78.30, 2, '2024-10-12', 1),
(66.50, 4, '2024-01-13', 5),
(150.75, 5, '2024-10-14', 6),
(110.20, 3, '2024-10-25', 2),
(135.40, 6, '2024-10-16', 4),
(220.00, 11, '2024-11-07',1),
(99.99, 2, '2024-10-18',1 ),
(189.00, 9, '2024-10-19', 7),
(79.99, 3, '2024-10-20', 5);

-- Inserción de usuarios
SELECT * FROM usuarios;
INSERT INTO usuarios (nombre, apellidoPaterno, apellidoMaterno, telefono, correo, contraseña) 
VALUES
('Circe', 'Delgadillo', 'López', '5512345678', 'circe.delgadillo@gmail.com', 'password123'), 
('Estefany', 'Contreras', 'Sanchez', '5523456789', 'estefanycose@gmail.com', 'password456'), 
('Sara Abigail', 'Martínez', 'Reyes', '5534567890', 'sara.martinez@gmail.com', 'password789'), 
('Alma Valeria', 'Martinez', 'Tamariz', '5556789012', 'alma.martinez@example.com', 'password654'),
('Lorena Maria', 'Raygoza', 'Ibarra', '5567890123', 'lorena.raygoza@gmail.com', 'password987'),
('Lizbeth', 'Diaz', 'Feria', '5578901234', 'lizbeth.feria@gmail.com', 'password432'),
('Daniela', 'Cerón', 'Chávez', '7721202817', 'dceronchavez09@gmail.com', 'password101');