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
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic h
        NododeLista nododeLista1= new NododeLista();
        nododeLista1.setMatricula("01");
        nododeLista1.setDueño("beto");
        nododeLista1.setMarca("Toyota");
        NododeLista nododeLista2= new NododeLista();
        nododeLista1.setMatricula("02");
        nododeLista1.setDueño("Marito");
        nododeLista2.setMarca("Vaca");
        
        Lista oLista= new Lista();
        oLista.Insertar(nododeLista1);
        oLista.Insertar(nododeLista2);
        oLista.Imprimir();
    }
    
}
