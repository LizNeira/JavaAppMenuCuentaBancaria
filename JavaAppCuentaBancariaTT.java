/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappcuentabancariatt;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class JavaAppCuentaBancariaTT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner entrada = new Scanner(System.in);

//        float monto = EntradaSalida.leerFloat("Ingrese monto a extraer");
//        if (!cuenta.extraer(monto)) {
//       
//            EntradaSalida.mostrarCadena("Saldo insuficiente");
//            
//        } else 
//        {
//            
//            EntradaSalida.mostrarCadena("Saldo despues de la extraccion: \n" + cuenta.extraer(monto));
//            
//        }
EntradaSalida.mostrarCadena("Tu saldo actual es : \n" + cuenta.obtenerSaldo());
       float monto = EntradaSalida.leerFloat("Ingrese monto a depositar");
       if (!cuenta.depositar(monto)) {
       
            EntradaSalida.mostrarCadena("limite");
            
        } else 
        {
            
    EntradaSalida.mostrarCadena("Saldo despues del deposito: \n" + cuenta.depositar(monto));
            
        }
  
       
    }    
    
}
