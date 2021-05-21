package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class PantallaAcierto extends JPanel{
	private Ventana ventana;// variable de onjeto ventana para pasarla por parámetros al constructor.
	private JTextField campoNombre;
	private JTextField campoAutor;
	private JTextField campoAño;
	private JTextField campoDisco;
	
	public PantallaAcierto(Ventana v) {
		this.ventana = v;
		
		setLayout(null);
		
		JLabel etiquetaNombre = new JLabel("Nombre:");
		etiquetaNombre.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		etiquetaNombre.setBounds(10, 226, 258, 55);
		add(etiquetaNombre);
		
		JLabel etiquetaAutor = new JLabel("Autor:");
		etiquetaAutor.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		etiquetaAutor.setBounds(10, 296, 225, 55);
		add(etiquetaAutor);
		
		JLabel etiquetaAño = new JLabel("Año:");
		etiquetaAño.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		etiquetaAño.setBounds(10, 372, 132, 42);
		add(etiquetaAño);
		
		JLabel textoEnhorabuena = new JLabel("¡Enhorabuena, has acertado!");
		textoEnhorabuena.setHorizontalAlignment(SwingConstants.CENTER);
		textoEnhorabuena.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
		textoEnhorabuena.setBounds(149, 65, 1099, 102);
		add(textoEnhorabuena);
		
		JLabel etiquetaDisco = new JLabel("Disco:");
		etiquetaDisco.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		etiquetaDisco.setBounds(10, 434, 184, 55);
		add(etiquetaDisco);
		
		campoNombre = new JTextField();
		campoNombre.setEditable(false);
		campoNombre.setBounds(279, 239, 170, 42);
		add(campoNombre);
		campoNombre.setColumns(10);
		
		campoAutor = new JTextField();
		campoAutor.setEditable(false);
		campoAutor.setBounds(279, 308, 170, 43);
		add(campoAutor);
		campoAutor.setColumns(10);
		
		campoAño = new JTextField();
		campoAño.setEditable(false);
		campoAño.setBounds(277, 379, 172, 42);
		add(campoAño);
		campoAño.setColumns(10);
		
		campoDisco = new JTextField();
		campoDisco.setEditable(false);
		campoDisco.setBounds(279, 447, 170, 42);
		add(campoDisco);
		campoDisco.setColumns(10);
	}
}
