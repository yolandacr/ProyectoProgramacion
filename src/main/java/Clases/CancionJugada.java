/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


/**
 * La clase Canción Jugada son las canciones que ya he jugado.
 *
 * @author Yolanda Cordero
 */
public class CancionJugada extends Cancion {

    private boolean aciertoONo;//true si acierto y false si no acierto la cancion
    
    /**
     * constructor de CancionJugada
     * @param nombre string nombre cancion
     * @param autor string nombre autor
     * @param categoria string con el nombre de la categoria
     * @param año año de salida de la cancion
     * @param disco al que pertenece la cancion
     * @param ruta ruta relativa del archivo de audio
     * @param aciertoONo booleano que sera true si acierta y false si falla
     */

	public CancionJugada(String nombre, String autor, String categoria, int año, String disco, String ruta,
			boolean aciertoONo) {
		super(nombre, autor, categoria, año, disco, ruta);
		this.aciertoONo = aciertoONo;
	}
	
	/**
	 * metodo getter de aciertoONo
	 * @return
	 */

	public boolean isAciertoONo() {
		return aciertoONo;
	}
	
	/**
	 * método setter de aciertooNo
	 * @param aciertoONo
	 */

	public void setAciertoONo(boolean aciertoONo) {
		this.aciertoONo = aciertoONo;
	}

    

}
