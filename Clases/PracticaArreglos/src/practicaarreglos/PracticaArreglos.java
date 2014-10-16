/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarreglos;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class PracticaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opcion=0;
        Scanner teclado = new Scanner(System.in);
         do{
     System.out.println("Digite la opcion del ejercicio a evaluar");
     System.out.println("1: Ejercicio 1");
     System.out.println("2: Ejercicio 2");
     System.out.println("3: Ejercicio 3");
     System.out.println("4: Ejercicio 4");
             System.out.println("5: Salir");
     opcion= teclado.nextInt();
     switch(opcion){
         case 1:
             Ejercicio1 oEjercicio1= new Ejercicio1();
            Strng oStrng= new Strng();
             System.out.println(oStrng.c());
             for(int i=0;i<8;i++){
                 teclado= new Scanner(System.in);
                 System.out.println("Digite un valor en la posicion "+(i+1));
                 oEjercicio1.agregarvalores(teclado.nextDouble());
             }
             System.out.println("El acumulado es de: "+oEjercicio1.AcumulacionVector());
             System.out.println("El acumulado de elmentos mayores a 36 es: "+oEjercicio1.AcumuladodeElementos());
             System.out.println("La cantidad de numeros mayores a 50 es de: "+oEjercicio1.CantidadMayor());
             break;
         case 2:
             Ejercicio2 oEjercicio2= new Ejercicio2();
             for (int i = 0; i < 4; i++) {
                 teclado= new Scanner(System.in);
                 System.out.println("Digite un numero entero en la posición "+(i+1));
                 oEjercicio2.Vector1(teclado.nextInt());
             }
             for (int i = 0; i < 4; i++) {
                 teclado= new Scanner(System.in);
                 System.out.println("Digite un numer entero en la posición "+(i+1));
                 oEjercicio2.Vector2(teclado.nextInt());
             }
             System.out.println("La suma de los numeros del vector 3 es"+oEjercicio2.VectorFinal());
             break;
         case 3:
             Ejercicio3 oEjercicio3= new Ejercicio3();
             for (int i = 0; i <5; i++) {
                 teclado= new Scanner(System.in);
                 System.out.println("Digite la nota del alumno # "+(i+1)+" del Curso A");
                 oEjercicio3.Promedio(teclado.nextInt());
             }
             for (int i = 0; i < 5; i++) {
                 teclado= new Scanner(System.in);
                 System.out.println("Digite la nota del alumno # "+(i+1)+" del Curso B");
                 oEjercicio3.Promedio2(teclado.nextInt());
             }
             System.out.println(oEjercicio3.Mayor());
             break;
         case 4:
             Ejercicio4 oEjercicio4= new Ejercicio4();
             for (int i = 0; i < 10; i++) {
                 teclado= new Scanner(System.in);
                 System.out.println("Digite un valor en la posicion "+(i+1));
             oEjercicio4.Vector(teclado.nextInt());
             }
             System.out.println(oEjercicio4.orden());
             break;
         case 5:
             break;
     }
    }while(opcion<5);
    }
}
