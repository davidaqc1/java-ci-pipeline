package test;

import static org.junit.Assert.*;
import org.junit.Test;
import source.Calculadora;


public class Calculadora_Test {

	@Test
	public void sumarTest() {
		int resultado = Calculadora.sumar(10, 10);
		int esperado = 20;
		assertEquals(esperado, resultado);
	}

}
