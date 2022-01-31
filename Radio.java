/**
 * 
 */

/**
 * @author grupo12
 *
 */
public interface Radio {
	
	void encenderApagar(); // Cambia el estado encendido/apagado
	String guardarEmisoraActual(int numBoton); // Guarda la emisora como favorita en el botón indicado (array de 12 espacios).
	String seleccionarEmisoraGuardada(int numBoton); // Reproduce la emisora guardada en uno de los 12 botones.
	boolean cambiarSenal(boolean opcion); //true: AM // false:FM
	boolean getTipoSenal(); ////true: AM // false:FM
	void subirEmisora(); // Aumenta la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM
	void bajarEmisora(); // Disminuye la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM
	float getEmisoraActual();
	boolean comprobarEncendida(); //true: encendida, false: apagada


}
