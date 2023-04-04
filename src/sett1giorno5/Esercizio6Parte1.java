package sett1giorno5;
import java.util.Scanner;
/*
Riscrivere lo stesso metodo dell’esercizio 3
utilizzando NUMERI inseriti dall’utente a console.
(Esercizio 3 - Creare una nuova classe Java dotata di un metodo
main. Il metodo dovrà leggere l’input digitato dall’utente
a console e stamparne a video il contenuto.)
 */

public class Esercizio6Parte1 {
    public static void main(String[] args) {
        Scanner inputInts = new Scanner(System.in);
        System.out.println("Digita degli interi...");
        int random_int_one = inputInts.nextInt();
        inputInts.nextLine();
        int random_int_two = inputInts.nextInt();
        inputInts.nextLine();
        int another_one = inputInts.nextInt();
        System.out.println(random_int_one +
                " " + random_int_two +
                " " + another_one);
        inputInts.close();
    }
}
