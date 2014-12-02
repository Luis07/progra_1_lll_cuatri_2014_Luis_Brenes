/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealistas;

/**
 *
 * @author Luis B
 */
public class NodoNumero3 {
     int numero=0;
    NodoNumero3 siguiente;
    public NodoNumero3() {
    numero=0;
    siguiente=null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public    NodoNumero3 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(   NodoNumero3 siguiente) {
        this.siguiente = siguiente;
    }
}
