/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int opcion=0;   
    Scanner oScanner= new Scanner(System.in);
do{
    System.out.println("digite la opcion que desea:");
    System.out.println("1: Ejercicio 1");
    System.out.println("2: Ejercicio 2");
    opcion=oScanner.nextInt();
    switch(opcion){
    case 1:
        System.out.println("Digite el correo a evaluar");
        oScanner=new Scanner(System.in);
        Ejercicio1 oEjercicio1= new Ejercicio1(oScanner.nextLine());
        System.out.println(oEjercicio1.ValidarCorreo());
        break;
    case 2:
        System.err.println("Digite la cadena aevaluar ");
        Ejercicio2 oEjercicio2=new Ejercicio2();
        oScanner=new Scanner(System.in);
        oEjercicio2.setCadena(oScanner.nextLine());
        System.out.println(oEjercicio2.MediaCadena());
        System.out.println(oEjercicio2.UltimoValor());
        System.out.println(oEjercicio2.Alrevez());
        System.out.println(oEjercicio2.Guion());
        System.out.println(oEjercicio2.Vocales());
        System.out.println(oEjercicio2.Palindromo());
        break;
    }
}while(opcion<=7);
    }
}