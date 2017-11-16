package boletin10;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author abrandarizdominguez
 */
public class Juego {
    
    public void comenzarpartida(){
        // Se crea un objeto de tipo Scanner y se crean las variables opcion, dificultad, respuesta y resultado.
        Scanner scan = new Scanner(System.in);
        int opcion, dificultad, resultado, respuesta;
        // Se crea un bucle repetitivo do... while.
        do{
            System.out.println("_________MENU_________\n1. Modo 1 jugador\n2. Modo 2 jugadores");
            opcion = scan.nextInt();
        } while (opcion!=2 && opcion!=1);
        // Se crea una estructura condicional doble
        if (opcion==1){
            System.out.println("¡Modo 1 jugador!\nSelecciona la dificultad:\n1. Dificultad 1 - Fácil\n2. Dificuktad 2 - Medio\n3- Dificultad 3 - Difícil");
            dificultad = scan.nextInt();
            if (dificultad==1){
                Random aleatorio = new Random (System.currentTimeMillis());
                //Valor aleatorio de 1 al 50.
                int numeroaleatorio = aleatorio.nextInt(50)+1;
                for (int i=10; i>0; i--){
                    
                }
            }
            else if (dificultad==2){
            
            }
            else{
                    
                    }
            }
        else{
            System.out.println("¡Modo 2 jugadores!\nSelecciona la dificultad:\n1. Dificultad 1 - Fácil\n2. Dificuktad 2 - Medio\n3- Dificultad 3 - Difícil");
            dificultad = scan.nextInt();
        }
    }
}
