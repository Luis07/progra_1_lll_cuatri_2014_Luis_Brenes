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
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //*  Ejercicio1 oEjercicio1= new Ejercicio1();
   // oEjercicio1.CrearMatriz(2,5);
  //  oEjercicio1.Cargamatriz();
        //System.out.println(oEjercicio1.mprimir());
        
      //  Ejercicio2 oEjercicio2= new Ejercicio2();
        //System.out.println("Digite la cantidad de filas de la Matriz");
        //*teclado= new Scanner(System.in);
        //filas=teclado.nextInt();
        //System.out.println("Digite la cantidad de columnas de la matriz");
        //teclado= new Scanner(System.in);
        //columnas= teclado.nextInt();
        //oEjercicio2.CrearMatriz(filas,columnas);
        //+/oEjercicio2.Cargamatriz();
        //System.out.println(oEjercicio2.mprimir());
        //*System.out.println(oEjercicio2.cambio());
   
        //Ejercicio 3
         int filas=0;
        int columnas=0;
        Scanner teclado= new Scanner(System.in);
        Ejercicio3 oEjercicio3= new Ejercicio3();
        System.out.println("Digite la cantidad de filas de la Matriz");
        teclado= new Scanner(System.in);
        filas=teclado.nextInt();
        System.out.println("Digite la cantidad de columnas de la matriz");
        teclado= new Scanner(System.in);
        columnas= teclado.nextInt();
        oEjercicio3.CrearMatriz(filas, columnas);
        oEjercicio3.cargamatriz();
        System.out.println(oEjercicio3.mostrarmatriz());
        System.out.println(oEjercicio3.impresion(columnas,filas));

        //Ejercicio4
        
    }
    
}
