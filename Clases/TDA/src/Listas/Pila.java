/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoPila;

/**
 *
 * @author Luis B
 */
//el primer elemento es el ultimo en entrar en una Pila
public class Pila {
    private NodoPila raiz;

    public Pila() {
        this.raiz = null;
    }
    public void Push(NodoPila cuenta){
        NodoPila nuevo;
        nuevo= new NodoPila();
        nuevo.setCliente(cuenta.getCliente());
        nuevo.setCuenta(cuenta.getCuenta());
        if(raiz==null){
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }else{
            nuevo.setSiguiente(raiz);
            raiz=nuevo;
        }
    }
    public NodoPila Pop(){
        if(raiz!=null){
            NodoPila cuenta=raiz;
            raiz=raiz.getSiguiente();
            return cuenta;
        }else{
           return null;
        }
    }
    public String Imprimir(){
        String impresion="";
        NodoPila recorrido=raiz;
        while(recorrido!=null){
            impresion+="Cliente: "+recorrido.getCliente()+" Cuenta: "+recorrido.getCuenta();
            impresion+="\n";
            recorrido=recorrido.getSiguiente();
        }
        return impresion;
    }
    
}
