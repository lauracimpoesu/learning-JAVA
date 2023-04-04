package sett1giorno5;
import java.util.Scanner;
public class Esercizio4Parte1Pro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi il primo intero");
        int numero1 = input.nextInt();
        input.nextLine();
        System.out.println("Scrivi il secondo intero");
        int numero2 = input.nextInt();
        input.nextLine();
        input.close();
        int somma = numero1 + numero2;
        int prodotto = numero1 * numero2;
        int differenza = numero1 - numero2;
        double quoziente = numero1 / numero2;
        System.out.println("Somma: " + somma + ". \n"
                + "Prodotto: " + prodotto  + ". \n"
                + "Differenza " + differenza + ". \n"
                + "Quoziente: " + quoziente
        );
    }
}
