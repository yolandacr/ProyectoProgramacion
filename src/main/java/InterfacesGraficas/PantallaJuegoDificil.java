package InterfacesGraficas;

import javax.swing.JPanel;
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

/**
 * clase de la pantalla del modo dificil
 * 
 * @author yolanda cordero
 *
 */
public class PantallaJuegoDificil extends JPanel {
	//private Cancion cancion = new Cancion("./sonidos/ACTUALIDAD/aliceWonder.wav");// crea el objeto
	// reproductor que reproduce el audio en el reproductor. Se tiene que borrar

	private Ventana ventana;// objeto ventana base
	private JTextField campoPuntos;// campo donde aparecen los puntos acumulados
	private JTextField campoRespuesta;// campo donde escribir la respuesta

	/**
	 * metodo constructor
	 * 
	 * @param v objeto jframe base
	 */
	public PantallaJuegoDificil(Ventana v) {
		this.ventana = v;
		setLayout(null);
		JLabel textoPuntos = new JLabel("Puntos:");
		textoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		textoPuntos.setBounds(40, 21, 155, 42);
		add(textoPuntos);

		campoPuntos = new JTextField();
		campoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 18));
		campoPuntos.setBounds(205, 33, 96, 19);
		add(campoPuntos);
		campoPuntos.setColumns(10);

		JButton botonPlay = new JButton("Play");
		botonPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		botonPlay.setBounds(320, 221, 85, 21);
		add(botonPlay);

		JButton botonStop = new JButton("Stop");
		botonStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		botonStop.setBounds(527, 221, 85, 21);
		add(botonStop);

		JLabel etiquetaRespuesta = new JLabel("Dime el título de la canción:");
		etiquetaRespuesta.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		etiquetaRespuesta.setBounds(123, 349, 627, 57);
		add(etiquetaRespuesta);

		campoRespuesta = new JTextField();
		campoRespuesta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		campoRespuesta.setBounds(133, 420, 596, 51);
		add(campoRespuesta);
		campoRespuesta.setColumns(10);

		JButton botonOk = new JButton("OK");
		botonOk.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		botonOk.setBounds(400, 547, 110, 57);
		add(botonOk);
	}
}
