package sett1giorno4;
/* ESERCIZIO NR. 7 - SCRIVERE UN METODO CHE PRESO IN INPUT
INDICA UNA QUANTITA' IN DOLLARI, LO TRASFORMI IN EURO
STAMPARE IL RISULTATO A VIDEO
 */
import java.util.Scanner;

public class ScambioValuta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la quantità in dollari");
        double dollari = input.nextDouble();
        input.close();
        double euro = dollari * 0.85;
        System.out.println("La quantità in euro è " + euro + " EUR.");
    }
}
