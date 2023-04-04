package sett1giorno5;
/*
Modificare l’esercizio precedente e fare in modo
che vengano stampati a video solo i numeri pari.
*/
public class Esercizio8Parte3 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                if ((i * j) % 2 == 0) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
            }
        }
    }
}
