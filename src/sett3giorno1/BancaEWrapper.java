package sett3giorno1;
public class BancaEWrapper {
    public static void main(String[] args) {
        String [][] datiBanca = {
                {"cc5423", "prelievo", "4500", "01/03/22",},
                {"cc5423", "prelievo", "1500", "11/03/22",},
                {"cc5423", "prelievo", "4500", "21/01/22",},
                {"cc5423", "prelievo", "300", "12/02/22",}
        };
        int sommaPrelievi = 0;
        for (int i = 0; i < datiBanca.length; i++) {
            // SPLIT crea un array partendo da una stringa e un separatore
            String [] datiData = datiBanca[i][3].split("/");
            // il risultato sarà che in datiData[0] ho il giorno, in datiData[1] il mese, in datiData[2] l'anno
            String giorno = datiData[0];
            String mese = datiData[1];
            String anno = datiData[2];
            String meseCercato = "03";
            String meseDellaRiga = datiBanca[i][3].substring(3, 5);
            if (datiBanca[i][1].equals("prelievo") && meseCercato.equals(meseDellaRiga)) {
                sommaPrelievi += Integer.parseInt(datiBanca[i][2]);
                System.out.println("La somma dei prelievi è: " + sommaPrelievi);
            }
        }
    }
}
