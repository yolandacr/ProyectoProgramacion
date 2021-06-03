
package InterfacesGraficas;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JTextField;
import Clases.Cancion;
import Hilos.Hilo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * clase de la pantalla base del juego (superclase) de ella heredan PantallaJuegoDificil y PantallaJuegoFacil.
 * 
 * @author yolanda cordero
 *
 */
public class PantallaJuegoBase extends PanelMadre {

	private Ventana ventana;// objeto ventana base
	private JTextField campoPuntos;// campo donde aparecen los puntos acumulados
	private Cancion actual;// cancion con la que se juega en el momento dado
	private File archivoSonido;// archivo de sonido
	private Clip sonido;// objeto reproducible del sonido
	private Hilo hiloMusical;// variable que contendrá la ejecución de la musica

	/**
	 * metodo constructor
	 * 
	 * @param v objeto jframe base
	 */
	public PantallaJuegoBase(Ventana v) {
		this.ventana = v;

		Random r = new Random();
		actual = ventana.cancionesCategoria.get(r.nextInt(ventana.cancionesCategoria.size()));
		ventana.cancionesPartida.add(actual);

		AudioInputStream audioInputStream;
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File(actual.getRuta()));
			sonido = AudioSystem.getClip();
			sonido.open(audioInputStream);
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e2) {
			e2.printStackTrace();
		}

		setLayout(null);
		JLabel textoPuntos = new JLabel("Puntos:");
		textoPuntos.setForeground(new Color(204, 51, 255));
		textoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoPuntos.setBounds(40, 21, 187, 42);
		add(textoPuntos);

		campoPuntos = new JTextField();
		campoPuntos.setBackground(new Color(0, 0, 0));
		campoPuntos.setForeground(new Color(204, 51, 255));
		campoPuntos.setEditable(false);
		campoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		campoPuntos.setBounds(237, 22, 96, 42);
		add(campoPuntos);
		campoPuntos.setColumns(10);

		// ponemos los puntos a los de la partida. Empieza en 0
		int puntosPartida = ventana.nuevaPartida.getPuntosPartida();
		String puntos = Integer.toString(puntosPartida);
		campoPuntos.setText(puntos);

		JButton botonStop = new BotonMadre("Stop");
		JButton botonPlay = new BotonMadre("Play");

		botonPlay.setForeground(new Color(255, 51, 255));
		botonPlay.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		botonPlay.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// instanciamos el hilo
				if (botonPlay.isEnabled()) {
					hiloMusical = new Hilo(actual.getRuta(), botonPlay, botonStop);
					hiloMusical.start();
				}

			}

		});
		botonPlay.setBounds(223, 210, 177, 51);
		add(botonPlay);

		botonStop.setForeground(new Color(255, 51, 255));
		botonStop.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		botonStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (hiloMusical != null) {
					hiloMusical.parar();
				}

			}
		});
		botonStop.setBounds(571, 210, 177, 51);
		add(botonStop);
	}

	/**
	 * método getter de ventana
	 * 
	 * @return un objeto ventana
	 */

	public Ventana getVentana() {
		return ventana;
	}

	/**
	 * método getter de CampoPuntos
	 * 
	 * @return el contenido de CampoPuntos
	 */

	public JTextField getCampoPuntos() {
		return campoPuntos;
	}

	/**
	 * método getter de la canción actual
	 * 
	 * @return un objeto cancion actual
	 */

	public Cancion getActual() {
		return actual;
	}

	/**
	 * método getter para el archivo de sonido (file)
	 * 
	 * @return un file con el archivo de sonido
	 */
	public File getArchivoSonido() {
		return archivoSonido;
	}

	/**
	 * método getter para sonido
	 * 
	 * @return un clip reproducible sonido
	 */
	public Clip getSonido() {
		return sonido;
	}

	/**
	 * método getter para el hilo musical
	 * 
	 * @return un objeto hiloMusical.
	 */

	public Hilo getHiloMusical() {
		return hiloMusical;
	}

}
