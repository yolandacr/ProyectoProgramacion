//DOCUMENTACION OK

package InterfacesGraficas;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * clase para crear la pantalla que aparece cuando falla la cancion
 * 
 * @author Yolanda Cordero
 *
 */
public class PantallaFallo extends JPanel {

	private Ventana ventana;// objeto ventana base

	/**
	 * metodo constructor
	 * 
	 * @param v ventana base
	 */
	public PantallaFallo(Ventana v) {
		this.ventana = v;
				GridBagLayout gridBagLayout = new GridBagLayout();
				gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
				gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
				gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
				gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0, 1.0, Double.MIN_VALUE};
				setLayout(gridBagLayout);
						
								JLabel textoFallo1 = new JLabel("¡Has fallado!");
								textoFallo1.setFont(new Font("Goudy Stout", Font.PLAIN, 40));
								textoFallo1.setForeground(Color.RED);
								textoFallo1.setHorizontalAlignment(SwingConstants.CENTER);
								GridBagConstraints gbc_textoFallo1 = new GridBagConstraints();
								gbc_textoFallo1.anchor = GridBagConstraints.NORTHWEST;
								gbc_textoFallo1.insets = new Insets(0, 0, 5, 5);
								gbc_textoFallo1.gridx = 1;
								gbc_textoFallo1.gridy = 1;
								add(textoFallo1, gbc_textoFallo1);
						
								JButton botonContinuar = new JButton("Continuar");
								botonContinuar.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) {
										
										ventana.siguienteCancion();
										if(ventana.nuevaPartida.getNivel().equalsIgnoreCase("Fácil")) {
									
										ventana.irFacil();}
										else {
											
											ventana.irAExperto();
										}
									}
								});
								
								
								
								botonContinuar.setForeground(new Color(0, 0, 0));
								botonContinuar.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
								GridBagConstraints gbc_botonContinuar = new GridBagConstraints();
								gbc_botonContinuar.insets = new Insets(0, 0, 5, 5);
								gbc_botonContinuar.anchor = GridBagConstraints.NORTH;
								gbc_botonContinuar.fill = GridBagConstraints.HORIZONTAL;
								gbc_botonContinuar.gridx = 1;
								gbc_botonContinuar.gridy = 3;
								add(botonContinuar, gbc_botonContinuar);
								}

}

