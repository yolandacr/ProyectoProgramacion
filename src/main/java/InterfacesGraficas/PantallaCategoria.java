
package InterfacesGraficas;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import Clases.Cancion;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
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
 * Clase para la pantalla de categoría de juego extiende de PanelMadre
 *
 * @author Yolanda Cordero
 *
 */
public class PantallaCategoria extends PanelMadre {

	private Ventana ventana;// objeto ventana base

	/**
	 * metodo constructor
	 *
	 * @param v objeto ventana jframe base
	 */
	public PantallaCategoria(Ventana v) {
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 209, 275, 50, 275, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 80, 35, 187, 56, 51, 53, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		// boton actualidad

		JButton botonActualidad = new BotonMadre("Actualidad");
		botonActualidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// creamos y rellenamos el arraylist de las canciones de la categoría

				try {
					ventana.cancionesCategoria = new ArrayList<Cancion>();
					Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root", "1234");
					// Connection conexion =
					// DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
					// "admin");

					Statement smt = conexion.createStatement();
					ResultSet cancionesResult = smt
							.executeQuery("select * from cancion where categoria='" + "ACTUALIDAD'");

					while (cancionesResult.next()) {
						ventana.cancionesCategoria.add(
								new Cancion(cancionesResult.getString("nombre"), cancionesResult.getString("autor"),
										cancionesResult.getString("categoria"), (short) cancionesResult.getInt("año"),
										cancionesResult.getString("disco"), cancionesResult.getString("ruta")));

						Connection conexion1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
								"1234");
						// Connection conexion1 =
						// DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
						// "admin");
						Statement smt1 = conexion1.createStatement();
						ResultSet opcionesResult = smt1
								.executeQuery("select nombre from opciones where nombre_cancion='"
										+ cancionesResult.getString("nombre") + "'");

						// creamos y rellenamos el array de opciones

						byte contador = 0;
						ventana.opcionesCancionActual = new String[4];

						while (opcionesResult.next()) {
							ventana.opcionesCancionActual[contador] = opcionesResult.getString("nombre");
							contador++;
							ventana.cancionesCategoria.get(ventana.cancionesCategoria.size() - 1)
									.setOpcionesEleccion(ventana.opcionesCancionActual);
						}

						smt1.close();
					}
					smt.close();

					ventana.irANivel();

				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
		botonActualidad.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonActualidad.setForeground(new Color(255, 51, 255));
		botonActualidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel textoCategoria = new JLabel("Elige la categoría");
		textoCategoria.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoCategoria.setForeground(new Color(204, 51, 255));
		textoCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textoCategoria = new GridBagConstraints();
		gbc_textoCategoria.anchor = GridBagConstraints.NORTH;
		gbc_textoCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_textoCategoria.gridwidth = 3;
		gbc_textoCategoria.gridx = 1;
		gbc_textoCategoria.gridy = 1;
		add(textoCategoria, gbc_textoCategoria);
		GridBagConstraints gbc_botonActualidad = new GridBagConstraints();
		gbc_botonActualidad.fill = GridBagConstraints.BOTH;
		gbc_botonActualidad.insets = new Insets(0, 0, 5, 5);
		gbc_botonActualidad.gridx = 1;
		gbc_botonActualidad.gridy = 3;
		add(botonActualidad, gbc_botonActualidad);

		// boton años 90

		JButton boton90 = new BotonMadre("Años 90");
		boton90.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cancionesCategoria = new ArrayList<Cancion>();
					Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root", "1234");
					// Connection conexion =
					// DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
					// "admin");
					Statement smt = conexion.createStatement();
					ResultSet cancionesResult = smt.executeQuery("select * from cancion where categoria='" + "AÑOS90'");

					while (cancionesResult.next()) {
						ventana.cancionesCategoria.add(
								new Cancion(cancionesResult.getString("nombre"), cancionesResult.getString("autor"),
										cancionesResult.getString("categoria"), (short) cancionesResult.getInt("año"),
										cancionesResult.getString("disco"), cancionesResult.getString("ruta")));

						Connection conexion1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
								"1234");
						// Connection conexion1 =
						// DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
						// "admin");

						Statement smt1 = conexion1.createStatement();
						ResultSet opcionesResult = smt1
								.executeQuery("select nombre from opciones where nombre_cancion='"
										+ cancionesResult.getString("nombre") + "'");

						byte contador = 0;
						ventana.opcionesCancionActual = new String[4];

						while (opcionesResult.next()) {
							ventana.opcionesCancionActual[contador] = opcionesResult.getString("nombre");
							contador++;
							ventana.cancionesCategoria.get(ventana.cancionesCategoria.size() - 1)
									.setOpcionesEleccion(ventana.opcionesCancionActual);
						}

						smt1.close();
					}
					smt.close();

