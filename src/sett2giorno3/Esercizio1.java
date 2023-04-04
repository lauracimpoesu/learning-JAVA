package sett2giorno3;
import java.util.Scanner;
/*
Es. 1 - Si scriva un programma che stampa a video la
lunghezza della stringa inserita.

Es. 2 - Si modifichi il codice dell’esercizio precedente in
modo tale da far comparire a video i caratteri componenti
la stringa suddivisi per riga.
Esempio: stringa: prova la lunghezza della stringa è: 5
p
r
o
v
a
*/
public class Esercizio1 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Digita stringa");
        String stringa = inputString.nextLine();

        for (int i = 0; i < stringa.length(); i++) {
            System.out.println(stringa.charAt(i));
        }
    }
}

