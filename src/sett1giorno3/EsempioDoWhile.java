package sett1giorno3;

public class EsempioDoWhile {
    public static void main(String[] args) {
        // STAMPARE LA TABELLINA DEL 3
        System.out.println("INIZIO PROGRAMMA");
        int maxValore = 10, contatore = 1;
        do {
            System.out.print(contatore * 3 + "\t");
            contatore++;
        } while (contatore <= maxValore);


        System.out.println("FINE PROGRAMMA");
    }
}
