/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Enums.CategoriaMusical;
import Interfaces.ReproducirCancion;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.Clip;


/**
 * La siguiente clase representa a los objetos Canción.
 *
 * @author Yolanda Cordero
 */
public class Cancion extends ElementoConNombre implements ReproducirCancion {

    private String autor;//representa el nombre del autor de la canción
    private CategoriaMusical categoria;//enumeración que representa la categoróa a la que va a pertenecer.
    private String[] opcionesEleccion;//representa a las distintas opciones de elección del modo fácil.
    private short año;//año de la canción
    private String disco;//disco al que pertenece
    private Image imagen;//imagen del disco al que pertenece
    private String ruta;//ruta relativa donde se encuentra la canción.
    private Clip audioClip;//archivo Clip de cada audio.
    Scanner sc=new Scanner(System.in);

    /**
     * método constructor de la clase Canción.
     *
     * @param nombre nombre de la canción
     * @param autor autor de la canción
     * @param categoria categoría musical a la que pertenece
     * @param opcionesEleccion las distintas opciones a elegir del modo fácil
     * @param año año de la canción
     * @param disco nombre del disco al que pertenece la canción
     * @param imagen imágen del disco de la canción
     * @param ruta ruta donde se encuentra el archivo
     * @param audioClip archivo de audio.
     */
    public Cancion(String nombre, String autor, CategoriaMusical categoria, String[] opcionesEleccion, short año, String disco, Image imagen, String ruta, Clip audioClip) {
        super(nombre);
        this.autor = autor;
        this.categoria = categoria;
        this.opcionesEleccion = opcionesEleccion;
        this.año = año;
        this.disco = disco;
        this.imagen = imagen;
        this.ruta = ruta;
        this.audioClip = audioClip;
    }

    /**
     * método getter de autor
     *
     * @return un string con el nombre del autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * método setter de autor
     *
     * @param autor otorga un nuevo string pasado por parámetros a la variable
     * autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * método getter de la categoría musical
     *
     * @return un string con el nombre de la categoría
     */
    public CategoriaMusical getCategoria() {
        return categoria;
    }

    /**
     * método setter de categoría
     *
     * @param categoria otorga un nuevo string pasado por parámetros a la
     * variable categoría entre las opciones del enum.
     */
    public void setCategoria(CategoriaMusical categoria) {
        this.categoria = categoria;
    }

    /**
     * método getter de las opciones a elegir
     *
     * @return un string con las opciones
     */
    public String[] getOpcionesEleccion() {
        return opcionesEleccion;
    }

    /**
     * método setter de las opciones de elección.
     *
     * @param opcionesEleccion establece nuevos valores para el array de
     * opciones
     */
    public void setOpcionesEleccion(String[] opcionesEleccion) {
        this.opcionesEleccion = opcionesEleccion;
    }

    /**
     * método getter de año
     *
     * @return un número con el valor de la variable
     */
    public short getAño() {
        return año;
    }

    /**
     * método setter de año
     *
     * @param año establece un nuevo valor para la variable año
     */
    public void setAño(short año) {
        this.año = año;
    }

    /**
     * método getter para disco
     *
     * @return devuelve un string con el nombre del disco
     */
    public String getDisco() {
        return disco;
    }

    /**
     * método setter de disco
     *
     * @param disco establece unnuevo valor para el string disco
     */
    public void setDisco(String disco) {
        this.disco = disco;
    }

    /**
     * método getter de Imagen
     *
     * @return un objeto file con la imagen
     */
    public Image getImagen() {    
        return imagen;
    }

    /**
     * método setter de imagen
     *
     * @param imagen establece un nuevo objeto imagen
     */
    public void setImagen(Image imagen) {    
        this.imagen = imagen;
    }

    /**
     * método getter de la ruta de la canción
     *
     * @return un string con la ruta relativa de la canción
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * método setter de la ruta de la canción
     *
     * @param ruta establece una nueva ruta relativa para la canción
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * método getter para el archivo de audio
     *
     * @return un archivo con el audio
     */
    public Clip getAudioClip() {
        return audioClip;
    }

    /**
     * método setter del clip de audio
     *
     * @param audioClip establece un nuevo clip para el audio
     */
    public void setAudioClip(Clip audioClip) {
        this.audioClip = audioClip;
    }

    /**
     * método para imprimir objetos canción
     *
     * @return un string concatenado con otodos los atributos del objeto.
     */
    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()
                + "\n\tAutor: " + autor
                + "\n\tCategoría: " + categoria
                + "\n\tOpcionesEleccion: " + opcionesEleccion
                + "\n\tAño: " + año
                + "\n\tDisco: " + disco
                + "\n\tImagen: " + imagen
                + "\n\tRuta: " + ruta
                + "\n\tAudioClip: " + audioClip;
    }
    
    /**
     * método que reproduce el clip de audio
     */

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * método que para el clip de audio
     */

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
