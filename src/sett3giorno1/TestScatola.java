package sett3giorno1;
public class TestScatola {
    public static void main(String[] args) {
        Scatola prima;
        // assegno al puntatore un oggetto creandolo con la parola chiave new
        // ed il suo "costruttore"
        prima = new Scatola();
        // Assegno alla scatola una sua dimensione
        prima.altezza = 7.5;
        // stampo le informazioni della scatola
        System.out.println("La scatola prima ha lunghezza " + prima.lunghezza
                + ", altezza " + prima.altezza + " e larghezza "
                + prima.larghezza);
    }
}

