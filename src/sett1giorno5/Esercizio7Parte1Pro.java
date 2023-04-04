package sett1giorno5;
import java.util.Scanner;
public class Esercizio7Parte1Pro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double euro = 1.09;
        System.out.println("Inserisci una cifra in dollari");
        double dollari = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        double risultatoConversione = dollari * euro;
        System.out.println(dollari + " USD equivalgono a " + risultatoConversione + " EUR.");
    }
}
