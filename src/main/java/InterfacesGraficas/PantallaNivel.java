
package InterfacesGraficas;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import Clases.Partida;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * clase para la pantalla nivel
 * 
 * @author yolanda cordero
 *
 */
public class PantallaNivel extends PanelMadre {
	private Ventana ventana;// objeto ventana base
	

	/**
	 * metodo constructor
	 * 
	 * @param v ventana jframe base
	 */
	public PantallaNivel(Ventana v) {
		this.ventana = v;
		setLayout(new GridLayout(0, 1, 0, 0));

		JLabel botonSelecciona = new JLabel("Selecciona el nivel de juego");
		botonSelecciona.setHorizontalAlignment(SwingConstants.CENTER);
		botonSelecciona.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonSelecciona.setForeground(new Color(204, 51, 255));
		add(botonSelecciona);

		// boton facil

		JButton botonFacil = new BotonMadre("Fácil");
		botonFacil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.nuevaPartida = new Partida(ventana.jugador, (short) 0, ventana.cancionesCategoria,
						botonFacil.getText());
				ventana.irFacil();
				ventana.hiloMusical.pararIntro();
			}
		});
		botonFacil.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonFacil.setForeground(new Color(255, 51, 255));
		add(botonFacil);

		// boton experto

		JButton botonExperto = new BotonMadre("Experto");
		botonExperto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.nuevaPartida = new Partida(ventana.jugador, (short) 0, ventana.cancionesCategoria,
						botonExperto.getText());
				ventana.irAExperto();
				ventana.hiloMusical.pararIntro();
				
			}
		});
		botonExperto.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		botonExperto.setForeground(new Color(255, 51, 255));
		add(botonExperto);

	}

}
