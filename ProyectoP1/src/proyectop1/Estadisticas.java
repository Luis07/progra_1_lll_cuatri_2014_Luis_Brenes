/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectop1;

/**
 *
 * @author Greivin
 */
public class Estadisticas {
  //declaracion de variables de la case estadisticas
    Colocarficha oColocarficha = new Colocarficha();
    private int cp = 0;
    private int i = 0, i2 = 0;

    

    //metodo para contar las partidas jugadas entre los jugadores

    public int CantPar(int opcion2) {

        if (opcion2 == 5 || opcion2 == 8) {
            cp++;
        }
        //if para reiniciar las partidas jugadas en caso de reiniciar el juego
        if (opcion2 == 7) {
            cp = 0;
        }
        return cp;
    }
    

}
