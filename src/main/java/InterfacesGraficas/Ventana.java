

package InterfacesGraficas;

import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import Clases.Cancion;
import Clases.Jugador;
import Clases.Partida;
import Hilos.HiloIntro;
import Interfaces.FuncionesVentana;

@SuppressWarnings("serial")

/**
 * 
 * @author Yolanda Cordero La siguiente clase corresponde a nuestra ventana
 *         base. Constructor y métodos que nos dejaran navegar por las pantallas
 *         correctamente.
 */
public class Ventana extends JFrame implements FuncionesVentana {
	private PantallaInicio inicio; // objeto para la pantalla de inicio
	private PantallaRegistro registro; // objeto para la pantalla de registro
	private PantallaLogin login; // objeto para la pantalla de Login
	private PantallaJuegoFacil juegoFacil; // objeto para la pantalla de modo Fácil
	private PantallaJuegoDificil juegoDificil; // objeto para la pantalla de modo Experto
	private PantallaNivel nivel; // objeto para la pantalla de nivel
	private PantallaCategoria categoria; // objeto para la pantalla de categoría
	private PantallaAciertov2 acierto; // objeto para la pantalla de acierto
	private PantallaFallo fallo; // objeto para la pantalla de fallo
	private PantallaRanking ranking; // objeto para la pantalla de ranking
	private PantallaFinPartida fin;// objeto de la pantalla de fin de juego
	protected Jugador jugador; // objeto para jugador
	protected String[] opcionesCancionActual; // array que guarda las opciones de la canción para elegir entre ellas.
	protected ArrayList<Cancion> cancionesCategoria; // ArrayList que guarda las canciones de toda la categoria.
	protected ArrayList<Cancion> cancionesPartida; // ArrayList que guarda las canciones de la partida.
	protected Partida nuevaPartida; // objeto para crear una nueva partida cuando empezamos
	protected String[] nombresRanking; // array que guarda los nombres de los 5 jugadores con más puntuación.
	protected short[] puntosRanking; // array con el top 5 de puntuaciones
	protected HiloIntro hiloMusical;// variable que contendrá la ejecución de la musica
	

	/**
	 * constructor sin argumentos para instanciar objetos Ventana.
	 */

	public Ventana() {
		cancionesPartida= new ArrayList<Cancion>();
		
		this.setSize(1000, 700);// tamaño de la ventana en píxeles
		this.setResizable(false); // indica que no se puede modificar el tamaño
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// cierra el programa cuando cerramos en la "x"

		this.setTitle("Rockola Boomer");
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setLocation(200, 100);

		// creamos el icono del juego

		try {
			Image imagen = ImageIO.read(new File("./imagenes/icono.png"));
			this.setIconImage(imagen);
		} catch (IOException e) {
			e.printStackTrace();
		}

		this.inicio = new PantallaInicio(this);
		this.setContentPane(this.inicio); // Con esto ponemos el contenido de la ventana.

		// El setvisible debe ser lo ultimo para que aplique todo.
		this.setVisible(true); // Con esto se puede ver la ventana

	}

	/**
	 * método para ir a la pantalla de registro
	 */

	public void irARegistro() {
		if (this.registro == null) {
			this.registro = new PantallaRegistro(this);
		}
		if (registro != null) {
			this.registro.setVisible(false);
		}
		this.setContentPane(registro);
		this.registro.setVisible(true);
	}

	/**
	 * método para ir a la pantalla de Login
	 */

	public void irALogin() {
		if (this.login == null) {
			this.login = new PantallaLogin(this);
		}
		if (login != null) {
			this.login.setVisible(false);
		}
		this.setContentPane(login);
		this.login.setVisible(true);
	}

	/**
	 * método para ir a la pantalla de Inicio
	 */
	public void irInicio() {
		if (this.inicio == null) {
			this.inicio = new PantallaInicio(this);
		}
		if (inicio != null) {
			this.inicio.setVisible(false);
		}
		this.setContentPane(inicio);
		this.inicio.setVisible(true);
	}

	/**
	 * método para ir a la pantalla del juego en modo fácil
	 */

	public void irFacil() {
		if (this.juegoFacil == null) {
			this.juegoFacil = new PantallaJuegoFacil(this);
		}
		if (juegoFacil != null) {
			this.juegoFacil.setVisible(false);
		}
		this.setContentPane(juegoFacil);
		this.juegoFacil.setVisible(true);
	}

	/**
	 * este método resetea la pantalla de juego y la prepara para la proxima ronda
	 */
	public void siguienteCancion() {
		this.juegoFacil = null;
		this.juegoDificil = null;
	}

	/**
	 * método para ir a la pantalla del juego en modo experto
	 */

	public void irAExperto() {
		if (this.juegoDificil == null) {
			this.juegoDificil = new PantallaJuegoDificil(this);
		}
		if (juegoDificil != null) {
			this.juegoDificil.setVisible(false);
		}
		this.setContentPane(juegoDificil);
		this.juegoDificil.setVisible(true);
	}

	/**
	 * método para ir a la pantalla de elección de Categoría
	 */

	public void irACategoria() {
		if (this.categoria == null) {
			this.categoria = new PantallaCategoria(this);
		}
		if (categoria != null) {
			this.categoria.setVisible(false);
		}
		this.setContentPane(categoria);
		this.categoria.setVisible(true);
	}

	/**
	 * método para ir a la pantalla de elección de nivel
	 */

	public void irANivel() {
		if (this.nivel == null) {
			this.nivel = new PantallaNivel(this);
		}
		if (nivel != null) {
			this.nivel.setVisible(false);
		}
		this.setContentPane(nivel);
		this.nivel.setVisible(true);
	}

	/**
	 * método para ir a la pantalla de Ranking
	 */

	public void irARanking() {
		if (this.ranking == null) {
			this.ranking = new PantallaRanking(this);
		}
		if (ranking != null) {
			this.ranking.setVisible(false);
		}
		this.setContentPane(ranking);
		this.ranking.setVisible(true);
	}

	/**
	 * método para ir a la pantalla de acierto (version alternativa)
	 */

	@Override
	public void irAciertoV2() {
		if (this.acierto == null) {
			this.acierto = new PantallaAciertov2(this);
		}
		if (acierto != null) {
			this.acierto.setVisible(false);
		}
		this.setContentPane(acierto);
		this.acierto.setVisible(true);

	}

	/**
	 * método para ir a la pantalla de fallo
	 */

	@Override
	public void irFallo() {
		if (this.fallo == null) {
			this.fallo = new PantallaFallo(this);
		}
		if (fallo != null) {
			this.fallo.setVisible(false);
		}
		this.setContentPane(fallo);
		this.fallo.setVisible(true);

	}

	/**
	 * metodo para ir al final del juego
	 */

	public void irFin() {
		if (this.fin == null) {
			this.fin = new PantallaFinPartida(this);
		}
		if (fin != null) {
			this.fin.setVisible(false);
		}
		this.setContentPane(fin);
		this.fin.setVisible(true);

	}

}
