/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

/**
 *
 * @author Luis B
 */
public class OrdenamientoLíneal {
public int BusquedaLíneal(int[]arreglo,int elemento){
    for (int i = 0; i < arreglo.length; i++) {
        if(arreglo[i]==elemento){
            return i;
        }else{
            
        }
    }
    return -1;
}    
}
