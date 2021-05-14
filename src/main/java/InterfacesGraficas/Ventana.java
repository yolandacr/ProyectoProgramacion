package InterfacesGraficas;

import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

@SuppressWarnings("serial")

/**
 * 
 * @author Yolanda Cordero
 * La siguiente clase corresponde a nuestra ventana base. Constructor y métodos que nos dejaran navegar por las pantallas correctamente.
 */
public class Ventana extends JFrame {
	private PantallaInicio inicio;//objeto para la pantalla de inicio
	private PantallaRegistro registro;//objeto para la pantalla de registro
	private PantallaLogin login;
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
		if(this.registro==null) {
			this.registro=new PantallaRegistro(this);
		}
		if(registro!=null) {this.registro.setVisible(false);}
		this.setContentPane(registro);
		this.registro.setVisible(true);
	}
	
	public void irALogin() {
		if(this.login==null) {
			this.login=new PantallaLogin(this);
		}
		if(login!=null) {this.login.setVisible(false);}
		this.setContentPane(login);
		this.login.setVisible(true);
	}
	
	public void irInicio() {
		if(this.inicio==null) {
			this.inicio=new PantallaInicio(this);
		}
		if(inicio!=null) {this.inicio.setVisible(false);}
		this.setContentPane(inicio);
		this.inicio.setVisible(true);
	}
}
