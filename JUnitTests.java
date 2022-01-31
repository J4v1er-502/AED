import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTests {

	opRadio obj1 = new opRadio();
    
	@Test
	public void testGuardar() {
		
		int numero = 2;
		String output = obj1.guardarEmisoraActual(numero);
		String expected = "Emisora " + 2 + " guardada en la lista";
		//Test output
		assertEquals(expected, output);
	
	}
	
	@Test
	public void testSenal() {
		
		boolean valor = true;
		boolean output = obj1.cambiarSenal(valor);
		//Test output
		assertEquals(false,output);
		
	}
	
	@Test
	public void testEncenderApagar() {
		
		float output = obj1.getEmisoraActual();
		float expected = 1.0f;
		//Test output
		assertEquals(expected,output,0.0002);
			
	}

}

