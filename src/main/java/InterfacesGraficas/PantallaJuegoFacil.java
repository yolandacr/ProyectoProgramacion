
package InterfacesGraficas;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * clase para crear las pantallas del modo facil. Hereda de PantallaJuegoBase
 * 
 * @author yolanda cordero
 *
 */

public class PantallaJuegoFacil extends PantallaJuegoBase {

	/**
	 * metodo constructor
	 * 
	 * @param v jframe base
	 */
	public PantallaJuegoFacil(Ventana v) {

		super(v);// metodo constructor de la superclase

		// opcion 1

		JButton botonOpcion1 = new BotonMadre(getActual().getOpcionesEleccion()[0]);
		botonOpcion1.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion1.setForeground(new Color(255, 51, 255));
		botonOpcion1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (botonOpcion1.getText().equalsIgnoreCase(getActual().getNombre())) {
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
		botonOpcion1.setBounds(75, 352, 337, 37);
		add(botonOpcion1);

		// opcion 2

		JButton botonOpcion2 = new BotonMadre(getActual().getOpcionesEleccion()[1]);
		botonOpcion2.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion2.setForeground(new Color(255, 51, 255));
		botonOpcion2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (botonOpcion2.getText().equalsIgnoreCase(getActual().getNombre())) {
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
		botonOpcion2.setBounds(511, 352, 337, 37);
		add(botonOpcion2);

		// opcion 3

		JButton botonOpcion4 = new BotonMadre(getActual().getOpcionesEleccion()[2]);
		botonOpcion4.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion4.setForeground(new Color(255, 51, 255));
		botonOpcion4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (botonOpcion4.getText().equalsIgnoreCase(getActual().getNombre())) {
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
		botonOpcion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonOpcion4.setBounds(511, 440, 337, 37);
		add(botonOpcion4);

		// opcion 4

		JButton botonOpcion3 = new BotonMadre(getActual().getOpcionesEleccion()[3]);
		botonOpcion3.setFont(new Font("Goudy Stout", Font.PLAIN, 10));
		botonOpcion3.setForeground(new Color(255, 51, 255));
		botonOpcion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonOpcion3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (botonOpcion3.getText().equalsIgnoreCase(getActual().getNombre())) {

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
		botonOpcion3.setBounds(75, 440, 337, 37);
		add(botonOpcion3);

	}

}
