package sett1giorno5;
public class Esercizio9Parte1Pro {
    public static void main(String[] args) {
        int numeroMax = 10;
        for(int i = 0; i <= numeroMax; i++) {
            int quadrato = i*i;
            System.out.print(quadrato + "\t");
        }
        System.out.println();

        for(int i = 0; i <= numeroMax; i++) {
            int cubo = i*i*i;
            System.out.print(cubo + "\t");
        }
    }
}
