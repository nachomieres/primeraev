package com.dawes.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.dawes.servicio.ServicioIngredienteReceta;
import com.dawes.servicioImpl.ServicioIngredienteImpl;
import com.dawes.servicioImpl.ServicioIngredienteRecetaImpl;
import com.dawes.servicioImpl.ServicioRecetaImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IngredienteRecetaTest {

	static ServicioIngredienteReceta sr;
	
	@BeforeClass
	public static void antesdelaclase() {
		sr = new ServicioIngredienteRecetaImpl();
	}
	
	@Test
	public void t1AsignaIngredienteReceta() {		
		assertEquals (1, sr.asignaIngredienteReceta("Lentejas Estofadas", "Lentejas", 300));		
	}
}
