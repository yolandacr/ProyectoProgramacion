/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa.proyectot3;

/**
 * La siguiente clase es la principal de mi proyecto
 *
 * @author Yolanda Cordero
 * @version 1.0
 */
public class Main {

	/**
	 * método main de mi proyecto donde creo la interfaz gráfica
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		InterfacesGraficas.Ventana miVentana = new InterfacesGraficas.Ventana();
		miVentana.setVisible(true);

	}

}
