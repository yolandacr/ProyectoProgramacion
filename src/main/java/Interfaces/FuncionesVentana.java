//DOCUMENTACION OK

package Interfaces;



/**
 * Interface para la clase ventana con todos los métodos a utilizar
 * @author yolanda cordero
 *
 */
public interface FuncionesVentana {

	public void irARegistro();//método para ir a la pantalla de registro

	public void irALogin();//método para ir a la pantalla de Login

	public void irInicio();//método para ir a la pantalla de Inicio

	public void irFacil();//método para ir a la pantalla del juego en modo fácil

	public void irAExperto();//método para ir a la pantalla del juego en modo experto

	public void irACategoria();//método para ir a la pantalla de elección de Categoría

	public void irANivel();//método para ir a la pantalla de elección de nivel

	public void irARanking();//método para ir a la pantalla de Ranking
	
	public void irAciertoV2();//método para ir a la pantalla de acierto (version alternativa)
	
	public void irFallo();//método para ir a la pantalla de fallo
	
	public void siguienteCancion();// metodo para resetear la pantalla y que cambie de cancion

}
