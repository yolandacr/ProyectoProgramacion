/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa.proyectot3;

import Clases.CancionJugada;
import Clases.Cancion;
import Clases.Jugador;
//import Clases.Jugador;
import Clases.Partida;
import Enums.CategoriaMusical;
import Excepciones.PasswordInvalidException;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;

/**
 * La siguiente clase es la principal de mi proyecto
 *
 * @author Yolanda Cordero
 */
public class Main {

	/**
	 * método main de mi proyecto
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		InterfacesGraficas.Ventana miVentana = new InterfacesGraficas.Ventana();
		miVentana.setVisible(true);

		try {
			Scanner sc = new Scanner(System.in);

			Jugador jugador1 = new Jugador();

			System.out.println("Bienvenido a la Rockola Boomer. Elige que quieres hacer: " + "\n\t1- Registrar Usuario"
					+ "\n\t2- Login de usuario");

			byte opcion = Byte.parseByte(sc.nextLine());
			while (opcion < 1 || opcion > 2) {
				System.out.println("Opción no válida. Elige una de las dos opciones por favor");
				System.out.println("Bienvenido a la Rockola Boomer. Elige que quieres hacer: "
						+ "\n\t1- Registrar Usuario" + "\n\t2- Login de usuario");

				opcion = Byte.parseByte(sc.nextLine());

			}

			switch (opcion) {
			case 1:
				jugador1 = jugador1.pideDatos();
				jugador1.registrar();

				break;
			case 2:
				jugador1.login();
				Partida partida1 = new Partida(jugador1, (short) 0, null, null, null);
				partida1.eligeNivel(partida1);
				partida1.estableceFecha(partida1);
				System.out.println(partida1);

				break;
			}
		} catch (PasswordInvalidException | FileNotFoundException ex) {
			System.out.println("La acción no ha podido llevarse a cabo");
		}

		// OBJETO CANCIÓN 1

		String[] opcionesEleccionAlice = { "quizas", "sitio muy raro", "el viaje", "que se joda todo lo demas" };
		try {
			Image discoAlice = ImageIO.read(new File("./imagenes/aliceWonder.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Cancion cancionAlice = new CancionJugada("que se joda todo lo demas",
		 * "alice wonder", CategoríaMusical.ACTUAL, opcionesEleccionAlice, 2021,
		 * "que se joda todo lo demás",discoAlice,
		 * "./sonidos/ACTUALIDAD/aliceWonder.wav", Clip,false);
		 */

		// OBJETO CANCIÓN 2
		String[] opcionesEleccionMerichane = { "yo estaba ahi", "sin saber salir", "merichane", "yo" };
		try {
			Image discoZahara = ImageIO.read(new File("./imagenes/zahara.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Cancion cancionMerichane = new CancionJugada("merichane", "zahara",
		 * CategoríaMusical.ACTUAL, opcionesEleccionMerichane, 2021,
		 * "puta",discoZahara,"./sonidos/ACTUALIDAD/merichane.wav", Clip,false);
		 */

		// OBJETO CANCIÓN 3
		String[] opcionesEleccionBad = { "bad gay", "bad guy", "bad boy", "bad" };
		try {
			Image discoBillie = ImageIO.read(new File("./imagenes/billie.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Cancion cancionBillie = new CancionJugada("bad guy", "billie eilish",
		 * CategoríaMusical.ACTUAL, opcionesEleccionBad, 2021,
		 * "When We All Fall Asleep, Where Do We Go?",discoBillie,
		 * "./sonidos/ACTUALIDAD/billie.wav", Clip,false);
		 */

		// OBJETO CANCIÓN 4
		String[] opcionesEleccionForever = { "forever", "savor", "hate you", "forgive me" };
		try {
			Image discoChvrches = ImageIO.read(new File("./imagenes/chvrches.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Cancion cancionForever = new CancionJugada("forever", "chvrches",
		 * CategoríaMusical.ACTUAL, opcionesEleccionForever, 2018,
		 * "love is dead",discoChvrches,
		 * "./sonidos/ACTUALIDAD/forever.wav", Clip,false);
		 */

	}

}
