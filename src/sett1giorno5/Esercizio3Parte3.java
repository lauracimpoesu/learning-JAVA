package sett1giorno5;
/*
Riscrivere l’esercizio 9 del modulo relativo alla
sintassi base di Java, utilizzando l’istruzione iterativa.
*/
public class Esercizio3Parte3 {
    public static void main(String[] args) {
        int numeroBase = 10;
        int fattoriale = 1;
        for (int i = 1; i <= numeroBase; i++) {
            fattoriale *= i;
        }
        System.out.println("Il fattoriale di " + numeroBase + " è " + fattoriale);
    }
}