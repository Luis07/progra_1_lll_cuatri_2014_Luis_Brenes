/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealistas;

import java.util.Random;
import java.util.Scanner;
import sun.org.mozilla.javascript.internal.ast.ForInLoop;

/**
 *
 * @author Luis B
 */
public class TareaListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner oScanner= new Scanner(System.in);
         NodoNumeros oNodoNumeros= new NodoNumeros();
        ListaEjercicio1NodoNumeros oListaEjercicio1NodoNumeros= new ListaEjercicio1NodoNumeros();
        NodoNumeros nodonumero;
        for (int i = 0; i < 10; i++) {
            nodonumero= new     NodoNumeros();
            System.out.println("Digite un numero ");
            nodonumero.setNumero(oScanner.nextInt());
            oListaEjercicio1NodoNumeros.Insertar(nodonumero);
            
        }
        System.out.println(oListaEjercicio1NodoNumeros.Listapares());
     NodoNumero3 oNodoNumero3=new NodoNumero3();
     ListaEjercicioNodoNumeros3 oListaEjercicioNodoNumeros2= new ListaEjercicioNodoNumeros3();
     NodoNumero3 nodoNumero3;
     for (int i = 0; i < 10; i++) {
            nodoNumero3= new NodoNumero3();
            System.out.println("Digite un numero ");
            nodoNumero3.setNumero(oScanner.nextInt());
            oListaEjercicioNodoNumeros2.Insertar(nodoNumero3);
        }
        System.out.println(oListaEjercicioNodoNumeros2.Impresion());
    NodoNumeros2 oNodoNumeros2= new NodoNumeros2();
    ListaEjercicioNodoNumeros2 listaEjercicioNodoNumeros2=new ListaEjercicioNodoNumeros2();
  int B=0;
  for (int j = 0; j < 10; j++){
 Random aleatorio = new Random();
 NodoNumeros2 oNodoNumeros21 = new NodoNumeros2();
 B = 1 + aleatorio.nextInt(10);
 oNodoNumeros2.setRandom(B);
 listaEjercicioNodoNumeros2.Insertar(oNodoNumeros2);
 }
 System.out.println(listaEjercicioNodoNumeros2.impresion());

        
    } 
}   
    
    

