/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author Luis B
 */
public class CuentaBancaria {
private double Saldoinicial;
private boolean hayError;
//Metodo constructor
public CuentaBancaria(){
    Saldoinicial=0;
    hayError=false;
} 

    public double getSaldoinicial() {
        return Saldoinicial;
    }

    public void setSaldoinicial(double Saldoinicial) {
        this.Saldoinicial = Saldoinicial;
    }

    public boolean isHayError() {
        return hayError;
    }

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

}
