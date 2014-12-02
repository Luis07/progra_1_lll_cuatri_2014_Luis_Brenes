/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoCola;



/**
 *
 * @author Luis B
 */
public class Cola {
   private NodoCola raiz;
   private NodoCola ultimo;

    public Cola() {
        this.raiz = null;
    }
    public void Encolar(NodoCola tiquete){
        NodoCola nuevo;
        nuevo= new NodoCola();
        nuevo.setCliente(tiquete.getCliente());
        nuevo.setTiquete(tiquete.getTiquete());
        nuevo.setSiguiente(null);
        if(raiz==null){
            raiz=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
        }
    }
   public NodoCola Desencolar(){
       if(raiz!=null){
           NodoCola tiquete=raiz;
           if(raiz==ultimo){
               raiz=null;
               ultimo=null;
           }else{
               raiz=raiz.getSiguiente();
               return tiquete;
           }
       }
       return null;
   }
   public String Impresion(){
       String impresion="";
       NodoCola recorrido=raiz;
       while(recorrido!=null){
           impresion+="Cliente: "+recorrido.getCliente()+" Tiquete: "+recorrido.getTiquete();
       impresion+="\n";
       recorrido=recorrido.getSiguiente();
       }
       return impresion;
   }
}
