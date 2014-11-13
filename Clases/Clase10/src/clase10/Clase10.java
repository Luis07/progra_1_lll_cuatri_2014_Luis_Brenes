/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10;

/**
 *
 * @author Luis B
 */
public class Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Ordenamiento por seleccion
       OrdenamientoSeleccion ordenamientoSeleccion= new OrdenamientoSeleccion();
       int[]arreglito={8,5,2,6,0};
     int[]temporal=  ordenamientoSeleccion.OrdenSeleccion(arreglito, "A");
        for (int i = 0; i <temporal.length; i++) {
            System.out.print(temporal[i]);
        }
        System.out.println();
    
    OrdenamientoBurbuja ordenamientoBurbuja=new OrdenamientoBurbuja();
      temporal= ordenamientoBurbuja.OrdenamientoB(arreglito, "A");
for (int i = 0; i <temporal.length; i++) {
            System.out.print(temporal[i]);
        }
    
    
    OrdenamientoporIncersión ordenamientoporIncersión= new OrdenamientoporIncersión();
       temporal= ordenamientoporIncersión.Ordeninsercion(arreglito, "A");
       for (int i = 0; i <temporal.length; i++) {
            System.out.print(temporal[i]);
        }
    
}
}