package com.dawes.servicioImpl;

import com.dawes.dao.RecetaDAO;
import com.dawes.modelo.RecetaVO;
import com.dawes.servicio.ServicioReceta;
import com.dawes.util.MySqlDAOFactory;

public class ServicioRecetaImpl implements ServicioReceta {
	
	MySqlDAOFactory f;
	RecetaDAO r;
		
	public ServicioRecetaImpl() {
		super();
		f = MySqlDAOFactory.getCon();
		r = f.getReceta();
	}

	@Override
	public int insertar(RecetaVO receta) {
		return r.insertar(receta);
	}

	@Override
	public RecetaVO buscarPorDenominacion(String den) {		
		return r.buscarPorDenominacion(den);
	}

	@Override
	public int eliminar(RecetaVO receta) {		
		return r.eliminar(receta);
	}

}
