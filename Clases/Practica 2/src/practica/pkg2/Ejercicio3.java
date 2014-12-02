/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;

/**
 *
 * @author Luis B
 */
public class Ejercicio3 {
    private String a="a",A="A",b="b",B="B",c="c",C="C",d="d",D="D",p;
    public String letra(String letra){
   p=letra;
        if((p.equals(a))||(p.equals(A))){
            return "Excelente";
        }if((p.equals(b))||(p.equals(B))){
            return "Bueno";
        }if(p.equals(c)||(p.equals(C))){
                return "Regular";
            }
        if((p.equals(d))||(p.equals(D))){
            return "Malo";
        }return "Pesimo";
        
    }
}
