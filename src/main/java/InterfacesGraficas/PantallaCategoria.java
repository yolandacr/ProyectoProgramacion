package InterfacesGraficas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
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

public class PantallaCategoria extends JPanel {
	private Ventana ventana;//objeto ventana base
	private String categoria;
	private ArrayList<Cancion> cancionesActualidad;
	
	
	
	public PantallaCategoria(Ventana v) {
		ventana=v;
		setLayout(null);
		
		JLabel textoCategoria = new JLabel("Elige la categoría");
		textoCategoria.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoCategoria.setForeground(new Color(204, 51, 255));
		textoCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		textoCategoria.setBounds(136, 80, 506, 35);
		add(textoCategoria);
		
		JButton botonActualidad = new JButton("Actualidad");
		botonActualidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					cancionesActualidad=new ArrayList <Cancion>();
					Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/rockola", "root", "admin");
					Statement smt = conexion.createStatement();
					ResultSet cancionesResult= smt.executeQuery("select * from cancion where categoria='"+"ACTUALIDAD"+"'");
					
					while(cancionesResult.next()) {
						cancionesActualidad.add(new Cancion(cancionesResult.getString("nombre"),
								cancionesResult.getString("autor"),
								cancionesResult.getString("categoria"),
								cancionesResult.getInt("año"),
								cancionesResult.getString("disco"),
								cancionesResult.getString("ruta")
							));
						
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
		botonActualidad.setBounds(69, 302, 275, 56);
		add(botonActualidad);
		
		JButton boton2000 = new JButton("Años 2000");
		boton2000.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		boton2000.setForeground(new Color(255, 51, 255));
		boton2000.setBounds(69, 409, 275, 53);
		add(boton2000);
		
		JButton boton90 = new JButton("Años 90");
		boton90.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		boton90.setForeground(new Color(255, 51, 255));
		boton90.setBounds(394, 302, 275, 56);
		add(boton90);
		
		JButton boton80 = new JButton("Años 80");
		boton80.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		boton80.setForeground(new Color(255, 51, 255));
		boton80.setBounds(394, 409, 275, 53);
		add(boton80);
	}
	
}
