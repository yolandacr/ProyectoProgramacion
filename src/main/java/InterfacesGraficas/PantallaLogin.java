//DOCUMENTACION OK
package InterfacesGraficas;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.SwingConstants;
import Clases.Jugador;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * La siguiente clase es la Interface gráfica de la pantalla para que el jugador
 * se registre.
 * 
 * @author Yolanda Cordero
 *
 */

public class PantallaLogin extends JPanel {
	private JTextField campoNombre;// donde ingresamos el nombre a grabar
	private JTextField campoContraseña;// donde ingresamos la contraseña a grabar
	private Ventana ventana;// objeto ventana base

	/**
	 * Constructor de PantallaRegistro
	 * 
	 * @param v nuestra ventana base
	 */
	public PantallaLogin(Ventana v) {
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		// nombre
		JLabel etiquetaNombre = new JLabel("Nombre:");
		etiquetaNombre.setForeground(new Color(153, 51, 255));
		etiquetaNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaNombre.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_etiquetaNombre = new GridBagConstraints();
		gbc_etiquetaNombre.insets = new Insets(0, 0, 5, 5);
		gbc_etiquetaNombre.gridx = 2;
		gbc_etiquetaNombre.gridy = 2;
		add(etiquetaNombre, gbc_etiquetaNombre);

		campoNombre = new JTextField();
		campoNombre.setText("YOLANDA");
		campoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_campoNombre = new GridBagConstraints();
		gbc_campoNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoNombre.insets = new Insets(0, 0, 5, 5);
		gbc_campoNombre.gridx = 3;
		gbc_campoNombre.gridy = 2;
		add(campoNombre, gbc_campoNombre);
		campoNombre.setColumns(10);

		// contraseña

		JLabel etiquetaContraseña = new JLabel("Constraseña:");
		etiquetaContraseña.setForeground(new Color(153, 51, 255));
		etiquetaContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaContraseña.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_etiquetaContraseña = new GridBagConstraints();
		gbc_etiquetaContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_etiquetaContraseña.gridx = 2;
		gbc_etiquetaContraseña.gridy = 3;
		add(etiquetaContraseña, gbc_etiquetaContraseña);

		campoContraseña = new JTextField();
		campoContraseña.setText("CORDERO");
		campoContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_campoContraseña = new GridBagConstraints();
		gbc_campoContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_campoContraseña.gridx = 3;
		gbc_campoContraseña.gridy = 3;
		add(campoContraseña, gbc_campoContraseña);
		campoContraseña.setColumns(10);

		// botón registro

		JButton botonLogin = new JButton("Acceder");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (campoNombre.getText().isBlank() || campoContraseña.getText().isBlank()) {
					JOptionPane.showMessageDialog(ventana, "Todos los campos deben" + " estar rellenos",
							"No pudo insertarse", JOptionPane.ERROR_MESSAGE);

				} else { // no estan en blanco y pasa a validar

					try {
						Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
								"1234");
						Statement smt = conexion.createStatement();

						ResultSet loginResult = smt.executeQuery("select * from jugador where nombre='"
								+ campoNombre.getText() + "' AND " + "contraseña='" + campoContraseña.getText() + "'");

						if (loginResult.next() == true) {
							String nombre = loginResult.getString("nombre");
							String contraseña = loginResult.getString("contraseña");
							ventana.jugador = new Jugador(nombre, contraseña);

							JOptionPane.showMessageDialog(null, "Bienvenido " + nombre, "Mensaje",
									JOptionPane.INFORMATION_MESSAGE);
							ventana.irACategoria();

						} else {
							JOptionPane.showMessageDialog(null, "El usuario o clave incorrectos. ", "Prueba de nuevo",
									JOptionPane.ERROR_MESSAGE);

						}

						smt.close();
						conexion.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		botonLogin.setForeground(new Color(255, 51, 255));
		botonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonLogin.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		GridBagConstraints gbc_botonLogin = new GridBagConstraints();
		gbc_botonLogin.insets = new Insets(0, 0, 5, 5);
		gbc_botonLogin.gridx = 2;
		gbc_botonLogin.gridy = 5;
		add(botonLogin, gbc_botonLogin);

		// botón volver

		JButton botonVolver = new JButton("Volver");
		botonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irInicio();
			}
		});
		botonVolver.setForeground(new Color(255, 51, 255));
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonVolver.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		GridBagConstraints gbc_botonVolver = new GridBagConstraints();
		gbc_botonVolver.fill = GridBagConstraints.HORIZONTAL;
		gbc_botonVolver.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolver.gridx = 3;
		gbc_botonVolver.gridy = 5;
		add(botonVolver, gbc_botonVolver);
	}

}
