/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;

import Listas.Cola;
import Listas.Pila;
import Nodos.NodoCola;
import Nodos.NodoPila;

/**
 *
 * @author Luis B
 */
public class TDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila oPila= new Pila();
        NodoPila Cuenta1=new NodoPila();
        Cuenta1.setCliente("Mario Mortadela");
        Cuenta1.setCuenta("2-066696-2252-5524");
        oPila.Push(Cuenta1);
        NodoPila Cuenta2=new NodoPila();
        Cuenta2.setCliente("Chepe Figuerez");
        Cuenta2.setCuenta("2-666666-555-5524");
        oPila.Push(Cuenta2);
        NodoPila Cuenta3=new NodoPila();
        Cuenta3.setCliente("Guillermo Solis");
        Cuenta3.setCuenta("2-77777-2252-888888");
        oPila.Push(Cuenta3);
        NodoPila Cuenta4=new NodoPila();
        Cuenta4.setCliente("Carlos Alvarez");
        Cuenta4.setCuenta("2-747444-2252-5524");
        oPila.Push(Cuenta4);
        System.out.println(oPila.Imprimir());
        oPila.Pop();
        System.out.println(oPila.Imprimir());
        oPila.Pop();
        System.out.println(oPila.Imprimir());
        oPila.Pop(); 
         System.out.println(oPila.Imprimir());
        oPila.Pop();
         System.out.println(oPila.Imprimir());
         
         Cola oCola= new Cola();
        NodoCola tiquete1=new NodoCola();
        tiquete1.setCliente("Mario Mortadela");
        tiquete1.setTiquete("2-066696-2252-5524");
        oCola.Encolar(tiquete1);
        NodoCola tiquete2=new NodoCola();
        tiquete2.setCliente("Chepe Figuerez");
        tiquete2.setTiquete("2-666666-555-5524");
        oCola.Encolar(tiquete2);
        NodoCola tiquete3=new NodoCola();
        tiquete3.setCliente("Guillermo Solis");
        tiquete3.setTiquete("2-77777-2252-888888");
        oCola.Encolar(tiquete3);
        NodoCola tiquete4=new NodoCola();
        tiquete4.setCliente("Carlos Alvarez");
        tiquete4.setTiquete("2-747444-2252-5524");
        oCola.Encolar(tiquete4);
        System.out.println(oCola.Impresion());
        oCola.Encolar(tiquete1);
        System.out.println(oCola.Impresion());
        oCola.Encolar(tiquete2);
        System.out.println(oCola.Impresion());
        oCola.Encolar(tiquete3); 
         System.out.println(oCola.Impresion());
        oCola.Encolar(tiquete4);
          System.out.println(oCola.Impresion());
          
         
    }
}
