package sett1giorno5;
/*
Scrivere un’applicazione che legga un
intero e determini se è pari o dispari.
Suggerimenti. Usare l’operatore modulo (%).
*/
public class Esercizio4Parte2 {
    public static void main(String[] args) {
        int myInt = 8 % 2;

        if (myInt == 0) {
            System.out.println("pari");
        } else {
            System.out.println("dispari");
        }
    }
}
