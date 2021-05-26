//DOCUMENTACION OK

package InterfacesGraficas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JTextField;

import Clases.Cancion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * clase de la pantalla del modo dificil
 * 
 * @author yolanda cordero
 *
 */
public class PantallaJuegoDificil extends JPanel {

	private Ventana ventana;// objeto ventana base
	private JTextField campoPuntos;// campo donde aparecen los puntos acumulados
	private Cancion actual;// cancion con la que se juega en el momento dado
	private File archivoSonido;// archivo de sonido
	private Clip sonido;// objeto reproducible del sonido
	private JTextField campoRespuesta;

	/**
	 * metodo constructor
	 * 
	 * @param v objeto jframe base
	 */
	public PantallaJuegoDificil(Ventana v) {
		this.ventana = v;
		
		Random r = new Random();
		actual = ventana.cancionesAJugar.get(r.nextInt(ventana.cancionesAJugar.size()));
		
		
		
		AudioInputStream audioInputStream;
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File(actual.getRuta()));
			sonido = AudioSystem.getClip();
			sonido.open(audioInputStream);
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
		
		setLayout(null);
		JLabel textoPuntos = new JLabel("Puntos:");
		textoPuntos.setForeground(new Color(204, 51, 255));
		textoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		textoPuntos.setBounds(40, 21, 187, 42);
		add(textoPuntos);

		campoPuntos = new JTextField();
		campoPuntos.setForeground(new Color(204, 51, 255));
		campoPuntos.setEditable(false);
		campoPuntos.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		campoPuntos.setBounds(237, 22, 96, 42);
		add(campoPuntos);
		campoPuntos.setColumns(10);
		
		//ponemos los puntos a los de la partida. Empieza en 0
		int puntosPartida = ventana.nuevaPartida.getPuntosPartida();
		String puntos = Integer.toString(puntosPartida);
		campoPuntos.setText(puntos);

		JButton botonPlay = new JButton("Play");
		botonPlay.setForeground(new Color(255, 51, 255));
		botonPlay.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		botonPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				sonido.start();
				while (sonido.isRunning())
					try {
						Thread.sleep(10);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

			}
		});
		botonPlay.setBounds(223, 210, 177, 51);
		add(botonPlay);

		JButton botonStop = new JButton("Stop");
		botonStop.setForeground(new Color(255, 51, 255));
		botonStop.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		botonStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sonido.stop();

			}
		});
		botonStop.setBounds(571, 210, 177, 51);
		add(botonStop);

		JLabel etiquetaRespuesta = new JLabel("Dime el título de la canción:");
		etiquetaRespuesta.setForeground(new Color(204, 51, 255));
		etiquetaRespuesta.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		etiquetaRespuesta.setBounds(192, 352, 627, 57);
		add(etiquetaRespuesta);

		campoRespuesta = new JTextField();
		campoRespuesta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		campoRespuesta.setBounds(201, 419, 596, 51);
		add(campoRespuesta);
		campoRespuesta.setColumns(10);

		JButton botonOk = new JButton("OK");
		botonOk.setForeground(new Color(255, 51, 255));
		botonOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(campoRespuesta.getText().equalsIgnoreCase(actual.getNombre())) {
					ventana.irAciertoV2();
				}else {
					ventana.irFallo();
				}
				
			}
		});
		botonOk.setFont(new Font("Goudy Stout", Font.PLAIN, 25));
		botonOk.setBounds(445, 520, 110, 57);
		add(botonOk);
	}
}
