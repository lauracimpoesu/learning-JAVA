package sett1giorno4;
import java.util.Scanner;
/* ESERCIZIO NR. 4 - SCRIVERE UN METODO CHE CHIEDA ALL'UTENTE
DI DIGITARE DUE INTERI LEGGA I DUE NUMERI E NE VISUALIZZI
LA SOMMA, IL PRODOTTO, LA DIFFERENZA, E IL QUOZIENTE
*/
public class EsempioUserInteri {
    public static void main(String[] args) {
        Scanner inputInteri = new Scanner(System.in);
        System.out.println("Digita due interi: ");
        int intero1 = inputInteri.nextInt();
        int intero2 = inputInteri.nextInt();
        int sommaInteri = intero1 + intero2;
        int prodottoInteri = intero1 * intero2;
        int differenzaInteri = intero1 - intero2;
        int quozienteInteri = intero1 / intero2;
        System.out.println("La somma è: " + sommaInteri + "." + "\n" +
                "Il prodotto è: " + prodottoInteri + "." + "\n" +
                "La differenza è: " + differenzaInteri + "." + "\n" +
                "Il quoziente è: " + quozienteInteri + "."
        );
    }
}
