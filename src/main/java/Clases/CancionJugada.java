/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Enums.CategoríaMusical;
import java.io.File;
import javax.sound.sampled.Clip;

/**
 * La clase Canción Jugada hereda de canción y representará el resultado
 * obtenido.
 *
 * @author Yolanda Cordero
 */
public class CancionJugada extends Canción {

    private boolean aciertoONo;//booleano que almacena si hay acierto o no

    /**
     * método constructor de las canciones jugadas
     *
     * @param nombre nombre de la canción
     * @param autor autor de la canción
     * @param categoria categoría musical a la que pertenece
     * @param opcionesEleccion las distintas opciones de respuesta
     * @param año año de la canción
     * @param disco disco al que pertenece
     * @param imagen imagen del disco al que pertenece
     * @param ruta ruta de la canción
     * @param audioClip archivo de audio
     * @param aciertoONo booleano que valora si hay acierto o no
     */
    public CancionJugada(String nombre, String autor, CategoríaMusical categoria,
            String[] opcionesEleccion, short año, String disco, File imagen,
            String ruta, Clip audioClip, boolean aciertoONo) {
        super(nombre, autor, categoria, opcionesEleccion, año, disco, imagen, ruta, audioClip);
        this.aciertoONo = aciertoONo;
    }

    /**
     * método getter para saber si hay acierto o no
     *
     * @return un true o un false
     */
    public boolean isAciertoONo() {
        return aciertoONo;
    }

    /**
     * setter para el acierto
     *
     * @param aciertoONo establece un nuevo valor para la variable acierto entre
     * true o false.
     */
    public void setAciertoONo(boolean aciertoONo) {
        this.aciertoONo = aciertoONo;
    }

    /**
     * método para imprimir objetos CancionJugada
     *
     * @return un string concatenado con todos los atributos.
     */
    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()
                + "\n\tAutor: " + super.getAutor()
                + "\n\tCategoría: " + super.getCategoria()
                + "\n\tOpcionesEleccion: " + super.getOpcionesEleccion()
                + "\n\tAño: " + super.getAño()
                + "\n\tDisco: " + super.getDisco()
                + "\n\tImagen: " + super.getImagen()
                + "\n\tRuta: " + super.getRuta()
                + "\n\tAudioClip: " + super.getAudioClip()
                + "\n\tAcierto: " + aciertoONo;
    }

}
