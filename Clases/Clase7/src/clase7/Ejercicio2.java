/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Luis B
 */
public class Ejercicio2 {
    
private float[]alturas=new float[5];
public void AgregarAltura(float altura){
    for(int i=0;i<alturas.length;i++){
        if(alturas[i]==0){
            alturas[i]=altura;
            break;
        }
    }
}
public float Promedio(){
    float sumaPromedio=0,promedio=0;
    for(int i=0;i<alturas.length;i++){
    sumaPromedio+=alturas[i];
}
    promedio=sumaPromedio/alturas.length;
    return promedio;
}
public String ContarPersonas(){
    String PersonasBajas="",personasAltas="",Retorno="" ;
    float promedio=this.Promedio();
    for(int i=0;i<alturas.length;i++){
        if(alturas[i]>promedio){
            personasAltas+="La persona #"+(i+1)+"es alta"+"\n";
        }else{
            PersonasBajas+="La persona #"+(i+1)+"es baja"+"\n";
        }
    }
   Retorno=personasAltas+"\n"+PersonasBajas;
   return Retorno;
}
}
