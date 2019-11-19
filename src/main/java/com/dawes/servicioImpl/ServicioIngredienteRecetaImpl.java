package com.dawes.servicioImpl;

import com.dawes.dao.IngredienteRecetaDAO;
import com.dawes.servicio.ServicioIngredienteReceta;
import com.dawes.util.MySqlDAOFactory;

public class ServicioIngredienteRecetaImpl implements ServicioIngredienteReceta {
	
	MySqlDAOFactory f;
	IngredienteRecetaDAO ir;

	public ServicioIngredienteRecetaImpl() {
		super();
		f = MySqlDAOFactory.getCon();
		ir = f.getIngredienteReceta();
	}

	@Override
	public int asignaIngredienteReceta(String denReceta, String denIngrediente, int cantidad) {
		// TODO Auto-generated method stub
		return ir.asignaIngredienteReceta(denReceta, denIngrediente, cantidad);
	}
}
