/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Luis B
 */
public class Ejercicio6 {
 //variables
    private int N;
//Metodo constructor
    public Ejercicio6(int B) {
        this.N = B;
    }
    //Metodo para saber si es positivo o negativo
 public String valor(){
     String p= "Positivo";
     String n= "Negativo";
     if(N>=0)return p;return n;
 }
}
