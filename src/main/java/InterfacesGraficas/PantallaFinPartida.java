
package InterfacesGraficas;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.awt.Insets;
import javax.swing.JTextField;

/**
 * Clase de la Pantalla Acierto version alternativa
 * 
 * @author Yolanda Cordero
 *
 */

public class PantallaFinPartida extends PanelMadre {
	private Ventana ventana;// variable de objeto ventana para pasarla por parámetros al constructor.
	private JTextField campoPuntos;// en este campo aparecerán los puntos de la partida

	/**
	 * consctructor de pantallas de acierto version alternativa
	 * 
	 * @param v ventana base
	 */

	public PantallaFinPartida(Ventana v) {
		this.ventana = v;

		JLabel textoPuntos;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 35, 0, 41, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel texto3 = new JLabel("¡El juego ha terminado!");
		texto3.setForeground(new Color(204, 51, 255));
		texto3.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
		GridBagConstraints gbc_texto3 = new GridBagConstraints();
		gbc_texto3.fill = GridBagConstraints.BOTH;
		gbc_texto3.insets = new Insets(0, 0, 5, 5);
		gbc_texto3.gridx = 1;
		gbc_texto3.gridy = 1;
		add(texto3, gbc_texto3);

		JLabel textoObtenido2 = new JLabel("Has obtenido:");
		textoObtenido2.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		textoObtenido2.setForeground(new Color(204, 51, 255));
		GridBagConstraints gbc_textoObtenido2 = new GridBagConstraints();
		gbc_textoObtenido2.anchor = GridBagConstraints.NORTH;
		gbc_textoObtenido2.insets = new Insets(0, 0, 5, 5);
		gbc_textoObtenido2.gridx = 1;
		gbc_textoObtenido2.gridy = 3;
		add(textoObtenido2, gbc_textoObtenido2);

		JButton botonRanking = new BotonMadre("Ver Ranking");
		botonRanking.setHorizontalAlignment(SwingConstants.LEFT);
		botonRanking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					/*
					 * Connection conexion =
					 * DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola",
					 * "root","admin");
					 */
					Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root", "1234");

					Statement smt = conexion.createStatement();
					smt.executeUpdate("insert into partida values (" + (int) ventana.nuevaPartida.getPuntosPartida()
							+ ",'" + LocalDateTime.now() + "','" + ventana.nuevaPartida.getJugador().getNombre()
							+ "');");

					smt.close();
					conexion.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				ventana.reseteoJuego();
				ventana.irARanking();
			}
		});

		campoPuntos = new JTextField();
		campoPuntos.setBackground(Color.BLACK);
		campoPuntos.setForeground(new Color(255, 51, 255));
		campoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		campoPuntos.setEditable(false);
		campoPuntos.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_campoPuntos = new GridBagConstraints();
		gbc_campoPuntos.anchor = GridBagConstraints.NORTH;
		gbc_campoPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_campoPuntos.gridx = 1;
		gbc_campoPuntos.gridy = 5;
		add(campoPuntos, gbc_campoPuntos);
		campoPuntos.setColumns(10);
		campoPuntos.setText(String.valueOf(ventana.nuevaPartida.getPuntosPartida()) + " PTS");

		botonRanking.setForeground(new Color(255, 51, 255));
		botonRanking.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		GridBagConstraints gbc_botonRanking = new GridBagConstraints();
		gbc_botonRanking.insets = new Insets(0, 0, 5, 5);
		gbc_botonRanking.anchor = GridBagConstraints.NORTH;
		gbc_botonRanking.gridx = 1;
		gbc_botonRanking.gridy = 8;
		add(botonRanking, gbc_botonRanking);

	}
}
