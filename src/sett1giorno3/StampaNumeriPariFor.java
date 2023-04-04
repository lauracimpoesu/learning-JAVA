package sett1giorno3;

public class StampaNumeriPariFor {
    public static void main(String[] args) {
        // TODO STAMPA NUMERI PARI USANDO IL FOR LOOP
        int valoreMassimo = 20;
        for (int contatore = 2; contatore <= valoreMassimo; contatore+=2) {
            System.out.println("Il numero " + contatore + " è pari");
        }
    }
}
