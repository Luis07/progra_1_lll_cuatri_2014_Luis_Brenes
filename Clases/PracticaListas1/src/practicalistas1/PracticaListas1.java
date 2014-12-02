/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalistas1;

import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class PracticaListas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner oScanner= new Scanner(System.in);
        System.out.println("Digite la cantidad de palabras a insetar");
        int cantidad=oScanner.nextInt();
        ListaPalabras oListaPalabras= new ListaPalabras();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserte la palabra"+(i+1));
            oScanner=new Scanner(System.in);
            String palabra=oScanner.nextLine();
            NodoPalabras oNodoPalabras=new NodoPalabras();
            oNodoPalabras.setPalabra(palabra);
            
            if(oListaPalabras.Duplicado(palabra)){
                 System.out.println("Palabra duplicada");
                i--;
            }else{
                oListaPalabras.Insertar(oNodoPalabras);
            }
        }
        System.out.println(oListaPalabras.Imprimir());
       
    }
    
}
