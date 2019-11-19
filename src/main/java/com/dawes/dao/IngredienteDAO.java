package com.dawes.dao;

import com.dawes.modelo.IngredienteVO;

public interface IngredienteDAO {
	int insertar (IngredienteVO ingrediente);
	IngredienteVO  buscarPorDenominacion (String den);
}
