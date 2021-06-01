/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 * La siguiente excepcion saltará cuando, en la pantalla registro, la contraseña esté en blanco.
 * @author Yolanda Cordero
 */
public class ContraseñaVaciaException extends Exception {
    public ContraseñaVaciaException(String mensaje) {
        super(mensaje);
    }
    
}
