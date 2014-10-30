/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

/**
 *
 * @author Luis B
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Ejercicio1 oEjercicio1= new Ejercicio1();
   oEjercicio1.CrearMatriz(3, 5);
   oEjercicio1.Cargamatriz();
        System.out.println(oEjercicio1.mprimir()+"\n");
       
        Ejercicio2 oEjercicio2= new Ejercicio2();
        oEjercicio2.CrearMatriz(4, 4);
        oEjercicio2.CargarMatriz();
        System.out.println(oEjercicio2.Imprimir());
           }
    
}
