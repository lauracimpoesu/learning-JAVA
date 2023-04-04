package sett3giorno1;
public class TestArrayScatole {
    public static void main(String[] args) {
        Scatola [] arrayScatole = new Scatola[5];
        arrayScatole[0] = new Scatola();
        arrayScatole[0].setCaratteristiche(10, 20, 30);
        arrayScatole[1] = new Scatola();
        arrayScatole[1].setCaratteristiche(20, 70, 90);
        // Stampare arrayScatole[0] e arrayScatole[1]
        for(int i = 0; i < arrayScatole.length; i++) {
            if(arrayScatole[i] != null) {
                System.out.println("Scatola " + i + ": " + arrayScatole[i].lunghezza + " "
                        + arrayScatole[i].larghezza + " " + arrayScatole[i].altezza);
            }
        }
    }
}

