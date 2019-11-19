package com.dawes.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dawes.dao.IngredienteDAO;
import com.dawes.modelo.IngredienteVO;

public class IngredienteDAOImpl implements IngredienteDAO {
	EntityManager em;
	
	

	public IngredienteDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public int insertar(IngredienteVO ingrediente) {
		try {
			em.getTransaction().begin();
			em.persist(ingrediente);
			em.getTransaction().commit();
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar el ingrediente " + ingrediente.getDenominacion()); 
			em.getTransaction().rollback();
			return 0;
		}
	}

	@Override
	public IngredienteVO buscarPorDenominacion(String den) {
		Query consulta = em.createQuery("select i from IngredienteVO i  where denominacion=:nombre ");
		consulta.setParameter("nombre", den);
		return (IngredienteVO)consulta.getSingleResult();
	}
}
