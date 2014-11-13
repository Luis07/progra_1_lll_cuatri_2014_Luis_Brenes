/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import sun.org.mozilla.javascript.internal.ast.ForInLoop;

/**
 *
 * @author Luis B
 */
public class Ejercicio2 {
    //cadena que muestra el primero ultimo segundo  penultimo tercero antepenultimo
public String impresion(String palabra){
    String temporal="";
   boolean finalizar=false;
   int contador=0; 
   while(!finalizar){
        if(contador==0){
            temporal+=palabra.charAt(contador);
            contador=palabra.length()-1;
        }else if(contador==palabra.length()-1){
            temporal+=palabra.charAt(contador);
        contador=1;
        }else if(contador==1){
            temporal+=palabra.charAt(contador);
            contador=palabra.length()-2;
        }else if(contador==palabra.length()-2){
            temporal+=palabra.charAt(contador);
            contador=2;
        }else if(contador==2){
            temporal+=palabra.charAt(contador);
            contador=palabra.length()-3;
        }else if(contador==palabra.length()-3){
            temporal+=palabra.charAt(contador);
            finalizar=true;
        }
   }
    return temporal;
}  
}
