package sett1giorno5;
/*
Scrivere un’applicazione che, dati in input
due numeri interi ordinati (a < b), stampi
a video tutti i numeri compresi tra loro.
*/
import java.util.Scanner;
public class Esercizio7Parte3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero...");
        int myInt = input.nextInt();
        System.out.println("Inserisci un numero intero...");
        int myInt2 = input.nextInt();
        input.nextLine();
        input.close();
    }
}
