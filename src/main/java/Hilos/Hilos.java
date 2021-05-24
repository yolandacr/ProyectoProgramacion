package Hilos;

import javax.sound.sampled.Clip;

public class Hilos extends Thread {
	
	Clip sonido;
	
	public Hilos() {}
	
	
	public void run() {
		while(true) {sonido.start();}
	}

	
	public void recibeSonido(Clip sonido) {
		this.sonido=sonido;
		sonido.start();
	}}
	



