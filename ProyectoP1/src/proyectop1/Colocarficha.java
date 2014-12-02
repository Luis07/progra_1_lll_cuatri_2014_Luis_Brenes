/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectop1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class Colocarficha {

    // creacion de las variables de a clase
    private String turno1=" ", turno2=" ";
    private String[][]Matrizjuego;
    private boolean Estado;
    private int b=0,a=0,k=0,h=0,f=0,g=0,e=0,d=0,c=0;
    private String jugador1,jugador2,acum3="",palabra="";
//metodo que retorna el valor del estado   
 public boolean isEstado() {
        return Estado;
    }
//metodo boolean para el turno de jugador
     public boolean turnojugador(){
         
          if(this.Estado==false){
            Estado=true;
        }else{
            Estado=false;
        }
         return Estado;
    }
   //Aquí se crea la Matriz del juego 
    public void CrearMatrisjuego(int filas,int columnas){
        Matrizjuego= new String[filas][columnas];
    }
//Metodo para cargar la  matriz
    public void CargaMatriz(){
        String impresion="";
        int i2=0,suma=0,i3=0;
        for (int i = 0; i < Matrizjuego.length; i++) {
            for (int j = 0; j <Matrizjuego[0].length; j++) {
                 
                impresion="( )";
                Matrizjuego[i][j]=impresion;
            }
            
            impresion+=" "+"\n";
        }
    }
//Metodo get 
    public String[][] getMatrizjuego() {
        return Matrizjuego;
    }
//Metodo set
    public void setMatrizjuego(String[][] Matrizjuego) {
        this.Matrizjuego = Matrizjuego;
    }

    
    // Metodo en el cual se recorre la matriz y se imprimie el tablero,aimismo se  almacena la ficha donde el usuario quiere
    public String muestratablero(int columnas){
        String impresion="",acum2=" 0"+"  1"+"  2"+"  3"+"  4"+"  5"+"  6";
        impresion+=acum2;
        impresion+="\n";
        acum3="";
     
   if(columnas==0){         
// If para saber si Existe una columna llena
       if(Matrizjuego[0][0].equals("(X)")||Matrizjuego[0][0].equals("(O)")){
                     acum3="Columna llena, favor digite una columna vacia";
                   setMatrizjuego(Matrizjuego);
                   return acum3;
   }
   }if(columnas==1){
    if(Matrizjuego[0][1].equals("(X)")||Matrizjuego[0][1].equals("(O)")){
                   acum3="Columna llena, favor digite una columna vacia";
                   setMatrizjuego(Matrizjuego);
                   return acum3;
   } 
   }if(columnas==2){
   if(Matrizjuego[0][2].equals("(X)")||Matrizjuego[0][2].equals("(O)")){
                  acum3="Columna llena, favor digite una columna vacia";
                   setMatrizjuego(Matrizjuego);
                   return acum3;
   }
   }if(columnas==3){
   if(Matrizjuego[0][3].equals("(X)")||Matrizjuego[0][3].equals("(O)")){
                    acum3="Columna llena, favor digite una columna vacia";
                   setMatrizjuego(Matrizjuego);
                   return acum3;
   }
   }if(columnas==4){
   if(Matrizjuego[0][4].equals("(X)")||Matrizjuego[0][4].equals("(O)")){
                 acum3="Columna llena, favor digite una columna vacia";
                   setMatrizjuego(Matrizjuego);
                   return acum3;
   }
   }if(columnas==5){
   if(Matrizjuego[0][5].equals("(X)")||Matrizjuego[0][5].equals("(O)")){
                   acum3="Columna llena, favor digite una columna vacia";
                   setMatrizjuego(Matrizjuego);
                   return acum3;
   }
   }if(columnas==6){
   if(Matrizjuego[0][6].equals("(X)")||Matrizjuego[0][6].equals("(O)")){
                  acum3="Columna llena, favor digite una columna vacia";
                   setMatrizjuego(Matrizjuego);
                   return acum3;
   }
   }
        if(columnas==8){
          for (int i = 0; i <Matrizjuego.length; i++) {
             for (int j = 0; j < Matrizjuego[0].length; j++) {
         impresion+=Matrizjuego[i][j];        
             }
            impresion+="\n";
        }
         return impresion;
        }//for para recoorrer l matriz
  
//if para colocar la ficha en la posicion que debe ir, ya que la ficha debbe caer por su propio peso
   if(columnas==0&&Estado==true){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")&&Matrizjuego[2][0].equals("( )")&&
                    Matrizjuego[3][0].equals("( )")&&Matrizjuego[4][0].equals("( )")&&Matrizjuego[5][0].equals("( )")){
            Matrizjuego[5][0]="("+"X"+")";
            columnas=7;
            }
        }
         if(columnas==0&&Estado==true){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")&&Matrizjuego[2][0].equals("( )")&&
                    Matrizjuego[3][0].equals("( )")&&Matrizjuego[4][0].equals("( )")){
                    Matrizjuego[4][0]="("+"X"+")";
         columnas=7;
            }
         }
         if(columnas==0&&Estado==true){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")&&Matrizjuego[2][0].equals("( )")&&
                    Matrizjuego[3][0].equals("( )")){
            Matrizjuego[3][0]="("+"X"+")";
         columnas=7;
            }
         } if(columnas==0&&Estado==true){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")&&Matrizjuego[2][0].equals("( )")){
            Matrizjuego[2][0]="("+"X"+")";
         columnas=7;
            }
         }if(columnas==0&&Estado==true){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")){
            Matrizjuego[1][0]="("+"X"+")";
         columnas=7;
            }
         }
         if(columnas==0&&Estado==true){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("(X)")||Matrizjuego[1][0].equals("(O)")&&Matrizjuego[2][0].equals("(X)")||Matrizjuego[2][0].equals("(O)")&&
                    Matrizjuego[3][0].equals("(X)")||Matrizjuego[3][0].equals("(O)")&&Matrizjuego[4][0].equals("(X)")||Matrizjuego[4][0].equals("(O)")&&Matrizjuego[5][0].equals("(X)")||Matrizjuego[5][0].equals("(O)")){
            Matrizjuego[0][0]="("+"X"+")";
             columnas=7;
            }
         }

         if(columnas==0&&Estado==false){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")&&Matrizjuego[2][0].equals("( )")&&
                    Matrizjuego[3][0].equals("( )")&&Matrizjuego[4][0].equals("( )")&&Matrizjuego[5][0].equals("( )")){
            Matrizjuego[5][0]="("+"O"+")";
         columnas=7;
            }
        }
         if(columnas==0&&Estado==false){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")&&Matrizjuego[2][0].equals("( )")&&
                    Matrizjuego[3][0].equals("( )")&&Matrizjuego[4][0].equals("( )")){
            Matrizjuego[4][0]="("+"O"+")";
            columnas=7;
        }
         }
         if(columnas==0&&Estado==false){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")&&Matrizjuego[2][0].equals("( )")&&
                    Matrizjuego[3][0].equals("( )")){
            Matrizjuego[3][0]="("+"O"+")";
       columnas=7;
            }
         } if(columnas==0&&Estado==false){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")&&Matrizjuego[2][0].equals("( )")){
            Matrizjuego[2][0]="("+"O"+")";
         columnas=7;
            }
         }if(columnas==0&&Estado==false){
            if(Matrizjuego[0][0].equals("( )")&&Matrizjuego[1][0].equals("( )")){
            Matrizjuego[1][0]="("+"O"+")";
             columnas=7;
            }   
         }
         if(columnas==0&&Estado==false){
            if(Matrizjuego[0][0].equals("( )")){
            Matrizjuego[0][0]="("+"O"+")";
             columnas=7;
            }
         } if(columnas==1&&Estado==true){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")&&Matrizjuego[2][1].equals("( )")&&
                    Matrizjuego[3][1].equals("( )")&&Matrizjuego[4][1].equals("( )")&&Matrizjuego[5][1].equals("( )")){
            Matrizjuego[5][1]="("+"X"+")";
            columnas=8;
            }
        }
         if(columnas==1&&Estado==true){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")&&Matrizjuego[2][1].equals("( )")&&
                    Matrizjuego[3][1].equals("( )")&&Matrizjuego[4][1].equals("( )")){
                    Matrizjuego[4][1]="("+"X"+")";
         columnas=8;
            }
         }
         if(columnas==1&&Estado==true){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")&&Matrizjuego[2][1].equals("( )")&&
                    Matrizjuego[3][1].equals("( )")){
            Matrizjuego[3][1]="("+"X"+")";
         columnas=8;
            }
         } if(columnas==1&&Estado==true){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")&&Matrizjuego[2][1].equals("( )")){
            Matrizjuego[2][1]="("+"X"+")";
         columnas=8;
            }
         }if(columnas==1&&Estado==true){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")){
            Matrizjuego[1][1]="("+"X"+")";
         columnas=8;
            }
         }
         if(columnas==1&&Estado==true){
            if(Matrizjuego[0][1].equals("( )")){
            Matrizjuego[0][1]="("+"X"+")";
             columnas=8;
            }
         }

         if(columnas==1&&Estado==false){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")&&Matrizjuego[2][1].equals("( )")&&
                    Matrizjuego[3][1].equals("( )")&&Matrizjuego[4][1].equals("( )")&&Matrizjuego[5][1].equals("( )")){
            Matrizjuego[5][1]="("+"O"+")";
         columnas=8;
            }
        }
         if(columnas==1&&Estado==false){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")&&Matrizjuego[2][1].equals("( )")&&
                    Matrizjuego[3][1].equals("( )")&&Matrizjuego[4][1].equals("( )")){
            Matrizjuego[4][1]="("+"O"+")";
            columnas=8;
        }
         }
         if(columnas==1&&Estado==false){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")&&Matrizjuego[2][1].equals("( )")&&
                    Matrizjuego[3][1].equals("( )")){
            Matrizjuego[3][1]="("+"O"+")";
       columnas=8;
            }
         } if(columnas==1&&Estado==false){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")&&Matrizjuego[2][1].equals("( )")){
            Matrizjuego[2][1]="("+"O"+")";
         columnas=8;
            }
         }if(columnas==1&&Estado==false){
            if(Matrizjuego[0][1].equals("( )")&&Matrizjuego[1][1].equals("( )")){
            Matrizjuego[1][1]="("+"O"+")";
             columnas=8;
            }   
         }
         if(columnas==1&&Estado==false){
            if(Matrizjuego[0][1].equals("( )")){
            Matrizjuego[0][1]="("+"O"+")";
             columnas=8;
            }
         }
         if(columnas==2&&Estado==true){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")&&Matrizjuego[2][2].equals("( )")&&
                    Matrizjuego[3][2].equals("( )")&&Matrizjuego[4][2].equals("( )")&&Matrizjuego[5][2].equals("( )")){
            Matrizjuego[5][2]="("+"X"+")";
            columnas=9;
            }
        }
         if(columnas==2&&Estado==true){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")&&Matrizjuego[2][2].equals("( )")&&
                    Matrizjuego[3][2].equals("( )")&&Matrizjuego[4][2].equals("( )")){
                    Matrizjuego[4][2]="("+"X"+")";
         columnas=9;
            }
         }
         if(columnas==2&&Estado==true){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")&&Matrizjuego[2][2].equals("( )")&&
                    Matrizjuego[3][2].equals("( )")){
            Matrizjuego[3][2]="("+"X"+")";
         columnas=9;
            }
         } if(columnas==2&&Estado==true){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")&&Matrizjuego[2][2].equals("( )")){
            Matrizjuego[2][2]="("+"X"+")";
         columnas=9;
            }
         }if(columnas==2&&Estado==true){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")){
            Matrizjuego[1][2]="("+"X"+")";
         columnas=9;
            }
         }
         if(columnas==2&&Estado==true){
            if(Matrizjuego[0][2].equals("( )")){
            Matrizjuego[0][2]="("+"X"+")";
             columnas=9;
            }
         }

         if(columnas==2&&Estado==false){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")&&Matrizjuego[2][2].equals("( )")&&
                    Matrizjuego[3][2].equals("( )")&&Matrizjuego[4][2].equals("( )")&&Matrizjuego[5][2].equals("( )")){
            Matrizjuego[5][2]="("+"O"+")";
         columnas=9;
            }
        }
         if(columnas==2&&Estado==false){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")&&Matrizjuego[2][2].equals("( )")&&
                    Matrizjuego[3][2].equals("( )")&&Matrizjuego[4][2].equals("( )")){
            Matrizjuego[4][2]="("+"O"+")";
            columnas=9;
        }
         }
         if(columnas==2&&Estado==false){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")&&Matrizjuego[2][2].equals("( )")&&
                    Matrizjuego[3][2].equals("( )")){
            Matrizjuego[3][2]="("+"O"+")";
       columnas=9;
            }
         } if(columnas==2&&Estado==false){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")&&Matrizjuego[2][2].equals("( )")){
            Matrizjuego[2][2]="("+"O"+")";
         columnas=9;
            }
         }if(columnas==2&&Estado==false){
            if(Matrizjuego[0][2].equals("( )")&&Matrizjuego[1][2].equals("( )")){
            Matrizjuego[1][2]="("+"O"+")";
             columnas=9;
            }   
         }
         if(columnas==2&&Estado==false){
            if(Matrizjuego[0][2].equals("( )")){
            Matrizjuego[0][2]="("+"O"+")";
             columnas=9;
            }
         }
         if(columnas==3&&Estado==true){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")&&Matrizjuego[2][3].equals("( )")&&
                    Matrizjuego[3][3].equals("( )")&&Matrizjuego[4][3].equals("( )")&&Matrizjuego[5][3].equals("( )")){
            Matrizjuego[5][3]="("+"X"+")";
            columnas=10;
            }
        }
         if(columnas==3&&Estado==true){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")&&Matrizjuego[2][3].equals("( )")&&
                    Matrizjuego[3][3].equals("( )")&&Matrizjuego[4][3].equals("( )")){
                    Matrizjuego[4][3]="("+"X"+")";
         columnas=10;
            }
         }
         if(columnas==3&&Estado==true){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")&&Matrizjuego[2][3].equals("( )")&&
                    Matrizjuego[3][3].equals("( )")){
            Matrizjuego[3][3]="("+"X"+")";
         columnas=10;
            }
         } if(columnas==3&&Estado==true){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")&&Matrizjuego[2][3].equals("( )")){
            Matrizjuego[2][3]="("+"X"+")";
         columnas=10;
            }
         }if(columnas==3&&Estado==true){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")){
            Matrizjuego[1][3]="("+"X"+")";
         columnas=10;
            }
         }
         if(columnas==3&&Estado==true){
            if(Matrizjuego[0][3].equals("( )")){
            Matrizjuego[0][3]="("+"X"+")";
             columnas=10;
            }
         }
         if(columnas==4&&Estado==true){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")&&Matrizjuego[2][4].equals("( )")&&
                    Matrizjuego[3][4].equals("( )")&&Matrizjuego[4][4].equals("( )")&&Matrizjuego[5][4].equals("( )")){
            Matrizjuego[5][4]="("+"X"+")";
            columnas=11;
            }
        }
         if(columnas==4&&Estado==true){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")&&Matrizjuego[2][4].equals("( )")&&
                    Matrizjuego[3][4].equals("( )")&&Matrizjuego[4][4].equals("( )")){
                    Matrizjuego[4][4]="("+"X"+")";
         columnas=11;
            }
         }
         if(columnas==4&&Estado==true){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")&&Matrizjuego[2][4].equals("( )")&&
                    Matrizjuego[3][4].equals("( )")){
            Matrizjuego[3][4]="("+"X"+")";
         columnas=11;
            }
         }
         if(columnas==4&&Estado==true){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")&&Matrizjuego[2][4].equals("( )")){
            Matrizjuego[2][4]="("+"X"+")";
         columnas=11;
            }
         }
         if(columnas==4&&Estado==true){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")){
            Matrizjuego[1][4]="("+"X"+")";
         columnas=11;
            }
         }
         if(columnas==4&&Estado==true){
            if(Matrizjuego[0][4].equals("( )")){
            Matrizjuego[0][4]="("+"X"+")";
             columnas=11;
            }
         }
         if(columnas==5&&Estado==true){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")&&Matrizjuego[2][5].equals("( )")&&
                    Matrizjuego[3][5].equals("( )")&&Matrizjuego[4][5].equals("( )")&&Matrizjuego[5][5].equals("( )")){
            Matrizjuego[5][5]="("+"X"+")";
            columnas=12;
            }
        }
         if(columnas==5&&Estado==true){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")&&Matrizjuego[2][5].equals("( )")&&
                    Matrizjuego[3][5].equals("( )")&&Matrizjuego[4][5].equals("( )")){
                    Matrizjuego[4][5]="("+"X"+")";
         columnas=12;
            }
         }
         if(columnas==5&&Estado==true){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")&&Matrizjuego[2][5].equals("( )")&&
                    Matrizjuego[3][5].equals("( )")){
            Matrizjuego[3][5]="("+"X"+")";
         columnas=12;
            }
         }
         if(columnas==5&&Estado==true){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")&&Matrizjuego[2][5].equals("( )")){
            Matrizjuego[2][5]="("+"X"+")";
         columnas=12;
            }
         }
         if(columnas==5&&Estado==true){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")){
            Matrizjuego[1][5]="("+"X"+")";
         columnas=12;
            }
         }
         if(columnas==5&&Estado==true){
            if(Matrizjuego[0][5].equals("( )")){
            Matrizjuego[0][5]="("+"X"+")";
             columnas=12;
            }
         }
         if(columnas==6&&Estado==true){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")&&Matrizjuego[2][6].equals("( )")&&
                    Matrizjuego[3][6].equals("( )")&&Matrizjuego[4][6].equals("( )")&&Matrizjuego[5][6].equals("( )")){
            Matrizjuego[5][6]="("+"X"+")";
            columnas=13;
            }
        }
         if(columnas==6&&Estado==true){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")&&Matrizjuego[2][6].equals("( )")&&
                    Matrizjuego[3][6].equals("( )")&&Matrizjuego[4][6].equals("( )")){
                    Matrizjuego[4][6]="("+"X"+")";
         columnas=13;
            }
         }
         if(columnas==6&&Estado==true){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")&&Matrizjuego[2][6].equals("( )")&&
                    Matrizjuego[3][6].equals("( )")){
            Matrizjuego[3][6]="("+"X"+")";
         columnas=13;
            }
         }
         if(columnas==6&&Estado==true){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")&&Matrizjuego[2][6].equals("( )")){
            Matrizjuego[2][6]="("+"X"+")";
         columnas=7;
            }
         }
         if(columnas==6&&Estado==true){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")){
            Matrizjuego[1][6]="("+"X"+")";
         columnas=13;
            }
         }
         if(columnas==6&&Estado==true){
            if(Matrizjuego[0][6].equals("( )")){
            Matrizjuego[0][6]="("+"X"+")";
             columnas=13;
            }
         }

         if(columnas==3&&Estado==false){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")&&Matrizjuego[2][3].equals("( )")&&
                    Matrizjuego[3][3].equals("( )")&&Matrizjuego[4][3].equals("( )")&&Matrizjuego[5][3].equals("( )")){
            Matrizjuego[5][3]="("+"O"+")";
         columnas=10;
            }
        }
         if(columnas==3&&Estado==false){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")&&Matrizjuego[2][3].equals("( )")&&
                    Matrizjuego[3][3].equals("( )")&&Matrizjuego[4][3].equals("( )")){
            Matrizjuego[4][3]="("+"O"+")";
            columnas=10;
        }
         }
         if(columnas==3&&Estado==false){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")&&Matrizjuego[2][3].equals("( )")&&
                    Matrizjuego[3][3].equals("( )")){
            Matrizjuego[3][3]="("+"O"+")";
       columnas=10;
            }
         } if(columnas==3&&Estado==false){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")&&Matrizjuego[2][3].equals("( )")){
            Matrizjuego[2][3]="("+"O"+")";
         columnas=10;
            }
         }if(columnas==3&&Estado==false){
            if(Matrizjuego[0][3].equals("( )")&&Matrizjuego[1][3].equals("( )")){
            Matrizjuego[1][3]="("+"O"+")";
             columnas=10;
            }   
         }
         if(columnas==3&&Estado==false){
            if(Matrizjuego[0][3].equals("( )")){
            Matrizjuego[0][3]="("+"O"+")";
             columnas=10;
            }
         }
         if(columnas==4&&Estado==false){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")&&Matrizjuego[2][4].equals("( )")&&
                    Matrizjuego[3][4].equals("( )")&&Matrizjuego[4][4].equals("( )")&&Matrizjuego[5][4].equals("( )")){
            Matrizjuego[5][4]="("+"O"+")";
         columnas=11;
            }
        }
         if(columnas==4&&Estado==false){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")&&Matrizjuego[2][4].equals("( )")&&
                    Matrizjuego[3][4].equals("( )")&&Matrizjuego[4][4].equals("( )")){
            Matrizjuego[4][4]="("+"O"+")";
            columnas=11;
        }
         }
          if(columnas==4&&Estado==false){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")&&Matrizjuego[2][4].equals("( )")&&
                    Matrizjuego[3][4].equals("( )")){
            Matrizjuego[3][4]="("+"O"+")";
       columnas=11;
            }
         } 
          if(columnas==4&&Estado==false){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")&&Matrizjuego[2][4].equals("( )")){
            Matrizjuego[2][4]="("+"O"+")";
         columnas=11;
            }
         }
          if(columnas==4&&Estado==false){
            if(Matrizjuego[0][4].equals("( )")&&Matrizjuego[1][4].equals("( )")){
            Matrizjuego[1][4]="("+"O"+")";
             columnas=11;
            }   
         }
          if(columnas==4&&Estado==false){
            if(Matrizjuego[0][4].equals("( )")){
            Matrizjuego[0][4]="("+"O"+")";
             columnas=11;
            }
         }
          if(columnas==5&&Estado==false){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")&&Matrizjuego[2][5].equals("( )")&&
                    Matrizjuego[3][5].equals("( )")&&Matrizjuego[4][5].equals("( )")&&Matrizjuego[5][5].equals("( )")){
            Matrizjuego[5][5]="("+"O"+")";
         columnas=12;
            }
        }
          if(columnas==5&&Estado==false){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")&&Matrizjuego[2][5].equals("( )")&&
                    Matrizjuego[3][5].equals("( )")&&Matrizjuego[4][5].equals("( )")){
            Matrizjuego[4][5]="("+"O"+")";
            columnas=12;
        }
         }
          if(columnas==5&&Estado==false){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")&&Matrizjuego[2][5].equals("( )")&&
                    Matrizjuego[3][5].equals("( )")){
            Matrizjuego[3][5]="("+"O"+")";
       columnas=12;
            }
         } 
          if(columnas==5&&Estado==false){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")&&Matrizjuego[2][5].equals("( )")){
            Matrizjuego[2][5]="("+"O"+")";
         columnas=12;
            }
         }
          if(columnas==5&&Estado==false){
            if(Matrizjuego[0][5].equals("( )")&&Matrizjuego[1][5].equals("( )")){
            Matrizjuego[1][5]="("+"O"+")";
             columnas=12;
            }   
         }
          if(columnas==5&&Estado==false){
            if(Matrizjuego[0][5].equals("( )")){
            Matrizjuego[0][5]="("+"O"+")";
             columnas=12;
            }
         }
          if(columnas==6&&Estado==false){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")&&Matrizjuego[2][6].equals("( )")&&
                    Matrizjuego[3][6].equals("( )")&&Matrizjuego[4][6].equals("( )")&&Matrizjuego[5][6].equals("( )")){
            Matrizjuego[5][6]="("+"O"+")";
         columnas=13;
            }
        }
          if(columnas==6&&Estado==false){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")&&Matrizjuego[2][6].equals("( )")&&
                    Matrizjuego[3][6].equals("( )")&&Matrizjuego[4][6].equals("( )")){
            Matrizjuego[4][6]="("+"O"+")";
            columnas=13;
        }
         }
          if(columnas==6&&Estado==false){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")&&Matrizjuego[2][6].equals("( )")&&
                    Matrizjuego[3][6].equals("( )")){
            Matrizjuego[3][6]="("+"O"+")";
       columnas=13;
            }
         } 
          if(columnas==6&&Estado==false){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")&&Matrizjuego[2][6].equals("( )")){
            Matrizjuego[2][6]="("+"O"+")";
         columnas=13;
            }
         }
          if(columnas==6&&Estado==false){
            if(Matrizjuego[0][6].equals("( )")&&Matrizjuego[1][6].equals("( )")){
            Matrizjuego[1][6]="("+"O"+")";
             columnas=13;
            }   
         }
          if(columnas==6&&Estado==false){
            if(Matrizjuego[0][6].equals("( )")){
            Matrizjuego[0][6]="("+"O"+")";
             columnas=13;
            }
         }
         
