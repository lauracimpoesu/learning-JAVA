package sett1giorno3;

public class EsempioSemaforo {
    public static void main(String[] args) {
        System.out.println("INIZIO PROGRAMMA");
        // il colore del semaforo è l'iniziale
        // v (verde), a (arancione), r (rosso)

        char coloreSemaforo = 'A';
        if (coloreSemaforo == 'v' || coloreSemaforo == 'V') {
            System.out.println("Passa pure, semaforo verde!");
        } else if (coloreSemaforo == 'a' || coloreSemaforo == 'A'){
            System.out.println("Passa in fretta oppure fermati, semaforo arancione!");
        } else if (coloreSemaforo == 'r' || coloreSemaforo == 'R') {
            System.out.println("Fermati o rischi la vita e la patente");
        } else {
            System.out.println("Che semaforo usi?? Colore non riconosciuto.");
        }
        System.out.println("FINE PROGRAMMA");
    }
}
