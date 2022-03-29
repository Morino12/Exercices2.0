package clone;

public class AppCloneContenant {
    Liquide eau = new Liquide("Eau", 1000);

    public AppCloneContenant() {
        clonerContenant();
    }

    private void clonerContenant() {
        ContenantLiquide pipetteDEau = new ContenantLiquide("Pipette", eau, 250, 200);
        System.out.println(pipetteDEau);

        //Cloner la pipette d'eau
        ContenantLiquide pipetteDeLait = pipetteDEau.clone(); //remplacer null par la bonne instruction pour cloner.

        //Modifier la pipette d'eau pour avoir une pipette de lait
        pipetteDeLait.getLiquide().setNom("Lait");
        pipetteDeLait.getLiquide().setMasseVolumique_KgParM3(1030);
        pipetteDeLait.setNom("Bécher");
        pipetteDeLait.setCapaciteMl(1000);
        pipetteDEau.setCapaciteMl(2147000000);
        System.out.println(pipetteDeLait);
        System.out.println(pipetteDEau);
//Résultat attendu :
//        Pipette - {Eau - {masseVolumique= 1000 Kg/M3}, qteMaxMl=250, qte=200}
//        Pipette - {Lait - {masseVolumique= 1030 Kg/M3}, qteMaxMl=250, qte=200}
//        Pipette - {Eau - {masseVolumique= 1000 Kg/M3}, qteMaxMl=250, qte=200}
    }


    public static void main(String[] args) {
        new AppCloneContenant();
    }
}