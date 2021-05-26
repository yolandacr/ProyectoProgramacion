
//TODO PREGUNTAR A MIGUEL SI NO SERIA MEJOR UN ARRAYLIST PARA HACER LOS BOTONES CN CONTENIDO RANDOM Y ASI BORRAR EL QUE YA SALIERA
// peta al pulsar botones. creo q es fallo de los hilos
package InterfacesGraficas;

import javax.swing.JPanel;

import java.applet.AudioClip;
import java.awt.BorderLayout;
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
import Clases.CancionJugada;
import Hilos.Hilos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.swing.SwingConstants;

/**
 * clase para crear las pantallas del modo facil
 * 
 * @author yolanda cordero
 *
 */

public class PantallaJuegoFacil extends JPanel {

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

		this.ventana = v;

		Random r = new Random();
		
		
		actual = ventana.cancionesAJugar.get(r.nextInt(ventana.cancionesAJugar.size()));
		
		if (ventana.cancionesJugadas!=null&&ventana.cancionesJugadas.contains(actual)){
			ventana.cancionesAJugar.get(r.nextInt(ventana.cancionesAJugar.size()));
		}
		
		


		setLayout(null);
		JLabel textoPuntos = new JLabel("Puntos:");
		textoPuntos.setForeground(new Color(204, 51, 255));
		textoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoPuntos.setBounds(40, 21, 192, 42);
		add(textoPuntos);

		campoPuntos = new JTextField();
		campoPuntos.setForeground(new Color(255, 51, 255));
		campoPuntos.setEditable(false);
		campoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		campoPuntos.setBounds(252, 21, 35, 42);
		add(campoPuntos);
		campoPuntos.setColumns(10);
		
		//establecemos los puntos a los de la partida. Empezarán en 0
		
		
		campoPuntos.setText(String.valueOf(ventana.nuevaPartida.getPuntosPartida()));

		JButton botonOpcion1 = new JButton(actual.getOpcionesEleccion()[0]);
		botonOpcion1.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion1.setForeground(new Color(255, 51, 255));
		botonOpcion1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			

				if (botonOpcion1.getText().equalsIgnoreCase(actual.getNombre())) {
					ventana.irAciertoV2();
					ventana.totalAciertos++;
					ventana.cancionesJugadas.add(new CancionJugada(actual.getNombre(),actual.getAutor(),actual.getCategoria(),actual.getAño()
							,actual.getDisco(),actual.getRuta(),actual.getRutaImagen(),true));
					ventana.cancionesAJugar.remove(actual);
				} else {
					ventana.irFallo();
					ventana.cancionesJugadas.add(new CancionJugada(actual.getNombre(),actual.getAutor(),actual.getCategoria(),actual.getAño()
							,actual.getDisco(),actual.getRuta(),actual.getRutaImagen(),false));
					ventana.cancionesAJugar.remove(actual);
				}
				hiloMusical.parar();
	

			}
		});
		botonOpcion1.setBounds(75, 352, 337, 37);
		add(botonOpcion1);

		JButton botonOpcion2 = new JButton(actual.getOpcionesEleccion()[1]);
		botonOpcion2.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion2.setForeground(new Color(255, 51, 255));
		botonOpcion2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (botonOpcion2.getText().equalsIgnoreCase(actual.getNombre())) {
					ventana.irAciertoV2();
					ventana.totalAciertos++;
					ventana.cancionesJugadas.add(new CancionJugada(actual.getNombre(),actual.getAutor(),actual.getCategoria(),actual.getAño()
							,actual.getDisco(),actual.getRuta(),actual.getRutaImagen(),true));
					ventana.cancionesAJugar.remove(actual);
					
					
				} else {
					ventana.irFallo();
					ventana.cancionesJugadas.add(new CancionJugada(actual.getNombre(),actual.getAutor(),actual.getCategoria(),actual.getAño()
							,actual.getDisco(),actual.getRuta(),actual.getRutaImagen(),false));
					ventana.cancionesAJugar.remove(actual);
					
				}
				hiloMusical.parar();
				
			}
		});
		botonOpcion2.setBounds(511, 352, 337, 37);
		add(botonOpcion2);

		JButton botonOpcion4 = new JButton(actual.getOpcionesEleccion()[2]);
		botonOpcion4.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion4.setForeground(new Color(255, 51, 255));
		botonOpcion4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (botonOpcion4.getText().equalsIgnoreCase(actual.getNombre())) {
					ventana.irAciertoV2();
					ventana.totalAciertos++;
					ventana.cancionesJugadas.add(new CancionJugada(actual.getNombre(),actual.getAutor(),actual.getCategoria(),actual.getAño()
							,actual.getDisco(),actual.getRuta(),actual.getRutaImagen(),true));
					ventana.cancionesAJugar.remove(actual);
				} else {
					ventana.irFallo();
					ventana.cancionesJugadas.add(new CancionJugada(actual.getNombre(),actual.getAutor(),actual.getCategoria(),actual.getAño()
							,actual.getDisco(),actual.getRuta(),actual.getRutaImagen(),false));
					ventana.cancionesAJugar.remove(actual);
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

		JButton botonOpcion3 = new JButton(actual.getOpcionesEleccion()[3]);
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
					ventana.irAciertoV2();
					ventana.totalAciertos++;
					ventana.cancionesJugadas.add(new CancionJugada(actual.getNombre(),actual.getAutor(),actual.getCategoria(),actual.getAño()
							,actual.getDisco(),actual.getRuta(),actual.getRutaImagen(),true));
					ventana.cancionesAJugar.remove(actual);
				} else {
					ventana.irFallo();
					ventana.cancionesJugadas.add(new CancionJugada(actual.getNombre(),actual.getAutor(),actual.getCategoria(),actual.getAño()
							,actual.getDisco(),actual.getRuta(),actual.getRutaImagen(),false));
					ventana.cancionesAJugar.remove(actual);
				}
				
			hiloMusical.parar();
			
			}
		});
		botonOpcion3.setBounds(75, 440, 337, 37);
		add(botonOpcion3);

		// boton play

		JButton botonStop = new JButton("Stop");
		JButton botonPlay = new JButton("Play");
		botonPlay.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonPlay.setForeground(new Color(204, 51, 255));
		botonPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//instanciamos el hilo
				
				hiloMusical=new Hilos(actual.getRuta(),botonPlay,botonStop);
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
