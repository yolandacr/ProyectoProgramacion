//DOCUMENTACION OK
package InterfacesGraficas;

import javax.swing.JPanel;
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
import java.awt.Insets;
import javax.swing.JTextField;

/**
 * Clase de la Pantalla Acierto version alternativa
 * 
 * @author Yolanda Cordero
 *
 */

public class PantallaFinPartida extends JPanel {
	private Ventana ventana;// variable de objeto ventana para pasarla por parámetros al constructor.
	private JTextField campoPuntos;

	/**
	 * consctructor de pantallas de acierto version alternativa
	 * 
	 * @param v ventana base
	 */

	public PantallaFinPartida(Ventana v) {
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel textoFin = new JLabel("¡El juego ha terminado!");
		textoFin.setForeground(new Color(204, 51, 255));
		textoFin.setFont(new Font("Goudy Stout", Font.PLAIN, 40));
		textoFin.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textoFin = new GridBagConstraints();
		gbc_textoFin.fill = GridBagConstraints.HORIZONTAL;
		gbc_textoFin.anchor = GridBagConstraints.NORTH;
		gbc_textoFin.insets = new Insets(0, 0, 5, 5);
		gbc_textoFin.gridx = 1;
		gbc_textoFin.gridy = 1;
		add(textoFin, gbc_textoFin);

		JLabel textoPuntos;

		JLabel textoPuntos1 = new JLabel("Has obtenido:");
		textoPuntos1.setHorizontalAlignment(SwingConstants.CENTER);
		textoPuntos1.setForeground(new Color(204, 51, 255));
		textoPuntos1.setFont(new Font("Dialog", Font.PLAIN, 30));
		GridBagConstraints gbc_textoPuntos1 = new GridBagConstraints();
		gbc_textoPuntos1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textoPuntos1.insets = new Insets(0, 0, 5, 5);
		gbc_textoPuntos1.gridx = 1;
		gbc_textoPuntos1.gridy = 2;
		add(textoPuntos1, gbc_textoPuntos1);

		campoPuntos = new JTextField();
		campoPuntos.setBackground(Color.BLACK);
		campoPuntos.setForeground(new Color(255, 51, 255));
		campoPuntos.setFont(new Font("Dialog", Font.PLAIN, 25));
		campoPuntos.setEditable(false);
		campoPuntos.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_campoPuntos = new GridBagConstraints();
		gbc_campoPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_campoPuntos.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoPuntos.gridx = 1;
		gbc_campoPuntos.gridy = 3;
		add(campoPuntos, gbc_campoPuntos);
		campoPuntos.setColumns(10);
		campoPuntos.setText(String.valueOf(ventana.nuevaPartida.getPuntosPartida()) + " PTS");

		JButton botonRanking = new BotonMadre("Ver Ranking");
		botonRanking.setHorizontalAlignment(SwingConstants.LEFT);
		botonRanking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
							"admin");

					Statement smt = conexion.createStatement();
					smt.executeUpdate("insert into partida values ("
							+ ventana.nuevaPartida.getPuntosPartida() + ",'" + ventana.nuevaPartida.getFecha() + "','"
							+ ventana.nuevaPartida.getJugador().getNombre() + "');");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				ventana.irARanking();
			}
		});

		botonRanking.setForeground(new Color(255, 51, 255));
		botonRanking.setFont(new Font("Dialog", Font.PLAIN, 30));
		GridBagConstraints gbc_botonRanking = new GridBagConstraints();
		gbc_botonRanking.insets = new Insets(0, 0, 5, 5);
		gbc_botonRanking.anchor = GridBagConstraints.NORTH;
		gbc_botonRanking.gridx = 1;
		gbc_botonRanking.gridy = 7;
		add(botonRanking, gbc_botonRanking);

	}
}
