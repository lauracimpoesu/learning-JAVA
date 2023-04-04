package sett3giorno2;
// ARRAY PERSONA/E

public class PersonaScatola {
    public static void main(String[] args) {
        Persona [] arrayPersone = new Persona[2];

        arrayPersone[0] = new Persona("Mario", "Rossi", "RSSMRA80A01H501L");
        arrayPersone[1] = new Persona("Luigi", "Verdi", "VRDLGI80A01H501L");

        for(int i = 0; i < arrayPersone.length; i++) {
            if(arrayPersone[i] != null) {
                System.out.println(arrayPersone[i].info());
            }
        }
    }
}
