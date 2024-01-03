/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // String miCiudad = obtenerCiudadMayuscula("Loja");
        // System.out.printf("%s\n", miCiudad);
        obtenerMultiplicacion(7, 50); // no retorna nada ya que este
                                // es un procedimiento no una funcion
        String miMensaje = obtenerMultiplicacionDos(7, 50);
        // por otro lado esta retorna informacion ya que es una funcion
        System.out.printf("%s\n", miMensaje);

    }

    public static String obtenerMultiplicacionDos(int tabla, int limite) {
        int t = tabla;
        int l = limite;
        int m;
        String ca = "";
        for (int c = 0; c <= l; c++) {
            m = t * c;
            ca = String.format("%s%d * %d = %d\n", ca,
                    t, c, m);
            
        }
        return ca;
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

    public static void obtenerMultiplicacion(int tabla, int limite) {
        int t = tabla;
        int l = limite;
        int m;
        String ca = "";
        for (int c = 0; c <= l; c++) {
            m = t * c;
            ca = String.format("%s%d * %d = %d\n", ca,
                    t, c, m);
        }
        System.out.printf("%s", ca);
        {

        }
    }

    public static String obtenerNombre() {
        return "Luis";
    }

}
