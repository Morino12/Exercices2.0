package file;

public class FileDynamique implements IFile {
    private NoeudFile debut;
    private NoeudFile fin;

    public FileDynamique() {
        debut = null;
        fin = null;
    }

    @Override
    public void enfiler(Object data) {
        NoeudFile newNoeud = new NoeudFile(data, null);

        if (estVide()) {
            debut = newNoeud;
        } else {
            fin.setSuivant(newNoeud);
        }
        fin = newNoeud;


    }

    @Override
    public Object defiler() {
        Object retour;
        if (estVide())
            throw new RuntimeException("La pile est vide");
        retour = debut.getData();

        debut = debut.getSuivant();
        if (estVide()) {
            fin = debut;
        }

        return retour;
    }

    @Override
    public boolean estVide() {
        return debut == null;
    }
//    @Override
//    public String toString() {
//        return "" + debut;
//    }
   @Override
   public String toString() {
       String str = "";
       NoeudFile courant = debut;

       while (courant != null) {
           str += courant.getData().toString();
           courant = courant.getSuivant();
           str += courant == null ? "" : ", ";
       }
       return str;
   }
}

