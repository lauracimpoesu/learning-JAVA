package sett1giorno4;
/*
VOGLIO PRENDERE IN INPUT UN DATO DALL'UTENTE
USO LO Scanner DI JAVA; E INFINE LO STAMPO A SCHERMO
*/

import java.util.Scanner;

public class EsempioScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita un numero intero");
        int numero = input.nextInt();
        input.close();
        System.out.println("Il numero è " + numero);
    }
}
