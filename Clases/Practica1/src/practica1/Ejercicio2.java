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
public class Ejercicio2 {
//Atributos
    private double N,M;
    private int X,Y;
    //Metodo constructor
    public Ejercicio2(double n, double m, int x, int y) {
        this.N = n;
        this.M = m;
        this.X = x;
        this.Y = y;
    }
    //Metodos para realizar las operaciones basicas entre diferentes numeros
    public int suma(){
    int suma=X+Y;
    return suma;
}
    public int resta(){
        int resta=X-Y;
        return resta;
    }
    public int  mul(){
        int mul=X*Y;
        return mul;
    }
    public int div(){
        int div=X/Y;
        return div;
    }
    public double sum(){
    double suma=N+M;
    return suma;
}
    public double rest(){
        double resta=N-M;
        return resta;
    }
    public double  mult(){
        double mul=N*M;
        return mul;
    }
    public double divi(){
        double div=N/M;
        return div;
    }
}
