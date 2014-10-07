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
public class Ejercicio5 {
   //Variables 
    int A;
//Metodo constructor
    public Ejercicio5(int A) {
        this.A = A;
    }
    //Metodo para saber si es par o impar
    public String parimpar(){
        String s="par";
        String p="Impar";
        if(A%2==0){
            return s;
        }else{
            return p;
        }
    }
}
