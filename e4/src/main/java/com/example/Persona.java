package com.example;
/**
 * Creacion clase Persona
 * @author Eric Roca
 */
public class Persona {

    /**
     * Crear variable privada nombre
     * En numeroCuenta solo se admiten valores tipo string
     */
    private String nombre;

    /**
     * Crear variable privada edad
     * En edad solo se admiten valores tipo int
     */
    private int edad;


    /**
     * Constructor de la clase Persona
     * @param nombre valor de nombre
     * @param edad valor de edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo devuelve valor de nombre
     * @return valor de nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo establece valor de nombre
     * @param nombre valor nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo devuelve valor de edad
     * @return valor de edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo establece valor de edad
     * @param edad valor edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
