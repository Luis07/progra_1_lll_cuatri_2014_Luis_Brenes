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
public class Ejercicio2 {
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
   
        public boolean impresionDiagonalSuperior(int filas,int columnas){
      boolean validar=false;
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < i; j++) {
                    if(matrixA[i][j]==0){
                        validar=true;
                    }else{
                        validar=false;
                        break;
                    }
                }
            }
            return validar;
    }
}
