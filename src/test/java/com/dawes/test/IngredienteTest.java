package com.dawes.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.dawes.modelo.IngredienteVO;
import com.dawes.servicio.ServicioIngrediente;
import com.dawes.servicioImpl.ServicioIngredienteImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IngredienteTest {

	static ServicioIngrediente si;
	
	@BeforeClass
	public static void antesdelaclase() {
		si = new ServicioIngredienteImpl();
	}
	
	@Test
	public void t1InsertarIngrediente() {
		assertEquals (1, si.insertar(new IngredienteVO("Lentejas", null)));
	}

}
