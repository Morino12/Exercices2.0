package enumprovince;

public class TestProvince {
    public TestProvince() {

    }

    public static void main(String[] args) {
        Province j;
        j = Province.AB;
        for (Province p : Province.values()) {
            System.out.println(p.name() + ". La province est : " +p.getProvince()+ ". La capitale est : " +p.getCapitale()+ ". Population : " +p.getPopulation() + " habitants.");
        }
        new TestProvince();
    }
}
