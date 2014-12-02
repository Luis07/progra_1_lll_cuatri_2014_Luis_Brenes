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
public class NodoJugadores {
 private String nombre;
 private int edad;
NodoJugadores siguiente;
    public NodoJugadores(String Nombre, String edad) {
        this.nombre = "";
        this.edad = 0;
        this.siguiente=null;
    }

    public NodoJugadores getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoJugadores siguiente) {
        this.siguiente = siguiente;
    }

    public NodoJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

}
