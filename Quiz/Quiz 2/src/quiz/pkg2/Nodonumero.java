/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg2;

/**
 *
 * @author Luis B
 */
public class Nodonumero {
    int numero=0;
    Nodonumero siguiente;
    public Nodonumero() {
    numero=0;
    siguiente=null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodonumero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodonumero siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
