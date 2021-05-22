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
		setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), }));

		JLabel textoAcierto = new JLabel("¡Enhorabuena!");
		textoAcierto.setForeground(new Color(204, 51, 255));
		textoAcierto.setFont(new Font("Goudy Stout", Font.PLAIN, 40));
		textoAcierto.setHorizontalAlignment(SwingConstants.CENTER);
		add(textoAcierto, "4, 4");

		JLabel textoCorrecto = new JLabel("La respuesta es correcta");
		textoCorrecto.setForeground(new Color(153, 51, 255));
		textoCorrecto.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
		textoCorrecto.setHorizontalAlignment(SwingConstants.CENTER);
		add(textoCorrecto, "4, 12");

		JButton botonSiguiente = new JButton("Siguiente");
		botonSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irFacil();
			}
		});
		botonSiguiente.setForeground(new Color(255, 51, 255));
		botonSiguiente.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		add(botonSiguiente, "4, 18");

	}
}
