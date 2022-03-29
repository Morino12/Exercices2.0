package pile;

public class devoir {

    public static int nbreElementPile(IPile p) {
        IPile o = new Pile();
        int nbrDElements = 0;
        while (!p.estVide()) {
            o.empiler(p.depiler());
            nbrDElements++;

        }
        while (!o.estVide()) {
            p.empiler(o.depiler());
        }
        return nbrDElements;
    }

    public static void main(String[] args) {
        Pile pile = new Pile();
        pile.empiler(23);
       pile.empiler(22);
       pile.empiler(21);
       pile.empiler(20);

       System.out.println(nbreElementPile(pile));
        System.out.println(pile);
        System.out.println(pile.depiler());
    }
//1.	Écrire une fonction qui reçoit en argument une Pile qui implémente IPile et qui n’offre pas d’autres services.
//      Cette fonction retourne le nombre d’élément contenu dans la pile sans modifier la pile reçue.
//2.	Est-ce que cette fonction est statique ? et pourquoi ? Oui elle est static car elle ne recoit aucune variable d'instance et est indépendante de la classe.
//3.	Est-ce que cette fonction pourrait être ajouté dans la classe Pile utilisée ? Oui.
}

