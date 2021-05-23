/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * La siguiente clase representa a la clase de los jugadores y hereda de
 * ElementoConNombre
 *
 * @author Yolanda Cordero
 */
public class Jugador extends ElementoConNombre {

	private String constraseña;// variable string que contendrá la contraseña del jugador.

	/**
	 * Método constructor de la clase jugador
	 *
	 * @param nombre     nombre del jugador
	 * @param contraseña contraseña del jugador
	 */
	public Jugador(String nombre, String constraseña) {
		super(nombre);
		this.constraseña = constraseña;
	}

	/**
	 * constructor sin argumentos
	 */
	public Jugador() {

	}
	
	
	
/**
 * metodo constructor necesario para generar el ranking
 * @param nombre nombre del jugador
 */
	public Jugador(String nombre) {
		super(nombre);
		
	}

	/**
	 * método getter de la contraseña
	 *
	 * @return un string con la clave
	 */
	public String getContraseña() {
		return constraseña;
	}

	/**
	 * método setter de la contraseña
	 *
	 * @param constraseña asigna el argumento pasado por parámetros a la contraseña.
	 */
	public void setContraseña(String constraseña) {

		this.constraseña = constraseña;
	}

	/**
	 * método para imprimir objetos Jugador
	 *
	 * @return un string con los atributos concatenados.
	 */
	@Override
	public String toString() {
		return super.getNombre();
	}

}
