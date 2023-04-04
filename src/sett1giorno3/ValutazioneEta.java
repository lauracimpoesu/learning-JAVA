package sett1giorno3;
public class ValutazioneEta {
    public static void main(String[] args) {
        System.out.println("INIZIO PROGRAMMA");
        int eta = 11;
        if (eta < 18) {
            System.out.println("Bei tempi...");
        } else if (eta >= 18 && eta < 45) {
            System.out.println("Sei un giovanotto!");
        } else if (eta >= 45 && eta < 65) {
            System.out.println("Sei saggio");
        } else if (eta >= 65) {
            System.out.println("Vuole sedersi?");
        }
        System.out.println("FINE PROGRAMMA");
    }
}
