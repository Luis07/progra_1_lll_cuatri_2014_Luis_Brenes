/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaestructurasdedatos;

import ListaEjercicio1.ListaEjercicio1;
import java.util.Scanner;
import Nodos.NodoEjercicio1;
/**
 *
 * @author Luis B
 */
public class TareaEstructurasDedatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=1,num=0,arreglo[] = new int[10] ;
        int indice,indice2,auxiliar;
        Scanner oScanner= new Scanner(System.in);
        NodoEjercicio1 oNodoEjercicio1= new NodoEjercicio1();
        ListaEjercicio1 oListaEjercicio1= new ListaEjercicio1();
        oScanner= new Scanner(System.in);
         
                   for (int i = 0; numero>=0; i++) {
   System.out.println("Digite un numero, puede digitar el numero 0 si desea terminar");
                      numero= oScanner.nextInt();
                      if(numero!=0){
                          arreglo[i]=numero;
                    }else{
                          break;
                      }
                   }      
                for (indice = 0; indice < arreglo.length-1; indice++) {
                if(arreglo[indice]==0){
                    break;
                }
                auxiliar=arreglo[indice];
                for (indice2 = indice-1;indice2  >= 0&&arreglo[indice2]<auxiliar; indice2--) {
                arreglo[indice2+1]=arreglo[indice2];
                arreglo[indice2]=auxiliar;
                oNodoEjercicio1.setNum(arreglo);
                }
                ListaEjercicio1 oListaEjercicio11= new ListaEjercicio1();
                oListaEjercicio1.Insertar(oNodoEjercicio1);
                
         }
                System.out.println(oListaEjercicio1.NumNodos());
    }
}

