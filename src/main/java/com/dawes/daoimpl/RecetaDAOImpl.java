package com.dawes.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dawes.dao.RecetaDAO;
import com.dawes.modelo.RecetaVO;

public class RecetaDAOImpl implements RecetaDAO {
	
	EntityManager em;
	
	

	public RecetaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public int insertar(RecetaVO receta) {
		try {
			em.getTransaction().begin();
			em.persist(receta);
			em.getTransaction().commit();
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar la receta " + receta.getDenominacion()); 
			em.getTransaction().rollback();
			return 0;
		}
	}
	
	public int eliminar (RecetaVO receta) {
		try {
			em.getTransaction().begin();
			em.remove(receta);
			em.getTransaction().commit();
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al eliminar la receta " + receta.getDenominacion()); 
			em.getTransaction().rollback();
			return 0;
		}
	}
	
	public RecetaVO buscarPorDenominacion (String den) {
		Query consulta = em.createQuery("select r from RecetaVO r  where denominacion=:nombre ");
		consulta.setParameter("nombre", den);
		return (RecetaVO)consulta.getSingleResult();		
	}

}
