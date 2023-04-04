package sett1giorno5;
import java.util.Scanner;
public class Esercizio2Parte2Pro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il primo numero");
        int numero1 = input.nextInt();
        input.nextLine();
        System.out.println("Inserisci il secondo numero");
        int numero2 = input.nextInt();
        input.close();

        if (numero1>numero2) {
            System.out.println("Il maggiore è " + numero1);
        } else {
            System.out.println("Il maggiore è " + numero2);
        }
    }
}
