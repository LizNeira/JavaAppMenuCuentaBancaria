/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappcuentabancariatt;

/**
 *
 * @author alumno
 */
public class CuentaBancaria {

    public static int cant;
    private float saldo;
    private float minimo;
    private float limite;

    // Constructor
    public CuentaBancaria(float monto) {
        saldo = monto;
        minimo = -3000;
        limite = 50000;
        cant++;
    }

    public CuentaBancaria() {
        this(1000);
    }

    // Metodos
    public boolean extraer(float monto) {
        if (saldo - monto >= minimo) {
            saldo = saldo - monto;
            return true;
        } else {
            return false;
        }
    }

    public boolean extraer() {
        return extraer(1000);

    }

    public boolean depositar(float monto) {
        if (monto < limite) {
            saldo = saldo + monto;
            return true;
        } else {

        }
        return false;
    }

    public void depositar() {
        depositar(1000);
    }

    public float obtenerSaldo() {
        return saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getMinimo() {
        return minimo;
    }

    @Override
    public String toString() {
        return "saldo=" + saldo + ", minimo=" + minimo;
    }

}
