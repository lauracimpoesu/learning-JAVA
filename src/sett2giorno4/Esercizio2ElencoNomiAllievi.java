package sett2giorno4;
import java.util.Scanner;
public class Esercizio2ElencoNomiAllievi {
    public static void main(String[] args) {
        int numeroNomi=0;
        // creo un array di stringhe con un caricamento statico
        // String[] nomiAllievi = {"Cristian", "Michela", "Mauro"};
        String[] nomiAllievi ;
        Scanner input = new Scanner(System.in);
        System.out.println("Dimmi quanti nomi devi inserire");
        numeroNomi = input.nextInt();
        // creo l'array con il numero di nomi inserito
        nomiAllievi = new String[numeroNomi];
        for(int i=0; i < numeroNomi; i++) {
            System.out.println("Inserisci il nome " + (i+1));
            nomiAllievi[i]= input.next();
        }
        // stampa il "pseudo" indirizzo di memoria
        // System.out.println(nomiAllievi);
        for(int i=0; i<nomiAllievi.length;i++) {
            System.out.println( nomiAllievi [i] + " ha " + nomiAllievi [i].length() + " lettere");
        }
    }
}
