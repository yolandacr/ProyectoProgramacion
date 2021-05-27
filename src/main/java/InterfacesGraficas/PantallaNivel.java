//DOCUMENTACION OK
package InterfacesGraficas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import Clases.Cancion;
import Clases.Jugador;
import Clases.Partida;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * clase para la pantalla nivel
 * 
 * @author yolanda cordero
 *
 */
public class PantallaNivel extends JPanel {
	private Ventana ventana;// objeto ventana base

	/**
	 * metodo constructor
	 * 
	 * @param v ventana jframe base
	 */
	public PantallaNivel(Ventana v) {
		this.ventana = v;
		setLayout(new GridLayout(0, 1, 0, 0));

		JLabel botonSelecciona = new JLabel("Selecciona el nivel de juego");
		botonSelecciona.setHorizontalAlignment(SwingConstants.CENTER);
		botonSelecciona.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonSelecciona.setForeground(new Color(204, 51, 255));
		add(botonSelecciona);

		JButton botonFacil = new JButton("Fácil");
		botonFacil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LocalDateTime fechaActual = LocalDateTime.now();
				ventana.nuevaPartida = new Partida(ventana.jugador, (short) 0, fechaActual, ventana.cancionesAJugar,botonFacil.getText());
				ventana.irFacil();
			}
		});
		botonFacil.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonFacil.setForeground(new Color(255, 51, 255));
		add(botonFacil);

		JButton botonExperto = new JButton("Experto");
		botonExperto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LocalDateTime fechaActual = LocalDateTime.now();
				ventana.nuevaPartida = new Partida(ventana.jugador, (short) 0, fechaActual, ventana.cancionesAJugar,botonExperto.getText());
				ventana.irAExperto();
			}
		});
		botonExperto.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonExperto.setForeground(new Color(255, 51, 255));
		add(botonExperto);

	}

}
