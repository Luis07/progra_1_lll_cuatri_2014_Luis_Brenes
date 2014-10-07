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
public class Ejercicio4 {
  //Declaracion de variables
    private int a,b,c,d;
//Metodo constructor
    public Ejercicio4(int p, int i, int u, int t) {
        this.a = p;
        this.b = i;
        this.c = u;
        this.d = t;
    }
    //Metodos para intercambiar  valores entre las variables del Metodo constructor
    public int cambio(){
      int h=this.b;
        int cambio=h=this.c;
        return cambio;
    }
    public int cambio1(){
       int j=this.c;
        int cambio1=j=this.a;
        return cambio1;
    }
    public int cambio2(){
       int x=this.a;
        int cambio2=x=this.d;
        return cambio2;
    }
    public int cambio3(){
       int b=this.b;
        int cambio3=this.d=b;
        return cambio3;
    }
    
}
