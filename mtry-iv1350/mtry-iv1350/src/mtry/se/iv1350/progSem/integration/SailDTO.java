package mtry.se.iv1350.progSem.integration;

/**
 * Kondens spatrade köpta varor
 */
public class SailDTO {
    private VaraLista sailVaror = new VaraLista();

    /**
     * Lägger till en vara med en antal,
     * 
     * @param nyVara
     */
    public VaraLista loggaVara(Vara nyVara) {
        int antal = 1;
        nyVara.setAntal(antal);
        kolladInlagdaVaror(nyVara);

        return sailVaror;
    }

    /**
     * Lägger till varor vid fler
     * 
     * @param nyVara
     * @param antal
     */
    public VaraLista loggaVara(Vara nyVara, int antal) {
        nyVara.setAntal(antal);
        kolladInlagdaVaror(nyVara);

        return sailVaror;
    }

    /**
     * Kollar efter tidigare inlagda
     * 
     * @param nyVara
     */
    private void kolladInlagdaVaror(Vara nyVara) {

        boolean finns = false;
        for (int i = 0; i < sailVaror.getLength(); i++) {
            if (nyVara.getId() == sailVaror.getVara(i).getId()) {
                varaFinns(nyVara, i);
                finns = true;
            }
        }

        if (finns == false) {
            varaFinnsEj(nyVara);
        }
    }

    /**
     * Vara hittades och ökar antal av denna vara
     * 
     * @param nyVara
     * @param nr
     */
    private void varaFinns(Vara nyVara, int nr) {
        int antal = sailVaror.getVara(nr).getAntal();
        antal = antal + nyVara.getAntal();
        sailVaror.getVara(nr).setAntal(antal);
    }

    /**
     * Varan hittades inte vid det tidigare köpen
     * 
     * @param nyVara
     */
    private void varaFinnsEj(Vara nyVara) {
        sailVaror.laggTill(nyVara);
    }

}
