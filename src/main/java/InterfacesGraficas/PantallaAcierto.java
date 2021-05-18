package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PantallaAcierto extends JPanel{
	public PantallaAcierto() {
		setLayout(null);
		
		JLabel etiquetaNombre = new JLabel("Nombre:");
		etiquetaNombre.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		etiquetaNombre.setBounds(10, 244, 258, 42);
		add(etiquetaNombre);
		
		JLabel etiquetaAutor = new JLabel("Autor:");
		etiquetaAutor.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		etiquetaAutor.setBounds(10, 296, 225, 55);
		add(etiquetaAutor);
		
		JLabel etiquetaAño = new JLabel("Año:");
		etiquetaAño.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		etiquetaAño.setBounds(10, 361, 132, 42);
		add(etiquetaAño);
		
		JLabel textoEnhorabuena = new JLabel("¡Enhorabuena, has acertado!");
		textoEnhorabuena.setHorizontalAlignment(SwingConstants.CENTER);
		textoEnhorabuena.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
		textoEnhorabuena.setBounds(149, 65, 1099, 102);
		add(textoEnhorabuena);
		
		JLabel etiquetaDisco = new JLabel("Disco:");
		etiquetaDisco.setFont(new Font("Goudy Stout", Font.PLAIN, 30));
		etiquetaDisco.setBounds(10, 413, 184, 55);
		add(etiquetaDisco);
	}
	private Ventana ventana;
}
