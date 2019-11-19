package com.dawes.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.dawes.modelo.RecetaVO;
import com.dawes.servicio.ServicioReceta;
import com.dawes.servicioImpl.ServicioRecetaImpl;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RecetaTest {

	static ServicioReceta sr;
	
	@BeforeClass
	public static void antesdelaclase() {
		sr = new ServicioRecetaImpl();
	}
	@Test
	public void t1InsertaRecetaTest() {
		assertEquals (1, sr.insertar(new RecetaVO("Lentejas estofadas", null)));						
	}
	
	@Test
	public void t2EliminaRecetaTest () {
		assertEquals (1, sr.eliminar(sr.buscarPorDenominacion("Patatas Ali Oli")));
	}
}
