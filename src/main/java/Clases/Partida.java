/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Enums.ModoJuego;
import Interfaces.SumaTotales;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * clase que almacena toda la información de objetos Partida
 *
 * @author Yolanda Cordero
 */
public class Partida implements SumaTotales {

    private Jugador jugador;//objeto jugador de la partida
    private short puntosPartida;//puntos almacenados en la partida.
    private LocalDateTime fecha;//fecha en la que se realizó la partida.
    private ModoJuego nivel;//nivel de juego en el que se ha jugado.
    private ArrayList<CancionJugada> cancionJugada;//canciones que ya han sido jugadas en esta partida.

    /**
     * método constructor para las partidas jugadas.
     *
     * @param jugador jugador que la realizó
     * @param puntosPartida puntos conseguidos en la partida
     * @param fecha fecha de la partida y hora
     * @param nivel nivel de dificultad elegido
     * @param cancionJugada canciones que ya han sido jugadas en la aprtida
     */
    public Partida(Jugador jugador, short puntosPartida, LocalDateTime fecha, ModoJuego nivel, ArrayList<CancionJugada> cancionJugada) {
        this.jugador = jugador;
        this.puntosPartida = puntosPartida;
        this.fecha = fecha;
        this.nivel = nivel;
        this.cancionJugada = cancionJugada;
    }

    /**
     * método getter para el objeto jugador
     *
     * @return un objeto jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * método setter de jugador
     *
     * @param jugador establece un nuevo valor para el objeto jugador
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * método getter para los puntos de la partida
     *
     * @return un short con los puntos almacenados
     */
    public short getPuntosPartida() {
        return puntosPartida;
    }

    /**
     * método setter de los puntos de la partida
     *
     * @param puntosPartida establece un número de puntos.
     */
    public void setPuntosPartida(short puntosPartida) {
        this.puntosPartida = puntosPartida;
    }

    /**
     * método getterpara la fecha
     *
     * @return un objeto fecha
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * método setter para fecha
     *
     * @param fecha establece una fecha nueva
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * método getterpara el nivel de juego
     *
     * @return un string con el enum correspondiente.
     */
    public ModoJuego getNivel() {
        return nivel;
    }

    /**
     * método setter para nivel
     *
     * @param nivel establece un nuevo valor de el enum para el nivel
     */
    public void setNivel(ModoJuego nivel) {
        this.nivel = nivel;
    }

    /**
     * método getter de la lista de canciones jugadas.
     *
     * @return una lista de canciones jugadas
     */
    public ArrayList<CancionJugada> getCancionJugada() {
        return cancionJugada;
    }

    /**
     * método setter para canciones jugadas
     *
     * @param cancionJugada establece nuevos valores para las canciones jugadas.
     */
    public void setCancionJugada(ArrayList<CancionJugada> cancionJugada) {
        this.cancionJugada = cancionJugada;
    }

    /**
     * método para imprimir objetos de CancionJugada.
     *
     * @return un string con los datos concatenados.
     */
    @Override
    public String toString() {
        return "Jugador: " + jugador
                + "\n\tPuntos de la partida: " + puntosPartida
                + "\n\tFecha: " + fecha
                + "\n\tNivel de dificultad: " + nivel
                + "\n\tCanciones Jugadas: " + cancionJugada;
    }

    /**
     * función que suma los puntos por canción acertada
     *
     * @param puntos puntos de la canción acertada. 50 para modo fácil 100 para
     * experto.
     * @return un número con el total
     */
    @Override
    public short sumarPuntos(byte puntos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * método que suma los aciertos
     *
     * @param acierto le pasa un booleano que si es true suma 1.
     * @return un número con el total de aciertos.
     */

    @Override
    public byte sumarAciertos(boolean acierto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
