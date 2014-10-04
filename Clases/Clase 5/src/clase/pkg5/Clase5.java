/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
boolean validar=true;
int valor1=0,valor2=0,opcion=0;
double resultado=0;
char continuar;
    Scanner teclado= new Scanner(System.in);
    Operaciones oOperaciones= new Operaciones();
do{
            System.out.println("Digite la operacion a evaluar");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion");
            System.out.println("5. Raiz");
            System.out.println("6. Potencia");
            opcion=Integer.parseInt(teclado.nextLine());
switch(opcion){
    case 1:
        System.out.println("Digite el valor del primer digito");
        teclado= new Scanner(System.in);
        valor1=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor del segundo digito");
        teclado= new Scanner(System.in);
        valor2=Integer.parseInt(teclado.nextLine());
        resultado= oOperaciones.sumar(valor1, valor2);
        System.out.println("La suma es."+" "+resultado);
        break;
    case 2:
        System.out.println("Digite el valor del primer digito");
        teclado= new Scanner(System.in);
        valor1=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor del segundo numero");
       teclado= new Scanner(System.in);
        valor2=Integer.parseInt(teclado.nextLine());
        resultado= oOperaciones.resta(valor1, valor2);
        System.out.println(resultado);
        break;
        case 3:
        System.out.println("Digite el valor del primer digito");
        teclado= new Scanner(System.in);
        valor1=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor del segundo numero");
        teclado= new Scanner(System.in);
        valor2=Integer.parseInt(teclado.nextLine());
        resultado= oOperaciones.Division(valor1, valor2);
        System.out.println(resultado);
        break;
        case 4:
        System.out.println("Digite el valor del primer digito");
        teclado= new Scanner(System.in);
        valor1=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor del segundo numero");
        teclado= new Scanner(System.in);
        valor2=Integer.parseInt(teclado.nextLine());
        resultado= oOperaciones.Multiplicacion(resultado, resultado);
        System.out.println(resultado);
        break;
        case 5:
        System.out.println("Digite el valor del primer digito");
        teclado= new Scanner(System.in);
        valor1=Integer.parseInt(teclado.nextLine());
        resultado= oOperaciones.Raiz(valor1);
        System.out.println(resultado);
        break;
        case 6:
        System.out.println("Digite el valor del primer digito");
        teclado= new Scanner(System.in);
        valor1=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor del segundo numero");
        teclado= new Scanner(System.in);
        valor2=Integer.parseInt(teclado.nextLine());
        resultado= oOperaciones.Potencia(valor1, valor2);
        System.out.println(resultado);
        break;
            default:
                break;
}
                System.out.println("Desea continuar con otra operacion S/N");
                continuar=teclado.nextLine().charAt(0);
                if((continuar=='S')||(continuar=='s')){
                    validar=true;
                }else{
                    validar=false;
                
                }
}while(validar);
}
}
