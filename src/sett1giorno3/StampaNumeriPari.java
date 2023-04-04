package sett1giorno3;

public class StampaNumeriPari {
    public static void main(String[] args) {
        // TODO STAMPA NUMERI PARI - UN NUMERO E' PARI QUANDO IL RESTO E' 0
        System.out.println("INIZIO PROGRAMMA");
        int valoreMassimo = 14, contatore = 2;

        while (valoreMassimo >= contatore) {
            if (contatore % 2 == 0) {
                System.out.println("Il numero " + contatore + " è pari");
            }
            contatore++;
        }
        System.out.println("FINE PROGRAMMA");
    }
}
