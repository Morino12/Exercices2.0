package comparable.tri;

import personnage.Guerrier;
import personnage.Personnage;
import personnage.Sorcier;

import java.util.Arrays;

public class AlgoTriObjetApp {
    public AlgoTriObjetApp() {

        testerTriSelection();
        testerTriSelectionClasseEnveloppeInteger();
    }

    private void testerTriSelection() {
        Personnage[] tab = {new Guerrier("César"), new Guerrier("Zidane"), new Sorcier("Harry")};


        System.out.println("Avant le tri par insertion");
        System.out.println(Arrays.toString(tab));

        //trie un tableau en utilisant le tri par sélection
        AlgoTriObjet.triSelection(tab);

        System.out.println("Apres le tri par insertion");
        System.out.println(Arrays.toString(tab));
    }

    private void testerTriSelectionClasseEnveloppeInteger() {
        Integer[] tab = {new Integer(1), new Integer(12), new Integer(4), new Integer(5), new Integer(93), new Integer(21)};


        System.out.println("Avant le tri par insertion");
        System.out.println(Arrays.toString(tab));

        //trie un tableau en utilisant le tri par insertion
        AlgoTriObjet.triSelection(tab);

        System.out.println("Apres le tri par insertion");
        System.out.println(Arrays.toString(tab));
    }

    public static void main(String[] args) {
        new AlgoTriObjetApp();
    }
}
