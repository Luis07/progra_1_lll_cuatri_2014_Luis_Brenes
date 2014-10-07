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
public class Ejercicio7 {
  //variables
    private int C;
//Metodo constructor
    public Ejercicio7(int C) {
        this.C = C;
    }
   //metodopara saber si es positivo o negativo
   public String valor(){
     String p= "Positivo";
     String n= "Negativo";
     if(C>=0)return p;return n;
 }
   //Metodo par o impar
   public String parimpar(){
         String P= "Par";
         String i= "Impar";
    if(C%2==0)return P;return i;
   }
   //Metodo para saber si es mayor o menor que 100
   public String mayormenor(){
        String M= "Mayor que 100";
        String m= "Menor que 100";
    if(C>100)return M;return m;
   }
   //Metodo para saber si es multiplo de 5 o de 10
   public String multiplo(){
       String M=" Es Multiplo de 5";
       String m= "Es Multiplo de 10";
       String n="No es multiplo";
       if(C==10){
           return m;
       }
       if(C%5==0){
       return M;
   }else{
       }if(C%10==0){
               return m;
           }
       return n;
   }
}