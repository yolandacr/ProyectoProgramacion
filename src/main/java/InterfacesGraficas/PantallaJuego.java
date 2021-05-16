package InterfacesGraficas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaJuego extends JPanel {
	public PantallaJuego() {
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
		
		JButton botonOpcion1 = new JButton("Opción1");
		botonOpcion1.setBounds(377, 352, 85, 21);
		add(botonOpcion1);
		
		JButton botonOpcion2 = new JButton("Opción2");
		botonOpcion2.setBounds(556, 352, 85, 21);
		add(botonOpcion2);
		
		JButton botonOpcionCorrecta = new JButton("Opción4");
		botonOpcionCorrecta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonOpcionCorrecta.setBounds(556, 418, 85, 19);
		add(botonOpcionCorrecta);
		
		JButton botonOpcion3 = new JButton("Opción3");
		botonOpcion3.setBounds(377, 417, 85, 21);
		add(botonOpcion3);
		
		JButton botonPlay = new JButton("Play");
		botonPlay.setBounds(685, 111, 85, 21);
		add(botonPlay);
		
		JButton botonStop = new JButton("Stop");
		botonStop.setBounds(833, 111, 85, 21);
		add(botonStop);
	}
	private Ventana ventana;//objeto ventana base
	private JTextField campoPuntos;
}
