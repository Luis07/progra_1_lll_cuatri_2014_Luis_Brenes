/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEjercicio1;

import Nodos.NodoEjercicio1;

/**
 *
 * @author Luis B
 */
public class ListaEjercicio1 {
   private NodoEjercicio1 raiz;
        public void Insertar(NodoEjercicio1 elemento){
        NodoEjercicio1 nuevo;
        nuevo= new NodoEjercicio1();
        nuevo.setNum(elemento.getNum());
        nuevo.setSiguiente(elemento.getSiguiente());
        if(raiz==null ){
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }else{
            NodoEjercicio1 auxiliar=raiz;
            while(auxiliar.getSiguiente()!=null){//para llegar al ultimo elemento del nodo
                auxiliar=auxiliar.getSiguiente();
           }
            auxiliar.setSiguiente(nuevo);
            }
        }
public NodoEjercicio1 NumNodos (){
 NodoEjercicio1 aux;
 aux=raiz;
 while(aux!=null)
     
 return aux.getSiguiente();
       return aux;
 } 
 }
        

