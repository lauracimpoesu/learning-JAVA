package sett1giorno4;
/* ESERCIZIO 8 - SCRIVERE UN APPLICAZIONE CHE PRENDA TRE INTERI
DALL'UTENTE E POI VISUALIZZI LA SOMMA, LA MEDIA, IL PRODOTTO
IL PIU PICCOLO E IL PIU GRANDE
*/

import java.util.Scanner;

public class EsempioInteri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita tre numeri interi");

        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        int numero3 = input.nextInt();
        input.close();

        int somma = numero1 + numero2 + numero3;
        int media = (numero1 + numero2 + numero3) / 3;
        int prodotto = numero1 * numero2 * numero3;
        System.out.println("La somma è " + somma);
        System.out.println("La media è " + media);
        System.out.println("Il prodotto è " + prodotto);
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("Il numero più piccolo è " + numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("Il numero più piccolo è " + numero2);
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("Il numero più piccolo è " + numero3);
        }
    }
}
