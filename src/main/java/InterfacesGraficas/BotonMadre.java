package InterfacesGraficas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

/**
 * clase para crear botones madre base
 * 
 * @author yolanda cordero
 *
 */

public class BotonMadre extends JButton {
	private BotonMadre thisRef;// variable referencia a botón madre (la hizo miguel)

	/**
	 * método constructor del botón
	 * 
	 * @param txt texto que queremos modificar
	 */

	public BotonMadre(String txt) {
		super(txt);
		thisRef = this;

		this.setForeground(new Color(153, 51, 255));
		this.setFont(new Font("Goudy Stout", Font.BOLD, 25));
		this.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(2, 2, 2, 2, new Color(60, 20, 100)),
				new MatteBorder(5, 5, 5, 5, new Color(10, 13, 17))));
		this.setBackground(new Color(10, 13, 17));

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				thisRef.setBorder(
						BorderFactory.createCompoundBorder(new MatteBorder(2, 2, 2, 2, new Color(60, 20, 100)),
								new MatteBorder(5, 5, 5, 5, new Color(67, 36, 100))));
				thisRef.setCursor(new Cursor(Cursor.HAND_CURSOR));
				thisRef.setBackground(new Color(67, 36, 100));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				thisRef.setBorder(
						BorderFactory.createCompoundBorder(new MatteBorder(2, 2, 2, 2, new Color(60, 20, 100)),
								new MatteBorder(5, 5, 5, 5, new Color(10, 13, 17))));
				thisRef.setBackground(new Color(10, 13, 17));
			}
		});
	}

}
