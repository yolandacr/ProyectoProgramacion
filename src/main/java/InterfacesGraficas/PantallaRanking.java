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
import java.awt.Color;

/**
 * clase de la pantalla ranking
 * 
 * @author yolanda cordero
 *
 */
public class PantallaRanking extends JPanel {
	private Ventana ventana; // jframe base sobre el que trabajamos
	private JTextField campoRanking1; // campo de los datos del jugador en la posicion 1
	private JTextField campoRanking2; // campo de los datos del jugador en la posicion 2
	private JTextField campoRanking3; // campo de los datos del jugador en la posicion 3
	private JTextField campoRanking4; // campo de los datos del jugador en la posicion 4
	private JTextField campoRanking5; // campo de los datos del jugador en la posicion 5

	/**
	 * metodo constructor
	 * 
	 * @param v jframe base
	 */

	public PantallaRanking(Ventana v) {
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel textoPuntuaciones = new JLabel("Mejores Puntuaciones:");
		textoPuntuaciones.setForeground(new Color(255, 51, 255));
		textoPuntuaciones.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoPuntuaciones.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textoPuntuaciones = new GridBagConstraints();
		gbc_textoPuntuaciones.insets = new Insets(0, 0, 5, 5);
		gbc_textoPuntuaciones.gridx = 4;
		gbc_textoPuntuaciones.gridy = 1;
		add(textoPuntuaciones, gbc_textoPuntuaciones);

		JLabel textoPosicion1 = new JLabel("1.");
		textoPosicion1.setForeground(new Color(255, 51, 255));
		textoPosicion1.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion1 = new GridBagConstraints();
		gbc_textoPosicion1.anchor = GridBagConstraints.EAST;
		gbc_textoPosicion1.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion1.gridx = 3;
		gbc_textoPosicion1.gridy = 3;
		add(textoPosicion1, gbc_textoPosicion1);

		campoRanking1 = new JTextField();
		campoRanking1.setEditable(false);
		GridBagConstraints gbc_campoRanking1 = new GridBagConstraints();
		gbc_campoRanking1.insets = new Insets(0, 0, 5, 5);
		gbc_campoRanking1.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoRanking1.gridx = 4;
		gbc_campoRanking1.gridy = 3;
		add(campoRanking1, gbc_campoRanking1);
		campoRanking1.setColumns(10);

		JLabel textoPosicion2 = new JLabel("2.");
		textoPosicion2.setForeground(new Color(204, 51, 255));
		textoPosicion2.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion2 = new GridBagConstraints();
		gbc_textoPosicion2.anchor = GridBagConstraints.EAST;
		gbc_textoPosicion2.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion2.gridx = 3;
		gbc_textoPosicion2.gridy = 4;
		add(textoPosicion2, gbc_textoPosicion2);

		campoRanking2 = new JTextField();
		campoRanking2.setEditable(false);
		GridBagConstraints gbc_campoRanking2 = new GridBagConstraints();
		gbc_campoRanking2.insets = new Insets(0, 0, 5, 5);
		gbc_campoRanking2.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoRanking2.gridx = 4;
		gbc_campoRanking2.gridy = 4;
		add(campoRanking2, gbc_campoRanking2);
		campoRanking2.setColumns(10);

		JLabel textoPosicion3 = new JLabel("3.");
		textoPosicion3.setForeground(new Color(255, 51, 255));
		textoPosicion3.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion3 = new GridBagConstraints();
		gbc_textoPosicion3.anchor = GridBagConstraints.EAST;
		gbc_textoPosicion3.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion3.gridx = 3;
		gbc_textoPosicion3.gridy = 5;
		add(textoPosicion3, gbc_textoPosicion3);

		campoRanking3 = new JTextField();
		campoRanking3.setEditable(false);
		GridBagConstraints gbc_campoRanking3 = new GridBagConstraints();
		gbc_campoRanking3.insets = new Insets(0, 0, 5, 5);
		gbc_campoRanking3.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoRanking3.gridx = 4;
		gbc_campoRanking3.gridy = 5;
		add(campoRanking3, gbc_campoRanking3);
		campoRanking3.setColumns(10);

		JLabel textoPosicion4 = new JLabel("4.");
		textoPosicion4.setForeground(new Color(204, 51, 255));
		textoPosicion4.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion4 = new GridBagConstraints();
		gbc_textoPosicion4.anchor = GridBagConstraints.EAST;
		gbc_textoPosicion4.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion4.gridx = 3;
		gbc_textoPosicion4.gridy = 6;
		add(textoPosicion4, gbc_textoPosicion4);

		campoRanking4 = new JTextField();
		campoRanking4.setEditable(false);
		GridBagConstraints gbc_campoRanking4 = new GridBagConstraints();
		gbc_campoRanking4.insets = new Insets(0, 0, 5, 5);
		gbc_campoRanking4.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoRanking4.gridx = 4;
		gbc_campoRanking4.gridy = 6;
		add(campoRanking4, gbc_campoRanking4);
		campoRanking4.setColumns(10);

		JLabel textoPosicion5 = new JLabel("5.");
		textoPosicion5.setForeground(new Color(255, 51, 255));
		textoPosicion5.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion5 = new GridBagConstraints();
		gbc_textoPosicion5.anchor = GridBagConstraints.EAST;
		gbc_textoPosicion5.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion5.gridx = 3;
		gbc_textoPosicion5.gridy = 7;
		add(textoPosicion5, gbc_textoPosicion5);

		campoRanking5 = new JTextField();
		campoRanking5.setEditable(false);
		GridBagConstraints gbc_campoRanking5 = new GridBagConstraints();
		gbc_campoRanking5.insets = new Insets(0, 0, 5, 5);
		gbc_campoRanking5.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoRanking5.gridx = 4;
		gbc_campoRanking5.gridy = 7;
		add(campoRanking5, gbc_campoRanking5);
		campoRanking5.setColumns(10);

		JButton botonInicio = new JButton("Inicio");
		botonInicio.setForeground(new Color(204, 51, 255));
		botonInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irInicio();
			}
		});
		botonInicio.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		GridBagConstraints gbc_botonInicio = new GridBagConstraints();
		gbc_botonInicio.insets = new Insets(0, 0, 0, 5);
		gbc_botonInicio.gridx = 4;
		gbc_botonInicio.gridy = 8;
		add(botonInicio, gbc_botonInicio);
	}

}
