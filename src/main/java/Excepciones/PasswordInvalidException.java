/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *La siguiente excepción es para la contraseña inválida.
 * @author Yolanda Cordero
 */
public class PasswordInvalidException extends Exception {

    public PasswordInvalidException(String mensaje) {
        super(mensaje);
    }

}
