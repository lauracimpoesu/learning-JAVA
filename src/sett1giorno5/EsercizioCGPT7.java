package sett1giorno5;
/*
Scrivere un programma che chieda all'utente di inserire una
serie di numeri interi separati da virgole e poi determini
il valore massimo e il valore minimo di quei numeri
utilizzando l'if e il for loop.
*/

public class EsercizioCGPT7 {
    public static void main(String[] args) {
        String myString = "1,2,3,4,5,6,7,8,9,10";
        String[] myStringArray = myString.split(",");
        int[] myIntArray = new int[myStringArray.length];
        for (int i = 0; i < myStringArray.length; i++) {
            myIntArray[i] = Integer.parseInt(myStringArray[i]);
        }
        int max = myIntArray[0];
        int min = myIntArray[0];
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] > max) {
                max = myIntArray[i];
            }
            if (myIntArray[i] < min) {
                min = myIntArray[i];
            }
        }
        System.out.println("Il valore massimo è " + max + ".");
        System.out.println("Il valore minimo è " + min + ".");
    }
}
