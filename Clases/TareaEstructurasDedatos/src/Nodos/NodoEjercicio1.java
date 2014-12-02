/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Luis B
 */
public class NodoEjercicio1 {
    private int[] num;
    private NodoEjercicio1 siguiente;

    public NodoEjercicio1() {
        this.num=null;
        this.siguiente = null;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public NodoEjercicio1 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEjercicio1 siguiente) {
        this.siguiente = siguiente;
    }
}
