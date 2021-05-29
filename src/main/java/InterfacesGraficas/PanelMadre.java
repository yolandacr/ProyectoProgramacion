package InterfacesGraficas;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * clase del panel madre/base
 * 
 * @author yolanda cordero
 *
 */

public class PanelMadre extends JPanel {

	/**
	 * método que dibuja el fondo en un panel
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			g.drawImage(ImageIO.read(new File(".\\imagenes\\imagenFondo.jpg")), 0, 0, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
