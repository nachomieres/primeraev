package com.dawes.servicio;

import java.util.List;

public interface ServicioGestorRecetas {
	int crearReceta (String nombreReceta, String[] ingredientes, int[] cantidades);
	List<String> ingredientesDeReceta (String receta);
	
}
