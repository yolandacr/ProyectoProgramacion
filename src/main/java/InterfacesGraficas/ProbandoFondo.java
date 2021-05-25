//DA FALLO EVENT QUEQUE. FALLO DE MULTIHILO?

package InterfacesGraficas;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLayeredPane;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

public class ProbandoFondo extends JPanel {
	private Ventana ventana;
	
	
	ImageIcon imagen=new ImageIcon(getClass().getResource("imagenFondo.jpg").getFile());
	
	public ProbandoFondo(Ventana v) {
		this.ventana=v;
		
		setLayout(new CardLayout(0, 0));
		
		JPanel panelFondo = new JPanel();
		panelFondo.setBackground(Color.BLACK);
		add(panelFondo, "name_428196733529700");
		panelFondo.setLayout(null);
		
		JLabel imagenFondo = new JLabel("New label");
		imagenFondo.setHorizontalAlignment(SwingConstants.CENTER);
		imagenFondo.setIcon(imagen);
		add(imagenFondo, "name_428059014633200");
		
		JPanel panelTransparente = new JPanel();
		panelTransparente.setOpaque(false);
		panelTransparente.setBackground( new Color(255, 0, 0, 20) );
		add(panelTransparente, "name_428721491217500");
		panelTransparente.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JButton botonPrueba = new JButton("Boton Prueba");
		botonPrueba.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelTransparente.add(botonPrueba, "12, 8");
		
		
		
	}
}
