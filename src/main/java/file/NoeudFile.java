package file;

public class NoeudFile {
    private Object data;
    private NoeudFile suivant;

    public NoeudFile(Object data, NoeudFile suivant) {
        this.data = data;
        this.suivant = suivant;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NoeudFile getSuivant() {
        return suivant;
    }

    public void setSuivant(NoeudFile suivant) {
        this.suivant = suivant;
    }

    @Override
    public String toString() {
        return  data + "; "  + ((suivant == null) ?"":  suivant.toString());
    }


}
