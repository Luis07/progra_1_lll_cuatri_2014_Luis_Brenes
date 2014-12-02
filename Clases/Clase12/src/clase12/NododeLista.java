/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

/**
 *
 * @author Luis B
 */
public class NododeLista {
    private String Matricula;
    private String dueño;
    private String marca;
    private String borrar;
    private NododeLista siguiente;
    
    public NododeLista(){
        Matricula="";
        dueño="";
        marca="";
        borrar=null;
        siguiente=null;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public NododeLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NododeLista siguiente) {
        this.siguiente = siguiente;
    }

    public String getBorrar() {
        return borrar;
    }

    public void setBorrar(String borrar) {
        this.borrar = borrar;
    }
    
}
