package sett1giorno3;

public class SuperstiziosoContinue {
    public static void main(String[] args) {
        // TODO CONTINUE
        int valoreMassimo = 20;
        for (int contatore = 1; contatore <= valoreMassimo; contatore++) {
            if (contatore == 13 || contatore == 17) {
                continue; // AUMENTA IL CONTATORE E NON FA IL RESTO DEL BLOCCO
            }
            System.out.println("Il numero vale " + contatore);
        }
    }
}
