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
import Interfaces.FuncionesVentana;

@SuppressWarnings("serial")

/**
 * 
 * @author Yolanda Cordero La siguiente clase corresponde a nuestra ventana
 *         base. Constructor y métodos que nos dejaran navegar por las pantallas
 *         correctamente.
 */
public class Ventana extends JFrame implements FuncionesVentana {
	private PantallaInicio inicio;// objeto para la pantalla de inicio
	private PantallaRegistro registro;// objeto para la pantalla de registro
	private PantallaLogin login;
	private PantallaJuegoFacil juegoFacil;
	private PantallaJuegoDificil juegoDificil;
	private PantallaNivel nivel;
	private PantallaCategoria categoria;
	private PantallaAciertov2 acierto;
	private PantallaFallo fallo;
	private PantallaRanking ranking;
	protected Jugador jugador;
	protected String[] opcionesCancionActual;
	protected ArrayList<Cancion> cancionesAJugar;
	protected Partida nuevaPartida;
	protected String[] nombresRanking;
	protected short[]puntosRanking;
	/*
	 * private PantallaNivel nivel; private PantallaCategoria categoria; private
	 * PantallaJuego juego; private PantallaAcierto aciertoONo; private
	 * PantallaResultado resultado; private PantallaRanking ranking;
	 */

	/**
	 * constructor sin argumentos.
	 */

	public Ventana() {
		this.setSize(1000, 700);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Rockola Boomer");
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setLocation(200, 100);

		try {
			Image imagen = ImageIO.read(new File("./imagenes/icono.png"));
			this.setIconImage(imagen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.inicio = new PantallaInicio(this);
		this.setContentPane(this.inicio); // Con esto ponemos el contenido de la ventana.

		// El setvisible debe ser lo ultimo para que aplique todo.
		this.setVisible(true); // Con esto se puede ver la ventana

	}

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
	
	

}
