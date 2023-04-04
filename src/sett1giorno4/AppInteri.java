package sett1giorno4;
/*
ESERCIZIO NR. 9 - SCRIVERE UN APPLICAZIONE CHE CALCOLI
IL QUADRATO DA 0 A 10 E LI VISUALIZZI IN FORMA TABELLARE
 */

public class AppInteri {
    public static void main(String[] args) {
        System.out.println("INIZIO PROGRAMMA");
        int valoreMassimo = 10, contatore = 0;
        while (valoreMassimo >= contatore) {
            System.out.println("Il quadrato di " + contatore + " è " + (contatore * contatore));
            contatore++;
        }
        System.out.println("FINE PROGRAMMA");
    }
}
