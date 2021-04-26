/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Excepciones.NombreVacioException;
import Excepciones.PasswordInvalidException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import Interfaces.FuncionesLogin;
import java.io.File;

/**
 * La siguiente clase representa a la clase delos jugadores y hereda de
 * ElementoConNombre
 *
 * @author Yolanda Cordero
 */
public class Jugador extends ElementoConNombre implements FuncionesLogin {

    private String constraseña;//variable string que contendrá la contraseña del jugador.

    /**
     * Método constructor de la clase jugador
     *
     * @param nombre nombre del jugador
     * @param constraseña contraseña del jugador
     */
    public Jugador(String nombre, String constraseña) {
        super(nombre);
        this.constraseña = constraseña;
    }

    public Jugador() {

    }

    /**
     * método getter de la contraseña
     *
     * @return un string con la clave
     */
    public String getConstraseña() {
        return constraseña;
    }

    /**
     * método setter de la contraseña
     *
     * @param constraseña asigna el argumento pasado por parámetros a la
     * contraseña.
     */
    public void setConstraseña(String constraseña) {

        this.constraseña = constraseña;
    }

    /**
     * método para imprimir objetos Jugador
     *
     * @return un string con los atributos concatenados.
     */
    @Override
    public String toString() {
        return super.getNombre();
    }

    /**
     * método para que un jugador haga login
     *
     * @throws PasswordInvalidException lanza excepción si la clave no coincide
     * @throws FileNotFoundException lanza la excepción si el usuario no existe
     */
    @Override
    public void login() throws PasswordInvalidException, FileNotFoundException {
        try {
            Scanner sc = new Scanner(System.in);
            Jugador jugadorBusca = new Jugador();

            try {
                System.out.println("Dime tu nombre");
                jugadorBusca.setNombre(sc.nextLine());
            } catch (NombreVacioException ex) {
                System.out.println("El nombre no puede estar vacío");
            }
            System.out.println("Dime tu clave");
            jugadorBusca.setConstraseña(sc.nextLine());

            BufferedReader lector = new BufferedReader(new FileReader("./jugadores/" + jugadorBusca.getNombre()));
            String datosPersona = lector.readLine();
            String separador = ",";
            String[] arrayDatos = datosPersona.split(separador);
            this.setNombre(arrayDatos[0]);
            this.setConstraseña(arrayDatos[1]);

            boolean coincideP = arrayDatos[1].equals(jugadorBusca.getConstraseña());
            if (!coincideP) {
                throw new PasswordInvalidException("El password no coincide");

            } else {
                System.out.println("Bienvenid@ a la Rockola Boomer, " + this.getNombre() + ". Espero que disfrutes del juego.");
            }
        } catch (IOException ex) {
            System.out.println("El usuario no ha podido encontrarse");
            login();
        } catch (NombreVacioException ex) {
            System.out.println("El nombre no puede estar vacío");
            login();
        } catch (PasswordInvalidException ex) {

            System.out.println("El password no es válido");
            login();

        }
    }

    /**
     * método para realizar el registro del usuario.
     */
    @Override
    public void registrar() {
        try {

            FileWriter nuevoJugador = new FileWriter("./jugadores/" + super.getNombre(), true);
            String datos = this.toString() + "," + this.getConstraseña();
            nuevoJugador.write(datos);
            nuevoJugador.flush();
            nuevoJugador.close();
            //TODO hacer algo para que no se puedan registrar en el mismo archivo si ya existe.

        } catch (IOException ex) {
            System.out.println("El jugador no ha podido guardarse");
        }
    }

    /**
     * método para pedir los datos del usuario por consola
     *
     * @return un objeto Jugador con el nombre y la contraseña
     */
    @Override
    public Jugador pideDatos() {
        Jugador jugador1 = new Jugador();

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Dime el nombre");
            String nombre = sc.nextLine().toUpperCase();

            File archivo = new File("./jugadores/" + nombre);
            while (archivo.exists()) {
                System.out.println("El jugador ya existe. Elige otro");
                System.out.println("Dime el nombre");
                nombre = sc.nextLine().toUpperCase();
                archivo = new File("./jugadores/" + nombre);

            }
            if (!archivo.exists()) {
                jugador1.setNombre(nombre);
                System.out.println("Dime la contraseña");
                jugador1.setConstraseña(sc.nextLine());

                if (jugador1.constraseña.isBlank()) {
                    throw new PasswordInvalidException("La contraseña no puede estar vacía");
                } else {
                    System.out.println("El jugador ha sido creado con éxito");
                }

            }

        } catch (NombreVacioException ex) {
            System.out.println("El nombre no puede estar vacío");
            return pideDatos();
        } catch (PasswordInvalidException ex) {
            System.out.println("La contraseña no puede estar vacía");
            return pideDatos();
        }
        return (jugador1);
    }

}
