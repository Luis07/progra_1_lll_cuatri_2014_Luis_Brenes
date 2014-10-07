/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;
import javax.swing.JOptionPane;
import sun.font.EAttribute;

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
    //Ejercicio1
        Scanner teclado= new Scanner(System.in);
       
       
        //Declaracion de variables
        int N=0;
        double A=0;
        char C=' ' ;
        //Solicitud de datos
        System.out.println("Digite el valor de N");
        N=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de A");
        A=Double.parseDouble(teclado.nextLine());
        System.out.println("Digite e valor de C");
        C=teclado.nextLine().charAt(0);
       //Intancia de la clase
        Ejercicio1 oEjercicio1= new Ejercicio1(N, A, C);
       //Impresion de datos 
       System.out.println("A:"+A+"  N:"+N+" C:"+oEjercicio1.palabra());
       System.out.println("La suma de N+A es de:"+oEjercicio1.suma());
        System.out.println("La diferencia de A-N es de:"+oEjercicio1.resta());  
   //Ejercicio2
        //declaracion de variables
        int x=0,y=0;
        double n=0,m=0;
        //solicitud de datos
         System.out.println("Digite el valor de X");
        x=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de Y");
        y=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de N");
        n=Double.parseDouble(teclado.nextLine());
       System.out.println("Digite el valor de M");
        m=Double.parseDouble(teclado.nextLine());
        //Instancia de la clase
        Ejercicio2 oEjercicio2= new Ejercicio2(n, m, x, y);
       //Impresion de datos
        System.out.println("La suma de X+Y es de:"+oEjercicio2.suma());
        System.out.println("La resta de X-Y es de:"+oEjercicio2.resta());
        System.out.println("El producto de X*Y es de:"+oEjercicio2.mul());
        System.out.println("La division entre  X y Y es de:"+oEjercicio2.div());
        System.out.println("La suma de N+M es de:"+oEjercicio2.sum());
        System.out.println("La resta de N-M es de:"+oEjercicio2.rest());
        System.out.println("El producto de N*M es de:"+oEjercicio2.mult());
        System.out.println("La division entre  N y M es de:"+oEjercicio2.divi());
   //Ejercicio3
        //declaracion de variables
        int s=0;
        //solicitud de datos
        System.out.println("Digite el valor de S");
        s=Integer.parseInt(teclado.nextLine());
        //Instancia de la clase
        Ejercicio3 oEjercicio3= new Ejercicio3(s);
        //Impresion de datos
        System.out.println(oEjercicio3.incremento());
    //Ejercicio4
        //declaracion de variables
        int p,i,u,t;
        //solicitud de datos
        System.out.println("Digite el valor de A");
        p=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de B");
        i=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de C");
        u=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de D");
        t=Integer.parseInt(teclado.nextLine());
       //Instancia de la clase
        Ejercicio4 oEjercicio4= new Ejercicio4(p, i, u, t);
        //Impresion de datos
        System.out.println("Los valores son:"+"A="+p+" "+" B="+ i+"C="+ u+"D="+ t);
        System.out.println("Los nuevos valores son:"+"A:"+oEjercicio4.cambio2()+" "+"B:"+oEjercicio4.cambio()+" "+"C:"+oEjercicio4.cambio1()+" "+"D:"+oEjercicio4.cambio3());
        
        //Ejerccio5
        //declaracion de variables
        int l;
        //Solicitud de datos
        System.out.println("Digite un valor");
        l=Integer.parseInt(teclado.nextLine());
        //Instancia del ejercicio
        Ejercicio5 oEjercicio5=new Ejercicio5(l);
       //impresion de los datos
        System.out.println("El numero digitado es:"+" "+oEjercicio5.parimpar());
        //Ejercicio6
        //declaracion de variables
        int B;
        //solicitud de datos
        System.out.println("Digite un valor para B");
        B=Integer.parseInt(teclado.nextLine());
       //instancia del ejercicio 
        Ejercicio6 oEjercicio6= new Ejercicio6(B);
        //impresion de los datos
        System.out.println("El numero digitado en B es:"+" "+oEjercicio6.valor());
    //Ejercicio7
        //declaracion de variables
        int z;
        //solicitud de datos
        System.out.println("Digite un valor para C");
        z=Integer.parseInt(teclado.nextLine());
       //Instancia del ejercicio
        Ejercicio7 oEjercicio7=new Ejercicio7(z);
        //Impresion de datos
        System.out.println("El valor es:"+oEjercicio7.valor()+" "+"El valor es un numero:"+oEjercicio7.parimpar()+
                " "+"El valor "+oEjercicio7.multiplo()+" "+"El numero es:"+oEjercicio7.mayormenor());
    }
    
    
}
