package sett1giorno5;
/*
Scrivere un programma che chieda all'utente di inserire
un numero intero e poi determini se quel numero è un
numero primo utilizzando l'if e il for loop.
*/

import java.util.Scanner;

public class EsercizioCGPT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero...");
        int myInt = input.nextInt();
        input.close();

        for (int i = 2; i < myInt; i++) {
            if (myInt % i == 0) {
                System.out.println(myInt + " non è un numero primo.");
                break;
            } else {
                System.out.println(myInt + " è un numero primo.");
                break;
            }
        }
    }
}
