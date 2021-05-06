package mtry.se.iv1350.progSem.integration;

/**
 * Sparar det inlagda varorna
 */
public class VaraDTO {

    /**
     * vara strukturen
     */
    public Vara pVaras = new Vara();

    /**
     * Inlagda olika varor i systemet
     */
    public VaraLista vListaSystem = new VaraLista();

    /**
     * Skapar en ny varolista
     */
    public void varaListaNy() {

        pVaras.setVara("Kolrot", 5, 1, 3, 25);
        vListaSystem.laggTill(pVaras);
        pVaras.setVara("Palsternaka", 24, 1, 12, 25);
        vListaSystem.laggTill(pVaras);
        pVaras.setVara("Tomat", 2, 1, 9, 25);
        vListaSystem.laggTill(pVaras);
        pVaras.setVara("Gurka", 11, 1, 15, 25);
        vListaSystem.laggTill(pVaras);
        pVaras.setVara("Annanas", 22, 1, 16, 25);
        vListaSystem.laggTill(pVaras);

    }

    /**
     * Gemför varaID mot registet, Om varan finns sickar upgifter om den, Annars en
     * trom vara information med frågande varaID;
     * 
     * @param varaID
     * @return vara
     */

    public Vara kollaVara(int varaID) {

        varaListaNy();

        pVaras.setVara();
        pVaras.setID(varaID);

        for (int i = 0; i < vListaSystem.getLength(); i++) {

            if (varaID == vListaSystem.getVara(i).getId()) {
                pVaras.setVara(vListaSystem.getVara(i));
            }
        }
        return pVaras;
    }

}
