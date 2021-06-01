//preguntar a miguel por el metodo obsoleto pa get text en contraseña
package InterfacesGraficas;

import javax.swing.JPasswordField;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.SwingConstants;
import Clases.Jugador;
import Excepciones.ContraseñaVaciaException;
import Excepciones.NombreVacioException;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * La siguiente clase es la Interface gráfica de la pantalla para que el jugador
 * se registre.
 * 
 * @author Yolanda Cordero
 *
 */

public class PantallaRegistro extends PanelMadre {
	private JTextField campoNombre;// donde ingresamos el nombre a grabar
	private JPasswordField campoContraseña;// donde ingresamos la contraseña a grabar
	private Ventana ventana;// objeto ventana base

	/**
	 * Constructor de PantallaRegistro
	 * 
	 * @param v nuestra ventana base
	 */
	public PantallaRegistro(Ventana v) {
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
		campoNombre.setBackground(new Color(255, 255, 255));
		campoNombre.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
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

		campoContraseña = new JPasswordField();
		campoContraseña.setBackground(new Color(255, 255, 255));
		campoContraseña.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		campoContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_campoContraseña = new GridBagConstraints();
		gbc_campoContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_campoContraseña.gridx = 3;
		gbc_campoContraseña.gridy = 3;
		add(campoContraseña, gbc_campoContraseña);
		campoContraseña.setColumns(10);

		// botón registro

		JButton botonRegistrar = new BotonMadre("Registrar");
		botonRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				try {
					if (campoNombre.getText().isBlank() || String.valueOf(campoContraseña.getPassword()).isBlank()) {
						if (campoNombre.getText().isBlank()) {
							throw new NombreVacioException("El campo nombre esta vacio");
						}
						
						if(String.valueOf(campoContraseña.getPassword()).isBlank()) {
							throw new ContraseñaVaciaException("La contraseña está vacía");
						}

					}  
				// Todo relleno, se puede insertar
					
						Jugador jugador = new Jugador(campoNombre.getText(), String.valueOf(campoContraseña.getPassword()));
				//Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root","1234");

						// credenciales pa conectar en pc clase

						Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola","root","admin");

						Statement smt = conexion.createStatement();
						smt.executeUpdate("insert into Jugador " + "values('" + campoNombre.getText() + "'," + "'"
								+ String.valueOf(campoContraseña.getPassword()) + "')");
						JOptionPane.showMessageDialog(ventana, "El usuario se ha registrado correctamente",
								"Registro correcto", JOptionPane.INFORMATION_MESSAGE);

						smt.close();
						conexion.close();
						ventana.irInicio();
					} catch (SQLException |NombreVacioException|ContraseñaVaciaException e1) {
						JOptionPane.showMessageDialog(ventana, e1.getMessage(), "Error de inserción",
								JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		botonRegistrar.setForeground(new Color(255, 51, 255));
		botonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRegistrar.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		GridBagConstraints gbc_botonRegistrar = new GridBagConstraints();
		gbc_botonRegistrar.insets = new Insets(0, 0, 5, 5);
		gbc_botonRegistrar.gridx = 2;
		gbc_botonRegistrar.gridy = 5;
		add(botonRegistrar, gbc_botonRegistrar);

		// botón volver

		JButton botonVolver = new BotonMadre("Volver");
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
		gbc_botonVolver.anchor = GridBagConstraints.EAST;
		gbc_botonVolver.insets = new Insets(0, 0, 5, 5);
		gbc_botonVolver.gridx = 3;
		gbc_botonVolver.gridy = 5;
		add(botonVolver, gbc_botonVolver);
	}

}
