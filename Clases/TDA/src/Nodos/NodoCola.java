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
public class NodoCola {
  private String tiquete; 
  private String cliente;
  private NodoCola siguiente;


    public String getTiquete() {
        return tiquete;
    }

    public void setTiquete(String tiquete) {
        this.tiquete = tiquete;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
  

}
