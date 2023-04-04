package sett3giorno1;
import java.util.Scanner;
public class ArrayOperazioniCC {
    public static void main(String[] args) {
        String operazioneCercata = "";
        double sommaOperazioni = 0;
        Scanner input = new Scanner(System.in);
        OperazioneContoCorrente[] arrayOperazioniCC = new OperazioneContoCorrente[5];
        arrayOperazioniCC[0] = new OperazioneContoCorrente();
        arrayOperazioniCC[0].setContoCorrenteDati("IT123456789", "prelievo", "01/01/2020", "1000");
        arrayOperazioniCC[1] = new OperazioneContoCorrente();
        arrayOperazioniCC[1].setContoCorrenteDati("IT987654321", "versamento", "02/02/2021", "2000");
        arrayOperazioniCC[2] = new OperazioneContoCorrente();
        arrayOperazioniCC[2].setContoCorrenteDati("IT123456789", "prelievo", "03/03/2022", "3000");
        arrayOperazioniCC[3] = new OperazioneContoCorrente();
        arrayOperazioniCC[3].setContoCorrenteDati("IT987654321", "prelievo", "04/04/2023", "4000");
        arrayOperazioniCC[4] = new OperazioneContoCorrente();
        arrayOperazioniCC[4].setContoCorrenteDati("IT123456789", "versamento", "05/05/2024", "5000");

        System.out.println("Inserisci l'operazione di cui vuoi il riepilogo, 'p' per prelievo e 'v' per versamento");
        operazioneCercata = input.next();
    }
}


