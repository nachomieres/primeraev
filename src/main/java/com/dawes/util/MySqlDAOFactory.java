package com.dawes.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dawes.dao.IngredienteDAO;
import com.dawes.dao.IngredienteRecetaDAO;
import com.dawes.dao.RecetaDAO;
import com.dawes.daoimpl.IngredienteDAOImpl;
import com.dawes.daoimpl.IngredienteRecetaDAOImpl;
import com.dawes.daoimpl.RecetaDAOImpl;

public class MySqlDAOFactory {
	EntityManagerFactory emf;
	EntityManager em;

	private static MySqlDAOFactory f;
	
	private MySqlDAOFactory() {
		Persistence.generateSchema("jpa", null);
		emf = Persistence.createEntityManagerFactory("jpa");
		em = emf.createEntityManager();
	}

	public static MySqlDAOFactory getCon() {
		if (f==null)
			f=new MySqlDAOFactory();
		return f;
	}
	
	public RecetaDAO getReceta() {
		return new RecetaDAOImpl(em);
	}
	public IngredienteDAO getIngrediente() {
		return new IngredienteDAOImpl(em);
	}
	public IngredienteRecetaDAO getIngredienteReceta() {
		return new IngredienteRecetaDAOImpl(em);
	}
}
