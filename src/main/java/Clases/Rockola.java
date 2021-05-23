//DOCUMENTACION OK
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 * Clase que contendrá partidas y canciones. Es la Rockola en sí.
 * TODO documentar esta clase
 * @author Yolanda Cordero
 */
public class Rockola {

    private ArrayList<Partida> partidas;//arraylist con las partidas
    private ArrayList<Cancion> canciones;//arraylist con las canciones
    
    
    /**
     * metodo constructor de rockola
     * @param partidas incluye todas las partidas
     * @param canciones incluye todas las canciones
     */

    public Rockola(ArrayList<Partida> partidas, ArrayList<Cancion> canciones) {
        this.partidas = partidas;
        this.canciones = canciones;
    }
    
    /**
     * metodo getter de partidas
     * @return una lista de partidas
     */

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }
    
    
    /**
     * metodo setter de partidas
     * @param partidas los nuevos valores a insertar
     */

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }
    
    /**
     * metodo getter de canciones
     * @return una lista con las canciones
     */

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    
    /**
     * metodo setter de canciones
     * @param canciones arraylist cn los nuevos valores a insertar
     */
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    /**
     * metodo de impresion de objetos rockola
     */

  

}
