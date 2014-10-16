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
public class Ejercicio2 {
    int[]Vector=new int[4];
    int[]Vector2=new int[4];
    int[]Vector3= new int[4];
    public void Vector1(int vector){
        for (int i = 0; i <Vector.length; i++) {
            if (Vector[i]==0) {
                Vector[i]=vector;
                break;
            }
        }
    }
    public void Vector2(int vector2){
        for (int i = 0; i <Vector2.length; i++) {
            if (Vector2[i]==0) {
                Vector2[i]=vector2;
            break;
            }
        }
    }
    public int VectorFinal(){
        int acum=0,acum2=0,suma=0,suma2=0;
        int vect=0;
        for (int i = 0; i <Vector.length&&i<Vector2.length; i++) {
        acum=Vector[i];
        acum2=Vector2[i];
        suma=acum+acum2;
        Vector3[i]=suma;
        vect+=Vector3[i];
           
        }
        return vect;
            }
    }

