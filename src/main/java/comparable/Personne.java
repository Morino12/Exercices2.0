package comparable;

/**
 * Illustration de compareTo
 *
 * @author Robert Aubé
 */
public class Personne implements Comparable<Personne> { //
    private String prenom, nom;

    public Personne(String prenom, String nom) throws NullPointerException {
        if (validerNom(prenom, nom)) {
            this.prenom = prenom;
            this.nom = nom;
        } else
            throw new NullPointerException("Le nom et le prénom doit contenir des caractères");
    }

    private boolean validerNom(String prenom, String nom) {
        return (prenom != null && nom != null);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        if (prenom != null ? !prenom.equals(personne.prenom) : personne.prenom != null) return false;
        return nom != null ? nom.equals(personne.nom) : personne.nom == null;
    }

    public String toString() {
        return prenom + " " + nom;
    }

    @Override
    public int compareTo(Personne personne) {
        int iCompare = 0;
        String sCourant = this.nom + this.prenom;
        String sParam = personne.nom + personne.prenom;

        iCompare = sCourant.toLowerCase().compareTo(sParam.toLowerCase());
        return iCompare;
    }
//    @Override
//    public int compareTo(Object o) {
//        String sCourant = this.nom + this.prenom;
//        String sParam = ((Personne) o).nom + ((Personne) o).prenom;
//
//        int icompare = 0;
//
//        if (sCourant.length() < sParam.length())
//            icompare = -1;
//        else if (sCourant.length() > sParam.length())
//            icompare = 1;
//
//            if (o == null)
//                throw new NullPointerException("Le nom et le prénom doit contenir des caractères");
//        if (o != Personne.class)
//            throw new ClassCastException();
//        return 0;
//    }


}
