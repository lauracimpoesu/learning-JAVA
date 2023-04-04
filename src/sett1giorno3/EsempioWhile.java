package sett1giorno3;

public class EsempioWhile {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("INIZIO PROGRAMMA");
        // VOGLIO STAMPARE A VIDEO "N" VOLTE IL MIO NOME
        // CON N NUMERO INTERO CHE VA DA 0 A QUANTO VOGLIO
        // FARE QUESTO MA CON IL COSTRUTTO WHILE
        System.out.println("Laura");
        System.out.println("Laura");
        System.out.println("Laura");

        int numeroVolte = 3;
        int contatore = 0; // DEVO SCRIVERE UN ALTRA VARIABILE CHE CONTENGA IL NUMERO INIZIALE DI PARTENZA
        while (contatore < numeroVolte) {
            System.out.println("Laura");
            contatore++;
        }
        System.out.println("INIZIO PROGRAMMA");
    }
}
