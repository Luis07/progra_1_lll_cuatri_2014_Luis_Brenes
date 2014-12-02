/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalistas1;

/**
 *
 * @author Greivin
 */
public class ListaPalabras {
    private NodoPalabras raiz;
    
    public void Insertar(NodoPalabras elemento){
        
        NodoPalabras nuevo;
        nuevo= new NodoPalabras();
        nuevo.setPalabra(elemento.getPalabra());
       
        
        if (raiz==null){
            raiz=nuevo;
        }
        else
        {
            NodoPalabras auxiliar=raiz;
            while (auxiliar.getNodopalabras()!=null){
                auxiliar=auxiliar.getNodopalabras();
            }
            auxiliar.setNodopalabras(nuevo);
        }
        
    }
    
    public boolean Duplicado (String palabra){
        NodoPalabras auxiliar=raiz;
        while(auxiliar!=null){
            if(auxiliar.getPalabra().equals(palabra))
                return true;
            else
                auxiliar=auxiliar.getNodopalabras();
        }
        return false;
    }
    public String Imprimir (){
        String retorno="";
        NodoPalabras auxiliar=raiz;
        while(auxiliar!=null){
            retorno+=auxiliar.getPalabra();
            auxiliar=auxiliar.getNodopalabras();
        }
        return retorno;
    }
    
}
