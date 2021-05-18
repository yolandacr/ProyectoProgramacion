/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Enums.CategoriaMusical;
import Excepciones.InvalidNumberException;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.sampled.Clip;
import Interfaces.FuncionesCancionJugada;

/**
 * La clase Canción Jugada son las canciones que ya he jugado.
 *
 * @author Yolanda Cordero
 */
public class CancionJugada extends Cancion implements FuncionesCancionJugada {

    private boolean aciertoONo;

    /**
     * método constructor de cancionescon todas las variables internas menos las del reproductor.
     * @param nombre nombre de la cancion
     * @param autor nombre del autor de la cancion
     * @param categoria categoria del juego a la que pertenece
     * @param opcionesEleccion distintas opciones de eleccion
     * @param año año de publicacion
     * @param disco al que pertenece
     * @param imagen del disco al que pertenece
     * @param ruta ruta del archivo audio
     * @param aciertoONo booleano que es true si acierta y false si falla.
     */
    public CancionJugada(String nombre, String autor, CategoriaMusical categoria, String[] opcionesEleccion, short año, String disco,
            Image imagen, String ruta, boolean aciertoONo) {
        super(autor, categoria, opcionesEleccion, año, disco, imagen, ruta, nombre);
        this.aciertoONo = aciertoONo;
    }

}
