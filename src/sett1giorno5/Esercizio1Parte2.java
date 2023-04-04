package sett1giorno5;
import java.util.Scanner;

public class Esercizio1Parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("La votazione è...");
        int votazione = input.nextInt();
        input.close();

        if (votazione >= 60) {
            System.out.println("Promosso");
        } else {
            System.out.println("Bocciato");
        }
    }
}
