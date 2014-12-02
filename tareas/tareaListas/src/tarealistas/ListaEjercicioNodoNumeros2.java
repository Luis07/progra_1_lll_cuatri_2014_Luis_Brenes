/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealistas;

import java.util.Random;

/**
 *
 * @author Luis B
 */
public class ListaEjercicioNodoNumeros2 {
        private NodoNumeros2 raiz;
  
    public void Insertar(NodoNumeros2 elemento){
        NodoNumeros2 nuevo;
        nuevo= new NodoNumeros2();
        nuevo.setRandom(elemento.getRandom());
           if(raiz==null ){//de aqui para insertar otro cuando ya esta creado algo
               raiz=nuevo;
            nuevo.setSiguiente(null);
           }else{
           NodoNumeros2 auxiliar=raiz;//variable auxiliar que recorre la lista hasta llegar a null
            while(auxiliar.getSiguiente()!=null){//para llegar al ultimo elemento del nodo
                auxiliar=auxiliar.getSiguiente();
            }
           auxiliar.setSiguiente(nuevo);
        }
       }
    public  String impresion(){
        String cambio="",ListaInicial="";
        NodoNumeros2 auxiliar=raiz;
        while (auxiliar!=null) {
     ListaInicial+=auxiliar.getRandom()+"\n";
            cambio+=auxiliar.getRandom()*auxiliar.getRandom()+"\n";
     auxiliar=auxiliar.getSiguiente();
        }
            return "La lista generada fue: "+ListaInicial+"\n"+
            "La nueva lista es: "+cambio;
    }
}
