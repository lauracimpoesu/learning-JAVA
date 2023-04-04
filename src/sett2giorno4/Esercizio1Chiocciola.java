package sett2giorno4;
import java.util.Scanner;
public class Esercizio1Chiocciola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la main, ti dirò se è valida o no");
        String email = input.nextLine();
        String errore = "";

        if(email.indexOf("@") == -1) {
            errore += "- manca la chiocciola \n";
        }
        if (email.indexOf(".") == -1){
            errore += "- manca il punto \n";
        }
        if (errore.length() > 0) {
            System.out.println("Mail non valida:\n" + errore);
        } else {
            System.out.println("Mail valida.");
        }
    }
}
