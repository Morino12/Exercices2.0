package fichiers;

public class Liquide implements Cloneable {
    private String nom; //lait (1030), eau (1000), essence (750), Mercure(13600)
    private int masseVolumique_KgParM3;

    public Liquide(String nom, int masseVolumique_KgParM3) {
        this.nom = nom;
        this.masseVolumique_KgParM3 = masseVolumique_KgParM3;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMasseVolumique_KgParM3(int masseVolumique_KgParM3) {
        this.masseVolumique_KgParM3 = masseVolumique_KgParM3;
    }

    @Override
    public Liquide clone() {
        Liquide liquide = null;
        try {
            liquide = (Liquide) super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }

        // on retourne le clone
        return liquide;
    }

    @Override
    public String toString() {
        return nom + " - {masseVolumique= " + masseVolumique_KgParM3 + " Kg/M3" +
                '}';
    }
}
