/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase13;

import Listas.ListaJugadores;
import Nodos.NodoJugadores;
import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Clase13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
Scanner oScanner=new Scanner(System.in);
 Listas.ListaJugadores listaJugadoresMounstro=new ListaJugadores();
 
        NodoJugadores nodosJugadores1=new NodoJugadores();
 nodosJugadores1.setNombre("Mynor Esco");
 nodosJugadores1.setEdad(21);
 listaJugadoresMounstro.Insertar(nodosJugadores1);
 
 NodoJugadores nodosJugadores2=new NodoJugadores();
 nodosJugadores2.setNombre("Ariel Rodriguez");
 nodosJugadores2.setEdad(27);
 listaJugadoresMounstro.Insertar(nodosJugadores2);
 
 NodoJugadores nodosJugadores3=new NodoJugadores();
 nodosJugadores3.setNombre("Keilor Soto");
 nodosJugadores3.setEdad(28);
 listaJugadoresMounstro.Insertar(nodosJugadores3);
 
 
 
 System.out.println(listaJugadoresMounstro.Imprimir());
 
 listaJugadoresMounstro.Eliminar("Keilor Soto");
 }
    }
    

