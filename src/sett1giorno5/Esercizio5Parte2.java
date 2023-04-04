package sett1giorno5;
public class Esercizio5Parte2 {
    public static void main(String[] args) {
        int int_one = 20;
        int int_two = 10;
        int resto = int_one % int_two;

        if (resto == 0) {
            System.out.println(int_one + " è un multiplo di " + int_two);
        } else {
            System.out.println("non lo è");
        }
    }
}
