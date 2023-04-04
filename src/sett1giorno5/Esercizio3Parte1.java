package sett1giorno5;
import java.util.Scanner;
/*
Esercizio 3 - Creare una nuova classe Java dotata di un
metodo main. Il metodo dovrà leggere l’input digitato
dall’utente a console e stamparne a video il contenuto
*/
public class Esercizio3Parte1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Who I Love?");
        String whoILove = input.nextLine();
        System.out.println("I love... " + whoILove);
    }
}
