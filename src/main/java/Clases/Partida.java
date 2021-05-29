
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * clase que almacena todo lo necesario para crear objetos Partida
 *
 * @author Yolanda Cordero
 */
public class Partida {


	private Jugador jugador;// objeto jugador de la partida
	private short puntosPartida;// puntos almacenados en la partida.
	private LocalDateTime fecha;// fecha en la que se realizó la partida.
	private ArrayList<Cancion> cancionesPartida;// canciones que son jugadas en esta partida.
	private String nivel; //nivel de juego elegido

	
	
	/**
	 * método constructor para crear nuevas partidas
	 * @param jugador jugador que está logueado
	 * @param puntosPartida puntos conseguidos en la partida
	 * @param fecha fecha de la partida y hora
	 * @param cancionesPartida canciones con las que se va a jugar
	 * @param nivel de dificultad elegido
	 */
	
	
	public Partida(Jugador jugador, short puntosPartida, ArrayList<Cancion> cancionesPartida,
			String nivel) {
		super();
		this.jugador = jugador;
		this.puntosPartida = puntosPartida;
		this.fecha = LocalDateTime.now();
		this.cancionesPartida = cancionesPartida;
		this.nivel = nivel;
	}
	
	

	/**
	 * metodo constructor para el ranking
	 * @param jugador       objeto jugador con el nombre
	 * @param puntosPartida puntos obtenidos en la partida
	 */

	public Partida(Jugador jugador, short puntosPartida) {
		super();
		this.jugador = jugador;
		this.puntosPartida = puntosPartida;
	}

	
	

	/**
	 * método getter para el objeto jugador
	 * @return un objeto jugador
	 */
	public Jugador getJugador() {
		return jugador;
	}

	/**
	 * método setter de jugador
	 *
	 * @param jugador establece un nuevo valor para el objeto jugador
	 */
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	/**
	 * método getter para los puntos de la partida
	 *
	 * @return un short con los puntos almacenados
	 */
	public short getPuntosPartida() {
		return puntosPartida;
	}

	/**
	 * método setter de los puntos de la partida
	 *
	 * @param puntosPartida establece un número de puntos.
	 */
	public void setPuntosPartida(short puntosPartida) {
		this.puntosPartida = puntosPartida;
	}

	/**
	 * método getter para la fecha
	 *
	 * @return un objeto fecha
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}

	/**
	 * método setter para fecha
	 *
	 * @param fecha establece una fecha nueva
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	/**
	 * metodo getter para las canciones de la partida
	 * 
	 * @return un arraylist con todas las canciones con las que se va a jugar
	 */

	public ArrayList<Cancion> getCancionesPartida() {
		return cancionesPartida;
	}

	/**
	 * metodo setter para las canciones de la partida
	 * 
	 * @param cancionesPartida establece nuevos valores para las cancioens
	 */

	public void setCancionesPartida(ArrayList<Cancion> cancionesPartida) {
		this.cancionesPartida = cancionesPartida;
	}


	/**
	 * metodo getter de nivel
	 * @return un string con el nivel de juego
	 */

	public String getNivel() {
		return nivel;
	}


/**
 *  metodo setter de nivel
 * @param nivel nuevo valor para el string de nivel
 */
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	

}
