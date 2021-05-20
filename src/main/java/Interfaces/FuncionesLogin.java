/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Jugador;
import Excepciones.NombreVacioException;
import Excepciones.PasswordInvalidException;
import java.io.FileNotFoundException;

/**
 * clase para el login/registro del jugador
 * @author Yolanda Cordero
 */
public interface FuncionesLogin {
    public void login();
    public void registrar();
    
}
