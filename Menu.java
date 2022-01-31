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
		opRadio radio = new opRadio();
		String senal;

		
		do {
                    try {
                        
                        System.out.println("***********************************************************************");
        				System.out.println(":: Radio ::");
        				System.out.println("Bienvenido a la Radio.");
        				System.out.println("-----------------------------------------------------------------------");
        				System.out.println("1. Encender el radio");
        				System.out.println("2. Cambiar senal ");
        				System.out.println("3. Cambiar tipo de Emisora");
						System.out.println("4. Guardar  emisora guardada");
        				System.out.println("5. Seleccionar emisora guardada");
						System.out.println("5. Apagar el radio");
        				System.out.println("-----------------------------------------------------------------------");
        				System.out.println("Seleccione la opcion que desea realizar en la radio");
						System.out.println("***********************************************************************\n\n");

                        option= Integer.parseInt(in.nextLine());
                        switch(option) {
                            case 1: 
                            	
                            	radio.encenderApagar();
                            	if (radio.comprobarEncendida() == true) {
                            		
                            		System.out.println("-----------------------------------------------------------------------");
        							System.out.println(":: Radio ::");
        							System.out.println("-----------------------------------------------------------------------");
        							System.out.println("Radio encendida con exito");
									System.out.println("-----------------------------------------------------------------------\n\n");
                            		
                            	} else {

                            		System.out.println("-----------------------------------------------------------------------");
        							System.out.println(":: Radio ::");
        							System.out.println("-----------------------------------------------------------------------");
        							System.out.println("Radio apagada con exito");
									System.out.println("-----------------------------------------------------------------------\n\n");
                            		
                            	}
                            	
                            break;
                             
                            case 2:

								if (radio.getTipoSenal() == true) {
									senal = "FM";
								} else {
									senal = "AM";
								}

								System.out.println("-----------------------------------------------------------------------");
								System.out.println(":: Radio ::");
								System.out.println("-----------------------------------------------------------------------");
								System.out.println("Se encuentra en la senal " + senal);
								System.out.println("-----------------------------------------------------------------------");

								boolean senalT = radio.getTipoSenal();

								radio.cambiarSenal(senalT);
                            	
                            	
                            break;
                            
                            case 3:

								if (radio.comprobarEncendida() == true) {
								
									System.out.println("-----------------------------------------------------------------------");
									System.out.println(":: Radio ::");
									System.out.println("-----------------------------------------------------------------------");
									System.out.println("Desea subir emisora o bajar?");
									System.out.println("-----------------------------------------------------------------------");
									System.out.println("1. Subir");
									System.out.println("2. Bajar ");
									System.out.println("-----------------------------------------------------------------------\n\n");                            		

									option= Integer.parseInt(in.nextLine());

									switch(option) {
									
									case 1:

										radio.subirEmisora();

										System.out.println("-----------------------------------------------------------------------");
										System.out.println(":: Radio ::");
										System.out.println("-----------------------------------------------------------------------");
										System.out.println("Se encuentra en la emisora: " + radio.getEmisoraActual());
										System.out.println("-----------------------------------------------------------------------");

									break;
									
									case 2:

										radio.bajarEmisora();

										System.out.println("-----------------------------------------------------------------------");
										System.out.println(":: Radio ::");
										System.out.println("-----------------------------------------------------------------------");
										System.out.println("Se encuentra en la emisora: " + radio.getEmisoraActual());
										System.out.println("-----------------------------------------------------------------------");

									break;

									}
								
								} else {

									System.out.println("-----------------------------------------------------------------------");
									System.out.println(":: Radio ::");
									System.out.println("-----------------------------------------------------------------------");
									System.out.println("La radio se encuentra apagada");
									System.out.println("-----------------------------------------------------------------------");

								}
                            	
                            	
                            break;

							case 4:
								System.out.println("-----------------------------------------------------------------------");
								System.out.println(":: Radio ::");
								System.out.println("-----------------------------------------------------------------------");
								System.out.println("Ingrese el numero del boton para guardar la emisora, en el rango de 1-12");
								System.out.println("-----------------------------------------------------------------------");

								option= Integer.parseInt(in.nextLine());
								radio.guardarEmisoraActual( option);

								System.out.println("-----------------------------------------------------------------------");
								System.out.println(":: Radio ::");
								System.out.println("-----------------------------------------------------------------------");
								System.out.println("Se guardo la emisora 540.0 en en el boton " + option);
								System.out.println("-----------------------------------------------------------------------");


							break;

							case 5:

								System.out.println("-----------------------------------------------------------------------");
								System.out.println(":: Radio ::");
								System.out.println("-----------------------------------------------------------------------");
								System.out.println("Ingrese el numero del boton con la emisora guardada, en el rango de 1-12");
								System.out.println("-----------------------------------------------------------------------");

								option= Integer.parseInt(in.nextLine());
								radio.seleccionarEmisoraGuardada(option);

								System.out.println("-----------------------------------------------------------------------");
								System.out.println(":: Radio ::");
								System.out.println("-----------------------------------------------------------------------");
								System.out.println("Se seleciono la emisora 540.0 guardada en el boton " + option);
								System.out.println("-----------------------------------------------------------------------");

							break;
                            	
                            	
                            case 6: {
                                System.out.println("-----------------------------------------------------------------------");
								System.out.println(":: Radio ::");
								System.out.println("-----------------------------------------------------------------------");
								System.out.println("Apagando Radio.... " );
								System.out.println("-----------------------------------------------------------------------");

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
