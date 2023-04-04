package sett1giorno5;
import java.util.Scanner;
/*
Scrivere un metodo che, preso in input un valore che indica
una quantità in dollari, lo trasformi in euro.
Stampare il risultato a video.
*/
public class Esercizio7Parte1 {
    public static void main(String[] args) {
        Scanner inputDollarsToEuros = new Scanner(System.in);
        System.out.println("Dollars To Euros Conversion");
        double eurosCurrentValue = 0.92;
        double dollarsCurrentValue = inputDollarsToEuros.nextInt();
        double conversion = dollarsCurrentValue * eurosCurrentValue;
        inputDollarsToEuros.nextLine();
        System.out.println(
                "The current value in dollars is: " + dollarsCurrentValue
                        + "." + "And the value transformed in euros is... "
                        + conversion);
    }
}
