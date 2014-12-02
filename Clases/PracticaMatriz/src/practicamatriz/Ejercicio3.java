/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatriz;

/**
 *
 * @author Luis B
 */
public class Ejercicio3 {
     int[][] matrixA=new int[4][7];
         public String impresion(){
      String impresion="";
              int suma=0;
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                  suma=i+j;
                  matrixA[i][j]=suma;
                  impresion+=matrixA[i][j];
                  suma=0;
                }
                impresion+="\n";
            }
            return impresion;
    }
}
