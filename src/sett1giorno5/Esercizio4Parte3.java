package sett1giorno5;
/*
Scrivere un’applicazione per la registrazione dei voti
di un esame universitario. Il programma deve far inserire
all’utente 3 risultati e deve, al termine,

presentare
la somma degli esami passati e di quelli falliti.

Suggerimento: Si usi un contatore e si cicli
sui risultati inseriti dall’utente.
*/

import java.util.Scanner;

public class Esercizio4Parte3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci 3 risultati");
        int risultato1 = input.nextInt();
        int risultato2 = input.nextInt();

        for (int i = 0; i < 3; i++) {
            if (risultato1 <= 4) {
                System.out.println("Non passato il primo esame");
                break;
            } else if (risultato2 <= 6) {
                System.out.println("Passato il primo esame con la sufficienza");
                break;
            } else {
                System.out.println("Risultato passato");
                break;
            }
        }

    }
}
