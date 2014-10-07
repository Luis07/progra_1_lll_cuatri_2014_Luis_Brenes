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
public class Ejercicio4 {
    private int mes,año;
    public String año(int mes,int año){
        if(año%4==0&&mes==2){
            return "Febrero:"+"29 dias";
        }else{
        }if(mes==1){
            return "Enero:"+"31 Dias";
        }if(mes==2){
            return "Febrero:"+"28 dias";
        }if(mes==3){
            return "Marzo:"+"31 dias";
        }if(mes==4){
            return "Abril:"+"30 dias";
        }if(mes==5){
            return "Mayo:"+"31 dias";
        }if(mes==6){
            return "Jumio"+"30 dias";
        }if(mes==7){
            return "Julio:"+"31 dias";
        }if(mes==8){
            return "Agosto"+"31 dias";
        }if(mes==9){
            return "Septiembre:"+"30 dias";
        }if(mes==10){
            return "Octubre"+"31 dias";
        }if(mes==11){
            return "Noviembre:"+"30 dias";
        }return "Diciembre"+"31 dias";
    }
}
