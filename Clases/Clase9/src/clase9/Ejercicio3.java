/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Ejercicio3 {
    private int[][]matriz;
    Scanner teclado= new Scanner(System.in);
   
      public void CrearMatriz(int filas,int columnas){
     matriz=new int[filas][columnas];
 }   
    public void cargamatriz(){
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
                matriz[i][j]=teclado.nextInt();    
            }
        }
    } 
    public String impresion(int columnas,int filas){
        String acum="";
        int col=columnas;
        int fil=filas;
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
                if(i==0&&j==0){
                acum+=matriz[0][0]+" ";
                }
                if(i==0&&j==col-1){
                acum+=matriz[0][columnas-1]+" ";
                }if(i==fil-1&&j==0){
                acum+=matriz[fil-1][0]+" ";
                }if(i==fil-1&&col-1==j){
                acum+=matriz[fil-1][col-1]+" ";
                }
            }
            acum+="\n";
        }
        return acum;
    }
    public String mostrarmatriz(){
        String acum="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                acum+=matriz[i][j]+" ";
            }
            acum+="\n";
        }
        return acum;
   }
}
