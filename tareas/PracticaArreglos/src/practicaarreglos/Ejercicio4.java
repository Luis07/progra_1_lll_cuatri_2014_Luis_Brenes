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
public class Ejercicio4 {
    int[]Vector= new int[10];
    public void Vector(int vector){
        for (int i = 0; i < Vector.length; i++) {
            if (Vector[i]==0) {
                Vector[i]=vector;
                break;
            }
        }
    }
    public String orden(){
        int acum=0,acum1=0,acum2=0,acum3=0,acum4=0,acum5=0,acum6=0,acum7=0,acum8=0,acum9=0;
        for (int i = 0; i <Vector.length; i++) {
                acum=Vector[0];
                acum1=Vector[1];
                acum2=Vector[2];
                acum3=Vector[3];
                acum4=Vector[4];
                acum5=Vector[5];
                acum6=Vector[6];
                acum7=Vector[7];
                acum8=Vector[8];
                acum9=Vector[9];
        }
        if(acum<acum1&&acum1<acum2&&acum2<acum3&&acum3<acum4&&acum4<acum5
                &&acum5<acum6&&acum6<acum7&&acum7<acum8&&acum8<acum9){
      return "Si está ordenado de menor a mayor";      
        }
        return "No está ordenado de menor a mayor";
    }
}
