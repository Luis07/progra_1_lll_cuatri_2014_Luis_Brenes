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
public class NodoNumeros2 {
     private int Random;
     NodoNumeros2 siguiente;

    public NodoNumeros2() {
        this.Random = 0;
        this.siguiente = null;
    }

    public int getRandom() {
        return Random;
    }

    public void setRandom(int Random) {
        this.Random = Random;
    }

    public NodoNumeros2 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoNumeros2 siguiente) {
        this.siguiente = siguiente;
    }
    
}
