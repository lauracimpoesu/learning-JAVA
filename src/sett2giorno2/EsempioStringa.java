package sett2giorno2;
import java.util.Scanner;
public class EsempioStringa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dimmi il tuo nome");
        String nome = input.nextLine();
        input.close();

        int lunghezza = nome.length(); // se è una stringa length() con le parentesi tonde
        // Se voglio trasformare la stringa in upper case:
        String nomeMaiuscolo = nome.toUpperCase();
        String nomeMinuscolo = nome.toLowerCase();
        char primaLettera = nome.charAt(0); // perchè in memoria la Stringa è un ARRAY DI CHARS
        System.out.println(
                "Il nome è " + nome + ". La lunghezza è " + lunghezza + ". Maiuscolo "
                + nomeMaiuscolo + ", minuscolo " + nomeMinuscolo + ". La prima lettera è "
                + primaLettera + "."
        );
    }
}

