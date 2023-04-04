package sett1giorno5;
/*
Scrivere un programma che chieda all'utente di inserire un
numero intero positivo e poi stampi a video tutti i numeri
dispari da 1 fino a quel numero utilizzando il for loop.
*/
import java.util.Scanner;
public class EsercizioCGPT5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero positivo...");
        int myInt = input.nextInt();
        input.close();

        for (int i = 1; i <= myInt; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
