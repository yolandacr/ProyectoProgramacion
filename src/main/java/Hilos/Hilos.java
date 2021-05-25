package Hilos;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;

public class Hilos extends Thread {
	
	private String rutaCancion;
	private JButton botonPlay;
	private JButton botonStop;
	private Clip sonido;
	
	public Hilos(String rc,JButton botonPlay,JButton botonStop) {
		rutaCancion=rc;
		this.botonPlay=botonPlay;
		this.botonStop=botonStop;
	}
	
	
	public void run() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(rutaCancion));
			sonido = AudioSystem.getClip();
			if(botonPlay.isEnabled()) {
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
	
	public void parar() {
		sonido.stop();
		botonPlay.setEnabled(true);
		botonStop.setEnabled(false);
	}
}
	



