package sett1giorno5;
import java.util.Scanner;
public class Esercizio6Parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto hai preso?");
        int voto = input.nextInt();
        input.close();
        System.out.println("Il tuo voto: " + voto);

        char categoriaA = 'A';
        char categoriaB = 'B';
        char categoriaC = 'C';
        char categoriaD = 'D';
        switch (voto) {
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                if (categoriaA == 'A') {
                    System.out.println("Fai parte della categoria A");
                } else {
                    System.out.println("Bocciato");
                }
                break;
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                if (categoriaB == 'B') {
                    System.out.println("Fai parte della categoria B");
                } else {
                    System.out.println("Bocciato");
                }
                break;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                if (categoriaC == 'C') {
                    System.out.println("Fai parte della categoria C");
                } else {
                    System.out.println("Bocciato");
                }
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                if (categoriaD == 'D') {
                    System.out.println("Fai parte della categoria D");
                } else {
                    System.out.println("Bocciato");
                }
                break;
            default:
                System.out.println("Bocciato");
                break;
        }
    }
}