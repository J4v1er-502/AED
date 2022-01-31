/**


/**

 * @author grupo12
 *
 */

import java.util.*;

public class opRadio implements Radio {

	private String mensaje;
	
	private boolean encendido;
	private boolean tipoSenal;
	
	private int emisora;
	
	private ArrayList<Integer> emisorasGuardadas = new ArrayList<Integer>();
	
	@Override
	public void encenderApagar() {
		// TODO Auto-generated method stub
		
		if (encendido == false) {
			encendido = true;
		} else {
			encendido = false;
		}
		
	}

	@Override
	public String guardarEmisoraActual(int numBoton) {
		// TODO Auto-generated method stub
		mensaje = "";
		
		if (emisorasGuardadas.size() < 12) {
			
			emisorasGuardadas.add(numBoton);
            mensaje = "Emisora " + numBoton + " guardada en la lista";
			
		}
		
		return mensaje;
	}

	@Override
	public String seleccionarEmisoraGuardada(int numBoton) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < emisorasGuardadas.size(); i++) {
        	
            if (numBoton == emisorasGuardadas.get(i)) {

                numBoton = emisorasGuardadas.get(i);
                mensaje = "Emisora cargada " + this.emisora + " con la posicion " + i;
                
            } else {
            	
            	mensaje = "Esta emisora no esta guardada";
            	
            }
            
        }
        
        return mensaje;
	}

	@Override
	public boolean cambiarSenal(boolean opcion) {
		// TODO Auto-generated method stub
		
		if (opcion == true) {
			
			if (tipoSenal == true) {
				tipoSenal = false;
			} else {
				tipoSenal = true;
			}
			
		} 
		
		return tipoSenal;
	}

	@Override
	public boolean getTipoSenal() {
		// TODO Auto-generated method stub
		
		return tipoSenal;
	}

	@Override
	public void subirEmisora() {
		// TODO Auto-generated method stub
		
		if (emisora < 13 && emisora > 0) {
			
			emisora += 1;
			
		} 
		
	}

	@Override
	public void bajarEmisora() {
		// TODO Auto-generated method stub

		if (emisora < 13 && emisora > 0) {
			
			emisora -= 1;
			
		} 

	}

	@Override
	public float getEmisoraActual() {
		// TODO Auto-generated method stub
		
		return emisora;
	}

	@Override
	public boolean comprobarEncendida() {
		// TODO Auto-generated method stub
		return encendido;
	}

	

}
