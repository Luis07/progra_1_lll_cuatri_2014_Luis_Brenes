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
    public String Repeticiondelnombre(String nombre){
        int i=1;
        String Nombre="";
        while(i<=100){
            Nombre+=i+":"+nombre+"\n"+"\n";
            i++;
        }
        return Nombre;
    }
}
