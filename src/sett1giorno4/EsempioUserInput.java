package sett1giorno4;
/*
ESERCIZIO NR. 3 - CREAZIONE NUOVA CLASSE CON METODO MAIN
LETTURA INPUT DIGITATO DALL'UTENTE (A CONSOLE)
STAMPARE A VIDEO IL CONTENUTO
 */

import java.util.Scanner;

public class EsempioUserInput {
    public static void main(String[] args) {
        Scanner myUsersInput = new Scanner(System.in);
        System.out.println("What's your favorite color?");
        String favoriteColor = myUsersInput.nextLine();
        System.out.println("My fav color is: " + favoriteColor + ".");
        myUsersInput.close();
    }
}
