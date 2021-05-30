package Hilos;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import Interfaces.FuncionesHilos;

/**
 * clase para los hilos
 * 
 * @author yolanda cordero
 *
 */
public class Hilos extends Thread implements FuncionesHilos {

	private String rutaCancion;// ruta relativa del archivo wav
	private JButton botonPlay;// boton para ejecutar la canción
	private JButton botonStop;// boton para parar la canción
	private Clip sonido;// archivo de sonido reproducible

	/**
	 * metodo constructor para todas las canciones del juego
	 * 
	 * @param rc ruta de la canción (relativa)
	 * @param botonPlay boton de ejecucion
	 * @param botonStop boton de parada
	 */

	public Hilos(String rc, JButton botonPlay, JButton botonStop) {
		rutaCancion = rc;
		this.botonPlay = botonPlay;
		this.botonStop = botonStop;
	}

	/**
	 * método para ejecutar el hilo
	 */

	public void run() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(rutaCancion));
			sonido = AudioSystem.getClip();
			if (botonPlay.isEnabled()) {
				sonido.open(audioInputStream);
				sonido.start();
				botonPlay.setEnabled(false);
				botonStop.setEnabled(true);
			}
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

	/**
	 * metodo para parar la cancion de la intro
	 */

	public void pararIntro() {
		sonido.stop();
		sonido.close();
	}

	/**
	 * método para detener el hilo
	 */

	public void parar() {
		sonido.stop();
		sonido.close();
		botonPlay.setEnabled(true);
		botonStop.setEnabled(false);
	}
}
