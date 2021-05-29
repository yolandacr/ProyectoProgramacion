
package InterfacesGraficas;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JTextField;
import Clases.Cancion;
import Hilos.Hilos;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/**
 * clase para crear las pantallas del modo facil
 * 
 * @author yolanda cordero
 *
 */

public class PantallaJuegoFacil extends PanelMadre {

	private Ventana ventana;// objeto ventana base
	private JTextField campoPuntos;// campo donde aparecen los puntos acumulados
	private Cancion actual;// cancion con la que se juega en el momento dado
	private File archivoSonido;// archivo de sonido
	private Clip sonido;// objeto reproducible del sonido
	private Hilos hiloMusical;// variable que contendrá la ejecución de la musica

	/**
	 * metodo constructor
	 * 
	 * @param v jframe base
	 */
	public PantallaJuegoFacil(Ventana v) {
		ventana.cancionesPartida= new ArrayList<Cancion>();

		this.ventana = v;

		Random r = new Random();

		actual = ventana.cancionesCategoria.get(r.nextInt(ventana.cancionesCategoria.size()));

		ventana.cancionesPartida.add(actual);

		setLayout(null);
		JLabel textoPuntos = new JLabel("Puntos:");
		textoPuntos.setForeground(new Color(204, 51, 255));
		textoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoPuntos.setBounds(10, 21, 200, 42);
		add(textoPuntos);

		campoPuntos = new JTextField();
		campoPuntos.setBackground(Color.BLACK);
		campoPuntos.setForeground(new Color(255, 51, 255));
		campoPuntos.setEditable(false);
		campoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		campoPuntos.setBounds(206, 22, 101, 42);
		add(campoPuntos);
		campoPuntos.setColumns(10);

		// establecemos los puntos a los de la partida. Empezarán en 0

		campoPuntos.setText(String.valueOf(ventana.nuevaPartida.getPuntosPartida()));

		// opcion 1

		JButton botonOpcion1 = new BotonMadre(actual.getOpcionesEleccion()[0]);
		botonOpcion1.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion1.setForeground(new Color(255, 51, 255));
		botonOpcion1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (botonOpcion1.getText().equalsIgnoreCase(actual.getNombre())) {
					ventana.cancionesCategoria.remove(actual);
					ventana.irAciertoV2();

				} else {
					ventana.cancionesCategoria.remove(actual);
					ventana.irFallo();

				}
				if (hiloMusical != null) {
					hiloMusical.parar();
				}

			}
		});
		botonOpcion1.setBounds(75, 352, 337, 37);
		add(botonOpcion1);

		// opcion 2

		JButton botonOpcion2 = new BotonMadre(actual.getOpcionesEleccion()[1]);
		botonOpcion2.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion2.setForeground(new Color(255, 51, 255));
		botonOpcion2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (botonOpcion2.getText().equalsIgnoreCase(actual.getNombre())) {
					ventana.cancionesCategoria.remove(actual);
					ventana.irAciertoV2();

				} else {
					ventana.cancionesCategoria.remove(actual);
					ventana.irFallo();

				}
				hiloMusical.parar();

			}
		});
		botonOpcion2.setBounds(511, 352, 337, 37);
		add(botonOpcion2);

		// opcion 3

		JButton botonOpcion4 = new BotonMadre(actual.getOpcionesEleccion()[2]);
		botonOpcion4.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion4.setForeground(new Color(255, 51, 255));
		botonOpcion4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (botonOpcion4.getText().equalsIgnoreCase(actual.getNombre())) {
					ventana.cancionesCategoria.remove(actual);
					ventana.irAciertoV2();
				} else {
					ventana.cancionesCategoria.remove(actual);
					ventana.irFallo();

				}
				hiloMusical.parar();
			}
		});
		botonOpcion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonOpcion4.setBounds(511, 440, 337, 37);
		add(botonOpcion4);

		// opcion 4

		JButton botonOpcion3 = new BotonMadre(actual.getOpcionesEleccion()[3]);
		botonOpcion3.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion3.setForeground(new Color(255, 51, 255));
		botonOpcion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonOpcion3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (botonOpcion3.getText().equalsIgnoreCase(actual.getNombre())) {

					ventana.cancionesCategoria.remove(actual);
					ventana.irAciertoV2();

				} else {

					ventana.cancionesCategoria.remove(actual);
					ventana.irFallo();

				}

				if (hiloMusical != null) {
					hiloMusical.parar();
				}
			}
		});
		botonOpcion3.setBounds(75, 440, 337, 37);
		add(botonOpcion3);

		// boton play y stop

		JButton botonStop = new BotonMadre("Stop");
		JButton botonPlay = new BotonMadre("Play");
		botonPlay.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonPlay.setForeground(new Color(204, 51, 255));
		botonPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// instanciamos el hilo

				hiloMusical = new Hilos(actual.getRuta(), botonPlay, botonStop);
				hiloMusical.start();

			}
		});
		botonPlay.setBounds(276, 148, 136, 57);
		add(botonPlay);

		botonStop.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonStop.setForeground(new Color(204, 51, 255));
		botonStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hiloMusical.parar();
			}
		});
		botonStop.setBounds(511, 148, 136, 57);
		add(botonStop);

	}

}
