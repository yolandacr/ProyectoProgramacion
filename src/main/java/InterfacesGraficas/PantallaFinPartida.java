//DOCUMENTACION OK
package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase de la Pantalla de fin de partida
 * 
 * @author Yolanda Cordero
 *
 */

public class PantallaFinPartida extends JPanel {

	private Ventana ventana;// ventana jframe base
	private JTextField textoFinPartida; // texto visible
	private JTextField campoPuntos; // campo puntos obtenidos
	private JButton botonInicio; // boton para volver al inicio
	private JButton botonRanking; // boton para ver el ranking
	private JLabel lblNewLabel; // texto

	/**
	 * metodo constructor
	 * 
	 * @param v ventana base
	 */
	public PantallaFinPartida(Ventana v) {
		this.ventana = v;
		setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("center:default"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("center:default"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("center:max(50dlu;pref)"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(10dlu;default)"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), }));

		textoFinPartida = new JTextField();
		textoFinPartida.setForeground(new Color(204, 51, 255));
		textoFinPartida.setFont(new Font("Goudy Stout", Font.PLAIN, 40));
		textoFinPartida.setText("¡Fin de la");
		textoFinPartida.setHorizontalAlignment(SwingConstants.CENTER);
		add(textoFinPartida, "4, 2, fill, default");
		textoFinPartida.setColumns(10);

		lblNewLabel = new JLabel("partida!");
		lblNewLabel.setForeground(new Color(204, 51, 255));
		lblNewLabel.setFont(new Font("Goudy Stout", Font.PLAIN, 40));
		add(lblNewLabel, "4, 4");

		JLabel etiquetaPuntos = new JLabel("Puntos totales:");
		etiquetaPuntos.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPuntos.setForeground(new Color(255, 51, 255));
		etiquetaPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		add(etiquetaPuntos, "4, 12");

		campoPuntos = new JTextField();
		campoPuntos.setForeground(new Color(204, 51, 255));
		campoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		campoPuntos.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntos.setEditable(false);
		add(campoPuntos, "4, 14, fill, default");
		campoPuntos.setColumns(10);

		botonInicio = new JButton("Inicio");
		botonInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irInicio();
			}
		});
		botonInicio.setForeground(new Color(255, 51, 255));
		botonInicio.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		add(botonInicio, "2, 16");

		botonRanking = new JButton("Ranking");
		botonRanking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irARanking();
			}
		});
		botonRanking.setForeground(new Color(255, 51, 255));
		botonRanking.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		add(botonRanking, "6, 16");
	}

}
