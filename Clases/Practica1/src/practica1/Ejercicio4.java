/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import sun.org.mozilla.javascript.internal.ScriptRuntime;

/**
 *
 * @author Luis B
 */
public class Ejercicio4 {
    
    public int Numeros(String hilera){
        String temporal="";
        for (int i = 0; i <hilera.length(); i++) {
            if((hilera.charAt(i)=='1')||
              (hilera.charAt(i)=='2')||
              (hilera.charAt(i)=='3')||
              (hilera.charAt(i)=='4')||
              (hilera.charAt(i)=='5')||
              (hilera.charAt(i)=='6')||
              (hilera.charAt(i)=='7')||
              (hilera.charAt(i)=='8')||
              (hilera.charAt(i)=='9')||
              (hilera.charAt(i)=='0')){
            temporal+=hilera.charAt(i);
        }
                    }
        return Integer.parseInt(temporal);
    }
    
}
