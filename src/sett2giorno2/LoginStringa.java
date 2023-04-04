package sett2giorno2;
import java.util.Scanner;
public class LoginStringa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita username e password");
        String username = input.nextLine();
        String password = input.nextLine();
        input.close();

        if (username.equals("ut") && password.equals("pass")) {
            System.out.println("Benvenuto Utente!");
        } else if (username.equals("root") && password.equals("passroot")) {
            System.out.println("Benvenuto Utente!");
        }

        int tentativi = 3;
        for (int i = 0; i <= tentativi; i++) {
            if (username.equals("ut") || password.equals("pass")) {
                //System.out.println("Benvenuto Utente!");
                i++;
                System.out.println("Hai ancora 2 tentativi");
                break;
            } else if (username.equals("root") || password.equals("passroot")) {
                //System.out.println("Benvenuto Utente!");
                i++;
                System.out.println("Hai ancora 1 tentativo");
                break;
            } else {
                i++;
                System.out.println("Tentativi finiti");
                break;
            }
        }
    }
}


