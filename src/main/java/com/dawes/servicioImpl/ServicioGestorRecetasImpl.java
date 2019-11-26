package com.dawes.servicioImpl;

import java.util.ArrayList;
import java.util.List;

import com.dawes.dao.IngredienteDAO;
import com.dawes.dao.IngredienteRecetaDAO;
import com.dawes.dao.RecetaDAO;
import com.dawes.modelo.IngredienteVO;
import com.dawes.modelo.RecetaVO;
import com.dawes.servicio.ServicioGestorRecetas;
import com.dawes.util.MySqlDAOFactory;

public class ServicioGestorRecetasImpl implements ServicioGestorRecetas {

	MySqlDAOFactory f;
	IngredienteDAO i;
	RecetaDAO r;
	IngredienteRecetaDAO ir;
	
	
	
	public ServicioGestorRecetasImpl() {
		super();
		f = MySqlDAOFactory.getCon();
		i = f.getIngrediente();
		r = f.getReceta();
		ir = f.getIngredienteReceta();
	}

	@Override
	public int crearReceta(String nombreReceta, String[] ingredientes, int[] cantidades) {
		RecetaVO re= new RecetaVO(nombreReceta, null);
		r.insertar(re);		
		
		for (int n=0; n< ingredientes.length; n++) {
			IngredienteVO in = new IngredienteVO(ingredientes[n], null);
			i.insertar(in);
			ir.asignaIngredienteReceta(nombreReceta, ingredientes[n], cantidades[n]);			
		}
		return 1;
	}

	@Override
	public List<String> ingredientesDeReceta(String receta) {
		List<String> ing = new ArrayList();
		r.buscarPorDenominacion(receta).getIngredientes().forEach(x -> {
			ing.add(x.toString() + "\n");
		});
		return ing;
	}

}
