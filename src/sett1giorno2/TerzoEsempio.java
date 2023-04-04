package sett1giorno2;

public class TerzoEsempio {
    public static void main(String[] args) {
        char lettera1, lettera2, lettera3;
        int sommaChars;
        lettera1 = 'x';
        lettera2 = 'y';
        lettera3 = 'z';
        sommaChars = lettera1 + lettera2 + lettera3;
        System.out.println("Le lettere inserite sono :"
                + lettera1 + ", " + lettera2 + ", " + lettera3 + ". \n" +
                "Lettera 1 ha valore unicode di: " + (short)lettera1 + ". \n" +
                "Lettera 2 ha valore unicode di: " + (short)lettera2 + ". \n" +
                "Lettera 3 ha valore unicode di: " + (short)lettera3 + ".\n" + "E la somma totale è "
                + (char)sommaChars + ". Con valore unicode totale di:" + sommaChars
        );
    }
}
