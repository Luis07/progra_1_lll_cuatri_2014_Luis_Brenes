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
public class ejerccicio4 {
       private int[][]matriz;
    Scanner teclado= new Scanner(System.in);
   
      public void CrearMatriz(int fil,int columna){
     matriz=new int[fil][columna];
 }   
    public void cargamatriz(){
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
                matriz[i][j]=teclado.nextInt();    
            }
        }
    }
    public String Mayorelemnto()
    {
           return null;
        
    }
}
