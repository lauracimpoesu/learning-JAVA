package sett1giorno5;
import java.util.Scanner;
/*
Scrivere un’applicazione che prenda tre interi dall’utente
e poi visualizzi la somma, la media, il prodotto,
il più piccolo e il più grande.
*/
public class Esercizio8Parte1 {
    public static void main(String[] args) {
        Scanner introduciInteri = new Scanner(System.in);
        System.out.println("Introduci gli interi");
        int int_one = introduciInteri.nextInt();
        int int_two = introduciInteri.nextInt();
        int int_three = introduciInteri.nextInt();
        int somma = int_one + int_two + int_three;
        int prodotto = int_one * int_two * int_three;
        int media = (int_one + int_two + int_three) / 3;
        System.out.println("La somma è: " + somma + ". \n"
                + "Il prodotto è: " + prodotto + ". \n"
                + "La media è: " + media + "."
        );

        // FIRST IF TO FIND THE BIGGEST NUMBER
        if (int_one > int_two) {
            System.out.println("Il numero più grande è: " + int_one);
        } else if (int_two < int_three) {
            System.out.println("Il numero più grande è: " + int_three);
        }

        // SECOND IF THAT FIND THE LOWEST NUMBER
        if (int_one < int_two) {
            System.out.println("Il numero più piccolo è: " + int_one);
        } else if (int_two > int_three) {
            System.out.println("Il numero più piccolo è: " + int_three);
        }
    }
}
