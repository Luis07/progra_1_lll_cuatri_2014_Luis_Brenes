/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String p1="",p2="",p3="",p4="",p5="";
        Scanner oScanner= new Scanner(System.in);
        Ejercicio1 oEjercicio1= new Ejercicio1();
        System.out.println("Digite una palabra");
        p1=oScanner.nextLine();
        System.out.println("Digite una palabra");
        p2=oScanner.nextLine();
        System.out.println("Digite una palabra");
        p3=oScanner.nextLine();
        System.out.println("Digite una palabra");
        p4=oScanner.nextLine();
        System.out.println("Digite una palabra");
        p5=oScanner.nextLine();
        System.out.println(oEjercicio1.ordenar(p1, p2, p3, p4, p5));

    }
    
}
