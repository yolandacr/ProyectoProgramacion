/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa.proyectot3;

import Clases.Jugador;
import Clases.Partida;

import Excepciones.PasswordInvalidException;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La siguiente clase es la principal de mi proyecto
 *
 * @author Yolanda Cordero
 */
public class Main {

    /**
     * método main de mi proyecto
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Jugador jugador1 = new Jugador();

            System.out.println("Bienvenido a la Rockola Boomer. Elige que quieres hacer: "
                    + "\n\t1- Registrar Usuario"
                    + "\n\t2- Login de usuario");

            byte opcion = Byte.parseByte(sc.nextLine());
            while (opcion < 1 || opcion > 2) {
                System.out.println("Opción no válida. Elige una de las dos opciones por favor");
                System.out.println("Bienvenido a la Rockola Boomer. Elige que quieres hacer: "
                        + "\n\t1- Registrar Usuario"
                        + "\n\t2- Login de usuario");

                opcion = Byte.parseByte(sc.nextLine());

            }

            switch (opcion) {
                case 1:
                    jugador1 = jugador1.pideDatos();
                    jugador1.registrar();

                    break;
                case 2:
                    jugador1.login();
                    Partida partida1 = new Partida(jugador1, (short) 0, null, null, null);
                    partida1.eligeNivel(partida1);
                    partida1.estableceFecha(partida1);
                    System.out.println(partida1);

                    break;
            }
        } catch (PasswordInvalidException | FileNotFoundException ex) {
            System.out.println("La acción no ha podido llevarse a cabo");
        }

    }

}
