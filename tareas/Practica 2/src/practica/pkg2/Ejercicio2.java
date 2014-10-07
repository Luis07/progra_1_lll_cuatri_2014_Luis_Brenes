/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;

/**
 *
 * @author Luis B
 */
public class Ejercicio2 {
    private double Numero;
    public double numero(int numero1){
    Numero=(double)numero1;
    double acum=0;
    do{  
      acum=  Numero-10;
      Numero=acum;
    }while(Numero>10);
    if((Numero==2)||(Numero==5)||(Numero==8)){
            return Math.pow(numero1,2);
        }else{
            if((Numero==4)||(Numero==7)||(Numero==9)){
                return numero1*5;
            }
        }return numero1;
}
}