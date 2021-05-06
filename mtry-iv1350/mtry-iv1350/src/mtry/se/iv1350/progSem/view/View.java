package mtry.se.iv1350.progSem.view;

import mtry.se.iv1350.progSem.controller.*;

/**
 * användare
 */
public class View {
    Controller troll = new Controller();
    java.util.Scanner in = new java.util.Scanner(System.in);

    /**
     * Skriv in artikel ID
     */
    public void aderaVaror() {

        int varaID = 0;
        int antal = 0;
        String svar = "";

        for (int i = 0; i < 5; i++) {

            System.out.print("Skrive artikel id: ");
            varaID = in.nextInt();

            svar = troll.laggTillVara(varaID);
            System.out.println(svar);

            System.out.print("Skrive artikel id: ");
            varaID = in.nextInt();
            System.out.print("Skrive antal av varan: ");
            antal = in.nextInt();

            svar = troll.laggTillVara(varaID, antal);
            System.out.println(svar);

        }
    }
}
