//DOCUMENTACION OK

package InterfacesGraficas;



import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * La siguiente clase es una Interface gráfica para la pantalla de
 * Login/Registro
 * 
 * @author Yolanda Cordero
 *
 */

public class PantallaInicio extends JPanel {
	private Ventana ventana;// variable de onjeto ventana para pasarla por parámetros al constructor.

	/**
	 * método constructor para la pantalla de Login
	 * 
	 * @param v Objeto de la ventana que lo contiene
	 */

	public PantallaInicio(Ventana v) {
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 122, 693, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 133, 42, 169, 94, 81, 80, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		// botón de nuevo usuario

		JButton botonRegistro = new JButton("Nuevo Usuario");
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irARegistro();
			}
		});

		JLabel textoBienvenida2 = new JLabel(" Rockola Boomer");
		textoBienvenida2.setHorizontalAlignment(SwingConstants.CENTER);
		textoBienvenida2.setFont(new Font("Goudy Stout", Font.PLAIN, 40));
		textoBienvenida2.setForeground(new Color(255, 51, 255));
		GridBagConstraints gbc_textoBienvenida2 = new GridBagConstraints();
		gbc_textoBienvenida2.insets = new Insets(0, 0, 5, 5);
		gbc_textoBienvenida2.gridx = 1;
		gbc_textoBienvenida2.gridy = 1;
		add(textoBienvenida2, gbc_textoBienvenida2);
		
		JButton botonIrFondo = new JButton("Ir a Prueba Fondo");
		botonIrFondo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irFondo();
			}
		});
		GridBagConstraints gbc_botonIrFondo = new GridBagConstraints();
		gbc_botonIrFondo.insets = new Insets(0, 0, 5, 5);
		gbc_botonIrFondo.gridx = 0;
		gbc_botonIrFondo.gridy = 3;
		add(botonIrFondo, gbc_botonIrFondo);
		botonRegistro.setForeground(new Color(153, 51, 255));
		botonRegistro.setFont(new Font("Goudy Stout", Font.BOLD, 25));
		GridBagConstraints gbc_botonRegistro = new GridBagConstraints();
		gbc_botonRegistro.anchor = GridBagConstraints.NORTH;
		gbc_botonRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_botonRegistro.gridx = 1;
		gbc_botonRegistro.gridy = 3;
		add(botonRegistro, gbc_botonRegistro);

		// Botón acceder

		JButton botonLogin = new JButton("Login");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irALogin();
			}
		});
		botonLogin.setForeground(new Color(153, 51, 255));
		botonLogin.setFont(new Font("Goudy Stout", Font.BOLD, 25));
		GridBagConstraints gbc_botonLogin = new GridBagConstraints();
		gbc_botonLogin.insets = new Insets(0, 0, 5, 5);
		gbc_botonLogin.anchor = GridBagConstraints.NORTH;
		gbc_botonLogin.gridx = 1;
		gbc_botonLogin.gridy = 4;
		add(botonLogin, gbc_botonLogin);

		JButton botonRanking = new JButton("Ver Ranking");
		botonRanking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irARanking();
			}
		});
		botonRanking.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		botonRanking.setForeground(new Color(153, 51, 255));
		GridBagConstraints gbc_botonRanking = new GridBagConstraints();
		gbc_botonRanking.insets = new Insets(0, 0, 5, 5);
		gbc_botonRanking.gridx = 1;
		gbc_botonRanking.gridy = 5;
		add(botonRanking, gbc_botonRanking);

	}
}
