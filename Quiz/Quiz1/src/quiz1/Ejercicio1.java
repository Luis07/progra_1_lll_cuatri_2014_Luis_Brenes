/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Luis B
 */
public class Ejercicio1 {
    //Diseñe un programa que le solicite al usuario digitar cinco palabras con mayúscula y minúscula(estas pueden tomar cualquier orden).Se deben ordenar estas 5 palabras en orden alfabético y ascendente, tomando en cuenta que las mayúsculas van después de las minúsculas pero solo con respecto a la misma letra.Un espacio en blanco va antes de cualquier letra
//Por ejemplo:
//Casa casa cosa cOsa Cosa;Estas 5 palabras están ordenadas correctamente.
 String[]mayusculas={"A","B","C","D","E","F","G","H","I","j","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
 String[]minusculas={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
 public String ordenar(String p1,String p2,String p3,String p4,String p5){
     int e=0,a=0, b=0,c=0,d=0,contador=0;
     String Final="";
     String[]arreglo1 = new String [p1.length()];
       String[]arreglo2=new String [p2.length()];
       String[]arreglo3=new String[p3.length()];
       String[]arreglo4=new String[p4.length()];
       String[]arreglo5=new String[p5.length()];
       String palabra="",palabra2="",palabra3="",palabra4="",palabra5=""; 
       for (int i = 0; i < p1.length(); i++) {
           palabra+=p1.charAt(i);
           arreglo1[i]=palabra;
           palabra="";
        }
        for (int i = 0; i < p2.length(); i++) {
           palabra2+=p2.charAt(i);
           arreglo2[i]=palabra2;
           palabra2="";
        }
         for (int i = 0; i < p3.length(); i++) {
           palabra3+=p3.charAt(i);
           arreglo3[i]=palabra3;
           palabra3="";
        }
          for (int i = 0; i < p4.length(); i++) {
           palabra4+=p4.charAt(i);
           arreglo4[i]=palabra4;
           palabra4="";
        }
           for (int i = 0; i < p5.length(); i++) {
           palabra5+=p5.charAt(i);
           arreglo5[i]=palabra5;
           palabra5="";
        }
           palabra+=p1.charAt(0);
           palabra2+=p2.charAt(0);
           palabra3+=p3.charAt(0);
           palabra4+=p4.charAt(0);
           palabra5+=p5.charAt(0);
           for (int i = 0; i < arreglo1.length&&i<minusculas.length||i<mayusculas.length; i++) {
             if(palabra.equals(palabra.toUpperCase())){
                 a=i+2;
                 break;
             }else{
               if(arreglo1[0].contains(mayusculas[i])||arreglo1[0].contains(minusculas[i])){
                  a=i;
             }
             }
        }for (int i = 0; i < arreglo2.length&&i<minusculas.length||i<mayusculas.length; i++) {
          if(palabra2.equals(palabra2.toUpperCase())){
                 b=i+2;
                 break;
             }else{
            if(arreglo2[0].contains(mayusculas[i])||arreglo2[0].contains(minusculas[i])){
                  b=i;
             }
          }
     }for (int i = 0; i < arreglo3.length&&i<minusculas.length||i<mayusculas.length; i++){
         if(palabra3.equals(palabra3.toUpperCase())){
                 c=i+2;
                 break;
             } else{
         if(arreglo3[0].contains(mayusculas[i])||arreglo3[0].contains(minusculas[i])){
                  c=i;
             }
         }
     }for (int i = 0; i < arreglo4.length&&i<minusculas.length||i<mayusculas.length; i++){
         if(palabra4.equals(palabra4.toUpperCase())){
                 d=i+2;
                 break;
             } else{
         if(arreglo4[0].contains(mayusculas[i])||arreglo4[0].contains(minusculas[i])){
                  d=i;
             }
         }
     }for (int i = 0; i < arreglo5.length&&i<minusculas.length||i<mayusculas.length; i++){
      if(palabra5.equals(palabra5.toUpperCase())){
                 e=i+2;
                 break;
             }else{
         if(arreglo5[0].contains(mayusculas[i])||arreglo5[0].contains(minusculas[i])){
                 e=i;
             }
      }
     }while(contador<5){
           if(a<b&&a<c&&a<d&&a<e){
             Final+=p1+"\n";  
             contador++;
             a=27;
           if(palabra.toLowerCase().equals(palabra2.toLowerCase())){
           Final+=p2+"\n";
           b=27;
           contador++;
           }
           if (palabra.toLowerCase().equals(palabra3.toLowerCase())){
         Final+=p3+"\n";
           c=27;
           contador++;
           }
           if (palabra.toLowerCase().equals(palabra4.toLowerCase())) {
         Final+=p4+"\n";
           d=27;
           contador++;
           }
           if(palabra.toLowerCase().equals(palabra5.toLowerCase())) {
         Final+=p5+"\n";
          e=27;
           contador++; 
           }
           }else{
               if(b<a&&b<c&&b<d&&b<d){
                   Final+=p2+"\n";
               contador++;
               b=27;
               if(palabra2.toLowerCase().equals(palabra.toLowerCase())){
               Final+=p1+"\n";
           a=27;
           contador++;
               }
           if (palabra2.toLowerCase().equals(palabra3.toLowerCase())){
         Final+=p3+"\n";
           c=27;
           contador++;
           }
           if (palabra2.toLowerCase().equals(palabra4.toLowerCase())) {
         Final+=p4+"\n";
           d=27;
           contador++;
           }
           if(palabra2.toLowerCase().equals(palabra5.toLowerCase())) {
         Final+=p5+"\n";
           e=27;
           contador++;
           }
               }
           }if(c<a&&c<b&&c<d&&c<e){
              Final+=p3+"\n";
           contador++;
           c=27;
           if(palabra3.toLowerCase().equals(palabra.toLowerCase())){
               Final+=p1+"\n";
           a=27;
           contador++;
           }
           if(palabra3.toLowerCase().equals(palabra2.toLowerCase())){
           Final+=p2+"\n";
           b=27;
           contador++;
           }
           if (palabra3.toLowerCase().equals(palabra4.toLowerCase())) {
         Final+=p4+"\n";
           d=27;
           contador++;
           }
           if(palabra3.toLowerCase().equals(palabra5.toLowerCase())) {
         Final+=p5+"\n";
           e=27;
           contador++;
           }
           }else{
               if(d<a&&d<b&&d<c&&d<e){
                   Final+=p4+"\n";
               contador++;
               d=27;
               if(palabra4.toLowerCase().equals(palabra.toLowerCase())){
               Final+=p1+"\n";
           a=27;
           contador++;
               }
           if(palabra4.toLowerCase().equals(palabra2.toLowerCase())){
           Final+=p2+"\n";
           b=27;
           contador++;
           }
           if (palabra4.toLowerCase().equals(palabra3.toLowerCase())){
         Final+=p3+"\n";
           c=27;
           contador++;
           }
           if(palabra4.toLowerCase().equals(palabra5.toLowerCase())) {
         Final+=p5+"\n";
          e=27;
           contador++;
           }
               }
           }if(e<a&&e<b&&e<c&&e<d){
                   Final+=p5+"\n";
               contador++;
               e=27;
           if(palabra5.toLowerCase().equals(palabra.toLowerCase())){
               Final+=p1+"\n";
           a=27;
           contador++;
           }
           if(palabra5.toLowerCase().equals(palabra2.toLowerCase())){
           Final+=p2+"\n";
           b=27;
           contador++;
           }
           if (palabra5.toLowerCase().equals(palabra3.toLowerCase())){
         Final+=p3+"\n";
          c=27;
           contador++;
           }
           if (palabra5.toLowerCase().equals(palabra4.toLowerCase())) {
         Final+=p4+"\n";
           d=27;
           contador++;
           }
           }
          
     }   return Final;
}
}
