package sett1giorno5;
/*
Scrivere un programma che, dato in input un numero intero,
stampi a video una serie di righe formate da asterischi e
che contengono da 0 al numero inserito asterischi. Nella
figura sottostante è esemplificato l’output atteso.
*/

import java.util.Scanner;

public class Esercizio6Parte3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita un numero intero...");
        int myInt = input.nextInt();
        input.nextLine();
        input.close();
        int i, j;
        for (i = 0; i <= myInt; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
