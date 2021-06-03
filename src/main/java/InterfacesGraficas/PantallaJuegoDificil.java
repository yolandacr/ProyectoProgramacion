
package InterfacesGraficas;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

/**
 * clase de la pantalla del modo dificil. Hereda de PantallaJuegoBase
 * 
 * @author yolanda cordero
 *
 */
public class PantallaJuegoDificil extends PantallaJuegoBase {

	private JTextField campoRespuesta;// campo donde escribimos la respuesta

	/**
	 * metodo constructor
	 * 
	 * @param v objeto jframe base
	 */
	public PantallaJuegoDificil(Ventana v) {
		super(v);// constructor de la superclase

		JLabel etiquetaRespuesta = new JLabel("Dime el título de la canción:");
		etiquetaRespuesta.setForeground(new Color(204, 51, 255));
		etiquetaRespuesta.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		etiquetaRespuesta.setBounds(192, 352, 627, 57);
		add(etiquetaRespuesta);

		campoRespuesta = new JTextField();
		campoRespuesta.setHorizontalAlignment(SwingConstants.CENTER);
		campoRespuesta.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		campoRespuesta.setBounds(201, 419, 596, 51);
		add(campoRespuesta);
		campoRespuesta.setColumns(10);

		// boton ok

		JButton botonOk = new BotonMadre("OK");
		botonOk.setForeground(new Color(255, 51, 255));
		botonOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (campoRespuesta.getText().equalsIgnoreCase(getActual().getNombre())) {
					getVentana().cancionesCategoria.remove(getActual());
					getVentana().irAciertoV2();

				} else {
					getVentana().cancionesCategoria.remove(getActual());
					getVentana().irFallo();

				}
				if (getHiloMusical() != null) {
					getHiloMusical().parar();
				}

			}
		});
		botonOk.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		botonOk.setBounds(445, 520, 110, 57);
		add(botonOk);
	}
}
