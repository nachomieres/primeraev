package com.dawes.servicioImpl;

import com.dawes.dao.IngredienteDAO;
import com.dawes.modelo.IngredienteVO;
import com.dawes.servicio.ServicioIngrediente;
import com.dawes.util.MySqlDAOFactory;

public class ServicioIngredienteImpl implements ServicioIngrediente {
	
	MySqlDAOFactory f;
	IngredienteDAO i;	

	public ServicioIngredienteImpl() {
		super();
		f = MySqlDAOFactory.getCon();
		i = f.getIngrediente();
	}

	@Override
	public int insertar(IngredienteVO ingrediente) {
		// TODO Auto-generated method stub
		return i.insertar(ingrediente);
	}

	@Override
	public IngredienteVO buscarPorDenominacion(String den) {		
		return i.buscarPorDenominacion(den);
	}

}
