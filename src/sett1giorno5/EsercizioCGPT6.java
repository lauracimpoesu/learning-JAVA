package sett1giorno5;
/*
Scrivere un programma che chieda all'utente di inserire una
stringa e poi determini se quella stringa è un palindromo
(cioè se può essere letta allo stesso modo da sinistra
a destra e viceversa) utilizzando l'if e il for loop.
*/

public class EsercizioCGPT6 {
    public static void main(String[] args) {
        String myString = "anna";
        String reverseString = "";
        for (int i = myString.length() - 1; i >= 0; i--) {
            reverseString += myString.charAt(i);
        }
        if (myString.equals(reverseString)) {
            System.out.println(myString + " è un palindromo.");
        } else {
            System.out.println(myString + " non è un palindromo.");
        }
    }
}
