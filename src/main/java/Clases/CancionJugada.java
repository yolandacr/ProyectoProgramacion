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
 * La clase Canción Jugada hereda de canción y representará el resultado
 * obtenido.
 *
 * @author Yolanda Cordero
 */
public class CancionJugada extends Cancion implements FuncionesCancionJugada {

    private boolean aciertoONo;//booleano que almacena si hay acierto o no
    Scanner sc = new Scanner(System.in);

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
    
    

    /**
     * método getter para saber si hay acierto o no
     *
     * @return un true o un false
     */
    public boolean isAciertoONo() {
        return aciertoONo;
    }

    public CancionJugada(String nombre, String autor, CategoriaMusical categoria, String[] opcionesEleccion, short año,
			String disco, Image imagen, String ruta, Clip audioClip) {
		super(nombre, autor, categoria, opcionesEleccion, año, disco, imagen, ruta, audioClip);
		// TODO Auto-generated constructor stub
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

    /*@Override
    public void eligeCategoría(Partida p) {
          byte opcion = 0;

        try {
            System.out.println("Elige categoría: "
                    + "\n\t1- Años 80"
                    + "\n\t2- Años 90"
                    + "\n\t3- Años 200"
                    + "\n\t4- Actualidad"
            );
            opcion = Byte.parseByte(sc.nextLine());
            if (opcion < 1 || opcion > 4) {
                throw new InvalidNumberException("La opción no es válida, prueba de nuevo");
            }
        } catch (InvalidNumberException ex) {
            System.out.println("Opción no válida. Prueba de nuevo");
            while (opcion < 1 || opcion > 2) {
                System.out.println("Elige categoría: "
                    + "\n\t1- Años 80"
                    + "\n\t2- Años 90"
                    + "\n\t3- Años 200"
                    + "\n\t4- Actualidad");
                opcion = Byte.parseByte(sc.nextLine());
            }
        }
        switch (opcion) {

            case 1:
               ArrayList<CancionJugada>años80=new ArrayList();
               p.setCancionJugada(años80);
                break;
            case 2:
                ArrayList<CancionJugada>años90=new ArrayList();
               p.setCancionJugada(años90);
                break;
            case 3:
                ArrayList<CancionJugada>años2000=new ArrayList();
                p.setCancionJugada(años2000);
                break;
            case 4:
                ArrayList<CancionJugada>actualidad=new ArrayList();
                p.setCancionJugada(actualidad);
                break;
        }
        return
    }*/

}
