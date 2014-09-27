/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author Luis B
 */
public class Ejercicio1 {
    //Escribir un programa que solicite un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno a uno
private String numeros="";
    //Metodo Constructor
    public Ejercicio1(int numero){
    this.ImprimirNumeros(numero);
}
private String ImprimirNumeros(int numero){
    
    for (int i = 0; i < numero; i++) {
        numeros+=getNumeros()+i+"";
    }
        return getNumeros();
}
public String getNumeros(){
    return numeros;
}

    
}
