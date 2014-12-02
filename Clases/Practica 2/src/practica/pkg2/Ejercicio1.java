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
public class Ejercicio1 {
   //variables
    private int Numero;
//Metodo constructor
   
    //Metodo para reportar un mes
    public String mes(int numero){
       this.Numero=numero;
        if(this.Numero==1){
            return "Enero";
        }if(this.Numero==2){
            return "Febrero";
        }if(this.Numero==3){
            return "Marzo";
        }if(this.Numero==4){
            return "Abril";
        }if(this.Numero==5){
            return "Mayo";
        }if(this.Numero==6){
            return "Junio";
        }if(this.Numero==7){
            return "Julio";
        }if(this.Numero==8){
            return "Agosto";
        }if(this.Numero==9){
            return "Septiembre";
        }if(this.Numero==10){
            return "Octubre";
        }if(this.Numero==11){
            return "Noviembre";
        }if(this.Numero==12){
            return "Diciembre";
        }else{
            return "Error, ese mes no existe";
        }
    }
}
