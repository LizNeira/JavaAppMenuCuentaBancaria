
package javaappcuentabancariatt;

import javax.swing.JOptionPane;


public class EntradaSalida {
    
   public static float leerFloat(String mensaje){
        String valStr=JOptionPane.showInputDialog(null, mensaje);
        return Float.parseFloat(valStr);
    }
    
    public static int leerEntero(String mensaje){
        String valStr=JOptionPane.showInputDialog(null, mensaje);
        return Integer.parseInt(valStr);
    }
    
    public static void mostrarCadena(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}

