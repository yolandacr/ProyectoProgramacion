/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Excepciones.PasswordInvalidException;
import Interfaces.LoginRegistro;
import java.io.FileNotFoundException;

/**
 * La siguiente clase representa a la clase delos jugadores y hereda de
 * ElementoConNombre
 *
 * @author Yolanda Cordero
 */
public class Jugador extends ElementoConNombre implements LoginRegistro {

    private String constraseña;//variable string que contendrá la contraseña del jugador.

    /**
     * Método constructor de la clase jugador
     *
     * @param nombre nombre del jugador
     * @param constraseña contraseña del jugador
     */
    public Jugador(String nombre, String constraseña) {
        super(nombre);
        this.constraseña = constraseña;
    }

    /**
     * método getter de la contraseña
     *
     * @return un string con la clave
     */
    public String getConstraseña() {
        return constraseña;
    }

    /**
     * método setter de la contraseña
     *
     * @param constraseña asigna el argumento pasado por parámetros a la
     * contraseña.
     */
    public void setConstraseña(String constraseña) {
        this.constraseña = constraseña;
    }

    /**
     * método para imprimir objetos Jugador
     *
     * @return un string con los atributos concatenados.
     */
    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()
                + "\n\tConstraseña: " + constraseña;
    }

    /**
     * método para que un jugador haga login
     *
     * @param nombre nombre del jugador
     * @param password clave del jugador
     * @throws PasswordInvalidException lanza excepción si la clave no coincide
     * @throws FileNotFoundException lanza la excepción si el usuario no existe
     */
    @Override
    public void login(String nombre, String password) throws PasswordInvalidException, FileNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * método para realizar el registro del usuario.
     */
    @Override
    public void registrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
