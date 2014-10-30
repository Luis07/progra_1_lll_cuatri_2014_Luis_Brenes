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
public class Ejercicio2 {
    private int[][]matriz;
     public void CrearMatriz(int filas,int columnas){
     matriz=new int[filas][columnas];
 }   
    public void Cargamatriz(){
       Scanner teclado= new Scanner(System.in);
            for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j <matriz[0].length; j++) {     
        matriz[i][j]=teclado.nextInt();    
        }
        }
    }
   public String mprimir(){
        String impresion="",impresion2="",impresion3="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
               
                impresion+=matriz[i][j]+" ";
            }
            impresion+="\n";
        }
       
        return impresion;
    }
   public String cambio(){
        String impresion="",impresion2="",impresion3="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
                if(i==0){
                    impresion3+=matriz[i][j]+" ";
                }
                if(i==1){
                    impresion2+=matriz[i][j]+" ";
                }
            }
            
        }
        impresion=impresion2;
        impresion2=impresion3;
        
        return impresion+"\n"+impresion3;
    }
   }
    
