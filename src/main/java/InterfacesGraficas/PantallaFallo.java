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

		setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"), }));

		JLabel textoFallo1 = new JLabel("¡Has fallado!");
		textoFallo1.setFont(new Font("Goudy Stout", Font.PLAIN, 40));
		textoFallo1.setForeground(Color.RED);
		textoFallo1.setHorizontalAlignment(SwingConstants.CENTER);
		add(textoFallo1, "4, 4");

		JButton botonContinuar = new JButton("Continuar");
		botonContinuar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irFacil();
			}
		});
		botonContinuar.setForeground(new Color(0, 0, 0));
		botonContinuar.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		add(botonContinuar, "4, 10");
	}

}
