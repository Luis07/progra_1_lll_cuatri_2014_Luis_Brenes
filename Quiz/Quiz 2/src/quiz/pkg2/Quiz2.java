/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg2;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Listanumero oListanumero= new Listanumero();
        Nodonumero nodonumero;
        Scanner oScanner= new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            nodonumero= new  Nodonumero();
            System.out.println("Digite un numero del 1 al 10");
            nodonumero.setNumero(oScanner.nextInt());
            oListanumero.Insertar(nodonumero);
            
        }
        System.out.println(oListanumero.Contadornumeros());
        
    }
    
}