//for que recorre la matriz y la muestra
         for (int i = 0; i <Matrizjuego.length; i++) {
             for (int j = 0; j < Matrizjuego[0].length; j++) {
                 
                 
         impresion+=Matrizjuego[i][j];        
             }
            impresion+="\n";
        }
         return impresion;
           }
    //Metodo para reiniciar el juego
    public void reiniciarjuego(){
        String impresion="",acum2=" 0"+"  1"+"  2"+"  3"+"  4"+"  5"+"  6";
       Matrizjuego= new String[6][7];
       CargaMatriz();
        Estado=false;
     
    }
//metodo en el cual si un jugador le da, indica quien  se ha rendido y por ende quien ha ganado
    public String Rendirse (String jugador1, String jugador2)
 {
 if(Estado==true){
     turno1="j1";
 return jugador1+" "+"se a rendido, Felicidades el ganador es"+" "+jugador2;
 }else{
     turno2="j2";
 return jugador2+" "+"se a rendido, Felicidades el ganador es"+" "+jugador1; 
 }
 }
//Metodo en el cual se va analizar si un jugador ya ha ganado, se logra recorriendo la matriz y analizando cada valor en  sus posiciones
    public String ValidarJuego(String jugador1,String jugador2){
        for (int i = 0; i <Matrizjuego.length; i++) {
            for (int j = 0; j < Matrizjuego[0].length; j++) {
               if(Matrizjuego[5][0].equals("( )")&&Matrizjuego[5][1].equals("( )")&&Matrizjuego[5][2].equals("( )")&&
           Matrizjuego[5][3].equals("( )")&&Matrizjuego[5][4].equals("( )")&&Matrizjuego[5][5].equals("( )")&&Matrizjuego[5][6].equals("( )")){
            return "El juego no se ha iniciado...";
        }
                if(Estado==true){
                    this.turno1="j1";
     if(Matrizjuego[5][0].equals("(X)")&&Matrizjuego[5][1].equals("(X)")&&Matrizjuego[5][2].equals("(X)")&&
                   Matrizjuego[5][3].equals("(X)")){  
    return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
     }  if(Matrizjuego[5][0].equals("(X)")&&Matrizjuego[4][1].equals("(X)")&&Matrizjuego[3][2].equals("(X)")&&
                   Matrizjuego[2][3].equals("(X)")){  
      return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";       
     }if(Matrizjuego[5][0].equals("(X)")&&Matrizjuego[4][0].equals("(X)")&&Matrizjuego[3][0].equals("(X)")&&
                   Matrizjuego[2][0].equals("(X)")){  
         return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[4][0].equals("(X)")&&Matrizjuego[4][1].equals("(X)")&&Matrizjuego[4][2].equals("(X)")&&
                   Matrizjuego[4][3].equals("(X)")){  
                return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[4][0].equals("(X)")&&Matrizjuego[3][1].equals("(X)")&&Matrizjuego[2][2].equals("(X)")&&
                   Matrizjuego[1][3].equals("(X)")){  
                return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[4][0].equals("(X)")&&Matrizjuego[3][0].equals("(X)")&&Matrizjuego[2][0].equals("(X)")&&
                   Matrizjuego[1][0].equals("(X)")){  
               return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                } if(Matrizjuego[3][0].equals("(X)")&&Matrizjuego[3][1].equals("(X)")&&Matrizjuego[3][2].equals("(X)")&&
                   Matrizjuego[3][3].equals("(X)")){  
                      return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                }if(Matrizjuego[3][0].equals("(X)")&&Matrizjuego[2][1].equals("(X)")&&Matrizjuego[1][2].equals("(X)")&&
                   Matrizjuego[0][3].equals("(X)")){  
               return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                }if(Matrizjuego[3][0].equals("(X)")&&Matrizjuego[2][0].equals("(X)")&&Matrizjuego[1][0].equals("(X)")&&
                   Matrizjuego[0][0].equals("(X)")){  
                      return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            } }if(Matrizjuego[2][0].equals("(X)")&&Matrizjuego[2][1].equals("(X)")&&Matrizjuego[2][2].equals("(X)")&&
                   Matrizjuego[2][3].equals("(X)")){  
                    return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                }if(Matrizjuego[2][0].equals("(X)")&&Matrizjuego[3][1].equals("(X)")&&Matrizjuego[4][2].equals("(X)")&&
                   Matrizjuego[5][3].equals("(X)")){  
                   return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                }if(Matrizjuego[1][0].equals("(X)")&&Matrizjuego[1][1].equals("(X)")&&Matrizjuego[1][2].equals("(X)")&&
                   Matrizjuego[1][3].equals("(X)")){  
                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                }if(Matrizjuego[1][0].equals("(X)")&&Matrizjuego[2][1].equals("(X)")&&Matrizjuego[3][2].equals("(X)")&&
                   Matrizjuego[4][3].equals("(X)")){  
              return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                }if(Matrizjuego[0][0].equals("(X)")&&Matrizjuego[0][1].equals("(X)")&&Matrizjuego[0][2].equals("(X)")&&
                   Matrizjuego[0][3].equals("(X)")){  
                    return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            } if(Matrizjuego[0][0].equals("(X)")&&Matrizjuego[1][1].equals("(X)")&&Matrizjuego[2][2].equals("(X)")&&
                   Matrizjuego[3][3].equals("(X)")){  
                   return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                    }if(Matrizjuego[1][1].equals("(X)")&&Matrizjuego[2][2].equals("(X)")&&Matrizjuego[3][3].equals("(X)")&&
                   Matrizjuego[4][4].equals("(X)")){  
                   return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                    }
//columna1
            if(Matrizjuego[5][1].equals("(X)")&&Matrizjuego[5][2].equals("(X)")&&Matrizjuego[5][3].equals("(X)")&&
                   Matrizjuego[5][4].equals("(X)")){  
                              return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[5][1].equals("(X)")&&Matrizjuego[4][2].equals("(X)")&&Matrizjuego[3][3].equals("(X)")&&
                   Matrizjuego[2][4].equals("(X)")){  
                         return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            } if(Matrizjuego[5][1].equals("(X)")&&Matrizjuego[4][1].equals("(X)")&&Matrizjuego[3][1].equals("(X)")&&
                   Matrizjuego[2][1].equals("(X)")){  
                            return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[4][1].equals("(X)")&&Matrizjuego[4][2].equals("(X)")&&Matrizjuego[4][3].equals("(X)")&&
                   Matrizjuego[4][4].equals("(X)")){  
                            return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[4][1].equals("(X)")&&Matrizjuego[3][2].equals("(X)")&&Matrizjuego[2][3].equals("(X)")&&
                   Matrizjuego[1][4].equals("(X)")){  
                               return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[4][1].equals("(X)")&&Matrizjuego[3][1].equals("(X)")&&Matrizjuego[2][1].equals("(X)")&&
                   Matrizjuego[1][1].equals("(X)")){  
                               return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[3][1].equals("(X)")&&Matrizjuego[3][2].equals("(X)")&&Matrizjuego[3][3].equals("(X)")&&
                   Matrizjuego[3][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[3][1].equals("(X)")&&Matrizjuego[2][1].equals("(X)")&&Matrizjuego[1][0].equals("(X)")&&
                   Matrizjuego[0][1].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[3][1].equals("(X)")&&Matrizjuego[2][2].equals("(X)")&&Matrizjuego[1][3].equals("(X)")&&
                   Matrizjuego[0][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[2][1].equals("(X)")&&Matrizjuego[2][2].equals("(X)")&&Matrizjuego[2][3].equals("(X)")&&
                   Matrizjuego[2][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[2][1].equals("(X)")&&Matrizjuego[3][2].equals("(X)")&&Matrizjuego[4][3].equals("(X)")&&
                   Matrizjuego[5][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[1][1].equals("(X)")&&Matrizjuego[1][2].equals("(X)")&&Matrizjuego[1][3].equals("(X)")&&
                   Matrizjuego[1][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[0][1].equals("(X)")&&Matrizjuego[1][2].equals("(X)")&&Matrizjuego[2][3].equals("(X)")&&
                   Matrizjuego[3][4].equals("(X)")){  
                               return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
            }if(Matrizjuego[0][1].equals("(X)")&&Matrizjuego[0][2].equals("(X)")&&Matrizjuego[0][3].equals("(X)")&&
                   Matrizjuego[0][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }//columna2
            if(Matrizjuego[5][2].equals("(X)")&&Matrizjuego[5][3].equals("(X)")&&Matrizjuego[5][4].equals("(X)")&&
                   Matrizjuego[5][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[5][2].equals("(X)")&&Matrizjuego[4][3].equals("(X)")&&Matrizjuego[3][4].equals("(X)")&&
                   Matrizjuego[2][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[5][2].equals("(X)")&&Matrizjuego[4][2].equals("(X)")&&Matrizjuego[3][2].equals("(X)")&&
                   Matrizjuego[2][2].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[4][2].equals("(X)")&&Matrizjuego[4][3].equals("(X)")&&Matrizjuego[4][4].equals("(X)")&&
                   Matrizjuego[4][3].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[4][2].equals("(X)")&&Matrizjuego[3][2].equals("(X)")&&Matrizjuego[2][2].equals("(X)")&&
                   Matrizjuego[1][2].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[4][2].equals("(X)")&&Matrizjuego[3][3].equals("(X)")&&Matrizjuego[2][4].equals("(X)")&&
                   Matrizjuego[1][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[3][2].equals("(X)")&&Matrizjuego[3][3].equals("(X)")&&Matrizjuego[3][4].equals("(X)")&&
                   Matrizjuego[3][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[3][2].equals("(X)")&&Matrizjuego[2][2].equals("(X)")&&Matrizjuego[1][2].equals("(X)")&&
                   Matrizjuego[0][2].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[3][2].equals("(X)")&&Matrizjuego[2][3].equals("(X)")&&Matrizjuego[1][4].equals("(X)")&&
                   Matrizjuego[0][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[2][2].equals("(X)")&&Matrizjuego[2][3].equals("(X)")&&Matrizjuego[2][4].equals("(X)")&&
                   Matrizjuego[2][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[2][2].equals("(X)")&&Matrizjuego[3][3].equals("(X)")&&Matrizjuego[4][4].equals("(X)")&&
                   Matrizjuego[5][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[1][2].equals("(X)")&&Matrizjuego[1][3].equals("(X)")&&Matrizjuego[1][4].equals("(X)")&&
                   Matrizjuego[1][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[1][2].equals("(X)")&&Matrizjuego[2][3].equals("(X)")&&Matrizjuego[3][4].equals("(X)")&&
                   Matrizjuego[4][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[0][2].equals("(X)")&&Matrizjuego[0][3].equals("(X)")&&Matrizjuego[0][4].equals("(X)")&&
                   Matrizjuego[0][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[0][2].equals("(X)")&&Matrizjuego[1][3].equals("(X)")&&Matrizjuego[2][4].equals("(X)")&&
                   Matrizjuego[3][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }//columna3
                            if(Matrizjuego[5][2].equals("(X)")&&Matrizjuego[5][3].equals("(X)")&&Matrizjuego[5][4].equals("(X)")&&
                   Matrizjuego[5][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[5][3].equals("(X)")&&Matrizjuego[4][3].equals("(X)")&&Matrizjuego[3][3].equals("(X)")&&
                   Matrizjuego[2][3].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[5][3].equals("(X)")&&Matrizjuego[4][4].equals("(X)")&&Matrizjuego[3][5].equals("(X)")&&
                   Matrizjuego[2][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[4][3].equals("(X)")&&Matrizjuego[4][4].equals("(X)")&&Matrizjuego[4][5].equals("(X)")&&
                   Matrizjuego[4][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[4][3].equals("(X)")&&Matrizjuego[3][3].equals("(X)")&&Matrizjuego[2][3].equals("(X)")&&
                   Matrizjuego[1][3].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[4][3].equals("(X)")&&Matrizjuego[3][4].equals("(X)")&&Matrizjuego[2][5].equals("(X)")&&
                   Matrizjuego[1][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[3][3].equals("(X)")&&Matrizjuego[3][4].equals("(X)")&&Matrizjuego[3][5].equals("(X)")&&
                   Matrizjuego[3][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[3][3].equals("(X)")&&Matrizjuego[2][3].equals("(X)")&&Matrizjuego[1][3].equals("(X)")&&
                   Matrizjuego[0][3].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[3][3].equals("(X)")&&Matrizjuego[2][4].equals("(X)")&&Matrizjuego[1][5].equals("(X)")&&
                   Matrizjuego[0][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[2][3].equals("(X)")&&Matrizjuego[2][4].equals("(X)")&&Matrizjuego[2][5].equals("(X)")&&
                   Matrizjuego[2][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[2][3].equals("(X)")&&Matrizjuego[3][4].equals("(X)")&&Matrizjuego[4][5].equals("(X)")&&
                   Matrizjuego[5][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[1][3].equals("(X)")&&Matrizjuego[1][4].equals("(X)")&&Matrizjuego[1][5].equals("(X)")&&
                   Matrizjuego[1][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[1][3].equals("(X)")&&Matrizjuego[2][4].equals("(X)")&&Matrizjuego[3][5].equals("(X)")&&
                   Matrizjuego[4][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[0][3].equals("(X)")&&Matrizjuego[0][4].equals("(X)")&&Matrizjuego[0][5].equals("(X)")&&
                   Matrizjuego[0][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[0][3].equals("(X)")&&Matrizjuego[1][4].equals("(X)")&&Matrizjuego[2][5].equals("(X)")&&
                   Matrizjuego[3][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }//columna4
                            if(Matrizjuego[5][4].equals("(X)")&&Matrizjuego[4][4].equals("(X)")&&Matrizjuego[3][4].equals("(X)")&&
                   Matrizjuego[2][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[4][4].equals("(X)")&&Matrizjuego[3][4].equals("(X)")&&Matrizjuego[2][4].equals("(X)")&&
                   Matrizjuego[1][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[3][4].equals("(X)")&&Matrizjuego[2][4].equals("(X)")&&Matrizjuego[1][4].equals("(X)")&&
                   Matrizjuego[0][4].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }//columna5
                            if(Matrizjuego[5][5].equals("(X)")&&Matrizjuego[4][5].equals("(X)")&&Matrizjuego[3][5].equals("(X)")&&
                   Matrizjuego[2][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[4][5].equals("(X)")&&Matrizjuego[3][5].equals("(X)")&&Matrizjuego[2][5].equals("(X)")&&
                   Matrizjuego[1][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[3][5].equals("(X)")&&Matrizjuego[2][5].equals("(X)")&&Matrizjuego[1][5].equals("(X)")&&
                   Matrizjuego[0][5].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }//columna6
                             if(Matrizjuego[5][6].equals("(X)")&&Matrizjuego[4][6].equals("(X)")&&Matrizjuego[3][6].equals("(X)")&&
                   Matrizjuego[2][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[4][6].equals("(X)")&&Matrizjuego[3][6].equals("(X)")&&Matrizjuego[2][6].equals("(X)")&&
                   Matrizjuego[1][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }if(Matrizjuego[3][6].equals("(X)")&&Matrizjuego[2][6].equals("(X)")&&Matrizjuego[1][6].equals("(X)")&&
                   Matrizjuego[0][6].equals("(X)")){  
                                  return "¡Felicidades!...el jugador "+jugador1+" a ganado la partida";
                            }
        
               if(Estado==false){
                   this.turno2="j2";
            if(Matrizjuego[5][0].equals("(O)")&&Matrizjuego[5][1].equals("(O)")&&Matrizjuego[5][2].equals("(O)")&&
                   Matrizjuego[5][3].equals("(O)")){  
                return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            } if(Matrizjuego[5][0].equals("(O)")&&Matrizjuego[4][1].equals("(O)")&&Matrizjuego[3][2].equals("(O)")&&
                   Matrizjuego[2][3].equals("(O)")){  
            return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[5][0].equals("(O)")&&Matrizjuego[4][0].equals("(O)")&&Matrizjuego[3][0].equals("(O)")&&
                   Matrizjuego[2][0].equals("(O)")){  
            return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[4][0].equals("(O)")&&Matrizjuego[4][1].equals("(O)")&&Matrizjuego[4][2].equals("(O)")&&
                   Matrizjuego[4][3].equals("(O)")){  
            return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
         }if(Matrizjuego[4][0].equals("(O)")&&Matrizjuego[3][1].equals("(O)")&&Matrizjuego[2][2].equals("(O)")&&
                   Matrizjuego[1][3].equals("(O)")){  
            return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
         }if(Matrizjuego[4][0].equals("(O)")&&Matrizjuego[3][0].equals("(O)")&&Matrizjuego[2][0].equals("(O)")&&
                   Matrizjuego[1][0].equals("(O)")){  
               return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
         }if(Matrizjuego[3][0].equals("(O)")&&Matrizjuego[3][1].equals("(O)")&&Matrizjuego[3][2].equals("(O)")&&
                   Matrizjuego[3][3].equals("(O)")){  
                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
         } if(Matrizjuego[3][0].equals("(O)")&&Matrizjuego[2][1].equals("(O)")&&Matrizjuego[1][2].equals("(O)")&&
                   Matrizjuego[0][3].equals("(O)")){  
               return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
             }  if(Matrizjuego[3][0].equals("(O)")&&Matrizjuego[2][0].equals("(O)")&&Matrizjuego[1][0].equals("(O)")&&
                   Matrizjuego[0][0].equals("(O)")){  
                   return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[2][0].equals("(O)")&&Matrizjuego[2][1].equals("(O)")&&Matrizjuego[2][2].equals("(O)")&&
                   Matrizjuego[2][3].equals("(O)")){ 
         return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[2][0].equals("(O)")&&Matrizjuego[3][1].equals("(O)")&&Matrizjuego[4][2].equals("(O)")&&
                   Matrizjuego[5][3].equals("(O)")){  
           return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[1][0].equals("(O)")&&Matrizjuego[1][1].equals("(O)")&&Matrizjuego[1][2].equals("(O)")&&
                   Matrizjuego[1][3].equals("(O)")){  
            return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                }if(Matrizjuego[1][0].equals("(O)")&&Matrizjuego[2][1].equals("(O)")&&Matrizjuego[3][2].equals("(O)")&&
                   Matrizjuego[4][3].equals("(O)")){  
            return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                }if(Matrizjuego[0][0].equals("(O)")&&Matrizjuego[0][1].equals("(O)")&&Matrizjuego[0][2].equals("(O)")&&
                   Matrizjuego[0][3].equals("(O)")){ 
                    return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[0][0].equals("(O)")&&Matrizjuego[1][1].equals("(O)")&&Matrizjuego[2][2].equals("(O)")&&
                   Matrizjuego[3][3].equals("(O)")){  
                       return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[1][1].equals("(O)")&&Matrizjuego[2][2].equals("(O)")&&Matrizjuego[3][3].equals("(O)")&&
                   Matrizjuego[4][4].equals("(O)")){  
                   return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                    }
            //columna1 
            if(Matrizjuego[5][1].equals("(O)")&&Matrizjuego[5][2].equals("(O)")&&Matrizjuego[5][3].equals("(O)")&&
                   Matrizjuego[5][4].equals("(O)")){  
                return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[5][1].equals("(O)")&&Matrizjuego[4][2].equals("(O)")&&Matrizjuego[3][3].equals("(O)")&&
                   Matrizjuego[2][4].equals("(O)")){  
                 return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[5][1].equals("(O)")&&Matrizjuego[4][1].equals("(O)")&&Matrizjuego[3][1].equals("(O)")&&
                   Matrizjuego[2][1].equals("(O)")){  
                    return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[4][1].equals("(O)")&&Matrizjuego[4][2].equals("(O)")&&Matrizjuego[4][3].equals("(O)")&&
                   Matrizjuego[4][4].equals("(O)")){  
                       return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[4][1].equals("(O)")&&Matrizjuego[3][2].equals("(O)")&&Matrizjuego[2][3].equals("(O)")&&
                   Matrizjuego[1][4].equals("(O)")){  
                          return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
            }if(Matrizjuego[4][1].equals("(O)")&&Matrizjuego[3][1].equals("(O)")&&Matrizjuego[2][1].equals("(O)")&&
                   Matrizjuego[1][1].equals("(O)")){  
                       return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                    } if(Matrizjuego[3][1].equals("(O)")&&Matrizjuego[3][2].equals("(O)")&&Matrizjuego[3][3].equals("(O)")&&
                   Matrizjuego[3][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][1].equals("(O)")&&Matrizjuego[2][1].equals("(O)")&&Matrizjuego[1][0].equals("(O)")&&
                   Matrizjuego[0][1].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][1].equals("(O)")&&Matrizjuego[2][2].equals("(O)")&&Matrizjuego[1][3].equals("(O)")&&
                   Matrizjuego[0][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[2][1].equals("(O)")&&Matrizjuego[2][2].equals("(O)")&&Matrizjuego[2][3].equals("(O)")&&
                   Matrizjuego[2][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[2][1].equals("(O)")&&Matrizjuego[3][2].equals("(O)")&&Matrizjuego[4][3].equals("(O)")&&
                   Matrizjuego[5][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[1][1].equals("(O)")&&Matrizjuego[1][2].equals("(O)")&&Matrizjuego[1][3].equals("(O)")&&
                   Matrizjuego[1][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[0][1].equals("(O)")&&Matrizjuego[1][2].equals("(O)")&&Matrizjuego[2][3].equals("(O)")&&
                   Matrizjuego[3][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[0][1].equals("(O)")&&Matrizjuego[0][2].equals("(O)")&&Matrizjuego[0][3].equals("(O)")&&
                   Matrizjuego[0][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }//columna2
                            if(Matrizjuego[5][2].equals("(O)")&&Matrizjuego[5][3].equals("(O)")&&Matrizjuego[5][4].equals("(O)")&&
                   Matrizjuego[5][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[5][2].equals("(O)")&&Matrizjuego[4][3].equals("(O)")&&Matrizjuego[3][4].equals("(O)")&&
                   Matrizjuego[2][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }
                }if(Matrizjuego[5][2].equals("(O)")&&Matrizjuego[4][2].equals("(O)")&&Matrizjuego[3][2].equals("(O)")&&
                   Matrizjuego[2][2].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[4][2].equals("(O)")&&Matrizjuego[4][3].equals("(O)")&&Matrizjuego[4][4].equals("(O)")&&
                   Matrizjuego[4][3].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[4][2].equals("(O)")&&Matrizjuego[3][2].equals("(O)")&&Matrizjuego[2][2].equals("(O)")&&
                   Matrizjuego[1][2].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[4][2].equals("(O)")&&Matrizjuego[3][3].equals("(O)")&&Matrizjuego[2][4].equals("(O)")&&
                   Matrizjuego[1][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][2].equals("(O)")&&Matrizjuego[3][3].equals("(O)")&&Matrizjuego[3][4].equals("(O)")&&
                   Matrizjuego[3][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][2].equals("(O)")&&Matrizjuego[2][2].equals("(O)")&&Matrizjuego[1][2].equals("(O)")&&
                   Matrizjuego[0][2].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][2].equals("(O)")&&Matrizjuego[2][3].equals("(O)")&&Matrizjuego[1][4].equals("(O)")&&
                   Matrizjuego[0][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[2][2].equals("(O)")&&Matrizjuego[2][3].equals("(O)")&&Matrizjuego[2][4].equals("(O)")&&
                   Matrizjuego[2][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[2][2].equals("(O)")&&Matrizjuego[3][3].equals("(O)")&&Matrizjuego[4][4].equals("(O)")&&
                   Matrizjuego[5][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[1][2].equals("(O)")&&Matrizjuego[1][3].equals("(O)")&&Matrizjuego[1][4].equals("(O)")&&
                   Matrizjuego[1][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[1][2].equals("(O)")&&Matrizjuego[2][3].equals("(O)")&&Matrizjuego[3][4].equals("(O)")&&
                   Matrizjuego[4][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[0][2].equals("(O)")&&Matrizjuego[0][3].equals("(O)")&&Matrizjuego[0][4].equals("(O)")&&
                   Matrizjuego[0][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[0][2].equals("(O)")&&Matrizjuego[1][3].equals("(O)")&&Matrizjuego[2][4].equals("(O)")&&
                   Matrizjuego[3][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }//columna3
                            if(Matrizjuego[5][2].equals("(O)")&&Matrizjuego[5][3].equals("(O)")&&Matrizjuego[5][4].equals("(O)")&&
                   Matrizjuego[5][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[5][3].equals("(O)")&&Matrizjuego[4][3].equals("(O)")&&Matrizjuego[3][3].equals("(O)")&&
                   Matrizjuego[2][3].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[5][3].equals("(O)")&&Matrizjuego[4][4].equals("(O)")&&Matrizjuego[3][5].equals("(O)")&&
                   Matrizjuego[2][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[4][3].equals("(O)")&&Matrizjuego[4][4].equals("(O)")&&Matrizjuego[4][5].equals("(O)")&&
                   Matrizjuego[4][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[4][3].equals("(O)")&&Matrizjuego[3][3].equals("(O)")&&Matrizjuego[2][3].equals("(O)")&&
                   Matrizjuego[1][3].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[4][3].equals("(O)")&&Matrizjuego[3][4].equals("(O)")&&Matrizjuego[2][5].equals("(O)")&&
                   Matrizjuego[1][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][3].equals("(O)")&&Matrizjuego[3][4].equals("(O)")&&Matrizjuego[3][5].equals("(O)")&&
                   Matrizjuego[3][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][3].equals("(O)")&&Matrizjuego[2][3].equals("(O)")&&Matrizjuego[1][3].equals("(O)")&&
                   Matrizjuego[0][3].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][3].equals("(O)")&&Matrizjuego[2][4].equals("(O)")&&Matrizjuego[1][5].equals("(O)")&&
                   Matrizjuego[0][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[2][3].equals("(O)")&&Matrizjuego[2][4].equals("(O)")&&Matrizjuego[2][5].equals("(O)")&&
                   Matrizjuego[2][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[2][3].equals("(O)")&&Matrizjuego[3][4].equals("(O)")&&Matrizjuego[4][5].equals("(O)")&&
                   Matrizjuego[5][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[1][3].equals("(O)")&&Matrizjuego[1][4].equals("(O)")&&Matrizjuego[1][5].equals("(O)")&&
                   Matrizjuego[1][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[1][3].equals("(O)")&&Matrizjuego[2][4].equals("(O)")&&Matrizjuego[3][5].equals("(O)")&&
                   Matrizjuego[4][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[0][3].equals("(O)")&&Matrizjuego[0][4].equals("(O)")&&Matrizjuego[0][5].equals("(O)")&&
                   Matrizjuego[0][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[0][3].equals("(O)")&&Matrizjuego[1][4].equals("(O)")&&Matrizjuego[2][5].equals("(O)")&&
                   Matrizjuego[3][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }//columna4
                            if(Matrizjuego[5][4].equals("(O)")&&Matrizjuego[4][4].equals("(O)")&&Matrizjuego[3][4].equals("(O)")&&
                   Matrizjuego[2][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[4][4].equals("(O)")&&Matrizjuego[3][4].equals("(O)")&&Matrizjuego[2][4].equals("(O)")&&
                   Matrizjuego[1][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][4].equals("(O)")&&Matrizjuego[2][4].equals("(O)")&&Matrizjuego[1][4].equals("(O)")&&
                   Matrizjuego[0][4].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }//columna5
                            if(Matrizjuego[5][5].equals("(O)")&&Matrizjuego[4][5].equals("(O)")&&Matrizjuego[3][5].equals("(O)")&&
                   Matrizjuego[2][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[4][5].equals("(O)")&&Matrizjuego[3][5].equals("(O)")&&Matrizjuego[2][5].equals("(O)")&&
                   Matrizjuego[1][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][5].equals("(O)")&&Matrizjuego[2][5].equals("(O)")&&Matrizjuego[1][5].equals("(O)")&&
                   Matrizjuego[0][5].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }//columna6
                            if(Matrizjuego[5][6].equals("(O)")&&Matrizjuego[4][6].equals("(O)")&&Matrizjuego[3][6].equals("(O)")&&
                   Matrizjuego[2][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[4][6].equals("(O)")&&Matrizjuego[3][6].equals("(O)")&&Matrizjuego[2][6].equals("(O)")&&
                   Matrizjuego[1][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }if(Matrizjuego[3][6].equals("(O)")&&Matrizjuego[2][6].equals("(O)")&&Matrizjuego[1][6].equals("(O)")&&
                   Matrizjuego[0][6].equals("(O)")){  
                                  return "¡Felicidades!...el jugador "+jugador2+" a ganado la partida";
                            }
                           if(c==0){
                               //Los siguientes if son para saber si la partida ha quedado empate
            if(Matrizjuego[0][0].equals("(X)")||Matrizjuego[0][0].equals("(O)")){
                a=1;
                b+=a;
                c++;
            }
                           }
            if(d==0){
            if(Matrizjuego[0][1].equals("(X)")||Matrizjuego[0][1].equals("(O)")){
                a=1;
                b+=a;
                d++;
            }
            }if(e==0){
            if(Matrizjuego[0][2].equals("(X)")||Matrizjuego[0][2].equals("(O)")){
                a=1;
                b+=a;
                e++;
            }
            }if(f==0){
            if(Matrizjuego[0][3].equals("(X)")||Matrizjuego[0][3].equals("(O)")){
                a=1;
                b+=a;
            f++;
            }
            }if(g==0){
            if( Matrizjuego[0][4].equals("(X)")||Matrizjuego[0][4].equals("(O)")){
                a=1;
                b+=a;
            g++;
            }
            }if(h==0){
                if(Matrizjuego[0][5].equals("(X)")||Matrizjuego[0][5].equals("(O)")){
                a=1;
                b+=a;
                h++;
                }
            }if(k==0){
            if(  Matrizjuego[0][6].equals("(X)")||Matrizjuego[0][6].equals("(O)")){
                a=1;
            b+=a;
                k++;
            }
            }
           ;
        if(b==7){
             return "La partida ha terminado empate";
             }
            }
            }
            
        return " \"Aún no hay un 4 en línea...por favor continue su juego\";";
} 
    public String Ganador(boolean Estado, int opcion2, String jugador2, String jugador1, String turno2) {

        if (opcion2 == 5 && this.turno2.equals("j2") || opcion2 == 8 && this.turno1.equals("j1")) {
            return "Ganador de la partida" + ": " + jugador2;
        }
        return "Perdedor de la partida" + ": " + jugador2;
    }

    public String Ganador2(boolean Estado, int opcion2, String jugador1, String jugador2, String turno1) {

        if (opcion2 == 5 && this.turno1.equals("j1") || opcion2 == 8 && this.turno1.equals("j2")) {
            return "Ganador de la partida" + ": " + jugador1;
        }
        return "Perdedor de la partida" + ": " + jugador1;
    }

}
   

