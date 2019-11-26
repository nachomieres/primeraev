package com.dawes.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.dawes.modelo.IngredienteVO;
import com.dawes.modelo.RecetaVO;
import com.dawes.servicio.ServicioGestorRecetas;
import com.dawes.servicio.ServicioIngrediente;
import com.dawes.servicio.ServicioIngredienteReceta;
import com.dawes.servicio.ServicioReceta;
import com.dawes.servicioImpl.ServicioGestorRecetasImpl;
import com.dawes.servicioImpl.ServicioIngredienteImpl;
import com.dawes.servicioImpl.ServicioIngredienteRecetaImpl;
import com.dawes.servicioImpl.ServicioRecetaImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestEvaluacion {

	static ServicioReceta sr;
	static ServicioIngrediente si;
	static ServicioIngredienteReceta sir;
	static ServicioGestorRecetas sgr;
	
	@BeforeClass
	public static void antesdelaclase() {
		sr = new ServicioRecetaImpl();
		si = new ServicioIngredienteImpl();
		sir = new ServicioIngredienteRecetaImpl();
		sgr = new ServicioGestorRecetasImpl();
	}
		
	@Test
	public void t1CrearRecetaTest () {
		String[] ingredientes = {"Garbanzos", "Patatas"};
		int[] cantidades = {300,200};
		assertEquals (1, sgr.crearReceta("Garbanzos con Patatas", ingredientes, cantidades));		
	}
	
	@Test
	public void t2ListaRecetaConIngredientes () {		
		assertEquals (2, sgr.ingredientesDeReceta("Garbanzos con Patatas").size());
		
	}
	/*@Test
	public void t1CrearRecetaTest() {
		si.insertar(new IngredienteVO("Garbanzos", null));			
		sr.insertar(new RecetaVO("Garbanzos con patatas", null));
		
		sir.asignaIngredienteReceta("Garbanzos con patatas", "Garbanzos", 300);
		sir.asignaIngredienteReceta("Garbanzos con patatas", "Patata", 200);
		
		assertEquals (2, sr.buscarPorDenominacion("Garbanzos con patatas").getIngredientes().size());			
	}
	
	@Test
	public void t2ListaRecetasConIngrediente () {
		System.out.println("Recetas con Patata:");
		si.buscarPorDenominacion("Patata").getRecetas().forEach(x-> {
			System.out.println("- " + x.getReceta().getDenominacion());
		});
		assertEquals (3, si.buscarPorDenominacion("Patata").getRecetas().size());
	}*/

}
