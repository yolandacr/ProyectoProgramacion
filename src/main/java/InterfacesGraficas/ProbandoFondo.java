package InterfacesGraficas;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ProbandoFondo extends JPanel {
	private Ventana ventana;
	public ProbandoFondo(Ventana v) {
		this.ventana=v;
		
		setLayout(new CardLayout(0, 0));
		
		JPanel panelFondo = new JPanel();
		panelFondo.setBackground(Color.WHITE);
		add(panelFondo, "name_428196733529700");
		panelFondo.setLayout(new CardLayout(0, 0));
		
		JLabel imagenFondo = new JLabel("New label");
		imagenFondo.setHorizontalAlignment(SwingConstants.CENTER);
		imagenFondo.setIcon(new ImageIcon("C:\\Users\\reena\\Desktop\\TRIMESTRE 3\\PROGRAMACION\\ProyectoRockola\\ProyectoProgramacion\\imagenes\\imagenFondo.jpg"));
		add(imagenFondo, "name_428059014633200");
		
		JPanel panelTransparente = new JPanel();
		panelTransparente.setBackground(new Color(Color.TRANSLUCENT));
		add(panelTransparente, "name_428721491217500");
		panelTransparente.setOpaque(false);
		panelTransparente.setLayout(new CardLayout(0, 0));
		
		
	}
	
	

}
