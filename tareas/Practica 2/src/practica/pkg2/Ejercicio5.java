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
public class Ejercicio5 {
   private  String numeroromano ="",acum="";
   private int romano=1,i=0,acum2=0 ;
   public int numerorandom(){
             int random = (int) (Math.random() * (3000 - 1) + 1);
       return random;
   }  
   public String NumeroRomano() {
             int random = (int) (Math.random() * (3000 - 1) + 1);
      if(romano<3000){
          i=0;
       while(random>0){   
             acum2=random%10;
               romano = acum2 * (int) Math.pow(10, i);
                    if(romano==1){
                      numeroromano = "I";
                      acum+=numeroromano;    
                     }
                    if(romano==2){
                        numeroromano = "II";
                    acum+=numeroromano;
                    }
                    if(romano==3){
                        numeroromano = "III";
                    acum+=numeroromano;
                    }
                    if(romano==4){
                        numeroromano = "IV";
                   acum+=numeroromano;
                    }
                   if(romano==5){
                       numeroromano = "V";
                   acum+=numeroromano;
                   }
                    if(romano==6){
                        numeroromano = "VI";
                    acum+=numeroromano;
                    }
                    if(romano==7){
                        numeroromano = "VII";
                    acum+=numeroromano;
                    }
                    if(romano==8){
                        numeroromano = "VIII";
                    acum+=numeroromano;
                    }
                    if(romano==9){
                        numeroromano = "IX";
                    acum+=numeroromano;
                    }
                    if(romano==10){
                        numeroromano = "X";
                    acum+=numeroromano;
                    }
                    if(romano==20){
                        numeroromano = "XX";
                   acum+=numeroromano;
                    }
                   if(romano==30){
                        numeroromano = "XXX";
                   acum+=numeroromano;
                   }
                    if(romano==40){
                        numeroromano = "XL";
                    acum+=numeroromano;
                    }
                    if(romano==50){
                        numeroromano = "L";
                    acum+=numeroromano;
                    }
                    if(romano==60){
                        numeroromano = "LX";
                    acum+=numeroromano;
                    }
                    if(romano==70){
                        numeroromano = "LXX";
                    acum+=numeroromano;
                    }
                    if(romano==80){
                        numeroromano = "LXXX";
                    acum+=numeroromano;
                    }
                    if(romano==90){
                        numeroromano = "XC";
                    acum+=numeroromano;
                    }
                    if(romano==100){
                        numeroromano = "C";
                    acum+=numeroromano;
                    }
                    if(romano==200){
                        numeroromano = "CC";
                   acum+=numeroromano;
                    }
                   if(romano==300){
                       numeroromano = "CCC";
                   acum+=numeroromano;
                   }
                   if(romano==400){
                       numeroromano = "CD";
                   acum+=numeroromano;
                   }
                   if(romano==500){
                       numeroromano = "D";
                   acum+=numeroromano;
                   }
                    if(romano==600){
                        numeroromano = "DC";
                    acum+=numeroromano;
                    }
                    if(romano==700){
                        numeroromano = "DCC";
                    acum+=numeroromano;
                    }
                    if(romano==800){
                        numeroromano = "DCCC";
                    acum+=numeroromano;
                    }
                    if(romano==900){
                        numeroromano = "CM";
                    acum+=numeroromano;
                    }
                    if(romano==1000){
                        numeroromano = "M";
                   acum+=numeroromano;
                    }
                   if(romano==2000){
                       numeroromano = "MM";
                acum+=numeroromano;
                   }
                    if(romano==3000){
                        numeroromano = "MMM";
                acum+=numeroromano;
                    }
                    random = random / 10;
                i++;
             }
                        }
       return acum;
      }
}
      


    

