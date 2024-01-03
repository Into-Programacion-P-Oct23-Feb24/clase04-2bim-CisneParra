/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int[][] primerValor = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] segundoValor = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        obtenerMultiplicacion(primerValor, segundoValor);

    }

    public static void[][] obtenerMultiplicacion(int[][] a, int[][] b) {
        int operacion;
        int[][] m = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            String acum = "";
            for (int j = 0; j < a[i].length; i++) {
                if (i == j) {
                    operacion = a[i][j] * b[i][j];
                    m[i][j] = operacion;
                    acum = String.format("%s%d ", acum, m[i][j]);
                }
                acum = String.format("%s\n",acum);
            }
            System.out.printf("%s\n",acum);
        }
        

        return m;

    }

}
