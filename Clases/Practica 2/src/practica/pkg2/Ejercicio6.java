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
public class Ejercicio6 {
    private int dia,mes,año,acum,acum1,acum2;

    public Ejercicio6(int Dia, int Mes, int Año) {
        this.dia = Dia;
        this.mes = Mes;
        this.año = Año;
    }
    public int Dia(){
   if(año%4==0&&mes==2){
       acum=29;
   }else{
       if(año%4==0&&mes==3){
           acum=29;
           return acum;
       }
       if(dia==1&&mes==2){
           acum=31;
       }else
           if(dia==1&&mes==3){
               acum=28;
               return acum;
           }if(dia==1&&mes==4){
               acum=31;
               return acum;
           }if(dia==1&&mes==5){
               acum=30;
               return acum;
           }if(dia==1&&mes==6){
               acum=31;
               return acum;
           }if(dia==1&&mes==7){
               acum=30;
               return acum;
           }if(dia==1&&mes==8){
               acum=31;
               return acum;
           }if(dia==1&&mes==9){
               acum=31;
               return acum;
           }if(dia==1&&mes==10){
               acum=30;
               return acum;
           }if(dia==1&&mes==11){
               acum=31;
               return acum;
           }if(dia==1&&mes==12){
               acum=30;
               return acum;
           }if(dia==1&&mes==1){
               acum=31;
               return acum;
            }
            acum=dia-1;
   }
       return acum;
    }
    public int Mes(){
        if(mes>12){
            return 1;
        }else{
        }if(mes==1){
                acum1=12;
            }if(dia==1&&mes==1){
                acum1=12;
                return acum1;
            }
            if(dia==1){
                acum1=mes-1;
            }else{
                acum1=mes;
            }
        return acum1;
    }
    public int Año(){
        if(dia==1&&mes==1){
            acum2=año-1;
        }else{
            acum2=año;
        }
        return acum2;
    }
    }
    

