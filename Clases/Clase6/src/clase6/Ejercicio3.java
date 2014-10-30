/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author Luis B
 */
public class Ejercicio3 {
    public String Rote(String palabra)
    {
        String temp="";
        for (int i = palabra.length(); i>0; i--) {
            temp+=palabra.charAt(i-1);
        }
        return temp;
    }
    
    public String Palindromo(String palabra)
    {
        String temp="";
        String palabraNueva=palabra.substring(0, palabra.length()-1);
        for (int i = palabra.length(); i>0; i--) {
            temp+=palabra.charAt(i-1);
        }
        return palabraNueva+temp;
    }
    
    public String MarcaPalabra(String texto,String palabra)
    {
        return texto.replaceAll(palabra, "-"+palabra);
    }
    
    public int CantidadRepeticiones(String texto,String palabra)
    {
       String palabras[]=texto.split(" ");
        int contador=0;
        
        for (int i = 0; i < palabras.length; i++) {
            
            if(palabras[i].contains(palabra))
            {
                contador++;
            }            
        }        
        return contador;
    }
    
    public String Substring(String texto, int inicio,int final_)
    {
        String temporal="";
        if(final_>texto.length())
            return "Error";
        
        for (int i = inicio; i < final_; i++) {
            temporal+=texto.charAt(i);
        }        
        return temporal;
        
    }
    
    public String Mayuscula(String texto)
    {
        String textoFinal="";
        for (int i = 0; i < texto.length(); i++) {
            
            if(texto.charAt(i)=='a')
            {
                textoFinal+="A";
            }
            
            if(texto.charAt(i)=='e')
            {
                textoFinal+="E";
            }
            
            if(texto.charAt(i)=='i')
            {
                textoFinal+="I";
            }
            
            if(texto.charAt(i)=='o')
            {
                textoFinal+="O";
            }
            
            if(texto.charAt(i)=='u')
            {
                textoFinal+="U";
            }            
        }
        return textoFinal;
        
    }
    
    
    public int IndexOf (String texto,char letra) {
        
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)==letra)
            {
                return i;
            }
        }
        return -1;
    }
    
    public char ValueOf (String texto,int index) {
        
        return texto.charAt(index);
    }
 
}
