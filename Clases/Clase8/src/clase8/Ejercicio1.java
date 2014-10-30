/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.Random;

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
        Random random= new Random();
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=random.nextInt((5-3)+1)+3;
            
            }
        }
    }
    public String mprimir(){
        String impresion="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
                impresion+="  "+matriz[i][j];
            }
            impresion+="\n";
        }
        return impresion;
    }
    
    
    
    
    
}
