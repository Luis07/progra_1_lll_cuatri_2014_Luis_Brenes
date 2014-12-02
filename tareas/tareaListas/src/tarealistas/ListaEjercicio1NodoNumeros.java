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
public class ListaEjercicio1NodoNumeros {
    private NodoNumeros raiz;
   
    public void Insertar(NodoNumeros elemento){
        NodoNumeros nuevo;
        nuevo= new NodoNumeros();
        nuevo.setNumero(elemento.getNumero());
        if(raiz==null ){//de aqui para insertar otro cuando ya esta creado algo
            raiz=nuevo;
        }else{
           NodoNumeros auxiliar=raiz;//variable auxiliar que recorre la lista hasta llegar a null
            while(auxiliar.getSiguiente()!=null){//para llegar al ultimo elemento del nodo
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    public String Listapares(){
    NodoNumeros par=null;
    String pares="",impares="",Original="";
    NodoNumeros auxiliar=raiz;//variable auxiliar que recorre la lista hasta llegar a null
            while(auxiliar!=null){//para llegar al ultimo elemento del nodo
        if(auxiliar.numero%2==0){
            pares+=auxiliar.numero+"\n";
            Original+=auxiliar.numero+"\n";
            auxiliar=auxiliar.getSiguiente();
        }else{
            impares+=auxiliar.numero+"\n";
             Original+=auxiliar.numero+"\n";
            auxiliar=auxiliar.getSiguiente();
        }
           
}    return "La Lista Original es "+Original+"\n"+"Los numeros Pares De La Lista Son: "+pares+"\n"+
                "Los numeros Impares De La Lista Son: "+impares;
}
}