					ventana.irANivel();

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		boton90.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		boton90.setForeground(new Color(255, 51, 255));
		GridBagConstraints gbc_boton90 = new GridBagConstraints();
		gbc_boton90.fill = GridBagConstraints.BOTH;
		gbc_boton90.insets = new Insets(0, 0, 5, 5);
		gbc_boton90.gridx = 3;
		gbc_boton90.gridy = 3;
		add(boton90, gbc_boton90);

		// boton 2000

		JButton boton2000 = new BotonMadre("Años 2000");
		boton2000.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cancionesCategoria = new ArrayList<Cancion>();
					Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root", "1234");
					// Connection conexion =
					// DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
					// "admin");
					Statement smt = conexion.createStatement();
					ResultSet cancionesResult = smt
							.executeQuery("select * from cancion where categoria='" + "AÑOS2000'");

					while (cancionesResult.next()) {
						ventana.cancionesCategoria.add(
								new Cancion(cancionesResult.getString("nombre"), cancionesResult.getString("autor"),
										cancionesResult.getString("categoria"), (short) cancionesResult.getInt("año"),
										cancionesResult.getString("disco"), cancionesResult.getString("ruta")));

						Connection conexion1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
								"1234");
						// Connection conexion1 =
						// DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
						// "admin");
						Statement smt1 = conexion1.createStatement();
						ResultSet opcionesResult = smt1
								.executeQuery("select nombre from opciones where nombre_cancion='"
										+ cancionesResult.getString("nombre") + "'");

						byte contador = 0;
						ventana.opcionesCancionActual = new String[4];

						while (opcionesResult.next()) {
							ventana.opcionesCancionActual[contador] = opcionesResult.getString("nombre");
							contador++;
							ventana.cancionesCategoria.get(ventana.cancionesCategoria.size() - 1)
									.setOpcionesEleccion(ventana.opcionesCancionActual);
						}

						smt1.close();
					}
					smt.close();

					ventana.irANivel();

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		boton2000.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		boton2000.setForeground(new Color(255, 51, 255));
		GridBagConstraints gbc_boton2000 = new GridBagConstraints();
		gbc_boton2000.fill = GridBagConstraints.BOTH;
		gbc_boton2000.insets = new Insets(0, 0, 0, 5);
		gbc_boton2000.gridx = 1;
		gbc_boton2000.gridy = 5;
		add(boton2000, gbc_boton2000);

		// boton años 80

		JButton boton80 = new BotonMadre("Años 80");
		boton80.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.cancionesCategoria = new ArrayList<Cancion>();
					Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root", "1234");
					// Connection conexion =
					// DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
					// "admin");
					Statement smt = conexion.createStatement();
					ResultSet cancionesResult = smt.executeQuery("select * from cancion where categoria='" + "AÑOS80'");

					while (cancionesResult.next()) {
						// public Cancion(String nombre, String autor, String categoria, short año,
						// String disco, String ruta) {
						ventana.cancionesCategoria.add(
								new Cancion(cancionesResult.getString("nombre"), cancionesResult.getString("autor"),
										cancionesResult.getString("categoria"), (short) cancionesResult.getInt("año"),
										cancionesResult.getString("disco"), cancionesResult.getString("ruta")));

						Connection conexion1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
								"1234");
						// Connection conexion1 =
						// DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root",
						// "admin");
						Statement smt1 = conexion1.createStatement();
						ResultSet opcionesResult = smt1
								.executeQuery("select nombre from opciones where nombre_cancion='"
										+ cancionesResult.getString("nombre") + "'");

						byte contador = 0;
						ventana.opcionesCancionActual = new String[4];

						while (opcionesResult.next()) {
							ventana.opcionesCancionActual[contador] = opcionesResult.getString("nombre");
							contador++;
							ventana.cancionesCategoria.get(ventana.cancionesCategoria.size() - 1)
									.setOpcionesEleccion(ventana.opcionesCancionActual);
						}

						smt1.close();
					}
					smt.close();

					ventana.irANivel();

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		boton80.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		boton80.setForeground(new Color(255, 51, 255));
		GridBagConstraints gbc_boton80 = new GridBagConstraints();
		gbc_boton80.insets = new Insets(0, 0, 0, 5);
		gbc_boton80.fill = GridBagConstraints.BOTH;
		gbc_boton80.gridx = 3;
		gbc_boton80.gridy = 5;
		add(boton80, gbc_boton80);
	}

}
