package comparable.tri;

import java.util.Arrays;

public class TestTri {
    public TestTri() {
        testerGetMinIndice();
        testerTriSelection();
    }

    private void testerTriSelection() {
        int[]tab = {1,12,34,53,2,256,22,14,4};
        System.out.println("Tableau");
        System.out.println(Arrays.toString(tab));
        TableauDeTriSelection.triParSelection(tab);
        System.out.println("Le tableau permutter est : \n" + Arrays.toString(tab));
    }

    private void testerGetMinIndice() {
        int[]tab = {1,12,34,53,2,256,22,14,4};
        int[]tab2 = {12,34,53,2,256,22,14,4};
        System.out.println("tableau");
        System.out.println(Arrays.toString(tab));

        System.out.println("Le minimum est : " +TableauDeTriSelection.getIDuMin(tab));

        System.out.println("tableau");
        System.out.println(Arrays.toString(tab2));
        System.out.println("Le minimum est : " +TableauDeTriSelection.getIDuMin(tab2));
    }

    public static void main(String[] args) {
        new TestTri();
    }
}
