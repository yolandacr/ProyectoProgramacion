//TODO FALLA A LA HORA DE PONER ENTEROS EN EL TEXTFIELD. PREGUNTAR A MIGUEL SI PUEDO PONER EN LA BASE DE DATOS ESE CAMPO COMO VARCHAR O UNA ALTERNATIVA

package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;

import Clases.Cancion;
import Clases.Jugador;
import Clases.Partida;

import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;

/**
 * clase de la pantalla ranking
 * 
 * @author yolanda cordero
 *
 */
public class PantallaRanking extends JPanel {
	private Ventana ventana; // jframe base sobre el que trabajamos
	private JTextField nombreRanking1; // campo de los datos del jugador en la posicion 1
	private JTextField nombreRanking2; // campo de los datos del jugador en la posicion 2
	private JTextField nombreRanking3; // campo de los datos del jugador en la posicion 3
	private JTextField nombreRanking4; // campo de los datos del jugador en la posicion 4
	private JTextField nombreRanking5; // campo de los datos del jugador en la posicion 5
	private JTextField campoPuntos2;
	private JTextField campoPuntos4;
	private JTextField campoPuntos1;
	private JTextField campoPuntos3;
	private JTextField campoPuntos5;

	/**
	 * metodo constructor
	 * 
	 * @param v jframe base
	 */

