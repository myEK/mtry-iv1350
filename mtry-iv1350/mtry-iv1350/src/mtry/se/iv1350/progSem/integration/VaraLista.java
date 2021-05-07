package mtry.se.iv1350.progSem.integration;

/**
 * Skapar en varalista över varorna
 */
public class VaraLista {
    private Vara[] vara;
    private double pris;
    private double moms;

    /**
     * Skapar en varulista
     */
    public VaraLista() {
        this.vara = new Vara[0];
        pris = 0;
        moms = 0;
    }

    /**
     * skapa vara av vaulista
     * 
     * @param vara
     */
    public VaraLista(Vara[] vara) {
        this.vara = new Vara[vara.length];
        this.pris = 0;
        this.moms = 0;
        for (int i = 0; i < vara.length; i++) {
            this.vara[i] = new Vara(vara[i]);
            this.pris += vara[i].getPris() * listVara[i].getAntal();
            this.moms += (vara[i].getPris()  * listVara[i].getAntal() * vara[i].getmomsProcent() / 100);
        }
    }

    /**
     * skapar in en ny vara i listan
     * 
     * @param varaNy
     */
    public void laggTill(Vara varaNy) {
        Vara[] listVara = new Vara[this.vara.length + 1];
        int i = 0;
        for (i = 0; i < this.vara.length; i++)
            listVara[i] = this.vara[i];
        listVara[i] = new Vara(varaNy);
        this.pris += (listVara[i].getPris() * listVara[i].getAntal();
        this.moms += (listVara[i].getPris() * listVara[i].getAntal() * listVara[i].getmomsProcent() / 100);
        this.vara = listVara;
    }
                      
    /**
     * uppdaterar priset vid fler registrerade varor
     * 
     * @param vara
     * @param antal
     */
    public void setPris(Vara vara) {
        this.pris = this.pris + (vara.getPris() * vara.getAntal());
        this.moms = this.moms + (vara.getPris() * vara.getAntal() * vara.getmomsProcent() / 100);

    }
                      
                      
    /**
     * Registrerar hur många inregistrerae olika varor (ID)
     * 
     * @return length
     */
    public int getLength() {
        return this.vara.length;
    }

    /**
     * Får ut en vara från spesifik plats
     * 
     * @param nr
     * @return
     */
    public Vara getVara(int nr) {
        return this.vara[nr];
    }

    /**
     * Retuerar priset på köpet
     * 
     * @return pris
     */
    public double getPris() {
        return this.pris;
    }                   

    /**
     * Retuerar momsen på köpet
     * 
     * @return momsen på köpet
     */
    public double getMoms() {
        return this.moms;
    }

    /**
     * Retyerar det varor som är inlagda
     * 
     * @return string
     */
    public String toString() {
        String s = "\n";
        int antal = 0;
        for (int y = 0; y < 23; y++)
            s = s + "___";
        s = s + "\n\n";
        for (int i = 0; i < this.vara.length; i++) {
            s = s + this.vara[i].toString() + "\n";
            antal = antal + this.vara[i].getAntal();

        }
        for (int y = 0; y < 23; y++)
            s = s + "___";
        s = s + "\n\n Köpt " + antal + "st varor för " + pris + " kr (" + moms + "kr moms inkluderat)\n";
        for (int y = 0; y < 23; y++)
            s = s + "___";
        s = s + "\n";
        return s;
    }

}
