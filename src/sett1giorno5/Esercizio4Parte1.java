package sett1giorno5;
import java.util.Scanner;
/*
Esercizio 4 - Scrivere un metodo che chieda all’utente di
digitare due interi, legga i due numeri e ne visualizzi la
somma +, il prodotto x, la differenza - e il quoziente /.
*/
public class Esercizio4Parte1 {
    public static void main(String[] args) {
        Scanner richiestaInput = new Scanner(System.in);
        System.out.println("Digita due interi");
        int primoIntero = richiestaInput.nextInt();
        richiestaInput.nextLine();
        int secondoIntero = richiestaInput.nextInt();
        richiestaInput.nextLine();
        System.out.println("Il mio primo intero è: " + primoIntero
                + " e il mio secondo intero è: " + secondoIntero + ". :)"
        );
        richiestaInput.close();
    }
}
