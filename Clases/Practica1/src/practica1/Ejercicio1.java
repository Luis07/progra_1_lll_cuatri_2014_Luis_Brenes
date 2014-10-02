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
public class Ejercicio1 {
   //Variables
    private int n;
    private double a;
    private char c;
    //Metodo constructor

    public Ejercicio1(int N, double A, char C) {
        this.n = N;
        this.a = A;
        this.c = C;
    }//Metodo para realizar una suma
    
    public double  suma(){
        int suma=0;
        int f=(int)a;
        suma=n+f;
        return suma;
    }
    //Metodo para realizar una resta
    public double resta(){
        double resta=0;
        resta =a-n;
        return resta;
    }
    //Metodo para que un char indique el valor numerico que le corresponde
    public int palabra(){
        int palabra;
        palabra=c;
        return palabra;
        
    }
}
