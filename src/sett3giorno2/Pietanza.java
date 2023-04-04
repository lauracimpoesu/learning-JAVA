package sett3giorno2;

public class Pietanza {
    String tipo;
    String nome;
    int prezzo;
    String[] ingredienti;

    public Pietanza(String tipo, String nome, int prezzo, String[] ingredienti) {
        this.tipo = tipo;
        this.nome = nome;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
    }

public Pietanza() {
        this.tipo = "Primo";
        this.nome = "Pasta";
        this.prezzo = 5;
        this.ingredienti = new String[]{"Sugo", "Formaggio"};
    }



}
