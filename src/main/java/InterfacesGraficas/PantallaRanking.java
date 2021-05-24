//DOCUMENTACION OK
//TODO FALLA A LA HORA DE PONER ENTEROS EN EL TEXTFIELD. PREGUNTAR A MIGUEL SI PUEDO PONER EN LA BASE DE DATOS ESE CAMPO COMO VARCHAR O UNA ALTERNATIVA

package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
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
	private JTextField campoPuntos2; // campo de puntos para la posicion 2
	private JTextField campoPuntos4; // campo de puntos para la posicion 4
	private JTextField campoPuntos1; // campo de puntos para la posicion 1
	private JTextField campoPuntos3; // campo de puntos para la posicion 3
	private JTextField campoPuntos5; // campo de puntos para la posicion 5
	private JLabel etiquetaPuntos1; // texto "pts" al lado de la posicion 1
	private JLabel etiquetaPuntos2; // texto "pts" al lado de la posicion 2
	private JLabel etiquetaPuntos3; // texto "pts" al lado de la posicion 3
	private JLabel etiquetaPuntos4; // texto "pts" al lado de la posicion 4
	private JLabel etiquetaPuntos5; // texto "pts" al lado de la posicion 5

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
			ResultSet rankingResult = smt // hacemos la consulta
					.executeQuery("SELECT nombre_jugador,puntos FROM rockola.partida order by puntos desc limit 5");

			byte contador = 0;
			ventana.nombresRanking = new String[5];
			ventana.puntosRanking = new short[5];

			while (rankingResult.next()) {
				// guardamos en cada array
				ventana.nombresRanking[contador] = rankingResult.getString("nombre_jugador");
				ventana.puntosRanking[contador] = rankingResult.getShort("puntos");

				contador++;

			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		setLayout(null);

		JLabel textoPuntuaciones = new JLabel("Cuadro de Honor");
		textoPuntuaciones.setBounds(286, 117, 432, 35);
		textoPuntuaciones.setForeground(new Color(255, 51, 255));
		textoPuntuaciones.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoPuntuaciones.setHorizontalAlignment(SwingConstants.CENTER);
		add(textoPuntuaciones);

		// posicion 1

		JLabel textoPosicion1 = new JLabel("1.");
		textoPosicion1.setBounds(77, 269, 25, 28);
		textoPosicion1.setForeground(new Color(255, 51, 255));
		textoPosicion1.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(textoPosicion1);

		nombreRanking1 = new JTextField();
		nombreRanking1.setBounds(112, 266, 267, 34);
		nombreRanking1.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking1.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking1.setForeground(new Color(204, 51, 255));
		nombreRanking1.setEditable(false);
		add(nombreRanking1);
		nombreRanking1.setColumns(10);
		nombreRanking1.setText(ventana.nombresRanking[0]);

		campoPuntos1 = new JTextField();
		campoPuntos1.setBounds(395, 266, 464, 34);
		campoPuntos1.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntos1.setForeground(new Color(255, 51, 255));
		campoPuntos1.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		campoPuntos1.setEditable(false);
		add(campoPuntos1);
		campoPuntos1.setColumns(10);
		campoPuntos1.setText(String.valueOf(ventana.puntosRanking[0]));

		etiquetaPuntos1 = new JLabel("PTS");
		etiquetaPuntos1.setBounds(869, 266, 100, 34);
		etiquetaPuntos1.setForeground(new Color(204, 51, 255));
		etiquetaPuntos1.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(etiquetaPuntos1);

		// posicion 2

		JLabel textoPosicion2 = new JLabel("2.");
		textoPosicion2.setBounds(77, 307, 25, 28);
		textoPosicion2.setForeground(new Color(204, 51, 255));
		textoPosicion2.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(textoPosicion2);

		nombreRanking2 = new JTextField();
		nombreRanking2.setBounds(112, 305, 267, 34);
		nombreRanking2.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking2.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking2.setForeground(new Color(255, 51, 255));
		nombreRanking2.setEditable(false);
		add(nombreRanking2);
		nombreRanking2.setColumns(10);
		nombreRanking2.setText(ventana.nombresRanking[1]);

		campoPuntos2 = new JTextField();
		campoPuntos2.setBounds(395, 305, 464, 34);
		campoPuntos2.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntos2.setForeground(new Color(204, 51, 255));
		campoPuntos2.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		campoPuntos2.setEditable(false);
		add(campoPuntos2);
		campoPuntos2.setColumns(10);
		campoPuntos2.setText(String.valueOf(ventana.puntosRanking[1]));

		etiquetaPuntos2 = new JLabel("pts");
		etiquetaPuntos2.setBounds(869, 310, 68, 28);
		etiquetaPuntos2.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		etiquetaPuntos2.setForeground(new Color(255, 51, 255));
		add(etiquetaPuntos2);

		// POSICION 3

		JLabel textoPosicion3 = new JLabel("3.");
		textoPosicion3.setBounds(77, 346, 25, 28);
		textoPosicion3.setForeground(new Color(255, 51, 255));
		textoPosicion3.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(textoPosicion3);

		nombreRanking3 = new JTextField();
		nombreRanking3.setBounds(112, 344, 267, 34);
		nombreRanking3.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking3.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking3.setForeground(new Color(204, 51, 255));
		nombreRanking3.setEditable(false);
		add(nombreRanking3);
		nombreRanking3.setColumns(10);
		nombreRanking3.setText(ventana.nombresRanking[2]);

		campoPuntos3 = new JTextField();
		campoPuntos3.setBounds(395, 344, 464, 34);
		campoPuntos3.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntos3.setForeground(new Color(255, 51, 255));
		campoPuntos3.setEditable(false);
		campoPuntos3.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(campoPuntos3);
		campoPuntos3.setColumns(10);
		campoPuntos3.setText(String.valueOf(ventana.puntosRanking[2]));

		etiquetaPuntos3 = new JLabel("pts");
		etiquetaPuntos3.setBounds(869, 348, 68, 28);
		etiquetaPuntos3.setForeground(new Color(204, 51, 255));
		etiquetaPuntos3.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(etiquetaPuntos3);

		// POSICION 4
		JLabel textoPosicion4 = new JLabel("4.");
		textoPosicion4.setBounds(77, 385, 25, 28);
		textoPosicion4.setForeground(new Color(204, 51, 255));
		textoPosicion4.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(textoPosicion4);

		nombreRanking4 = new JTextField();
		nombreRanking4.setBounds(112, 383, 267, 34);
		nombreRanking4.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking4.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking4.setForeground(new Color(255, 51, 255));
		nombreRanking4.setEditable(false);
		add(nombreRanking4);
		nombreRanking4.setColumns(10);
		nombreRanking4.setText(ventana.nombresRanking[3]);

		campoPuntos4 = new JTextField();
		campoPuntos4.setBounds(395, 383, 464, 34);
		campoPuntos4.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntos4.setForeground(new Color(204, 51, 255));
		campoPuntos4.setEditable(false);
		campoPuntos4.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(campoPuntos4);
		campoPuntos4.setColumns(10);
		campoPuntos4.setText(String.valueOf(ventana.puntosRanking[3]));

		JButton botonInicio = new JButton("Inicio");
		botonInicio.setBounds(379, 504, 243, 43);
		botonInicio.setForeground(new Color(204, 51, 255));
		botonInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irInicio();
			}
		});

		etiquetaPuntos4 = new JLabel("pts");
		etiquetaPuntos4.setBounds(869, 386, 68, 28);
		etiquetaPuntos4.setForeground(new Color(255, 51, 255));
		etiquetaPuntos4.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(etiquetaPuntos4);

		// POSICION 5

		JLabel textoPosicion5 = new JLabel("5.");
		textoPosicion5.setBounds(77, 424, 25, 28);
		textoPosicion5.setForeground(new Color(255, 51, 255));
		textoPosicion5.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(textoPosicion5);

		nombreRanking5 = new JTextField();
		nombreRanking5.setBounds(112, 422, 267, 34);
		nombreRanking5.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRanking5.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		nombreRanking5.setForeground(new Color(204, 51, 255));
		nombreRanking5.setEditable(false);
		add(nombreRanking5);
		nombreRanking5.setColumns(10);
		nombreRanking5.setText(ventana.nombresRanking[4]);

		campoPuntos5 = new JTextField();
		campoPuntos5.setBounds(395, 422, 464, 34);
		campoPuntos5.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntos5.setForeground(new Color(255, 51, 255));
		campoPuntos5.setText(String.valueOf(ventana.puntosRanking[4]));
		campoPuntos5.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		campoPuntos5.setEditable(false);
		add(campoPuntos5);
		campoPuntos5.setColumns(10);

		etiquetaPuntos5 = new JLabel("pts");
		etiquetaPuntos5.setBounds(869, 425, 68, 28);
		etiquetaPuntos5.setForeground(new Color(204, 51, 255));
		etiquetaPuntos5.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		add(etiquetaPuntos5);
		botonInicio.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		add(botonInicio);
	}

}
