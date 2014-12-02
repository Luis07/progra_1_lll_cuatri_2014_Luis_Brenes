/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatriz;

import java.util.Random;

/**
 *
 * @author Luis B
 */
public class Ejercicio1 {
    int[][] matrixA=new int[0][0];
    public void iniciarMatriz(int filas,int columnas){
        matrixA=new int[filas][columnas];
    }
    public void LLenar(){
        Random oRandom=new Random();
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixA[i][j]=(int)(oRandom.nextInt(6)+10);
            }
        }
    }
    public String impresionPorFila(){
        String temporal="";
        for (int i = 0; i <matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                temporal+=String.valueOf(matrixA[i][j])+"-";
            }
            temporal+="\n";
        }
        return temporal;
    }
    public String impresionTriangularSuperior(){
        String temporal="";
        for (int i = 1; i <matrixA.length; i++) {
            for (int j = 1; j <i; j++) {
                temporal+=String.valueOf(matrixA[i][j])+"-";
            }
            temporal+="\n";
        }
        return temporal;
    }
      public String impresionTriangularInferior(){
        String temporal="";
        for (int i =matrixA.length-2;i>=0; i--) {
            for (int j =matrixA[0].length-1; j >i; j--) {
                temporal+=String.valueOf(matrixA[i][j])+"-";
            }
            temporal+="\n";
        }
        return temporal;
    }
}
