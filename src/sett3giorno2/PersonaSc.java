package sett3giorno2;

public class PersonaSc {
    public static void main(String[] args) {
        Persona prima, seconda;
        prima = new Persona();
        seconda = new Persona();
        prima.nome = "Laura";
        prima.cognome = "Jen";
        prima.codiceFiscale = "RSSMRA80A01H501L";
        seconda.nome = "Nicole";
        seconda.cognome = "Blue";
        seconda.codiceFiscale = "VRDLGI80A01H501L";

        System.out.println(prima.info());
        System.out.println(seconda.info());


        Persona terza = new Persona("Dalex - Mejor");
        System.out.println(terza.info());

        Persona quarta = new Persona("Rosso", "BMW X7");
        System.out.println(quarta.info());
    }
}

