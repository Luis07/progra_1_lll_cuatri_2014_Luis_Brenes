/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Ejercicio1 {
private int[][]matriz;
    public void CrearMatriz(int fila,int columnas){
     matriz=new int[fila][columnas];
 }   
    public void Cargamatriz(){
       Scanner teclado= new Scanner(System.in);
            for (int j = 0; j < matriz.length; j++) {
        for (int i = 0; i <matriz.length; i++) {     
        matriz[i][j]=teclado.nextInt();    
        }
        }
    }
    public String mprimir(){
        String impresion="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                impresion+=matriz[i][j]+" ";
            }
            impresion+="\n";
            
        }
        return impresion;
    }
   
    

}
