package com.example;
/**
* Creacion clase CuentaBancaria
* @author Eric Roca
*/
public class CuentaBancaria {

    /**
     * Crear variable privada numeroCuenta
     * En numeroCuenta solo se admiten valores tipo string
     */
    private String numeroCuenta;

    /**
     * Crear variable privada saldo
     * En saldo solo se admiten valores tipo double
     */
    private double saldo;

    /**
     * Constructor de la clase CuentaBancaria
     * @param numeroCuenta valor de numeroCuenta
     * Saldo valor por defecto 0
     */
    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    /**
     * Metodo para modificar (añadir en este caso) valor a saldo
     * @param cantidad Valor de saldo
     */
    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    /**
     * Metodo para modificar (restar en este caso) valor a saldo
     * @param cantidad Valor de saldo a restar
     * @return true si el valor es menor o igual al saldo
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * Metodo devuelve valor de saldo
     * @return valor de saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo devuelve valor de numeroCuenta
     * @return valor de numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Metodo establece valor de numeroCuenta
     * @param numeroCuenta valor numeroCuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
