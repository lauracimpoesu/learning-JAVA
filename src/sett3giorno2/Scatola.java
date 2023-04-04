package sett3giorno2;
public class Scatola {
    double lunghezza;
    double larghezza;
    double altezza;

    void setCaratteristiche(double lu, double la, double al) {
        lunghezza = lu;
        larghezza = la;
        altezza = al;
    }

/*
    funziona ma non è corretto - lega le info al system:
        void info() {
        System.out.println(
                "La scatola prima ha lunghezza: " + lunghezza
                + " larghezza: " + larghezza
                + "e altezza: " + altezza
        );
*/
    String info() {
        String ris =
                "La scatola ha lunghezza: " + lunghezza
                + " larghezza: " + larghezza
                + " e altezza: " + altezza;
        return ris;
    }



}
