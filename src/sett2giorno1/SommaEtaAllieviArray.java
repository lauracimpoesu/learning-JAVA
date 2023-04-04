package sett2giorno1;
import java.util.Scanner;
public class SommaEtaAllieviArray {
    public static void main(String[] args) {
        // DICHIARO LE VARIABILI DEL PROGRAMMA
        int numeroAllievi=3, totaleEta =0;
        double mediaEta =0;
        // DICHIARO UN VETTORE DI 10 ELEMENTI/VARIABILI INTERE
        int[] vettoreEtaAllievi = new int[numeroAllievi];
        // DICHIARO LO SCANNER PER LEGGERE I DATI
        Scanner input = new Scanner(System.in);

        System.out.println("CARICO IL VETTORE 🟢");
        // CICLO PER CARICARE L'ARRAY
        for(int i=0; i< numeroAllievi ; i++) {
            System.out.println("Inserisci l'eta' dell'allievo " + (i+1) );
            // MEMORIZZO NELL'ARRAY L'ETA DELL'ALLIEVO I-ESIMO
            vettoreEtaAllievi[i] = input.nextInt();
        }

        System.out.println("SCARICO/LEGGO IL VETTORE 🟣");
        // CICLO SUL VETTORE PER DARE ALL'UTENTE L'OUTPUT DEI DATI INSERITI E DELLA MEDIA
        for(int i=0; i< numeroAllievi ; i++) {
            System.out.println("L'allevo " + (i+1) + "ha eta' " + vettoreEtaAllievi[i]);
            totaleEta += vettoreEtaAllievi[i];
        }
        mediaEta = (double)totaleEta/numeroAllievi;
        System.out.println(" L'età media è " + mediaEta );
    }
}

