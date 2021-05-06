package mtry.se.iv1350.progSem.integration;

/**
 * Vara strukturer hur varan är uppbygd.
 */
public class Vara {
    private String namn;
    private int id;
    private int antal;
    private double pris;
    private int momsProcent;

    /**
     * Skapar ny vara
     */
    public Vara() {
        namn = "";
        id = 0;
        antal = 0;
        pris = 0;
        momsProcent = 0;
    }

    /**
     * skapar ny vara i registet
     * 
     * @param namn
     * @param id
     */
    public Vara(String namn, int id) {
        this.namn = namn;
        this.id = id;
        antal = 1;
        pris = 0;
        momsProcent = 0;
    }

    /**
     * skapar ny vara i registet
     * 
     * @param namn
     * @param id
     * @param pris
     */
    public Vara(String namn, int id, double pris) {
        this.namn = namn;
        this.id = id;
        this.pris = pris;
        antal = 1;
        momsProcent = 0;
    }

    /**
     * Skapar ny vara i registet
     * 
     * @param namn
     * @param id
     * @param pris
     * @param momsProcent
     */
    public Vara(String namn, int id, double pris, int momsProcent) {
        this.namn = namn;
        this.id = id;
        this.pris = pris;
        antal = 1;
        this.momsProcent = momsProcent;
    }

    /**
     * Skapar ny vara i registet.
     * 
     * @param vara
     */
    public Vara(Vara vara) {
        this.namn = vara.namn;
        this.id = vara.id;
        this.pris = vara.pris;
        this.antal = vara.antal;
        this.momsProcent = vara.momsProcent;
    }

    /**
     * Om Varan registrerar tomhänt
     * 
     */
    public void setVara() {
        namn = "";
        id = 0;
        pris = 0;
        antal = 0;
        momsProcent = 0;
    }

    /**
     * Ändrar Id till efterfrågan
     * 
     * @param id
     */
    public void setID(int varaID) {
        this.id = varaID;
    }

    /**
     * för ändra antalet köpta varor, vid köp av flera
     * 
     * @param antal
     */
    public void setAntal(int antal) {
        this.antal = antal;
    }

    /**
     * Skapa en ny vara an en annan vara
     * 
     * @param vara
     */
    public void setVara(Vara vara) {
        this.namn = vara.namn;
        this.id = vara.id;
        this.antal = vara.antal;
        this.pris = vara.pris;
        this.momsProcent = vara.momsProcent;
    }

    /**
     * Ändra värde på vara.
     * 
     * @param namn
     * @param id
     * @param antal
     * @param pris
     * @param momsProcent
     */
    public void setVara(String namn, int id, int antal, double pris, int momsProcent) {
        this.namn = namn;
        this.id = id;
        this.antal = antal;
        this.pris = pris;
        this.momsProcent = momsProcent;
    }

    /**
     * Returerar varans namn
     * 
     * @return namn
     */
    public String getNamn() {
        return namn;
    }

    /**
     * Returerar varans id
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Returerar varans pris
     * 
     * @return pris
     */
    public double getPris() {
        return pris;
    }

    /**
     * Returerar antal av varan
     *
     * @return antal
     */
    public int getAntal() {
        return antal;
    }

    /**
     * Retuerar varans momssatts
     * 
     * @return momsProcent
     */
    public int getmomsProcent() {
        return momsProcent;
    }

    /**
     * Retuerar varans info
     * 
     * @return string om varan.
     */
    public String toString() {

        String s = String.format("ID: %-4d \t %-15s %8.2f (%2d %% moms)", id, namn, pris, momsProcent);
        if (antal > 1) {
            s = String.format("ID: %-4d (%2d st) %-15s %8.2f (%2d %% moms, %4.2f kr/st)", id, antal, namn,
                    (pris * antal), momsProcent, pris);
        }
        return s;
    }
}
