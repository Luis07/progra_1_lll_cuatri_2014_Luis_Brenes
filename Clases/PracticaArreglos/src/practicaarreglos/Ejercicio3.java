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
public class Ejercicio3 {
    int[]CursoA= new int[5];
    int[]CursoB= new int[5];
    int pmayor=0;
    public void Promedio(int cursoa){
        int acum=0,acum2=0;
        int promedio=0,promedio2;
        for (int i = 0; i <CursoA.length ; i++) {
            if (CursoA[i]==0) {
                CursoA[i]=cursoa;
                break;
            }
        }
        
        }
    public void Promedio2(int cursob){
        int acum2=0,promedio2=0; 
        for (int i = 0; i <CursoB.length; i++) {
            if(CursoB[i]==0){
                CursoB[i]=cursob;
            break;    
            }
            } 
        }
public String Mayor(){
    int acum=0,acum2=0,promedio=0,promedio2=0; 
    for (int i = 0; i <CursoA.length; i++) {
                acum+=(int)CursoA[i];
    }
    promedio=acum/5;
       for (int i = 0; i <CursoB.length; i++) {
                acum2+=(int)CursoB[i];
    }
           promedio2=acum2/5;
    if(promedio>promedio2){
        return"El grupo A obtuvo mayor pormedio general";
    }
      return"El grupo B obtuvo mayor pormedio general";
}    
}
