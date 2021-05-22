/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 * La siguiente excepción saltará cuando el nombre del jugador esté en blanco
 * @author Yolanda Cordero
 */
public class NombreVacioException extends Exception {
    public NombreVacioException(String mensaje) {
        super(mensaje);
    }
    
}
