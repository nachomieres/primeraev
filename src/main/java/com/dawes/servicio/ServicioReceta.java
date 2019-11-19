package com.dawes.servicio;

import com.dawes.modelo.RecetaVO;

public interface ServicioReceta {
	int insertar (RecetaVO receta);
	RecetaVO buscarPorDenominacion (String den);
	int eliminar (RecetaVO receta);
}
