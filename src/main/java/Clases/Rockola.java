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

    public Rockola(ArrayList<Partida> partidas, ArrayList<Cancion> canciones) {
        this.partidas = partidas;
        this.canciones = canciones;
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Rockola{" + "partidas=" + partidas + ", canciones=" + canciones + '}';
    }

}
