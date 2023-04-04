package sett3giorno2;

public class Persona {
    String nome;
    String cognome;
    String codiceFiscale;

    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public Persona(String colore, String macchina) {
        this.colore = colore;
        this.macchina = macchina;
    }

    public Persona(String canzone) {
        this.canzone = canzone;
    }

    public Persona() {
        this.nome = "Mario";
        this.cognome = "Rossi";
        this.codiceFiscale = "RSSMRA80A01H501L";
    }

    void setCaratteristiche(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    String info() {
        return "Nome: " + nome + ", Cognome: " + cognome + ", Codice Fiscale: " + codiceFiscale
                + ", Colore: " + colore + ", Macchina: " + macchina + ", Canzone: " + canzone;
    }

    String colore;
    String macchina;
    String canzone;

}
