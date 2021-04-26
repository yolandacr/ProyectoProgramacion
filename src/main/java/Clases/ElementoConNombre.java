/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Excepciones.NombreVacioException;

/**
 * La siguiente clase abstracta será superclase de todos los elementos con
 * nombre.
 *
 * @author Yolanda Cordero
 */
public abstract class ElementoConNombre {

    private String nombre;//representa un string nombre

    /**
     * Método constructor de la clase
     *
     * @param nombre variable string con un nombre.
     */
    public ElementoConNombre(String nombre) {
        this.nombre = nombre;
    }

    public ElementoConNombre() {
    }

    /**
     * método getter de nombre
     *
     * @return un string nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * método setter de nombre
     *
     * @param nombre un string nombre que se asignará a la variable con el mismo
     * nombre.
     */
    public void setNombre(String nombre) throws NombreVacioException {
        if (nombre.isBlank()) {
            throw new NombreVacioException("No se puede poner un nombre vacío");
        }
        this.nombre = nombre;
    }

    /**
     * método para imprimir el objeto
     *
     * @return un string concatenado con el nombre.
     */
    @Override
    public String toString() {
        return "Nombre:" + nombre;
    }

}
