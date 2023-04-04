package sett1giorno5;
import java.util.Scanner;
public class Esercizio8Parte1Pro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero 1");
        int primo = input.nextInt();
        input.nextLine();
        System.out.println("Numero 2");
        int secondo = input.nextInt();
        input.nextLine();
        System.out.println("Numero 3");
        int terzo = input.nextInt();
        input.close();

        int grande= 0;
        int piccolo= 0;
        if(primo>secondo && primo>terzo) {
            grande = primo;
        }
        else if(secondo>primo && secondo>terzo) {
            grande = secondo;
        }
        else {
            grande = terzo;
        }
        if(primo<secondo && primo<terzo) {
            piccolo = primo;
        }
        else if(secondo<primo && secondo<terzo) {
            piccolo = secondo;
        }
        else {
            piccolo = terzo;
        }

        System.out.println("Max: " + grande + ".");
        System.out.println("Min: " + piccolo + ".");
    }
}
