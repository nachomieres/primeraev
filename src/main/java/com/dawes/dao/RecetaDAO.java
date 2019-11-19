package com.dawes.dao;

import com.dawes.modelo.RecetaVO;

public interface RecetaDAO {
	
	int insertar (RecetaVO receta);
	RecetaVO buscarPorDenominacion (String den);
	int eliminar (RecetaVO receta);
		
}
