package clone;

public class ContenantLiquide implements Cloneable {
    private String nom; //BECHER, ERLENMEYER, EPROUVETTE, COMPTE GOUTTE, PIPETTE... (verrerie en chimie)
    private Liquide liquide;
    private int capaciteMl; //capacité du contenant en millilitre
    private int qte; //quantité de liquide dans le contenant

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapaciteMl() {
        return capaciteMl;
    }

    public void setCapaciteMl(int capaciteMl) {
        this.capaciteMl = capaciteMl;
    }

    public ContenantLiquide(String nom, Liquide liquide, int capaciteMl, int qte) {
        this.nom = nom;
        this.liquide = liquide;
        this.capaciteMl = capaciteMl;
        this.qte = qte;
    }

    public Liquide getLiquide() {
        return liquide;
    }

    public void setLiquide(Liquide liquide) {
        this.liquide = liquide;
    }

    @Override
    public ContenantLiquide clone() {
        ContenantLiquide lait = null;
        try {
            lait = (ContenantLiquide) super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        lait.liquide = liquide.clone();
        return lait;
    }

    @Override
    public String toString() {
        return nom + " - {" +
                liquide +
                ", capacité=" + capaciteMl +
                ", qte=" + qte +
                '}';
    }
}