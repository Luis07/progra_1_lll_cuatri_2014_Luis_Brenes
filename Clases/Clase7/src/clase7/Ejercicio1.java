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
public class Ejercicio1 {
double[]salarios=new double[5];
//Aquí pregunta si hay datos en el array,si no los hay los guarda con salarios[i]=salario
public void AgregarSalario(double salario){
    for(int i=0;i<salarios.length;i++){
        if(salarios[i]==0){
            salarios[i]=salario;
            break;
        }
    }      
}    
public String imprimirSueldos(){
    String imprimir="";
    for(int i=0;i<salarios.length;i++){
        imprimir+="El Salario del trabajador #"+(i+1)+"es de"+salarios[i]+"\n";
    }
    return imprimir;
}
}
