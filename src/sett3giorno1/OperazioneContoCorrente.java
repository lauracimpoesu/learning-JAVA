package sett3giorno1;
// numero conto corrente, valore operazione e la data
// creare costruttore
// creare array operazioni
public class OperazioneContoCorrente {
    // Attributi
    String codiceIban;
    String operazioni;
    String data;
    String importo;
    // Metodo per settare gli attributi
    void setContoCorrenteDati(String codiceIban, String operazioni, String data, String importo) {
        this.codiceIban = codiceIban;
        this.operazioni = operazioni;
        this.data = data;
        this.importo = importo;
    }
}
