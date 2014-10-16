/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarreglos;

/**
 *
 * @author Luis B
 */
public class Ejercicio1 {
double Vector[]= new double[8];
public void agregarvalores(double vector){
     double acum=0;
    for (int i = 0; i <Vector.length; i++) {
        if(Vector[i]==0){
            Vector[i]=vector;
            acum=acum+ Vector[i];
       break;
        }
    }
    
}
    public double AcumulacionVector(){
        double acum=0;
        for (int i = 0; i <Vector.length; i++) {
                acum+=Vector[i];
            
        }
        return acum;
    } 
    public String AcumuladodeElementos(){
        double acum=0;
        String suma="",suma2="";
        String acum1="";
        int aum=0;
        int i2=0;
        for(int i=0;i<Vector.length;i++){
            acum+=Vector[i];
            suma+=Vector[i]+";";
            i2++;
            if(acum>=36){
                suma2+=suma+"\n";
                acum=0;
                suma="";
        }if(i2>=Vector.length){
             aum=aum+1;
                i=aum-1;
                acum=0;
                suma="";
                i2=aum;
               
        }
    }
    return suma2;
}
    public int CantidadMayor(){
        int acum=0,acum2=0;
        for (int i = 0; i < Vector[i]; i++) {
            acum=(int)Vector[i];    
            if(acum>50){
                acum2++;
            }
        }
        return acum2;
    }
}
