package sett1giorno5;
import java.util.Scanner;
/*
Si modifichi il metodo dell’esercizio 1 in modo tale che venga
visualizzata a video la categoria del voto ottenuto dall’Utente.
Si tenga conto delle seguenti categorie:
a. “A”, voto > 90.
b. “B”, voto > = 80.
c. “C”, voto > = 70.
d. “D”, voto > = 60.
Suggerimenti: si implementi il metodo utilizzando inizialmente
una serie di If e poi si cerchi di ottimizzare il codice scritto.
*/
public class Esercizio3Parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto hai preso?");
        int voto = input.nextInt();
        input.close();
        System.out.println("Il tuo voto: " + voto);

        char categoriaA = 'A';
        char categoriaB = 'B';
        char categoriaC = 'C';
        char categoriaD = 'D';

        if(voto >= 90 && categoriaA == 'A') {
            System.out.println("Fai parte della categoria A");
        } else if(voto >= 80 && categoriaB == 'B') {
            System.out.println("Fai parte della categoria B");
        }else if(voto >= 70 && categoriaC == 'C') {
            System.out.println("Fai parte della categoria C");
        }else if(voto >= 60 && categoriaD == 'D') {
            System.out.println("Fai parte della categoria D");
        } else {
            System.out.println("Bocciato");
        }
    }
}
