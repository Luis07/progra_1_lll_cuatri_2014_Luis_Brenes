/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg2;

/**
 *
 * @author Luis B
 */
public class Listanumero {
private Nodonumero raiz;
    public void Insertar(Nodonumero elemento){
        Nodonumero nuevo;
        nuevo= new Nodonumero();
        nuevo.setNumero(elemento.getNumero());
        if(raiz==null ){//de aqui para insertar otro cuando ya esta creado algo
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }else{
            Nodonumero auxiliar=raiz;//variable auxiliar que recorre la lista hasta llegar a null
            while(auxiliar.getSiguiente()!=null){//para llegar al ultimo elemento del nodo
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    public String Contadornumeros(){
        int contador1=0,contador2=0,contador3=0,contador4=0,contador5=0,contador6=0,contador7=0,contador8=0,contador9=0,contador10=0;
    String retorno="";
   Nodonumero auxiliar=raiz;//variable auxiliar que recorre la lista hasta llegar a null
            while(auxiliar!=null){//para llegar al ultimo elemento del nodo
        if(auxiliar.getNumero()==1){
            contador1++;
            }if(auxiliar.getNumero()==2){
            contador2++;
            }if(auxiliar.getNumero()==3){
            contador3++;
            }if(auxiliar.getNumero()==4){
            contador4++;
            }if(auxiliar.getNumero()==5){
            contador5++;
            }if(auxiliar.getNumero()==6){
            contador6++;
            }if(auxiliar.getNumero()==7){
            contador7++;
            }if(auxiliar.getNumero()==8){
            contador8++;
            }if(auxiliar.getNumero()==9){
            contador9++;
            }if(auxiliar.getNumero()==10){
            contador10++;
            }
            auxiliar=auxiliar.getSiguiente();
            }
            retorno+=contador1+"repeticiones de 1"+"\n";
            retorno+=contador2+"repeticiones de 2"+"\n";
            retorno+=contador3+"repeticiones de 3"+"\n";
            retorno+=contador4+"repeticiones de 4"+"\n";
            retorno+=contador5+"repeticiones de 5"+"\n";
            retorno+=contador6+"repeticiones de 6"+"\n";
            retorno+=contador7+"repeticiones de 7"+"\n";
            retorno+=contador8+"repeticiones de 8"+"\n";
            retorno+=contador9+"repeticiones de 9"+"\n";
            retorno+=contador10+"repeticiones de 10"+"\n";
            return retorno;
}
}
