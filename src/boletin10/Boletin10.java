/*
 * 1- Codifica un programa que permita el siguiente juego  para adivinar un número.
 * El primer jugador teclea (utilizando la clase JoptionPane)
 * un número a adivinar (entre 1 y 50) y el número máximo de intentos que tiene
 * el segundo jugador para dar con él. El programa irá sacando por pantalla
 * mensajes que orienten al segundo jogador sobre si el número tecleado es mayor o menor
 * que el número a adivinar. Haz el programa repetitivo.
 * 
 * 2- Programa el ejercicio anterior para jogar contra el ordenador.
 * Para eso el ordenador genera un número aleatorio, entre 1 y 50.
 * Este programa dará las siguientes pistas sobre lo lejos que esté de adivinar el número:
 * Si la distancia entre el número a adivinar y el tecleado es mayor de 20: "muy lejos".
 * Entre 10 y 20 , ambos incluídos: "lejos"
 * Mayor de 10 y menor de 5: "cerca"
 * Menor o igual que 5: "muy cerca".
 */
package boletin10;
/**
 *
 * @author abrandarizdominguez
 */
public class Boletin10 {

    public static void main(String[] args) {
        Juego juego1 = new Juego();
        juego1.comenzarpartida();
    }
    
}
