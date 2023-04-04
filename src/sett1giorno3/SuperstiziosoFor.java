package sett1giorno3;

public class SuperstiziosoFor {
    public static void main(String[] args) {
        // INIZIALMENTE STAMPIAMO TUTTI I NUMERI DA 1 A 20 E APPENA INCONTRIAMO IL 13 USCIAMO
        // USIAMO IL BREAK

        int valoreMassimo = 20;
        for (int contatore = 1; contatore <= valoreMassimo; contatore++) {
            if (contatore !=13) {
                System.out.println("Il numero vale " + contatore);
            } else {
                System.out.println("E' uscito il numero " + contatore);
                System.out.println("Top");
                break; // ESCE DAL CICLO
            }
        }
    }
}
