
package Clases;

/**
 * La siguiente clase representa a los objetos Canción.
 *
 * @author Yolanda Cordero
 */
public class Cancion extends ElementoConNombre {

	private String autor;// representa el nombre del autor de la canción
	private String categoria;// enumeración que representa la categoróa a la que va a pertenecer.
	private String[] opcionesEleccion;// representa a las distintas opciones de elección del modo fácil.
	private int año;// año de la canción
	private String disco;// disco al que pertenece
	private String ruta;// ruta del archivo de audio en String

	/**
	 * constructor sin la ruta de imagen para generar canciones en una primera
	 * version del juego
	 * 
	 * @param nombre           nombre string de la cancion
	 * @param autor            autor de la cancion string
	 * @param categoria        categoria cancion String
	 * @param opcionesEleccion array con las opciones a elegir. solo una es correcta
	 * @param año              año de publicacion de la cancion
	 * @param disco            disco al que pertenece
	 * @param ruta             ruta relativa del archivo de audio
	 */

	public Cancion(String nombre, String autor, String categoria, String[] opcionesEleccion, int año, String disco,
			String ruta) {
		super(nombre);
		this.autor = autor;
		this.categoria = categoria;
		this.opcionesEleccion = opcionesEleccion;
		this.año = año;
		this.disco = disco;
		this.ruta = ruta;
	}

	/**
	 * constructor de canción para la pantalla de acierto
	 * 
	 * @param autor  autor de la cancion
	 * @param año    año enel que se publicó la canción
	 * @param disco  nombre del disco al que pertenece
	 * @param imagen imagen del disco al que pertenece
	 * @param nombre nombre de la canción
	 */

	public Cancion(String nombre, String autor, short año, String disco) {
		super(nombre);
		this.autor = autor;
		this.año = año;
		this.disco = disco;
	}

	/**
	 * constructor para crear arrayList en Pantalla de categoría.
	 * 
	 * @param nombre    de la cancion
	 * @param autor     quien la canta
	 * @param categoria categoria musical a la que pertenece
	 * @param año       año d epublicacion
	 * @param disco     disco al que pertenece
	 * @param ruta      ruta relativa del archivo wav
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
	 * getter del array de opciones de eleccion
	 * 
	 * @return el array de las opciones de la cancion
	 */

	public String[] getOpcionesEleccion() {
		return opcionesEleccion;
	}

	/**
	 * metodo setter del array de opciones de eleccion
	 * 
	 * @param opcionesEleccion implanta estos valores nuevos en el array
	 */

	public void setOpcionesEleccion(String[] opcionesEleccion) {
		this.opcionesEleccion = opcionesEleccion;
	}

	/**
	 * getter de autor
	 * 
	 * @return un string con el nombre del autor
	 */

	public String getAutor() {
		return autor;
	}

	/**
	 * setter autor
	 * 
	 * @param autor establece un valor nuevo en autor
	 */

	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * getter de categoria
	 * 
	 * @return devuelve un string con el nombre de la categoria
	 */

	public String getCategoria() {
		return categoria;
	}

	/**
	 * setter categoria
	 * 
	 * @param categoria establece un nuevo valor para categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * getter de año
	 * 
	 * @return un entero con el año
	 */

	public int getAño() {
		return año;
	}

	/**
	 * setter de año
	 * 
	 * @param año establece un nuevo valor a la variable
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * getter de disco
	 * 
	 * @return devuelve el nombre del disco
	 */

	public String getDisco() {
		return disco;
	}

	/**
	 * setter disco
	 * 
	 * @param disco establece un nuevo valor para disco
	 */

	public void setDisco(String disco) {
		this.disco = disco;
	}

	/**
	 * getter ruta
	 * 
	 * @return la ruta relativa de la cancion en formato wav
	 */

	public String getRuta() {
		return ruta;
	}

	/**
	 * setter de ruta
	 * 
	 * @param ruta establece una nueva ruta para el archivo wav
	 */

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}
