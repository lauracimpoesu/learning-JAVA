package sett1giorno5;
/* Esercizio 2 - Modificare il metodo main in modo tale che stampi
a video una serie di variabili di tipo diverso inizializzate a piacere.
*/

public class Esercizio2Parte1 {
    public static void main(String[] args) {
        // Variables
        byte myByte = 1;
        short myShort = 33, mySecondShort = 77;
        int myInt = 200;
        long myLong = 500;
        float myFloat = 1.00F;
        double myDouble = 30.000;
        boolean myBoolean = true, mySecondBool = false;
        char myChar = 'L';
        String favQuote = "Never give up";

        System.out.println(
                "My byte: " + myByte + ". \n" +
                "My short: " + myShort + " and " + mySecondShort + ". \n" +
                "My int: " + myInt + ". \n" +
                "My long: " + myLong + ". \n" +
                "My float: " + myFloat + ". \n" +
                "My double: " + myDouble + ". \n" +
                "My boolean: " + myBoolean + " and " + mySecondBool + ". \n" +
                "My char: " + myChar + ". \n" +
                "My favourite quote is: " + favQuote + ". \n"
        );
    }
}
