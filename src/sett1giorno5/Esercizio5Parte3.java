package sett1giorno5;
/*
Scrivere un programma che stampi a video le tabelline da 1 a 10.
Suggerimento. Si utilizzino due cicli annidati.
*/
public class Esercizio5Parte3 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
