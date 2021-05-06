package mtry.se.iv1350.progSem.controller;

import mtry.se.iv1350.progSem.model.Sail;
import mtry.se.iv1350.progSem.integration.*;

/**
 * Över systemet
 */
public class Controller {
    Sail sail = new Sail();

    /**
     * Sickar felmedelande till användare om något inte stämmer anars vanliga
     * inregistrerade varor
     * 
     * @param varaID
     * @return status string
     */
    public String laggTillVara(int varaID) {
        VaraLista vLista = sail.registreraVara(varaID);
        return felMedelande(vLista, varaID);
    }

    /**
     * Sickar felmedelande till användare om något inte stämmer anars vanliga
     * inregistrerade varor
     * 
     * @param varaID
     * @return status string
     */
    public String laggTillVara(int varaID, int antal) {
        VaraLista vLista = sail.registreraVara(varaID, antal);
        return felMedelande(vLista, varaID);
    }

    /**
     * 
     * @param vLista
     * @param varaID
     * @return medelande string
     */
    private String felMedelande(VaraLista vLista, int varaID) {
        String s = "";
        if (vLista == null) {
            s = "\n\nDet finns ingen vara med den avgivna varaID " + varaID + " i systemet! \n\n";
        } else {
            s = vLista.toString();
        }
        return s;
    }

}
