package comparable.tri;

public class TableauDeTriSelection {
    public TableauDeTriSelection() {
        int[] tab = new int[]{1, 2, 3, 4, 5};

        permuter(tab, 1, 4);
    }

    public static void main(String[] args) {
        new TableauDeTriSelection();
    }

    public static void permuter(int[] tab, int i1, int i2) {
            int variableTempo = tab[i1];
            tab[i1] = tab[i2];
            tab[i2] = variableTempo;
    }

    public static int getIDuMin(int[] tab) {
        int minIndex = getIDuMin(tab, 0);

        return minIndex;
    }

    public static int getIDuMin(int[] tab, int iDebut) {
        int minIndex = iDebut;

        for (int i = iDebut + 1; i < tab.length; i++) {
            if (tab[i] < tab[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void triParSelection(int[] tab) {
        int minIndex;
        for (int i = 0; i < tab.length - 1; i++) {
            minIndex = getIDuMin(tab, i);
            permuter(tab, minIndex, i);
        }

    }
}

