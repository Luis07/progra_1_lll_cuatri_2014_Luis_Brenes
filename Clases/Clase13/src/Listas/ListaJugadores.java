/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoJugadores;

/**
 *
 * @author Luis B
 */
public class ListaJugadores {
 Nodos.NodoJugadores raiz;
 
 public void Insertar (NodoJugadores jugador){
 NodoJugadores nuevo= new NodoJugadores();
 nuevo.setNombre(jugador.getNombre());
 nuevo.setEdad(jugador.getEdad());
 nuevo.setSiguiente(null);
 if(raiz==null)
 {
 raiz=nuevo;
 }else{
     NodoJugadores aux;
 aux=raiz;
 while(aux.getSiguiente()!=null)
 {
 aux=aux.getSiguiente();
 }
 aux.setSiguiente(nuevo);
 }
 }
 
 public boolean Eliminar(String nombre){
 NodoJugadores siguienteJugadores=raiz;
 NodoJugadores anterior=siguienteJugadores;
 if(raiz==null){
 System.out.println("La lista esta vacia");
 return true;
 }
 while(siguienteJugadores!=null){
 if(siguienteJugadores.getNombre().equals(nombre))
 {
 if(raiz==siguienteJugadores){
 
 raiz=siguienteJugadores.getSiguiente();
 }
 anterior.setSiguiente(siguienteJugadores.getSiguiente());
 return false;
 }
 anterior=siguienteJugadores;
 siguienteJugadores=siguienteJugadores.getSiguiente();
 }
 return true;
 }
 
 public String Imprimir (){
 NodoJugadores aux;
 aux=raiz;
 String temporal="";
 while(aux!=null){
 temporal+="Nombre,"+ aux.getNombre()+"Edad,"+ aux.getEdad();
 temporal+="\n";
 aux=aux.getSiguiente();
 }
 return temporal;
 }
}
