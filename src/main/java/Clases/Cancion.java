/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import Interfaces.ReproducirCancion;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * La siguiente clase representa a los objetos Canción.
 *
 * @author Yolanda Cordero
 */
public class Cancion extends ElementoConNombre implements ReproducirCancion {

    private String autor;//representa el nombre del autor de la canción
    private String categoria;//enumeración que representa la categoróa a la que va a pertenecer.
    private String[] opcionesEleccion;//representa a las distintas opciones de elección del modo fácil.
    private int año;//año de la canción
    private String disco;//disco al que pertenece
    private Image imagen;//imagen del disco al que pertenece
    private String ruta;//ruta del archivo de audio en String

    //estas dos variables se utilizan para crear el reproductor
    private Clip audioClip;//variable que representa el archivo de audio
    private AudioInputStream audioStream;//variable que representa la ruta del archivo de audio en un objeto
    Scanner sc = new Scanner(System.in);
    
  /**
   * constructor con todos los parámetros para crear las canciones del arraylist en cada categoria
   * @param autor
   * @param categoria
   * @param opcionesEleccion
   * @param año
   * @param disco
   * @param imagen
   * @param ruta
   * @param audioClip
   * @param audioStream
   * @param sc
   */
    
    
    public Cancion(String nombre, String autor, String categoria, int año, String disco, String ruta) {
		super(nombre);
		this.autor = autor;
		this.categoria = categoria;
		this.año = año;
		this.disco = disco;
		this.ruta = ruta;
		
	}

	/**
     * constructor de canción para la pantalla de acierto
     * @param autor autor de la cancion
     * @param año año enel que se publicó la canción
     * @param disco nombre del disco al que pertenece
     * @param imagen imagen del disco al que pertenece
     * @param nombre nombre de la canción
     */

    public Cancion(String nombre,String autor, short año, String disco, Image imagen) {
        super(nombre);
        this.autor = autor;
        this.año = año;
        this.disco = disco;
        this.imagen = imagen;
    }
    
    /**
     * constructor para crear arrayList en Pantalla de categoría.
     * @param nombre
     * @param autor
     * @param categoria
     * @param año
     * @param disco
     * @param ruta
     */

    

    public Cancion(String nombre, String autor, String categoria, short año, String disco, String ruta) {
		super(nombre);
		this.autor = autor;
		this.categoria = categoria;
		this.año = año;
		this.disco = disco;
		this.ruta = ruta;
	}




	/**
     * constructor pasando solo la ruta del archivo audio.Se usará para el reproductor.
     *
     * @param ruta
     */
    public Cancion(String ruta) {
        //crea un AudioInputStream desde la ruta de sonido especificada
        File audioFile = new File(ruta);
        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }

        //adquiere el formato de audio y crea un objeto DataLine.
        AudioFormat format = audioStream.getFormat();
        //var info = new DataLine.Info(Clip.class, format);

        //obtiene el clip
        try {
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
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
    public String getCategoria() {
        return categoria;
    }

    /**
     * método setter de categoría
     *
     * @param categoria otorga un nuevo string pasado por parámetros a la
     * variable categoría entre las opciones del enum.
     */
    public void setCategoria(String categoria) {
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
    public int getAño() {
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
     * método getter para AudioStream
     *
     * @return un objeto audioStream
     */
    public AudioInputStream getAudioStream() {
        return audioStream;
    }

    /**
     * método setter para AudioStream
     *
     * @param audioStream
     */
    public void setAudioStream(AudioInputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * método para imprimir objetos canción cuando acierten
     * @return un string concatenado con otodos los atributos del objeto.
     */
    @Override
    public String toString() {
        return "Nombre: "+super.getNombre()
                + "\nAutor: " + autor 
                + "\nAño: " + año 
                + "\nDisco: " + disco 
                + "\nImagen: " + imagen;
    }

    /**
     * método que reproduce el clip de audio
     */
    @Override
    public void play() {
        new Thread(() -> {
            audioClip.setFramePosition(0);
            audioClip.start();
        }) {
        }.start();
    }

    /**
     * método que para el clip de audio
     */
    @Override
    public void stop() {
        audioClip.stop();
    }
}
