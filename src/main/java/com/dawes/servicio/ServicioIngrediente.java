package com.dawes.servicio;

import com.dawes.modelo.IngredienteVO;

public interface ServicioIngrediente {
	int insertar (IngredienteVO ingrediente);
	IngredienteVO  buscarPorDenominacion (String den);
}
