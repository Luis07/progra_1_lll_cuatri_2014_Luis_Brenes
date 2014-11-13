/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oScanner= new Scanner(System.in);
    Ejercicio1 oEjercicio1= new Ejercicio1();
     // System.out.println(oEjercicio1.Alrevez(oScanner.nextLine()));
        
        Ejercicio2 oEjercicio2= new Ejercicio2();
        oScanner=new Scanner(System.in);
       // System.out.println(oEjercicio2.impresion(oScanner.nextLine()));
    Ejercicio3 oEjercicio3= new Ejercicio3();
    oScanner= new Scanner(System.in);
        //System.out.println(oEjercicio3.Eliminarespacios(oScanner.nextLine()));
    Ejercicio4 oEjercicio4= new Ejercicio4();
    oScanner= new Scanner(System.in);
        //System.out.println(oEjercicio4.Numeros(oScanner.nextLine()));
   
         Ejercicio5 oEjercicio5= new Ejercicio5();
    oScanner= new Scanner(System.in);
        //System.out.println(oEjercicio5.Repeticiondelnombre(oScanner.nextLine()));
   
             Ejercicio6 oEjercicio6= new Ejercicio6();
    oScanner= new Scanner(System.in);
        System.out.println(oEjercicio6.inversa(oScanner.nextLine()));
   
    }
    
}
