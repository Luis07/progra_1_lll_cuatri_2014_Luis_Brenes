/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis B
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      boolean validar=true;
      int numero=0,opcion=0,mes = 0,año,Mes,Dia = 0,Año,dia=0;
      char continuar;
      String letra="",diaS="";
        Scanner teclado=new Scanner(System.in);
        Ejercicio1 oEjercicio1= new Ejercicio1();
        do{
            System.out.println("Digite una opcion del menú");
            System.out.println("1: Calendario");
            System.out.println("2: Ingresar numero entero");
            System.out.println("3: Ingresar una letra");
            System.out.println("4: Dias del año");
            System.out.println("5: Mostrar Numero Romano");
            System.out.println("6: Mostar fecha al dia anterior");
            System.out.println("7: Digite un dia");
            System.out.println("8. Digite un dia");
            opcion= Integer.parseInt(teclado.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("digite un numero del 1 al 12");
                    teclado= new Scanner(System.in);
                   numero=Integer.parseInt(teclado.nextLine());
                    System.out.println("El mes es:"+" "+oEjercicio1.mes(numero));
                    break;
                case 2:
                    System.out.println("Digite un Numero entero");
                    teclado= new Scanner(System.in);
                    numero= Integer.parseInt(teclado.nextLine());
                    Ejercicio2 oEjercicio2= new Ejercicio2();
                    System.out.println(oEjercicio2.numero(numero));
                    break;
                case 3:
                    System.out.println("Ingrese una letra entre la a y la E");
                    teclado= new Scanner(System.in);
                    letra=teclado.nextLine();
                    Ejercicio3 oEjercicio3= new Ejercicio3();
                    System.out.println(oEjercicio3.letra(letra));
                    break;
                case 4:
                    System.out.println("digitar el año ");
                    teclado=new Scanner(System.in);
                    año=Integer.parseInt(teclado.nextLine());
                    System.out.println("dgitar el mes");
                    teclado= new Scanner(System.in);
                    mes=Integer.parseInt(teclado.nextLine());
                    Ejercicio4 oEjercicio4= new Ejercicio4();
                    System.out.println(oEjercicio4.año(mes, año));
                    break;
                case 5:
                    Ejercicio5 oEjercicio5= new Ejercicio5();
        System.out.println("El numero random es:"+oEjercicio5.numerorandom()+
                "El numero romano es:"+oEjercicio5.NumeroRomano());
                    break;
                case 6:
                    System.out.println("Digite la fecha del dia");
                    teclado= new Scanner(System.in);
                    Dia=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el mes");
                    teclado= new Scanner(System.in);
                    Mes=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digte un año");
                    teclado= new Scanner(System.in);
                    Año= Integer.parseInt(teclado.nextLine());
                    Ejercicio6 oEjercicio6= new Ejercicio6(Dia, Mes, Año);
                    System.out.println("El dia anterior a la fecha digitada es:"+" "+oEjercicio6.Dia()+" "
                            +oEjercicio6.Mes()+" "+oEjercicio6.Año());
                    break;
                case 7:
                    Ejercicio7 oEjercicio7= new Ejercicio7();
                    System.out.println("Digite el dia de una fecha");
                    teclado= new Scanner(System.in);
                    dia=Integer.parseInt(teclado.nextLine());
                    System.out.println("El Dia de la fecha digitada es:"+" "+oEjercicio7.dia(dia));
                    break; 
                case 8:
                    Ejercicio8 oEjercicio8=new Ejercicio8();
                    System.out.println("Digite que dia de la semana (Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo)"+" "+"fue el dia 1" );
                    teclado=new Scanner(System.in);
                    diaS = teclado.nextLine();
                    System.out.println("Digite que dia es hoy");
                    teclado= new Scanner(System.in);
                    int d=Integer.parseInt(teclado.nextLine());
                    System.out.println(oEjercicio8.gdia1(diaS, d));
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
