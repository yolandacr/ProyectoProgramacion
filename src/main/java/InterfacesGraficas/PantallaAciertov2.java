//DOCUMENTACION OK
package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Insets;

/**
 * Clase de la Pantalla Acierto version alternativa
 * 
 * @author Yolanda Cordero
 *
 */

public class PantallaAciertov2 extends JPanel {
	private Ventana ventana;// variable de objeto ventana para pasarla por parámetros al constructor.

	/**
	 * consctructor de pantallas de acierto version alternativa
	 * 
	 * @param v ventana base
	 */

	public PantallaAciertov2(Ventana v) {
		this.ventana = v;
				GridBagLayout gridBagLayout = new GridBagLayout();
				gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
				gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
				gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				setLayout(gridBagLayout);
						
								JLabel textoAcierto = new JLabel("¡Enhorabuena!");
								textoAcierto.setForeground(new Color(204, 51, 255));
								textoAcierto.setFont(new Font("Goudy Stout", Font.PLAIN, 40));
								textoAcierto.setHorizontalAlignment(SwingConstants.CENTER);
								GridBagConstraints gbc_textoAcierto = new GridBagConstraints();
								gbc_textoAcierto.anchor = GridBagConstraints.NORTH;
								gbc_textoAcierto.insets = new Insets(0, 0, 5, 5);
								gbc_textoAcierto.gridx = 1;
								gbc_textoAcierto.gridy = 1;
								add(textoAcierto, gbc_textoAcierto);
						
								JLabel textoCorrecto = new JLabel("La respuesta");
								textoCorrecto.setForeground(new Color(204, 51, 255));
								textoCorrecto.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
								textoCorrecto.setHorizontalAlignment(SwingConstants.CENTER);
								GridBagConstraints gbc_textoCorrecto = new GridBagConstraints();
								gbc_textoCorrecto.anchor = GridBagConstraints.NORTH;
								gbc_textoCorrecto.insets = new Insets(0, 0, 5, 5);
								gbc_textoCorrecto.gridx = 1;
								gbc_textoCorrecto.gridy = 3;
								add(textoCorrecto, gbc_textoCorrecto);
								
								JLabel texto3 = new JLabel("es correcta");
								texto3.setForeground(new Color(204, 51, 255));
								texto3.setHorizontalAlignment(SwingConstants.CENTER);
								texto3.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
								GridBagConstraints gbc_texto3 = new GridBagConstraints();
								gbc_texto3.insets = new Insets(0, 0, 5, 5);
								gbc_texto3.gridx = 1;
								gbc_texto3.gridy = 4;
								add(texto3, gbc_texto3);
								
										JButton botonSiguiente = new JButton("Siguiente");
										botonSiguiente.addMouseListener(new MouseAdapter() {
											@Override
											public void mouseClicked(MouseEvent e) {
												ventana.nuevaPartida.setPuntosPartida((short) (ventana.nuevaPartida.getPuntosPartida()+50));
												ventana.siguienteCancion();
												ventana.irFacil();
											}
										});
										
										JLabel textoPuntos = new JLabel("+50 PTS");
										textoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
										textoPuntos.setForeground(new Color(204, 51, 255));
										textoPuntos.setHorizontalAlignment(SwingConstants.CENTER);
										GridBagConstraints gbc_textoPuntos = new GridBagConstraints();
										gbc_textoPuntos.insets = new Insets(0, 0, 5, 5);
										gbc_textoPuntos.gridx = 1;
										gbc_textoPuntos.gridy = 6;
										add(textoPuntos, gbc_textoPuntos);
										botonSiguiente.setForeground(new Color(255, 51, 255));
										botonSiguiente.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
										GridBagConstraints gbc_botonSiguiente = new GridBagConstraints();
										gbc_botonSiguiente.insets = new Insets(0, 0, 5, 5);
										gbc_botonSiguiente.anchor = GridBagConstraints.NORTH;
										gbc_botonSiguiente.gridx = 1;
										gbc_botonSiguiente.gridy = 8;
										add(botonSiguiente, gbc_botonSiguiente);

	}
}
