
package InterfacesGraficas;

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
public class PantallaFallo extends PanelMadre {

	private Ventana ventana;// objeto ventana base

	/**
	 * metodo constructor
	 * 
	 * @param v ventana base
	 */
	public PantallaFallo(Ventana v) {
		this.ventana = v;
		setLayout(null);

		JLabel textoFallo1 = new JLabel("¡Has fallado!");
		textoFallo1.setBounds(211, 280, 557, 55);
		textoFallo1.setFont(new Font("Goudy Stout", Font.PLAIN, 40));
		textoFallo1.setForeground(Color.RED);
		textoFallo1.setHorizontalAlignment(SwingConstants.CENTER);
		add(textoFallo1);

		// boton continuar

		JButton botonContinuar = new BotonMadre("Continuar");
		botonContinuar.setBounds(340, 371, 307, 49);
		botonContinuar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ventana.cancionesPartida.size() == 10) {
					ventana.irFin();
				} else {
					if (ventana.nuevaPartida.getNivel().equalsIgnoreCase("Fácil")) {
						ventana.siguienteCancion();
						ventana.irFacil();
					} else {
						ventana.siguienteCancion();
						ventana.irAExperto();
					}

				}

			}
		});

		botonContinuar.setForeground(Color.WHITE);
		botonContinuar.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		add(botonContinuar);
	}

}
