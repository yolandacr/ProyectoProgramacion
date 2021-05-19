package InterfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Insets;

public class PantallaRanking extends JPanel {
	public PantallaRanking() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel textoPuntuaciones = new JLabel("Mejores Puntuaciones:");
		textoPuntuaciones.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoPuntuaciones.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textoPuntuaciones = new GridBagConstraints();
		gbc_textoPuntuaciones.insets = new Insets(0, 0, 5, 5);
		gbc_textoPuntuaciones.gridx = 5;
		gbc_textoPuntuaciones.gridy = 1;
		add(textoPuntuaciones, gbc_textoPuntuaciones);
		
		JLabel textoPosicion1 = new JLabel("1.");
		textoPosicion1.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion1 = new GridBagConstraints();
		gbc_textoPosicion1.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion1.gridx = 3;
		gbc_textoPosicion1.gridy = 3;
		add(textoPosicion1, gbc_textoPosicion1);
		
		JLabel textoPosicion2 = new JLabel("2.");
		textoPosicion2.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion2 = new GridBagConstraints();
		gbc_textoPosicion2.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion2.gridx = 3;
		gbc_textoPosicion2.gridy = 4;
		add(textoPosicion2, gbc_textoPosicion2);
		
		JLabel textoPosicion3 = new JLabel("3.");
		textoPosicion3.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion3 = new GridBagConstraints();
		gbc_textoPosicion3.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion3.gridx = 3;
		gbc_textoPosicion3.gridy = 5;
		add(textoPosicion3, gbc_textoPosicion3);
		
		JLabel textoPosicion4 = new JLabel("4.");
		textoPosicion4.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion4 = new GridBagConstraints();
		gbc_textoPosicion4.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion4.gridx = 3;
		gbc_textoPosicion4.gridy = 6;
		add(textoPosicion4, gbc_textoPosicion4);
		
		JLabel textoPosicion5 = new JLabel("5.");
		textoPosicion5.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		GridBagConstraints gbc_textoPosicion5 = new GridBagConstraints();
		gbc_textoPosicion5.insets = new Insets(0, 0, 5, 5);
		gbc_textoPosicion5.gridx = 3;
		gbc_textoPosicion5.gridy = 7;
		add(textoPosicion5, gbc_textoPosicion5);
	}
	Ventana ventana;
}
