package sett3giorno2;
// ARRAY
public class TestArrayScatole {
    public static void main(String[] args) {
        Scatola [] arrayScatole = new Scatola[5];
        arrayScatole[0] = new Scatola();
        arrayScatole[0].setCaratteristiche(10, 20, 30);
        arrayScatole[1] = new Scatola();
        arrayScatole[1].setCaratteristiche(20, 70, 90);

        for(int i = 0; i < arrayScatole.length; i++) {
            if(arrayScatole[i] != null) {
                System.out.println(arrayScatole[i].info());
            }
        }
    }
}