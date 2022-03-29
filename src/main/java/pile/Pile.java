package pile;

import java.util.ArrayList;

public class Pile implements IPile {
    private ArrayList<Integer> pile = new ArrayList<Integer>();



    @Override
    public void empiler(int valeur) {
        pile.add(valeur);
    }

    @Override
    public int depiler() {
        if (!estVide()) {
            return pile.remove(pile.size() - 1);
        } else
            throw new ArrayIndexOutOfBoundsException("Pile est vide!");
    }

    @Override
    public boolean estVide() {
        boolean estVide = false;

        estVide = pile.size() == 0;


        return estVide;
    }

    @Override
    public String toString() {
        return "Pile{" +
                "pile=" + pile +
                '}';
    }
}
