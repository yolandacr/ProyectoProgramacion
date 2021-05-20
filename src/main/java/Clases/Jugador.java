/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Excepciones.NombreVacioException;
import Excepciones.PasswordInvalidException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import Interfaces.FuncionesLogin;
import java.io.File;

/**
 * La siguiente clase representa a la clase delos jugadores y hereda de
 * ElementoConNombre
 *
 * @author Yolanda Cordero
 */
public class Jugador extends ElementoConNombre implements FuncionesLogin {

    private String constraseña;//variable string que contendrá la contraseña del jugador.
    
    

    /**
     * Método constructor de la clase jugador
     *
     * @param nombre nombre del jugador
     * @param contraseña contraseña del jugador
     */
    public Jugador(String nombre, String constraseña) {
        super(nombre);
        this.constraseña = constraseña;
    }

    public Jugador() {

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
     * @param constraseña asigna el argumento pasado por parámetros a la
     * contraseña.
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

    public static ArrayList<Jugador> todosJugadores(){
		try {
    		ArrayList<Jugador> jugadores=
    				new ArrayList<Jugador>();
    		
			Connection conexion= DriverManager.getConnection("jdbc:mysql://127.0.1.1/"
					+ "rockola","root","1234");
			Statement consultaJugadores=conexion.createStatement();
			
			ResultSet jugadoresResult=
			consultaJugadores.executeQuery("select * from Jugadores");
			
			while(jugadoresResult.next()) {
				jugadores.add(new Jugador(
							jugadoresResult.getString("nombre"),
							jugadoresResult.getString("contraseña")
							
						));
			}
			
			consultaJugadores.close();
			conexion.close();
			
			return jugadores;
			
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}



      

}
