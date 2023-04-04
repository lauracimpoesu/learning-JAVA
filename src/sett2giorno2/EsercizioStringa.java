package sett2giorno2;
import java.util.Scanner;
public class EsercizioStringa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nome = input.nextLine();

        for (int i = 1; i <= nome.length(); i++) {
            String temp = nome.substring(0, i);
            System.out.println(temp);
        }
    }
}


