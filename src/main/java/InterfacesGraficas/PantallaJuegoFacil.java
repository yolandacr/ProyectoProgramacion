
//TODO PREGUNTAR A MIGUEL SI NO SERIA MEJOR UN ARRAYLIST PARA HACER LOS BOTONES CN CONTENIDO RANDOM Y ASI BORRAR EL QUE YA SALIERA
package InterfacesGraficas;

import javax.swing.JPanel;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

import Clases.Cancion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * clase para crear las pantallas del modo facil
 * 
 * @author yolanda cordero
 *
 */

public class PantallaJuegoFacil extends JPanel {

	// private Cancion cancion= new
	// Cancion("./sonidos/ACTUALIDAD/aliceWonder.wav");//crea el objeto
	// reproductor que reproduce el audio en el reproductor.

	private Ventana ventana;// objeto ventana base
	private JTextField campoPuntos;// campo donde aparecen los puntos acumulados
	private Cancion actual;// cancion con la que se juega en el momento dado

	/**
	 * metodo constructor
	 * 
	 * @param v jframe base
	 */
	public PantallaJuegoFacil(Ventana v) {

		this.ventana = v;

		Random r = new Random();
		actual = ventana.cancionesAJugar.get(r.nextInt(10));
		Cancion reproduccionActual = new Cancion(actual.getRuta());
		

		setLayout(null);
		JLabel textoPuntos = new JLabel("Puntos:");
		textoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		textoPuntos.setBounds(40, 21, 155, 42);
		add(textoPuntos);

		campoPuntos = new JTextField();
		campoPuntos.setEditable(false);
		campoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 18));
		campoPuntos.setBounds(205, 33, 96, 19);
		add(campoPuntos);
		campoPuntos.setColumns(10);
		int puntosPartida = ventana.nuevaPartida.getPuntosPartida();
		String puntos = Integer.toString(puntosPartida);

		campoPuntos.setText(puntos);

		JButton botonOpcion1 = new JButton(actual.getOpcionesEleccion()[0]);
		botonOpcion1.setBounds(248, 352, 214, 21);
		add(botonOpcion1);

		JButton botonOpcion2 = new JButton(actual.getOpcionesEleccion()[1]);
		botonOpcion2.setBounds(556, 352, 214, 21);
		add(botonOpcion2);

		JButton botonOpcion4 = new JButton(actual.getOpcionesEleccion()[2]);
		botonOpcion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonOpcion4.setBounds(556, 418, 214, 19);
		add(botonOpcion4);

		JButton botonOpcion3 = new JButton(actual.getOpcionesEleccion()[3]);
		botonOpcion3.setBounds(248, 417, 214, 21);
		add(botonOpcion3);

		JButton botonPlay = new JButton("Play");
		botonPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				actual.play();

			}
		});
		botonPlay.setBounds(685, 111, 85, 21);
		add(botonPlay);

		JButton botonStop = new JButton("Stop");
		botonStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				actual.stop();
			}
		});
		botonStop.setBounds(833, 111, 85, 21);
		add(botonStop);
	}

}
