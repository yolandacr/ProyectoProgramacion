/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 * La siguiente excepcion saltará cuando un array a formar esté vacío
 * @author Yolanda Cordero
 */
public class ArrayVacioException extends Exception {
    public ArrayVacioException(String mensaje) {
        super(mensaje);
    }
    
}
