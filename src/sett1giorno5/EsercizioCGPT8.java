package sett1giorno5;
/*
Scrivere un programma che chieda all'utente di inserire una
serie di numeri interi e poi determini quanti di quei numeri sono
positivi e quanti sono negativi utilizzando l'if e il for loop.
*/

public class EsercizioCGPT8 {
    public static void main(String[] args) {
        String myString = "1,2,3,4,5,6,7,8,9,10";
        String[] myStringArray = myString.split(",");
        int[] myIntArray = new int[myStringArray.length];
        for (int i = 0; i < myStringArray.length; i++) {
            myIntArray[i] = Integer.parseInt(myStringArray[i]);
        }
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("I numeri positivi sono " + positive + ".");
        System.out.println("I numeri negativi sono " + negative + ".");
    }
}
