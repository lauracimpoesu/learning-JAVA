package sett1giorno5;
import java.util.Scanner;
/*
Scrivere un metodo che legga in input un numero
intero e verifichi se è positivo, negativo o nullo.
*/
public class EsercizioCGPT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Positivo, Negativo o Nullo? 🤔");
        int dato = input.nextInt();
        input.close();

        if (dato > 0) {
            System.out.println(dato + " è positivo");
        } else if (dato < 0) {
            System.out.println(dato + " è negativo");
        } else if (dato == 0) {
            System.out.println(dato + " è nullo");
        }
    }
}