	public PantallaRanking(Ventana v) {
		this.ventana = v;

		// generamos el ranking
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root", "1234");
			Statement smt = conexion.createStatement();
			ResultSet rankingResult = smt
					.executeQuery("SELECT nombre_jugador,puntos FROM rockola.partida order by puntos desc limit 5");

			byte contador = 0;
			ventana.nombresRanking = new String[5];

			while (rankingResult.next()) {
				ventana.nombresRanking[contador] = rankingResult.getString("nombre_jugador");
				// ventana.puntosRanking[contador] = rankingResult.getShort("puntos");
				contador++;

			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 42, 0, 31, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel textoPuntuaciones = new JLabel("Mejores Puntuaciones:");
		textoPuntuaciones.setForeground(new Color(255, 51, 255));
		textoPuntuaciones.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoPuntuaciones.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textoPuntuaciones = new GridBagConstraints();
		gbc_textoPuntuaciones.insets = new Insets(0, 0, 5, 5);
		gbc_textoPuntuaciones.gridx = 2;
		gbc_textoPuntuaciones.gridy = 1;
		add(textoPuntuaciones, gbc_textoPuntuaciones);

		// posicion 1

		JLabel textoPosicion1 = new JLabel("1.");
		textoPosicion1.setForeground(new Color(255, 51, 255));
		textoPosicion1.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion1 = new GridBagConstraints();
		gbc_textoPosicion1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textoPosicion1.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion1.gridx = 1;
		gbc_textoPosicion1.gridy = 3;
		add(textoPosicion1, gbc_textoPosicion1);

		nombreRanking1 = new JTextField();
		nombreRanking1.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking1.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking1.setForeground(new Color(204, 51, 255));
		nombreRanking1.setEditable(false);
		GridBagConstraints gbc_nombreRanking1 = new GridBagConstraints();
		gbc_nombreRanking1.insets = new Insets(0, 0, 5, 5);
		gbc_nombreRanking1.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreRanking1.gridx = 2;
		gbc_nombreRanking1.gridy = 3;
		add(nombreRanking1, gbc_nombreRanking1);
		nombreRanking1.setColumns(10);
		nombreRanking1.setText(ventana.nombresRanking[0]);

		campoPuntos1 = new JTextField();
		campoPuntos1.setEditable(false);
		GridBagConstraints gbc_campoPuntos1 = new GridBagConstraints();
		gbc_campoPuntos1.insets = new Insets(0, 0, 5, 5);
		gbc_campoPuntos1.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoPuntos1.gridx = 3;
		gbc_campoPuntos1.gridy = 3;
		add(campoPuntos1, gbc_campoPuntos1);
		campoPuntos1.setColumns(10);
		// campoPuntos1.setText((ventana.puntosRanking[0]).toString());

		// posicion 2

		JLabel textoPosicion2 = new JLabel("2.");
		textoPosicion2.setForeground(new Color(204, 51, 255));
		textoPosicion2.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion2 = new GridBagConstraints();
		gbc_textoPosicion2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textoPosicion2.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion2.gridx = 1;
		gbc_textoPosicion2.gridy = 4;
		add(textoPosicion2, gbc_textoPosicion2);

		nombreRanking2 = new JTextField();
		nombreRanking2.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking2.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking2.setForeground(new Color(255, 51, 255));
		nombreRanking2.setEditable(false);
		GridBagConstraints gbc_nombreRanking2 = new GridBagConstraints();
		gbc_nombreRanking2.insets = new Insets(0, 0, 5, 5);
		gbc_nombreRanking2.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreRanking2.gridx = 2;
		gbc_nombreRanking2.gridy = 4;
		add(nombreRanking2, gbc_nombreRanking2);
		nombreRanking2.setColumns(10);
		nombreRanking2.setText(ventana.nombresRanking[1]);

		campoPuntos2 = new JTextField();
		campoPuntos2.setEditable(false);
		GridBagConstraints gbc_campoPuntos2 = new GridBagConstraints();
		gbc_campoPuntos2.insets = new Insets(0, 0, 5, 5);
		gbc_campoPuntos2.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoPuntos2.gridx = 3;
		gbc_campoPuntos2.gridy = 4;
		add(campoPuntos2, gbc_campoPuntos2);
		campoPuntos2.setColumns(10);

		// POSICION 3

		JLabel textoPosicion3 = new JLabel("3.");
		textoPosicion3.setForeground(new Color(255, 51, 255));
		textoPosicion3.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion3 = new GridBagConstraints();
		gbc_textoPosicion3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textoPosicion3.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion3.gridx = 1;
		gbc_textoPosicion3.gridy = 5;
		add(textoPosicion3, gbc_textoPosicion3);

		nombreRanking3 = new JTextField();
		nombreRanking3.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking3.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking3.setForeground(new Color(204, 51, 255));
		nombreRanking3.setEditable(false);
		GridBagConstraints gbc_nombreRanking3 = new GridBagConstraints();
		gbc_nombreRanking3.insets = new Insets(0, 0, 5, 5);
		gbc_nombreRanking3.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreRanking3.gridx = 2;
		gbc_nombreRanking3.gridy = 5;
		add(nombreRanking3, gbc_nombreRanking3);
		nombreRanking3.setColumns(10);
		nombreRanking3.setText(ventana.nombresRanking[2]);

		campoPuntos3 = new JTextField();
		campoPuntos3.setEditable(false);
		GridBagConstraints gbc_campoPuntos3 = new GridBagConstraints();
		gbc_campoPuntos3.insets = new Insets(0, 0, 5, 5);
		gbc_campoPuntos3.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoPuntos3.gridx = 3;
		gbc_campoPuntos3.gridy = 5;
		add(campoPuntos3, gbc_campoPuntos3);
		campoPuntos3.setColumns(10);

		// POSICION 4
		JLabel textoPosicion4 = new JLabel("4.");
		textoPosicion4.setForeground(new Color(204, 51, 255));
		textoPosicion4.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion4 = new GridBagConstraints();
		gbc_textoPosicion4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textoPosicion4.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion4.gridx = 1;
		gbc_textoPosicion4.gridy = 6;
		add(textoPosicion4, gbc_textoPosicion4);

		nombreRanking4 = new JTextField();
		nombreRanking4.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking4.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking4.setForeground(new Color(255, 51, 255));
		nombreRanking4.setEditable(false);
		GridBagConstraints gbc_nombreRanking4 = new GridBagConstraints();
		gbc_nombreRanking4.insets = new Insets(0, 0, 5, 5);
		gbc_nombreRanking4.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreRanking4.gridx = 2;
		gbc_nombreRanking4.gridy = 6;
		add(nombreRanking4, gbc_nombreRanking4);
		nombreRanking4.setColumns(10);
		nombreRanking4.setText(ventana.nombresRanking[3]);

		campoPuntos4 = new JTextField();
		campoPuntos4.setEditable(false);
		GridBagConstraints gbc_campoPuntos4 = new GridBagConstraints();
		gbc_campoPuntos4.insets = new Insets(0, 0, 5, 5);
		gbc_campoPuntos4.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoPuntos4.gridx = 3;
		gbc_campoPuntos4.gridy = 6;
		add(campoPuntos4, gbc_campoPuntos4);
		campoPuntos4.setColumns(10);

		JButton botonInicio = new JButton("Inicio");
		botonInicio.setForeground(new Color(204, 51, 255));
		botonInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irInicio();
			}
		});

		// POSICION 5

		JLabel textoPosicion5 = new JLabel("5.");
		textoPosicion5.setForeground(new Color(255, 51, 255));
		textoPosicion5.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion5 = new GridBagConstraints();
		gbc_textoPosicion5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textoPosicion5.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion5.gridx = 1;
		gbc_textoPosicion5.gridy = 7;
		add(textoPosicion5, gbc_textoPosicion5);

		nombreRanking5 = new JTextField();
		nombreRanking5.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking5.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking5.setForeground(new Color(204, 51, 255));
		nombreRanking5.setEditable(false);
		GridBagConstraints gbc_nombreRanking5 = new GridBagConstraints();
		gbc_nombreRanking5.insets = new Insets(0, 0, 5, 5);
		gbc_nombreRanking5.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreRanking5.gridx = 2;
		gbc_nombreRanking5.gridy = 7;
		add(nombreRanking5, gbc_nombreRanking5);
		nombreRanking5.setColumns(10);
		nombreRanking5.setText(ventana.nombresRanking[4]);

		campoPuntos5 = new JTextField();
		campoPuntos5.setEditable(false);
		GridBagConstraints gbc_campoPuntos5 = new GridBagConstraints();
		gbc_campoPuntos5.insets = new Insets(0, 0, 5, 5);
		gbc_campoPuntos5.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoPuntos5.gridx = 3;
		gbc_campoPuntos5.gridy = 7;
		add(campoPuntos5, gbc_campoPuntos5);
		campoPuntos5.setColumns(10);
		botonInicio.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		GridBagConstraints gbc_botonInicio = new GridBagConstraints();
		gbc_botonInicio.insets = new Insets(0, 0, 0, 5);
		gbc_botonInicio.gridx = 2;
		gbc_botonInicio.gridy = 8;
		add(botonInicio, gbc_botonInicio);
	}

}
