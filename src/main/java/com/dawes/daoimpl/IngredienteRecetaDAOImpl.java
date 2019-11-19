package com.dawes.daoimpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dawes.dao.IngredienteRecetaDAO;
import com.dawes.modelo.IngredienteRecetaVO;
import com.dawes.modelo.IngredienteVO;
import com.dawes.modelo.RecetaVO;

public class IngredienteRecetaDAOImpl implements IngredienteRecetaDAO {
	
	EntityManager em;
	
	public IngredienteRecetaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public int asignaIngredienteReceta(String denReceta, String denIngrediente, int cantidad) {
		em.getTransaction().begin();
		Query receta=em.createQuery("select r from RecetaVO r where denominacion=:den");
		receta.setParameter("den", denReceta);
		RecetaVO r=(RecetaVO) receta.getSingleResult();
		
		Query ingrediente=em.createQuery("select i from IngredienteVO i where denominacion=:denominacion");
		ingrediente.setParameter("denominacion", denIngrediente);
		IngredienteVO i=(IngredienteVO) ingrediente.getSingleResult();		
		IngredienteRecetaVO ir = new IngredienteRecetaVO(r, i, cantidad);
		
		if (r.getIngredientes() == null) {
			r.setIngredientes(new ArrayList<IngredienteRecetaVO>());
			r.getIngredientes().add(ir);
		}
		else {
			r.getIngredientes().add(ir);
		}
		
		if (i.getRecetas() == null) {
			i.setRecetas(new ArrayList<IngredienteRecetaVO>());
			i.getRecetas().add(ir);
		}
		else {
			i.getRecetas().add(ir);	
		}					
		em.persist(ir);
		em.getTransaction().commit();
		return 1;

	}

}
