INSERT INTO `receta` (`idreceta`, `denominacion`) VALUES	(1, 'Patatas Bravas'),	(2, 'Patatas Ali Oli');
INSERT INTO `ingrediente` (`idingrediente`, `denominacion`) VALUES	(1, 'Patata'),	(2, 'Ajo'),	(3, 'Aceite'),	(4, 'Sal'),	(5, 'Tomate'),	(6, 'Guindilla');
INSERT INTO `ingredientereceta` (`idingredienteReceta`, `cantidad`, `idingrediente`, `idreceta`) VALUES	(1, 1, 6, 1),	(2, 10, 3, 1),	(3, 500, 1, 1),	(4, 500, 1, 2),	(5, 5, 2, 2),	(6, 10, 3, 2);
