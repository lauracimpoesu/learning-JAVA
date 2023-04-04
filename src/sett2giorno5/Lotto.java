package sett2giorno5;
import java.util.Scanner;
public class Lotto {
    public static void main(String[] args) {
        int[] numeri_estratti = {2, 22, 77, 100, 48};
        int[] numeri_giocati = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci numeri");
        int numeri = input.nextInt();

        for (int i = 0; i < numeri_giocati.length; i++) {
            for (int j = 0; i < numeri_estratti.length; j++) {
                if (numeri_giocati[i] == numeri_estratti[i]) {
                    System.out.println("Congrats");
                }
            }
        }
    }
}
