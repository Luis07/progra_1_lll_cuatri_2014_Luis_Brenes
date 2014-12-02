/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalistas1;

/**
 *
 * @author Greivin
 */
public class NodoPalabras {
    
    
    String palabra;
    NodoPalabras nodopalabras;
    
    public NodoPalabras(){
        palabra="";
        nodopalabras=null;
        
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public NodoPalabras getNodopalabras() {
        return nodopalabras;
    }

    public void setNodopalabras(NodoPalabras nodopalabras) {
        this.nodopalabras = nodopalabras;
    }
}
