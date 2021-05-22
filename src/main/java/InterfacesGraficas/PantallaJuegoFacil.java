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

public class PantallaJuegoFacil extends JPanel {
	//private Cancion cancion= new Cancion("./sonidos/ACTUALIDAD/aliceWonder.wav");//crea el objeto
    //reproductor que reproduce el audio en el reproductor.
	
	private Ventana ventana;//objeto ventana base
	private JTextField campoPuntos;
	private Cancion actual;
	
	
	
	public PantallaJuegoFacil(Ventana v) {
		
		this.ventana=v;
		
		Random r=new Random();
		actual=ventana.cancionesAJugar.get(r.nextInt(10));
		Cancion reproduccionActual=new Cancion(actual.getRuta());
		
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
		short puntosPartida=ventana.nuevaPartida.getPuntosPartida();
		
		campoPuntos.setText(ventana.nuevaPartida.getPuntosPartida());
		
		JButton botonOpcion1 = new JButton(actual.getOpcionesEleccion()[0]);
		botonOpcion1.setBounds(248, 352, 214, 21);
		add(botonOpcion1);
		
		JButton botonOpcion2 = new JButton(actual.getOpcionesEleccion()[1]);
		botonOpcion2.setBounds(556, 352, 214, 21);
		add(botonOpcion2);
		
		JButton botonOpcionCorrecta = new JButton(actual.getOpcionesEleccion()[2]);
		botonOpcionCorrecta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonOpcionCorrecta.setBounds(556, 418, 214, 19);
		add(botonOpcionCorrecta);
		
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
