/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectop1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Greivin
 */
public class ProyectoP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
 //Declaracion de Variables

        int opcion = 0, opcion2 = 0;
        String jugador2 = "o";
        String jugador1 = "x";
        String turno1=" ", turno2=" ";
        String acum = "";
        int f = 0, fj1 = 0, fj2 = 0, empates = 0;
        boolean Estado = false, estado = false;
        int columnas = 8, pam = 1;
        String res = "";
        //Creacion de las instancias y la creacion del escanner
        Estadisticas oEstadisticas = new Estadisticas();

        Colocarficha oColocarficha = new Colocarficha();
//Menú Principal
        do {
            try {
                Scanner teclado = new Scanner(System.in);
                oColocarficha.reiniciarjuego();
                System.out.println("- - - - - - - - - - - - - -" + "\n" + "Digite una opción del menú" + "\n" + "- - - - - - - - - - - - - -");
                System.out.println("1: Digitar nombre del primer jugador ");
                System.out.println("2: Digitar nombre del segundo jugador");
                System.out.println("3: Iniciar juego ");
                System.out.println("4: Estadísticas de la partida");
                System.out.println("5: Salir");

                opcion = teclado.nextInt();
                 if (opcion2 == 2) {
                     f = 0;
                     fj1 = 0;
                     fj2 = 0;
                             }
                switch (opcion) {
                       
                    case 1:
                        System.out.println("Digite su nombre");
                        teclado = new Scanner(System.in);
                        jugador1 = teclado.next();
                        break;
                    case 2:

                        System.out.println("Digite su nombre");
                        teclado = new Scanner(System.in);
                        jugador2 = teclado.next();
                        break;
                    case 3:
                        do {
                            //Sub  Menú del juego
                            System.out.println("1:¿Rendirse?");
                            System.out.println("2:Reiniciar");
                            System.out.println("3:Colocar ficha");
                            System.out.println("4:Validar cuatro en línea");
                            opcion2 = teclado.nextInt();
                            switch (opcion2) {
                                case 1:
                                    //Caso  que brinda la opcion de rendirse
                                    oColocarficha.turnojugador();
                                    System.out.println(oColocarficha.Rendirse(jugador1, jugador2));
                                    oColocarficha.reiniciarjuego();
                                    opcion2 = 8;
                                    columnas = 8;
                                    break;
                                case 2:
                                    //Caso para reiniciar el juego
                                    oColocarficha.reiniciarjuego();
                                    opcion2 = 7;
                                    estado = false;
                                    jugador1 = "";
                                    jugador2 = "";
                                    acum = "";
                                    fj1=0;
                                    fj2=0;
                                    f=0;
                                    columnas = 8;
                                    break;
                                case 3:
                                //Caso en el cual se inicia el juego 

                                    oColocarficha.turnojugador();//Se llama al metodo para saber que jugador inicia el juego
                                    if (columnas == 8) {
                                        oColocarficha.CrearMatrisjuego(6, 7);//Se crea y se carga la matriz para mostrarla a cada jugador
                                        oColocarficha.CargaMatriz();
                                    }
                                    //if para asignar turno a cada jugador
                                    if (oColocarficha.isEstado() == true) {
                                        System.out.println("Es el turno de " + jugador1);
                                        columnas = 8;
                                        System.out.println(oColocarficha.muestratablero(columnas));
                                        System.out.println("Digite la columna en la que desea colocar su ficha");
                                        teclado = new Scanner(System.in);
                                        columnas = teclado.nextInt();
                                        f++;
                                        fj1++;
                                        
                                        //Se utiliza una matriz llamada a y se implementa un if para saber si una columna esta llena,para que se coloque la ficha en un lugar vacio
                                        String M = "Columna llena, favor digite una columna vacia";
                                        String[][] a = oColocarficha.getMatrizjuego();
                                        if (pam == 1) {
                                            if (columnas == 0) {
                                                if (a[0][0].equals("(X)") || a[0][0].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 2;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 1) {
                                                if (a[0][1].equals("(X)") || a[0][1].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 2;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 2) {
                                                if (a[0][2].equals("(X)") || a[0][3].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 2;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 3) {
                                                if (a[0][3].equals("(X)") || a[0][3].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 2;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 0) {
                                                if (a[0][4].equals("(X)") || a[0][4].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 2;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 5) {
                                                if (a[0][5].equals("(X)") || a[0][5].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 2;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 6) {
                                                if (a[0][6].equals("(X)") || a[0][6].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 2;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                        }
                                        System.out.println(oColocarficha.muestratablero(columnas));
                                        oColocarficha.isEstado();

                                        break;
                                    } //if para asignar turno a cada jugador
                                    if (oColocarficha.isEstado() == false) {
                                        System.out.println("Es el turno de " + jugador2);
                                        columnas = 8;
                                        System.out.println(oColocarficha.muestratablero(columnas));
                                        System.out.println("Digite la columna en la que desea colocar su ficha");
                                        teclado = new Scanner(System.in);
                                        columnas = teclado.nextInt();
                                        f++;
                                        fj2++;
                                        
                                        //Se utiliza una matriz llamada a y se implementa un if para saber si una columna esta llena,para que se coloque la ficha en un lugar vacio
                                        String M = "Columna llena, favor digite una columna vacia";
                                        String[][] a = oColocarficha.getMatrizjuego();
                                        if (pam == 2 || pam == 1) {
                                            if (columnas == 0) {
                                                if (a[0][0].equals("(X)") || a[0][0].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 1;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 1) {
                                                if (a[0][1].equals("(X)") || a[0][1].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 1;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 2) {
                                                if (a[0][2].equals("(X)") || a[0][3].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 1;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 3) {
                                                if (a[0][3].equals("(X)") || a[0][3].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 1;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 0) {
                                                if (a[0][4].equals("(X)") || a[0][4].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 1;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 5) {
                                                if (a[0][5].equals("(X)") || a[0][5].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 1;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                            if (columnas == 6) {
                                                if (a[0][6].equals("(X)") || a[0][6].equals("(O)")) {
                                                    oColocarficha.turnojugador();
                                                    pam = 1;
                                                    System.out.println(oColocarficha.muestratablero(columnas));
                                                    break;
                                                }
                                            }
                                        }
                                        //Muestra el tablero del juego, en esto caso la matriz cargada
                                        System.out.println(oColocarficha.muestratablero(columnas));
                                        oColocarficha.isEstado();
                                        break;
                                    }
                                case 4:
                                    //Caso para ver si un jugador ha ganado o no, analizando el turno del jugador correspondiente
                                    String mensajeacum = "La partida ha terminado empate";
                                    if (oColocarficha.ValidarJuego(jugador1, jugador2).equals(mensajeacum)) {
                                        empates++;
                                        System.out.println(oColocarficha.ValidarJuego(jugador1, jugador2));
                                    } else {
                                        System.out.println(oColocarficha.ValidarJuego(jugador1, jugador2));
                                    }
                                    //Los siguientes 2 if son para que cuando gane un jugador le de la opcion de seguir jugando o de salirse
                                    if (oColocarficha.isEstado() == true) {
                                        String m = "¡Felicidades!...el jugador " + jugador1 + " a ganado la partida";
                                        if (oColocarficha.ValidarJuego(jugador1, jugador2).equals(m)) {
                                            System.out.println("Desea continuar: Digite S ó N");
                                            teclado = new Scanner(System.in);
                                            res = teclado.next();
                                            if (res.equals("S") || res.equals("s")) {
                                                opcion2 = 8;
                                            } else {
                                                opcion = 4;
                                            opcion2=5;
                                            }
                                        }}if(oColocarficha.ValidarJuego(jugador1, jugador2).equals("La partida ha terminado empate")){
                                            System.out.println("Desea continuar: Digite S ó N");
                                            teclado = new Scanner(System.in);
                                            res = teclado.next();
                                            if (res.equals("S") || res.equals("s")) {
                                                opcion2 = 8;
                                            } else {
                                                opcion2 = 5;
                                                opcion = 4;
                                                
                                            }
                                    }
                                    if (oColocarficha.isEstado() == false) {
                                        String m = "¡Felicidades!...el jugador " + jugador2 + " a ganado la partida";
                                        if (oColocarficha.ValidarJuego(jugador1, jugador2).equals(m)) {
                                            System.out.println("Desea continuar: Digite S ó N");
                                            teclado = new Scanner(System.in);
                                            res = teclado.next();
                                            if (res.equals("S") || res.equals("s")) {
                                                opcion2 = 8;
                                            } else {
                                                opcion2 = 5;
                                                opcion = 4;
                                            }if(oColocarficha.ValidarJuego(jugador1, jugador2).equals("La partida ha terminado empate")){
                                            
                                                System.out.println("Desea continuar: Digite S ó N");
                                            teclado = new Scanner(System.in);
                                            res = teclado.next();
                                            if (res.equals("S") || res.equals("s")) {
                                                opcion2 = 8;
                                            } else {
                                                opcion2 = 5;
                                                opcion = 4;
                                                
                                            }
                                        }
                                    }
                                break;
                            }
                            }
                        } while (opcion2 <= 4);
                        break;
                    case 4:
                        //Caso para mostrar las estadisticas del juego
                        System.out.println(oColocarficha.Ganador(Estado, opcion2, jugador2, jugador1, turno2)+ "\n" + "------------°.°--------------"+"\n"+oColocarficha.Ganador2(Estado, opcion2, jugador1, jugador2, turno1)+"\n"+"------------°.°--------------");
                        System.out.println("Cantidad de partidas:" + oEstadisticas.CantPar(opcion2)+"\n"+"------------°.°--------------");
                        System.out.println("Empates:" + empates + "\n" + "------------°.°--------------");
                        System.out.println("Cantidad de fichas Colocadas:" + " " + f + "\n" + "------------°.°--------------" + "\n" + "Fichas colocadas por" + " " + jugador1 + ": " + fj1 + "\n" + "------------°.°--------------" + "\n" + "Fichas colocadas por" + " " + jugador2 + ": " + fj2 + "\n" + "------------°.°--------------");
                        break;
                    case 5:
                        System.out.println("Vuelve Pronto");
                        System.out.println("Powered by UTN-Games");
                        break;
                }
                if (opcion2 == 2) {
                     f = 0;
                     fj1 = 0;
                     fj2 = 0;
                         } 
               
            } catch (RuntimeException e) {
                System.out.println("Debe digitar un número");
            }
            
        } while (opcion != 5);
      
    }
}
