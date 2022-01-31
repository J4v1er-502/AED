/**

import java.util.Scanner;

/**
 * @author grupo12
 *
 */

import java.util.Scanner;

public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int option = 0;
		boolean senalT = true;
		opRadio radio = new opRadio();
		String senal;
		
		String menu= "Seleccione la opcion que desea realizar:\n\n"
        		+ "1. Encender/Apagar el radio"
        		+ "\n2. Cambiar tipo de Emisora"
        		+ "\\n3. Cambiar senal"
        		+ "\n4. Guardar emisora"
        		+ "\n5. Seleccionar emisora guardada";
		
		do {
                    try {
                        
                        System.out.println("*** PROGRAMA DE RADIO ***");
                        System.out.println("\n");
                        System.out.println(menu);
                        option= Integer.parseInt(in.nextLine());
                        switch(option) {
                            case 1: 
                            	
                            	radio.encenderApagar();
                            	if (radio.comprobarEncendida() == true) {
                            		
                            		System.out.println("Radio encendida con exito");
                            		
                            	} else {
                            		
                            		System.out.println("Radio apagada con exito");
                            		
                            	}
                            	
                            break;
                             
                            case 2:
                            	
                            	if (radio.comprobarEncendida() == true) {
                            		
                            		System.out.println("Desea subir emisora o bajar? 1. subir \n2. bajar");
                            		option= Integer.parseInt(in.nextLine());
                            		
                            		switch(option) {
                            		
                            		case 1:
                            			
                            			radio.subirEmisora();
                            			
                            			System.out.println("Se encuentra en la emisora: " + radio.getEmisoraActual());
                            		break;
                            		
                            		case 2:
                            			
                            			radio.bajarEmisora();
                            			
                            			System.out.println("Se encuentra en la emisora: " + radio.getEmisoraActual());
                            		break;
                            		
                            		}
                            		
                            	} else {
                            		
                            		System.out.println("La radio se encuentra apagada");
                            		
                            	}
                            	
                            break;
                            
                            case 3:
                            	
                            	System.out.println("Desea cambiar la senal?");
                            	if (radio.getTipoSenal() == true) {
                            		senal = "AM";
                            	} else {
                            		senal = "FM";
                            	}
                            	
                            	System.out.println("Se encuentra en la senal " + senal);
                            	System.out.println("1. Si \n2. No");
                            	option= Integer.parseInt(in.nextLine());
                            	
                            	switch(option) {
                            	
                            	case 1:
                            		
                            		senalT = true;
                            		
                            	break;
                            	
                            	case 2:
                            		
                            		senalT = false;
                            		
                            	break;
                            		
                            	}
                            	
                            	radio.cambiarSenal(senalT);
                            	
                            break;
                            	
                            	
                            case 6: {
                                System.out.println("Apagando el radio....");

                                try {
                                Thread.sleep(1150);
                            }catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                                }

                                System.exit(0);
                            }break ;
                        } 
	            
                    }catch(Exception e){
	            System.out.println("Por favor, ingrese un formato valido");
                    }
			
		}while(option != 6);		
	}

}
