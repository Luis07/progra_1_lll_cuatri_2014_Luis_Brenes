/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

/**
 *
 * @author Luis B
 */
public class Lista {
    private NododeLista raiz;
    public void Insertar(NododeLista elemento){
        NododeLista nuevo;
        nuevo= new NododeLista();
        nuevo.setMatricula(elemento.getMatricula());
        nuevo.setDueño(elemento.getDueño());
        nuevo.setMarca(elemento.getMarca());
        if(raiz==null ){
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }else{
            NododeLista auxiliar=raiz;
            while(auxiliar.getSiguiente()!=null){//para llegar al ultimo elemento del nodo
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    public void Imprimir(){//para imprimir los elementos de la lista
        NododeLista recorrido= raiz;
        System.out.println("Listado de los elemntos de la lista");
        while(recorrido!=null){
            System.out.println("La marca es: "+recorrido.getMarca()+ " El dueño es: "+recorrido.getDueño()+
                    " La Matrícula es: "+recorrido.getMatricula());
            recorrido=recorrido.getSiguiente();
        }
        System.out.println();
    }
 public void eliminarelemento(){
     
 }   

}