package sett1giorno5;
import java.util.Scanner;
/*
Si scriva un metodo che, dati in input due interi,
li confronti e stampi a video il maggiore dei due.
*/
public class Esercizio2Parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci gli interi");
        int numero1 = input.nextInt();
        input.nextLine();
        int numero2 = input.nextInt();
        input.close();
        System.out.println(numero1 + ", " + numero2);

        if (numero1 > numero2) {
            System.out.println(numero1 + " è il maggiore");
        } else {
            System.out.println(numero2 + " è il maggiore");
        }
    }
}
