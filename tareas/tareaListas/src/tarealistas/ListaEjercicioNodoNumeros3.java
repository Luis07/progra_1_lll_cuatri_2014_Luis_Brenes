/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealistas;

/**
 *
 * @author Luis B
 */
public class ListaEjercicioNodoNumeros3 {
    private NodoNumero3 raiz;
       public void Insertar(NodoNumero3 elemento){
        NodoNumero3 nuevo;
        nuevo= new NodoNumero3();
        nuevo.setNumero(elemento.getNumero());
        if(raiz==null ){//de aqui para insertar otro cuando ya esta creado algo
            raiz=nuevo;
        }else{
          NodoNumero3 auxiliar=raiz;//variable auxiliar que recorre la lista hasta llegar a null
            while(auxiliar.getSiguiente()!=null){//para llegar al ultimo elemento del nodo
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
        public String Impresion(){
    NodoNumero3 cambio =null;
    String Cambio="";
    NodoNumero3 auxiliar=raiz;//variable auxiliar que recorre la lista hasta llegar a null
            while(auxiliar!=null){//para llegar al ultimo elemento del nodo
        if(auxiliar.numero<0){
            Cambio+="0"+"\n";
            auxiliar=auxiliar.getSiguiente();
        }else{
             Cambio+=auxiliar.numero+"\n";
            auxiliar=auxiliar.getSiguiente();
        }
           
}    return Cambio;
}
 
}
