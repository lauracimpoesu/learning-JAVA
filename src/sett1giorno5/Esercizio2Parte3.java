package sett1giorno5;
import java.util.Scanner;
/*
Scrivere un’applicazione che stampi a video il
fattoriale del numero intero inserito dall’utente.
*/
public class Esercizio2Parte3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci numero fattoriale:");
        int numeroBase = input.nextInt();
        input.close();

        int fattoriale = 1;
        for (int i = 1; i <= numeroBase; i++) {
            fattoriale *= i;
        }
        System.out.println("Il fattoriale di " + numeroBase + " è " + fattoriale);
    }
}
