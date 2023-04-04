package sett2giorno1;

import java.util.Scanner;

public class EsempioSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // VISUALIZZA IL MENU DI SCELTA
        System.out.println("1) Inserisci il cliente");
        System.out.println("2) Lista clienti");
        System.out.println("3) Cerca cliente");
        System.out.println("99) Esci dal programma");
        System.out.println("Fai la tua scelta?");

        int scelta = input.nextInt();
        switch (scelta) {
            case 1:
                System.out.println("Inserisci i dati del cliente");
                System.out.println("Cliente inserito");
                break;
            case 2:
                System.out.println("Lista dei clienti in database visualizzato");
                break;
            case 3:
                System.out.println("Inserisci il cliente da cercare");
                System.out.println("Cliente trovato!");
                break;
            default:
                System.out.println("Scelta non valida... sei un po' tanto !!");
                break;
        }
    }
}

