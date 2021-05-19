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
		gridBagLayout.columnWidths = new int[]{195, 526, 0};
		gridBagLayout.rowHeights = new int[]{133, 42, 169, 129, 185, 39, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
				// titulo
		
				JLabel botonBienvenida = new JLabel("Rockola Boomer");
				botonBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
				botonBienvenida.setForeground(new Color(255, 51, 255));
				botonBienvenida.setFont(new Font("Goudy Stout", Font.BOLD, 35));
				GridBagConstraints gbc_botonBienvenida = new GridBagConstraints();
				gbc_botonBienvenida.anchor = GridBagConstraints.NORTHWEST;
				gbc_botonBienvenida.insets = new Insets(0, 0, 5, 0);
				gbc_botonBienvenida.gridx = 1;
				gbc_botonBienvenida.gridy = 1;
				add(botonBienvenida, gbc_botonBienvenida);
				
						// botón de nuevo usuario
				
						JButton botonRegistro = new JButton("Nuevo Usuario");
						botonRegistro.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								ventana.irARegistro();
							}
						});
						botonRegistro.setForeground(new Color(153, 51, 255));
						botonRegistro.setFont(new Font("Goudy Stout", Font.BOLD, 25));
						GridBagConstraints gbc_botonRegistro = new GridBagConstraints();
						gbc_botonRegistro.anchor = GridBagConstraints.NORTH;
						gbc_botonRegistro.insets = new Insets(0, 0, 5, 0);
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
						gbc_botonLogin.insets = new Insets(0, 0, 5, 0);
						gbc_botonLogin.anchor = GridBagConstraints.NORTH;
						gbc_botonLogin.gridx = 1;
						gbc_botonLogin.gridy = 4;
						add(botonLogin, gbc_botonLogin);

		// Imagen de fondo TODO PREGUNTAR A MIGUEL COMO SE HACE

	}
}
