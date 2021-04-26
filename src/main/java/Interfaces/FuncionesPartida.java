/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import Clases.Partida;

/**
 * Interface con los métodos para sumar puntos y aciertos
 * @author Yolanda Cordero
 */
public interface FuncionesPartida {
    /**
     * función que suma los puntos por canción acertada
     * @param puntos puntos de la canción acertada. 50 para modo fácil 100 para experto.
     * @return un número con el total
     */
    public short sumarPuntos(byte puntos);
    
    /**
     * método que suma los aciertos
     * @param acierto le pasa un booleano que si es true suma 1.
     * @return un número con el total de aciertos.
     */
    public byte  sumarAciertos(boolean acierto);
    
    public void eligeNivel(Partida p);
    
    public void estableceFecha(Partida p);
    
}
