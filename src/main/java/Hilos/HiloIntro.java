package Hilos;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import Interfaces.FuncionesHiloIntro;

/**
 * clase para el hilo de la cancion de introduccion
 * 
 * @author yolanda cordero
 *
 */
public class HiloIntro extends Thread implements FuncionesHiloIntro {

	private String rutaCancion;// ruta relativa del archivo wav
	private Clip sonido;// archivo de sonido reproducible

	/**
	 * método constructor para el hilo de la intro
	 * 
	 * @param rutaCancion ruta relativa de la cancion
	 */
	public HiloIntro(String rutaCancion) {
		this.rutaCancion = rutaCancion;
	}

	/**
	 * método constructor para la cancion de la intro
	 */

	public void runIntro() {

		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(rutaCancion));
			sonido = AudioSystem.getClip();
			sonido.open(audioInputStream);
			sonido.start();
			sonido.loop(MAX_PRIORITY);

		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e2) {

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

}
