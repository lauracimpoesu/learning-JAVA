package sett1giorno5;
/*
Scrivere un’applicazione che calcoli il quadrato e il cubo
dei numeri da 0 a 10 e li visualizzi in forma tabellare.
*/

public class Esercizio9Parte1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int calcoloQuadrato = i*i;
            System.out.print(calcoloQuadrato * 3 + "\t");
        }
        // CALCOLO DEL CUBO E DEL QUADRATO GIUSTO
        for (int i = 0; i < 10; i++) { // i = 0
            int calcoloCubo = i*i*i; // calcoloCubo = 0
            System.out.print(calcoloCubo + "\t"); // 0
        }
    }
}

