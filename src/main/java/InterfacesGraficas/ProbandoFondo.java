package InterfacesGraficas;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ProbandoFondo extends JPanel {
	public ProbandoFondo() {
		setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, "name_428196733529700");
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(".\\imagenes\\imagenFondo.jpg"));
		add(lblNewLabel, "name_428059014633200");
		
		JPanel panelTransparente = new JPanel();
		panelTransparente.setBackground(Color.TRANSLUCENT);
		add(panelTransparente, "name_428721491217500");
		panelTransparente.setOpaque(false);
		panelTransparente.setLayout(new CardLayout(0, 0));
		
		
	}
	private Ventana ventana;
	

}
