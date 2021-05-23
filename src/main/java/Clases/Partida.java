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

	Scanner sc = new Scanner(System.in);

	private Jugador jugador;// objeto jugador de la partida
	private short puntosPartida;// puntos almacenados en la partida.
	private LocalDateTime fecha;// fecha en la que se realizó la partida.
	private ArrayList<Cancion> cancionesPartida;// canciones que son jugadas en esta partida.

	/**
	 * método constructor para las partidas jugadas.
	 * 
	 * @param jugador       jugador que la realizó
	 * @param puntosPartida puntos conseguidos en la partida
	 * @param fecha         fecha de la partida y hora
	 * @param cancionJugada canciones que ya han sido jugadas en la aprtida
	 */
	public Partida(Jugador jugador, short puntosPartida, LocalDateTime fecha, ArrayList<Cancion> cancionesPartida) {
		this.jugador = jugador;
		this.puntosPartida = puntosPartida;
		this.fecha = fecha;
		this.cancionesPartida = cancionesPartida;
	}
	
	
	/**
	 * metodo constructor para el ranking
	 * @param jugador
	 * @param puntosPartida
	 */

	public Partida(Jugador jugador, short puntosPartida) {
		super();
		this.jugador = jugador;
		this.puntosPartida = puntosPartida;
	}




	/**
	 * método getter para el objeto jugador
	 *
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
	 * método getterpara la fecha
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
	 * @return
	 */

	public ArrayList<Cancion> getCancionesPartida() {
		return cancionesPartida;
	}

	/**
	 * metodo setter para las canciones de la partida
	 * 
	 * @param cancionesPartida
	 */

	public void setCancionesPartida(ArrayList<Cancion> cancionesPartida) {
		this.cancionesPartida = cancionesPartida;
	}

	/**
	 * metodo de impresion de objetos
	 */

	@Override
	public String toString() {
		return "Partida [jugador=" + jugador + ", puntosPartida=" + puntosPartida + ", fecha=" + fecha
				+ ", cancionesPartida=" + cancionesPartida + "]";
	}

}
