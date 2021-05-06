package mtry.se.iv1350.progSem.model;

import mtry.se.iv1350.progSem.integration.*;

public class Sail {
    VaraDTO vDto = new VaraDTO();
    Vara vara = new Vara();
    SailDTO sDto = new SailDTO();

    /**
     * sickar vidare informationen till kollaren
     * 
     * @param varaID
     * @return VaraLista ststus medelande
     */
    public VaraLista registreraVara(int varaID) {

        Vara pVara = vDto.kollaVara(varaID);
        boolean finns = hittaVara(pVara);
        VaraLista status = null;
        if (finns == true) {
            status = sDto.loggaVara(pVara);
        }

        return status;
    }

    /**
     * sickar vidare informationen till kollaren
     * 
     * @param varaID
     * @param varaIDAntal
     * @returnVaraLista ststus medelande
     */
    public VaraLista registreraVara(int varaID, int varaIDAntal) {

        Vara pVara = vDto.kollaVara(varaID);
        boolean finns = hittaVara(pVara);

        VaraLista status = null;
        if (finns == true) {
            status = sDto.loggaVara(pVara, varaIDAntal);
        }
        return status;
    }

    /**
     * Kollar om varan finns inregistrerad sant värde.
     * 
     * @param pVara
     * @return
     */
    private boolean hittaVara(Vara pVara) {

        boolean finns = true;
        if (pVara.getNamn() == "" && pVara.getPris() == 0 && pVara.getmomsProcent() == 0) {
            finns = false;
        }
        return finns;
    }

}
