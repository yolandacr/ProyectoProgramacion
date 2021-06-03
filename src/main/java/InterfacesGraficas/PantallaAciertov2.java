
package InterfacesGraficas;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
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

public class PantallaAciertov2 extends PanelMadre {
	private Ventana ventana;// variable de objeto ventana para pasarla por parámetros al constructor.

	/**
	 * consctructor de pantallas de acierto version alternativa
	 * 
	 * @param v ventana base
	 */

	public PantallaAciertov2(Ventana v) {
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
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

		JLabel textoCorrecto = new JLabel("La respuesta es correcta");
		textoCorrecto.setForeground(new Color(255, 51, 255));
		textoCorrecto.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
		textoCorrecto.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textoCorrecto = new GridBagConstraints();
		gbc_textoCorrecto.anchor = GridBagConstraints.NORTH;
		gbc_textoCorrecto.insets = new Insets(0, 0, 5, 5);
		gbc_textoCorrecto.gridx = 1;
		gbc_textoCorrecto.gridy = 3;
		add(textoCorrecto, gbc_textoCorrecto);

		JLabel textoPuntos = new JLabel();

		if (ventana.nuevaPartida.getNivel().equalsIgnoreCase("Fácil")) {
			textoPuntos = new JLabel("+50 PTS");
		}

		else {
			textoPuntos = new JLabel("+100 PTS");
		}

		textoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
		textoPuntos.setForeground(new Color(204, 51, 255));
		textoPuntos.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textoPuntos = new GridBagConstraints();
		gbc_textoPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_textoPuntos.gridx = 1;
		gbc_textoPuntos.gridy = 6;
		add(textoPuntos, gbc_textoPuntos);

		// boton siguiente

		JButton botonSiguiente = new BotonMadre("Siguiente");
		botonSiguiente.setBackground(new Color(255, 255, 255));
		botonSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ventana.cancionesPartida.size() < 10) {
					if (ventana.nuevaPartida.getNivel().equalsIgnoreCase("Fácil")) {
						ventana.nuevaPartida.setPuntosPartida((short) (ventana.nuevaPartida.getPuntosPartida() + 50));
						ventana.siguienteCancion();
						ventana.irFacil();
					} else {
						ventana.nuevaPartida.setPuntosPartida((short) (ventana.nuevaPartida.getPuntosPartida() + 100));
						ventana.siguienteCancion();
						ventana.irAExperto();
					}
				} else {
					if (ventana.nuevaPartida.getNivel().equalsIgnoreCase("Fácil")) {
						ventana.nuevaPartida.setPuntosPartida((short) (ventana.nuevaPartida.getPuntosPartida() + 50));
						ventana.irFin();

					} else {
						ventana.nuevaPartida.setPuntosPartida((short) (ventana.nuevaPartida.getPuntosPartida() + 100));
						ventana.irFin();
					}

				}

			}
		});

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
