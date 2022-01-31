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
	
	
	private float emisora;
	
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
	public String guardarEmisoraActual(int option) {
		// TODO Auto-generated method stub
		mensaje = "";
		
		if (emisorasGuardadas.size() < 12) {
			
			emisorasGuardadas.add(option);
            mensaje = "Emisora " + option + " guardada en la lista";
			
		}
		
		return mensaje;
	}

	@Override
	public String seleccionarEmisoraGuardada(int option) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < emisorasGuardadas.size(); i++) {
        	
            if (option == emisorasGuardadas.get(i)) {

                option = emisorasGuardadas.get(i);
                mensaje = "Emisora cargada " + this.emisora + " con la posicion " + i;
                
            } else {
            	
            	mensaje = "Esta emisora no esta guardada";
            	
            }
            
        }
        
        return mensaje;
	}

	@Override
	public String cambiarSenal(boolean opcion) {
		// TODO Auto-generated method stub
		
		if (opcion == true) {
			tipoSenal = false;
			emisora = 87.9f;
		} else {
			tipoSenal = true;
			emisora = 530f;
		}
		mensaje =" "+ tipoSenal;
		
		return mensaje;
	}

	@Override
	public boolean getTipoSenal() {
		// TODO Auto-generated method stub
		
		return tipoSenal;
	}

	@Override
	public void subirEmisora() {
		// TODO Auto-generated method stub
		


		if (emisora >= 530f && emisora  <=1610f) {
			
			emisora = emisora + 10f;

			
		} else if(emisora >= 86f && emisora<=108f){
			emisora = emisora + 0.2f;
		}
		
		
	}

	@Override
	public void bajarEmisora() {
		// TODO Auto-generated method stub

		if (emisora >= 530f && emisora  <=1610f) {
			
			emisora= emisora- 10f;
			
		} else if(emisora >= 86f && emisora<=107f){
			emisora = emisora -0.2f;
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
