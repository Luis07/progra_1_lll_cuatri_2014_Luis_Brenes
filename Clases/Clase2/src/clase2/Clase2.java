/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean Validar=true;
    int opcion;
    char continuar;
    double monto;
    
    CuentaBancaria oCuentaBancaria= new CuentaBancaria();
    Scanner teclado= new Scanner(System.in);
    while(Validar)
    {
        System.out.println("Digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
        teclado= new Scanner(System.in);
        opcion= teclado.nextInt();
        if(opcion==1)
        {
            System.out.println("Digite el monto a depositar");
            monto=teclado.nextDouble();
            oCuentaBancaria.Deposito(monto);
            }
        if(opcion==2){
            System.out.println("Digite el monto a retirar");
            
            monto=teclado.nextDouble();
            oCuentaBancaria.retiro(monto);
            if(oCuentaBancaria.isHayError()){
                System.out.println("El monto que usted va a retirar o puede ser retirado");
            }
        }
        System.out.println("El saldo final es de"+oCuentaBancaria.getSaldoinicial());
        System.out.println("Desea continuar con otra transaccion S/N");
        teclado= new Scanner(System.in);
        continuar=teclado.nextLine().charAt(0);
        if(continuar=='S'||continuar=='s'){
            Validar=true;
        }
        if(continuar=='N'||continuar=='n'){
            Validar=false;
            }
        }
    }
    
}
