package sett3giorno2;

public class TestScatola {
    public static void main(String[] args) {
        Scatola prima, seconda;
        prima = new Scatola();
        seconda = new Scatola();
        prima.altezza = 7.5;
        seconda.larghezza = 8.9;

        System.out.println(prima.info());
        System.out.println(seconda.info());
    }



}

