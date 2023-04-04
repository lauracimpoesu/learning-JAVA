package sett1giorno4;
import java.util.Scanner;
/* ESERCIZIO NR. 6 - CREAZIONE NUOVA CLASSE CON METODO MAIN
LETTURA DI NUMERI INPUT DIGITATI DALL'UTENTE (A CONSOLE)
STAMPARE A VIDEO IL CONTENUTO
 */
public class UserInputPro {
    public static void main(String[] args) {
        Scanner inputNumeri = new Scanner(System.in);
        System.out.println("What is your fave number?");
        int favNum = inputNumeri.nextInt();
        inputNumeri.nextLine();
        System.out.println("My fave number is: " + favNum + ".");
        inputNumeri.close();
    }
}

