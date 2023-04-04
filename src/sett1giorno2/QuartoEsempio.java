package sett1giorno2;

public class QuartoEsempio {
    public static void main(String[] args) {
        int a, b, c;
        boolean firstBool, secondBool, thirdBool;
        a = 4;
        b = 2;
        c = 7;
        firstBool = a > b;
        secondBool = b > c;
        thirdBool = a > c;

        System.out.println("I numeri inseriti sono " +
                a + ", " + b + ", " + c + ". Che valgono... " + firstBool + ", " + secondBool + ", " + thirdBool + ".");
    }
}
