/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner teclado= new Scanner(System.in);
System.out.println("Digite el numero de impresiones que desea ver");        
Ejercicio1 oEjercicio1= new Ejercicio1(Integer.parseInt(teclado.nextLine()));
        System.out.println(oEjercicio1.getNumeros());
//Ciclo for
       
        int cantidad,suma=0;
teclado= new Scanner(System.in);
System.out.println("Digite el numero de impresiones que desea ver");
        
        cantidad= Integer.parseInt(teclado.nextLine());
        System.out.print("\n");
        for(int i=0;i<=cantidad;i++){
            System.out.println(i);
        }
        System.out.print("\n");
        System.out.println("Inverso");
        System.out.println("\n");
        for( int i=cantidad;i>=0;i--){
            System.out.println(i);
        }
        
        //Ciclo while
        while(suma<=cantidad){
            System.out.print(suma);
            System.out.print("-");
            suma=suma+1;
        }
        System.out.println("\n"+"Inverso");
        suma=cantidad;
        while(suma>=0){
            System.out.print(suma);
            System.out.print("-");
            suma=suma-1;
        }
        //Ciclo do while
        System.out.println("\n");
        suma=0;
        do{
            System.out.print(suma);
            System.out.print("_");
            suma=suma+1;
        }while(suma<=cantidad);
        System.out.println("\n");
        suma=cantidad;
       
        do{
            System.out.print(suma);
            System.out.print("_");
            suma=suma-1;
        }while(suma>=0);
    }
    
}
