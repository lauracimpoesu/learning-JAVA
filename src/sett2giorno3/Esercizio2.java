package sett2giorno3;
import java.util.Scanner;
/*Esercizio 3 - Si scriva un’applicazione che,
a fronte dell’inserimento di una stringa da parte
dell’utente, restituisce a video la stringa rovesciata.
Suggerimenti: Si utilizzi l’operatore di concatenazione.
Esercizio 4 - Scrivere un programma che, data una stringa
inserita dall’utente, stampi a video la stessa
stringa privata delle vocali.
*/
public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita la stringa");
        String name = input.nextLine();
        input.close();

        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) == 'a'
                    || name.charAt(i) == 'e'
                    || name.charAt(i) == 'i'
                    || name.charAt(i) == 'o'
                    || name.charAt(i) == 'u')) {
                System.out.print(name.charAt(i));
            }
        }
    }
}

